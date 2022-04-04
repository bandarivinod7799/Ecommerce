package com.ecommerce.cjss.Ecommerce.inventorymodel;

public class InventoryModel {
    private Integer skuCOde;
    private Long quantityAvailable;

    public Integer getSkuCOde() {
        return skuCOde;
    }

    public void setSkuCOde(Integer skuCOde) {
        this.skuCOde = skuCOde;
    }

    public Long getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Long quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
}
