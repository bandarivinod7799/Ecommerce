package com.ecommerce.cjss.Ecommerce.cartmodel;

import java.util.List;

public class ViewCart {
    private Double totalPrice;
    private List<AddToCart> addToCartList;

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<AddToCart> getAddToCartList() {
        return addToCartList;
    }

    public void setAddToCartList(List<AddToCart> addToCartList) {
        this.addToCartList = addToCartList;
    }
}
