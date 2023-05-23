package com.example.demo.Service;

import com.example.demo.Entity.Products;
import com.example.demo.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getAllProducts(){
        List<Products> user= productsRepository.findAll();
        return user;
    }
}
