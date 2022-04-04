package com.ecommerce.cjss.Ecommerce.cartentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ViewCartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private  Double price;
    private  Double totalPrice;
    private  Long totalQuantities;
    private String productName;
    private Integer skuCode;


    public Integer getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(Integer skuCode) {
        this.skuCode = skuCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }



    public Long getTotalQuantities() {
        return totalQuantities;
    }

    public void setTotalQuantities(Long totalQuantities) {
        this.totalQuantities = totalQuantities;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ShowCartEntity{" +
                "cid=" + cid +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", totalQuantities=" + totalQuantities +
                '}';
    }
}
