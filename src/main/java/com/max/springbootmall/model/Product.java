package com.max.springbootmall.model;

import com.max.springbootmall.constant.ProductCategory;

import java.util.Date;

public class Product {

    private Integer productId;
    private String productName;
    private ProductCategory category;
    private  String imgUrl;
    private Integer price;
    private Integer stock;
    private String description;
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date lastModifiledDate;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastModifiledDate() {
        return lastModifiledDate;
    }

    public void setLastModifiledDate(Date lastModifiledDate) {
        this.lastModifiledDate = lastModifiledDate;
    }



}
