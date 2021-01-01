package com.example.demo.Controller;

import com.example.demo.Dao.UserDao;
import com.example.demo.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/lists")
    public List<User> query(){
        List<User > userList = userDao.queryAllUsers();
        for(User user:userList){
            System.out.println(user);
        }
        return userList;
    }
}
