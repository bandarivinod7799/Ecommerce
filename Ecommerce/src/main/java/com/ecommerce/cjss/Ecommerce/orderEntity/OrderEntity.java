package com.ecommerce.cjss.Ecommerce.orderEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private Double price;
    private String status;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "orderEntity")
    private List<OrderListEntity> oderList=new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<OrderListEntity> getOderList() {
        return oderList;
    }

    public void setOderList(List<OrderListEntity> oderList) {
        this.oderList = oderList;
    }
}
