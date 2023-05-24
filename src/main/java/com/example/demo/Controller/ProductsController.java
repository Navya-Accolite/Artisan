package com.example.demo.Controller;

import com.example.demo.Entity.Products;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/postProduct")
    public void postProduct(@RequestBody Products products){
        Products savedProducts=productService.postProducts(products);
    }
}
