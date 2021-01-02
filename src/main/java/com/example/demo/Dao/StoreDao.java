package com.example.demo.Dao;

import com.example.demo.Entities.Store;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StoreDao {
    @Select("select * from store")
    @Results(id="resultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "address", column = "address"),
            @Result(property = "phone", column = "phone"),
    })
    List<Store> queryAll();

    @Insert("insert into store ( \"id\",  \"name\",  \"address\",  \"phone\") values(#{id}, #{name}, #{address}, #{phone})"
    )
    int addStore(Store store);
}
