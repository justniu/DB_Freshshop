package com.example.demo;

import com.example.demo.Entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

//
//    /**
//     * 测试查询所有表项
//     */
//    @Test
//    public void queryAll(){
//        List<User> userList = userDao.queryAllUsers();
//        for(User user:userList){
//            System.out.println(user);
//        }
//    }
//
//    /**
//     * test add user
//     */
//    @Test
//    public void addUser(){
//        User user = new User();
//        user.setUserId("1007");
//        user.setUserName("hahahaha");
//        user.setUserEmail("qwweerg@qq.com");
//        user.setUserPassword("2222");
//        user.setUserTel("12233");
//        user.setUserAddressDetail("sichuang");
//        user.setUserType(1);
//        user.setUserRegisterTime(new Date());
//        user.setUserZipCode("111");
//        user.setRealName("牛");
//        userDao.addCustomer(user);
//    }
//
//    /**
//     * test get user by id
//     */
//    @Test
//    public void getUserById(){
//        User user = userDao.getUser("1001");
//        System.out.println(user);
//    }
//
//    /**
//     * test update
//     */
//    @Test
//    public void upateRealName(){
//        User user = userDao.getUser("1007");
//        user.setRealName("niuzhuang");
//        userDao.updateRealName(user);
//    }
//
//    /**
//     * test delete user
//     */
//    @Test
//    public void deleteUser(){
//        userDao.deleteUser("1007");
//    }
}
