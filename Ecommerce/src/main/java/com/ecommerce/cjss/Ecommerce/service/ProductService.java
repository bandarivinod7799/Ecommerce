package com.ecommerce.cjss.Ecommerce.service;

import com.ecommerce.cjss.Ecommerce.ProductRepository.*;
import com.ecommerce.cjss.Ecommerce.inventoryentity.InventoryEntity;
import com.ecommerce.cjss.Ecommerce.inventorymodel.InventoryModel;
import com.ecommerce.cjss.Ecommerce.orderEntity.OrderEntity;
import com.ecommerce.cjss.Ecommerce.productentity.ProductEntity;
import com.ecommerce.cjss.Ecommerce.productentity.SKUEntity;
import com.ecommerce.cjss.Ecommerce.productmodel.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductsRepository productsRepository;



    @Autowired
    private SKURepository skuRepository;
    @Autowired
    private ShowCartRepository viewCartRepository;


    public void addProduct(ProductModel productModel) {

        ProductEntity pEntity = new ProductEntity();
        pEntity.setProductName(productModel.getProductName());
        pEntity.setProductDescription(productModel.getProductDescription());

        List<SKUEntity> skuEntity = new ArrayList<>();
        productModel.getSku().forEach(sku -> {
            SKUEntity sEntity = new SKUEntity();
            sEntity.setProductEntity(pEntity);
            sEntity.setPrice(sku.getPrice());
            sEntity.setSize(sku.getSize());
            skuEntity.add(sEntity);
        });

        pEntity.setSku(skuEntity);

        productsRepository.save(pEntity);
    }



}
