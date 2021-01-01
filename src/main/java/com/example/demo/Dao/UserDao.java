package com.example.demo.Dao;

import com.example.demo.Entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserDao {

    @Select("select * from customer")
    @Results(id="resultMap", value={
            @Result(property = "userId", column = "user_id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password"),
            @Result(property = "userTel", column = "user_tel"),
            @Result(property = "userEmail", column = "user_email"),
            @Result(property = "userZipCode", column = "user_zip_code"),
            @Result(property = "userAddressDetail", column = "user_address_detail"),
            @Result(property = "usertype", column = "usertype"),
            @Result(property = "userRegisterTime", column = "user_register_time"),
            @Result(property = "realName", column = "real_name"),
    })
    List<User> queryAllUsers();
}
