package com.ecommerce.cjss.Ecommerce.productmodel;

import com.ecommerce.cjss.Ecommerce.productentity.SKUEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {
    private String productName;
    private String productDescription;
    private List<SKUEntity> sku=new ArrayList<>();

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public List<SKUEntity> getSku() {
        return sku;
    }

    public void setSku(List<SKUEntity> sku) {
        this.sku = sku;
    }
}
