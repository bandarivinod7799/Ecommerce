package com.ecommerce.cjss.Ecommerce.service;

import com.ecommerce.cjss.Ecommerce.ProductRepository.OrderRepository;
import com.ecommerce.cjss.Ecommerce.orderEntity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FulfilmentService {

    @Autowired
    private OrderRepository orderRepository;


    public OrderEntity getOderStatus(Integer id) {
        OrderEntity orderEntity = orderRepository.findById(id).get();
        return orderEntity;
    }

    public OrderEntity updateStatus(Integer pid, String status) {

        OrderEntity orderEntity = orderRepository.findById(pid).get();
        orderEntity.setProductId(orderEntity.getProductId());
        orderEntity.setOderList(orderEntity.getOderList());
        orderEntity.setPrice(orderEntity.getPrice());
        orderEntity.setStatus(status.toUpperCase());
        OrderEntity save = orderRepository.save(orderEntity);

        return save;
    }
}
