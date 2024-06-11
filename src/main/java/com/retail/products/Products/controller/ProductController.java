package com.retail.products.Products.controller;

import com.retail.products.Products.Entity.Product;
import com.retail.products.Products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getMsg(@PathVariable("id") Integer productId){
        Map<Integer, Product> productMap = productService.getProductDetails();
        return new ResponseEntity<>(productMap.get(productId), HttpStatus.OK);
    }

}

