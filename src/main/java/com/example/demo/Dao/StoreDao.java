package com.example.demo.Dao;

import com.example.demo.Entities.Store;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StoreDao {
    @Select("select * from store")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "address", column = "address"),
            @Result(property = "phone", column = "phone"),
    })
    List<Store> queryAll();

    @Insert("insert into store ( \"ID\",  \"NAME\",  \"ADDRESS\",  \"PHONE\") values(#{id}, #{name}, #{address}, #{phone})")
    int addStore(Store store);
}
