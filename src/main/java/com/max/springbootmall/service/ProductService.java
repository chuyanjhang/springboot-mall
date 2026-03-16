package com.max.springbootmall.service;

import com.max.springbootmall.constant.ProductCategory;
import com.max.springbootmall.dto.ProductRequest;
import com.max.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category,String serch);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);
}
