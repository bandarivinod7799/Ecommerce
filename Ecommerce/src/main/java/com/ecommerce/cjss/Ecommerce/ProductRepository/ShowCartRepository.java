package com.ecommerce.cjss.Ecommerce.ProductRepository;

import com.ecommerce.cjss.Ecommerce.cartentity.ViewCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowCartRepository extends JpaRepository<ViewCartEntity,Integer> {
}
