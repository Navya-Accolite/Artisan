package com.example.demo.Controller;

import com.example.demo.Entity.Products;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }
}
