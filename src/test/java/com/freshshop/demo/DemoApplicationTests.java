package com.freshshop.demo;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.mapper.ProductDao;
import com.freshshop.demo.service.ProductSkuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private ProductSkuService productSkuService;

    @Autowired
    private ProductDao productDao;
    @Test
    public void update(){
        List<Product> select = productDao.query(new HashMap<>());
        System.out.println(select.size());
        for(Product product:select){
            productSkuService.update(product);
        }
    }
}
