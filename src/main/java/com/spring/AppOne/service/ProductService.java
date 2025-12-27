package com.spring.AppOne.service;

import com.spring.AppOne.model.Products;
import com.spring.AppOne.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Controller
@Service
public class ProductService {

//     private List<Products> products= new ArrayList<>(Arrays.asList(
//                                                new Products(101, "IPhone", 70000),
//                                                new Products(102, "MacBook", 100000)
//                                                ));

    @Autowired
    public ProductRepo repo;
    public List<Products> getAllProducts() {
//      return products;
        return repo.findAll();
    }

    public Products getProductByID(int id) {
//        return products.stream()
//                .filter(p -> p.getId() == id)
//                .findFirst().orElse(new Products(0, "Null", 0)); //.get();
        return repo.findById(id).orElse(new Products());
    }

    public void addProduct(Products prod) {
//         return products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Products prod) {
//        for (Products product : products) {
//            if (product.getId() == prod.getId()) {
//                product.setProduct(prod.getProduct());
//                product.setPrice(prod.getPrice());
//                return true;
//            }
//        }
        repo.save(prod);
    }

    public void deleteProductByID(int id) {
//        for (int i=0; i<products.size(); i++) {
//            if (products.get(i).getId() == id) {
//                products.remove(i);
//                return true;
//            }
//        }
//        return false;
        repo.deleteById(id);
    }
}
