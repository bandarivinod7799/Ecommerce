package com.ecommerce.cjss.Ecommerce.orderEntity;

import com.ecommerce.cjss.Ecommerce.orderEntity.OrderEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class OrderListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderListId;
    private Double price;
    private Long totalQuantities;
    private String productName;
    private Integer skuCode;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private OrderEntity orderEntity;

    public Integer getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(Integer skuCode) {
        this.skuCode = skuCode;
    }

    public Integer getOrderListId() {
        return OrderListId;
    }

    public void setOrderListId(Integer orderListId) {
        OrderListId = orderListId;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
