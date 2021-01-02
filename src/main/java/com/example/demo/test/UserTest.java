package com.example.demo.test;

import com.example.demo.Dao.UserDao;
import com.example.demo.Entities.*;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.util.List;


@MapperScan("com.example.demo.Dao")
public class UserTest {

    public static String getResultsStr(Class origin) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@Results(id=\"resultMap\", value = {\n");
        for (Field field : origin.getDeclaredFields()) {
            String property = field.getName();
            //映射关系：对象属性(驼峰)->数据库字段(下划线)
            String column = new PropertyNamingStrategy.SnakeCaseStrategy().translate(field.getName());
            stringBuilder.append(String.format("@Result(property = \"%s\", column = \"%s\"),\n", property, column));
        }
        stringBuilder.append("})");

        return stringBuilder.toString();
    }

    public static String getKeyStr(Class origin){
        StringBuilder stringBuilder = new StringBuilder();
        for (Field field: origin.getDeclaredFields()){
            String property = field.getName();
            stringBuilder.append(property);
            stringBuilder.append(", ");
        }
        StringBuilder columns = new StringBuilder();
        String[] names = stringBuilder.toString().split(",");
        for (String name: names){
            String column = new PropertyNamingStrategy.SnakeCaseStrategy().translate(name);
            columns.append(String.format("%s,", column));
        }
        stringBuilder.append("\n");
        stringBuilder.append(columns.toString());
        return stringBuilder.toString();
    }

    public static String getValueStr(Class origin){
        StringBuilder stringBuilder = new StringBuilder();
        for (Field field: origin.getDeclaredFields()){
            String property = field.getName();
            stringBuilder.append(String.format("#{%s}, ", property));
        }
        return stringBuilder.toString();
    }
    public static String getInsertStr(Class origin){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(origin.getSimpleName());
        stringBuilder.append("\"insert into " + new PropertyNamingStrategy.SnakeCaseStrategy().translate(origin.getSimpleName()));
        stringBuilder.append(" (");
        for (Field field : origin.getDeclaredFields()) {
            String property = field.getName();
            //映射关系：对象属性(驼峰)->数据库字段(下划线)
            String column = new PropertyNamingStrategy.SnakeCaseStrategy().translate(field.getName()).toUpperCase();
            stringBuilder.append(String.format(" \\\"%s\\\", ", column));
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(") values(");
        for (Field field: origin.getDeclaredFields()){
            String property = field.getName();
            stringBuilder.append(String.format("#{%s}, ", property));
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(")\"");
        return stringBuilder.toString();
    }

    public static String getSelWithParams(Class origin){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" public String selectWithParams(Map<String, Object> param){\n" +
                "        return new SQL(){\n" +
                "            {\n");
        stringBuilder.append("SELECT(\"*\");\n");
        stringBuilder.append("FROM(\""+new PropertyNamingStrategy.SnakeCaseStrategy().translate(origin.getSimpleName())+"\");\n");
        for (Field field : origin.getDeclaredFields()) {
            String property = field.getName();
            //映射关系：对象属性(驼峰)->数据库字段(下划线)
            String column = new PropertyNamingStrategy.SnakeCaseStrategy().translate(field.getName()).toUpperCase();
            stringBuilder.append(String.format("if(param.get(\"%s\") != null){\n" +
                    "                    WHERE(\"%s=#{%s}\");\n" +
                    "                }\n", property, column, property));
        }
        stringBuilder.append("  }\n" +
                "        }.toString();\n}\n");
        return stringBuilder.toString();
    }

    @Test
    public void getSel(){
        System.out.println(getSelWithParams(WarehouseInfo.class));
    }


    @Test
    public void getInsert(){
        System.out.println(getInsertStr(ProductCategory.class));
    }

    @Test
    public void getResult(){
        System.out.println(getResultsStr(UserRegisterLog.class));
    }

    @Test
    public void getKeyStr(){
        System.out.println(getKeyStr(Product.class));
    }

    @Test
    public void getValueStr(){
        System.out.println(getValueStr(User.class));
    }


    @Autowired
    private UserDao userDao;

    @Test
    public void queryAll(){
        List<User> userList = userDao.queryAllUsers();
        for(User user:userList){
            System.out.println(user);
        }
    }

}
