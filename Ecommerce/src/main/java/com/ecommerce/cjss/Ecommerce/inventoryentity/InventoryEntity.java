package com.ecommerce.cjss.Ecommerce.inventoryentity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InventoryEntity {

    @Id
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

    @Override
    public String toString() {
        return "InventoryEntity{" +
                "skuCOde=" + skuCOde +
                ", quantityAvailable=" + quantityAvailable +
                '}';
    }
}
