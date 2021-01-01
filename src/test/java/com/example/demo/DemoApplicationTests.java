package com.example.demo;

import com.example.demo.Dao.UserDao;
import com.example.demo.Entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private UserDao userDao;

    /**
     * 测试查询所有表项
     */
    @Test
    public void queryAll(){
        List<User> userList = userDao.queryAllUsers();
        for(User user:userList){
            System.out.println(user);
        }
    }
}
