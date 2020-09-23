package com.ernestovanegasdev.supermarketapi.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "puchases-product")
public class PurchasesProduct {
    @EmbeddedId
    private PurchasesProductPK id;
    private Integer quantity;
    private Double total;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "id_purchase", insertable = false, updatable = false)
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    public PurchasesProductPK getId() {
        return id;
    }

    public void setId(PurchasesProductPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
