package com.ecommerce.cjss.Ecommerce.ProductRepository;

import com.ecommerce.cjss.Ecommerce.inventoryentity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity,Integer> {


}
