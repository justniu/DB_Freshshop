package com.example.demo.Dao;

import com.example.demo.Entities.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserDao {

    @Select("select * from customers")
    @Results(id="resultMap", value={
            @Result(property = "userId", column = "user_id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password"),
            @Result(property = "userTel", column = "user_tel"),
            @Result(property = "userEmail", column = "user_email"),
            @Result(property = "userZipCode", column = "user_zip_code"),
            @Result(property = "userAddressDetail", column = "user_address_detail"),
            @Result(property = "userType", column = "user_type"),
            @Result(property = "userRegisterTime", column = "user_register_time"),
            @Result(property = "realName", column = "real_name"),
    })
    List<User> queryAllUsers();

    @Insert("insert into customers ( \"user_id\",  \"user_name\",  \"user_password\",  \"user_tel\",  \"user_email\",  \"user_zip_code\",  \"user_address_detail\",  \"user_type\",  \"user_register_time\",  \"real_name\") values(#{userId}, #{userName}, #{userPassword}, #{userTel}, #{userEmail}, #{userZipCode}, #{userAddressDetail}, #{userType}, #{userRegisterTime}, #{realName})"
    )
    int addCustomer(User user);



    @Select("select * from customers where \"user_id\"=#{userId}")
    @ResultMap("resultMap")
    User getUser(String id);

    @Update("update customers set \"real_name\"=#{realName} where \"user_id\"=#{userId}")
    int updateRealName(User user);

    @Delete("delete from customers where \"user_id\"=#{userId}")
    int deleteUser(String id);


}
