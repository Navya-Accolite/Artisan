package com.example.demo.Repository;


import com.example.demo.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{

}
