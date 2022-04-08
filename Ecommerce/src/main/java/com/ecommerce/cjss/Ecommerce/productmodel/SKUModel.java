package com.ecommerce.cjss.Ecommerce.productmodel;

import com.ecommerce.cjss.Ecommerce.productentity.ProductEntity;

public class SKUModel {
    private Integer skuCode;
    private String size;
    private  Double price;
    private ProductEntity productEntity;
    public Integer getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(Integer skuCode) {
        this.skuCode = skuCode;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }
}
