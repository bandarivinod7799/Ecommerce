package com.ecommerce.cjss.Ecommerce.cartmodel;

public class AddToCart {

    private Integer cid;
    private Double price;
    private Long totalQuantities;
    private String productName;
    private Integer skuCode;

    public Integer getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(Integer skuCode) {
        this.skuCode = skuCode;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getTotalQuantities() {
        return totalQuantities;
    }

    public void setTotalQuantities(Long totalQuantities) {
        this.totalQuantities = totalQuantities;
    }


}
