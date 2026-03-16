package com.max.springbootmall.dao;

import com.max.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
