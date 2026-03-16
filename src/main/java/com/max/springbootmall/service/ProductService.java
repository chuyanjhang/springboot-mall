package com.max.springbootmall.service;

import com.max.springbootmall.constant.ProductCategory;
import com.max.springbootmall.dto.ProductQueryParams;
import com.max.springbootmall.dto.ProductRequest;
import com.max.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);
}
