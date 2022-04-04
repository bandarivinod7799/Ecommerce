package com.ecommerce.cjss.Ecommerce.cartentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


public class CartEntity {
    private List<Integer> skuCode;
    private  Long quantity;


}
