package com.spring.AppOne.controller;

import com.spring.AppOne.model.Products;
import com.spring.AppOne.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin - to connect front <-> backend
@RequestMapping("/app")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Products> getProducts(){
//        System.out.println("Fetching all products...");
        return service.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Products getProductByID(@PathVariable int id) {
//        System.out.println("Info on product ID: "+id);
        return service.getProductByID(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products prod) {
//        System.out.println(prod.toString());
//        System.out.println("New Product Added...");
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Products prod) {
//        System.out.println(prod.toString());
//        System.out.println("Updated Successfully...");
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductByID(@PathVariable int id) {
//        System.out.println("Product Deleted...");
        service.deleteProductByID(id);
    }
}
