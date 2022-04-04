package com.ecommerce.cjss.Ecommerce.cartmodel;

import java.util.List;

public class CartModel {


    private Integer skuCode;
    private  Long quantity;
    private  Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Integer getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(Integer skuCode) {
        this.skuCode = skuCode;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

}
