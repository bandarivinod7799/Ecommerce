package com.ecommerce.cjss.Ecommerce.productentity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productCode;
    private String productName;
    private String productDescription;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "productEntity")
    private List<SKUEntity> sku=new ArrayList<>();

    public List<SKUEntity> getSku() {
        return sku;
    }

    public void setSku(List<SKUEntity> sku) {
        this.sku = sku;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

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
}
