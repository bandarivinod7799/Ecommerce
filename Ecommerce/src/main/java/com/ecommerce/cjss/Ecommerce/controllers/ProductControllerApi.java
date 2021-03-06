package com.ecommerce.cjss.Ecommerce.controllers;

import com.ecommerce.cjss.Ecommerce.cartmodel.CartModel;
import com.ecommerce.cjss.Ecommerce.cartmodel.ViewCart;
import com.ecommerce.cjss.Ecommerce.inventorymodel.InventoryModel;
import com.ecommerce.cjss.Ecommerce.productmodel.ProductModel;
import com.ecommerce.cjss.Ecommerce.service.CartService;
import com.ecommerce.cjss.Ecommerce.service.InventoryService;
import com.ecommerce.cjss.Ecommerce.service.ProductService;
import com.ecommerce.cjss.Ecommerce.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductControllerApi {
    @Autowired
    private CartService cartService;
    @Autowired
    private InventoryService inventoryService;
    @Autowired
    private ProductService productService;
    @Autowired
    private ReturnService returnService;


    @PostMapping("/add-product")
    public String addProduct(@RequestBody ProductModel model) {
        productService.addProduct(model);
        return "Successfully Added";
    }

    @PostMapping("/add-quantity")
    public ResponseEntity<String> addProductQuantity(@RequestBody InventoryModel inventoryModel) {
        String message = inventoryService.addQuantity(inventoryModel);
        //TODO create Model
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("/add-cart")
    public ResponseEntity<String> addToCart(@RequestBody CartModel cartModel) {
        String s = cartService.addToCart(cartModel);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
    @GetMapping("/view-cart")
    public ResponseEntity<ViewCart> viewCart() {
        ViewCart cart = cartService.viewCart();
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }
    @GetMapping("/place-order")
    public String placeOrder() {
        return cartService.placeOrder();
    }
    @GetMapping("/orderReturn/{pId}")
    public String orderReturn(@PathVariable Integer pId) {
        String s = returnService.returnProduct(pId);
        return s;
    }
}
