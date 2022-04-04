package com.ecommerce.cjss.Ecommerce.service;

import com.ecommerce.cjss.Ecommerce.ProductRepository.*;
import com.ecommerce.cjss.Ecommerce.cartentity.ViewCartEntity;
import com.ecommerce.cjss.Ecommerce.cartmodel.AddToCart;
import com.ecommerce.cjss.Ecommerce.cartmodel.CartModel;
import com.ecommerce.cjss.Ecommerce.cartmodel.ViewCart;
import com.ecommerce.cjss.Ecommerce.inventoryentity.InventoryEntity;
import com.ecommerce.cjss.Ecommerce.orderEntity.OrderEntity;
import com.ecommerce.cjss.Ecommerce.orderEntity.OrderListEntity;
import com.ecommerce.cjss.Ecommerce.productentity.ProductEntity;
import com.ecommerce.cjss.Ecommerce.productentity.SKUEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {


    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private SKURepository skuRepository;
    @Autowired
    private ShowCartRepository viewCartRepository;
    @Autowired
    private OrderRepository orderRepository;


    public String addToCart(CartModel cartModel) {
        Integer skuCode = cartModel.getSkuCode();
        SKUEntity skuEntity1 = skuRepository.findById(skuCode).get();
        Integer productCode = skuEntity1.getProductEntity().getProductCode();
        ProductEntity productEntity = productsRepository.findById(productCode).get();
        double total = 0;
        InventoryEntity byId = inventoryRepository.findById(skuCode).get();
        if ((byId.getQuantityAvailable() >= cartModel.getQuantity()) && (cartModel.getQuantity() > 0)) {

            ViewCartEntity viewCartEntity = new ViewCartEntity();
            SKUEntity skuEntity = skuRepository.findById(skuCode).get();
            viewCartEntity.setProductName(productEntity.getProductName());
            viewCartEntity.setPrice(skuEntity.getPrice());
            viewCartEntity.setTotalQuantities(cartModel.getQuantity());
            viewCartEntity.setSkuCode(skuCode);
            Long quantity = cartModel.getQuantity();
            total = total + skuEntity.getPrice() * quantity;
            viewCartEntity.setTotalPrice(total);
// after Adding to cart remaining
            Long remainingQuantities = byId.getQuantityAvailable() - viewCartEntity.getTotalQuantities();

            byId.setSkuCOde(byId.getSkuCOde());
            byId.setQuantityAvailable(remainingQuantities);
            inventoryRepository.save(byId);
            viewCartRepository.save(viewCartEntity);
            return "Products are added to cart, View the cart...!!!!";

        } else if (byId.getQuantityAvailable() <= 0) {

            return "Out of Stack";
        } else if (cartModel.getQuantity() <= 0) {

            return "Please Select Some Products";
        }

        return "Out Of Stack";
    }


    public ViewCart viewCart() {

        List<ViewCartEntity> allProducts = viewCartRepository.findAll();
        List<AddToCart> cartList = new ArrayList<>();
        Double sum = allProducts.stream().mapToDouble(t -> t.getTotalPrice()).sum();
        allProducts.stream().forEach(all ->
                {
                    AddToCart addCart = new AddToCart();
                    addCart.setPrice(all.getPrice());
                    addCart.setProductName(all.getProductName());
                    addCart.setSkuCode(all.getSkuCode());
                    addCart.setCid(all.getCid());
                    addCart.setTotalQuantities(all.getTotalQuantities());
                    cartList.add(addCart);

                }
        );
        ViewCart cart = new ViewCart();
        cart.setAddToCartList(cartList);
        cart.setTotalPrice(sum);
        return cart;
    }

    public String placeOrder() {

        ViewCart cartList = viewCart();
        OrderEntity orderEntity = new OrderEntity();
        List<OrderListEntity> orderList = new ArrayList<>();
        cartList.getAddToCartList().stream().forEach(addList -> {
            OrderListEntity order = new OrderListEntity();
            order.setPrice(addList.getPrice());
            order.setSkuCode(addList.getSkuCode());
            order.setProductName(addList.getProductName());
            order.setTotalQuantities(addList.getTotalQuantities());
            order.setOrderEntity(orderEntity);
            orderList.add(order);

        });
        orderEntity.setOderList(orderList);
        orderEntity.setPrice(cartList.getTotalPrice());
        orderEntity.setStatus("RECEIVED");
        orderRepository.save(orderEntity);

        return "Order Placed";
    }


}
