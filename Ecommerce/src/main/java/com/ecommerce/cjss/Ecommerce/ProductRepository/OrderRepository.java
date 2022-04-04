package com.ecommerce.cjss.Ecommerce.ProductRepository;

import com.ecommerce.cjss.Ecommerce.orderEntity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
}
