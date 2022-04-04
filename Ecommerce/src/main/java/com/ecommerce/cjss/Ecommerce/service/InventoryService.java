package com.ecommerce.cjss.Ecommerce.service;

import com.ecommerce.cjss.Ecommerce.ProductRepository.InventoryRepository;
import com.ecommerce.cjss.Ecommerce.ProductRepository.SKURepository;
import com.ecommerce.cjss.Ecommerce.inventoryentity.InventoryEntity;
import com.ecommerce.cjss.Ecommerce.inventorymodel.InventoryModel;
import com.ecommerce.cjss.Ecommerce.productentity.SKUEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private SKURepository skuRepository;
    public String addQuantity(InventoryModel inventoryModel) {
        Optional<SKUEntity> bySKUId = skuRepository.findById(inventoryModel.getSkuCOde());
        if (bySKUId.isPresent()) {
            SKUEntity skuEntity = bySKUId.get();
            InventoryEntity inventoryEntity = new InventoryEntity();
            inventoryEntity.setSkuCOde(skuEntity.getSkuCode());
            inventoryEntity.setQuantityAvailable(inventoryModel.getQuantityAvailable());
            inventoryRepository.save(inventoryEntity);
            return "Inventory Updated";
        } else {

            return "SKU ID Wrong";
        }


    }





}
