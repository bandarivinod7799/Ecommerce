package com.ecommerce.cjss.Ecommerce.service;

import com.ecommerce.cjss.Ecommerce.ProductRepository.InventoryRepository;
import com.ecommerce.cjss.Ecommerce.ProductRepository.OrderRepository;
import com.ecommerce.cjss.Ecommerce.inventoryentity.InventoryEntity;
import com.ecommerce.cjss.Ecommerce.orderEntity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReturnService {
    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private OrderRepository orderRepository;


    public String returnProduct(Integer pId) {

        Optional<OrderEntity> byId = orderRepository.findById(pId);
        if (byId.isPresent()) {
            System.out.println(byId);
            OrderEntity orderEntity = orderRepository.findById(pId).get();
            orderEntity.getOderList().stream().forEach(a -> {
                InventoryEntity inventoryEntity = inventoryRepository.findById(a.getSkuCode()).get();
                System.out.println("save Inventory");
                inventoryEntity.setSkuCOde(a.getSkuCode());
                inventoryEntity.setQuantityAvailable(a.getTotalQuantities() + inventoryEntity.getQuantityAvailable());
                inventoryRepository.save(inventoryEntity);
            });

            orderEntity.setOderList(orderEntity.getOderList());
            orderEntity.setProductId(orderEntity.getProductId());
            orderEntity.setPrice(orderEntity.getPrice());
            orderEntity.setStatus("RETURN");
            orderRepository.save(orderEntity);
            return "Order Return";

        }
        return "ID Not Found";
    }


}
