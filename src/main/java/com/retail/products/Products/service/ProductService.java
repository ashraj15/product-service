package com.retail.products.Products.service;

import com.retail.products.Products.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class ProductService {

    public Map<Integer, Product> getProductDetails(){
        List<Product> productList = getAllProducts();
        int length = productList.size();
        Map<Integer,Product> productMap = productList.stream().collect(
                Collectors.toMap(Product::getId,p->p));
        return productMap;
    }

    private List<Product> getAllProducts() {
        return Arrays.asList(new Product(1,"P1",20.50f,"black"),
                new Product(2,"P2",20.50f,"blue"),
                new Product(3,"P3",20.50f,"white"),
                new Product(4,"P4",20.50f,"black"));
    }
}
