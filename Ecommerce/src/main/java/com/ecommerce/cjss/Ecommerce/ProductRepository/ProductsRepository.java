package com.ecommerce.cjss.Ecommerce.ProductRepository;

import com.ecommerce.cjss.Ecommerce.productentity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface ProductsRepository extends JpaRepository<ProductEntity, Integer> {
}
