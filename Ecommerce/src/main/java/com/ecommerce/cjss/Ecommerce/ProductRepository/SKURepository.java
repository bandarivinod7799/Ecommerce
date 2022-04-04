package com.ecommerce.cjss.Ecommerce.ProductRepository;

import com.ecommerce.cjss.Ecommerce.productentity.SKUEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SKURepository extends JpaRepository<SKUEntity,Integer> {
}
