package com.ecommerce.cjss.Ecommerce.controllers;

import com.ecommerce.cjss.Ecommerce.orderEntity.OrderEntity;
import com.ecommerce.cjss.Ecommerce.service.FulfilmentService;
import com.ecommerce.cjss.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusControllerApi {

    @Autowired
    private ProductService service;

    @Autowired
    private FulfilmentService fulfilmentService;


//End point for get Status
    @GetMapping("/getStatus/{pid}")
    public OrderEntity getStatus(@PathVariable Integer pid){

       return fulfilmentService.getOderStatus(pid);

    }

    // End point for update product status
    @PutMapping("/statusUpdate/{pid}/{status}")
    public  OrderEntity  updateStatus(@PathVariable  Integer pid,@PathVariable String status){
        OrderEntity orderEntity = fulfilmentService.updateStatus(pid, status);
        return orderEntity;
    }
}
