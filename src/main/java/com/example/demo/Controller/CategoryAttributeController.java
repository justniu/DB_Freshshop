package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories", method = RequestMethod.GET)
public class CategoryAttributeController {
    @GetMapping("/lists")
    public String queryAll(){
        return "all categories!";
    }
}
