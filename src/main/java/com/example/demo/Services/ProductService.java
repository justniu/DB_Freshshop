package com.example.demo.Services;

import com.example.demo.Dao.ProductDao;
import com.example.demo.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductDao productDao;
    /**
     * 新建product条目
     */
    public void newProduct(Product product){
        productDao.insert(product);
    }



}
