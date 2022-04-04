package com.ecommerce.cjss.Ecommerce.productentity;

import javax.persistence.*;

@Entity
public class SKUEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer skuCode;
    private String size;
    private  Double price;
    @ManyToOne(cascade = CascadeType.ALL)
    private ProductEntity productEntity;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }
}
