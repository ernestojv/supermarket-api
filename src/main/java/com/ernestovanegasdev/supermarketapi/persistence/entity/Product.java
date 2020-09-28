package com.ernestovanegasdev.supermarketapi.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer idProducto;

    private String name;

    @Column(name = "id_category")
    private Integer idCategory;

    private String barcode;

    @Column(name = "sale_price")
    private Integer salePrince;

    @Column(name = "quantity_stock")
    private Integer quantityStock;

    private Boolean status;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name="id_category", insertable = false, updatable = false)
    private Category category;

    //Getter & Setter
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getSalePrince() {
        return salePrince;
    }

    public void setSalePrince(Integer salePrince) {
        this.salePrince = salePrince;
    }

    public Integer getQuatityStock() {
        return quantityStock;
    }

    public void setQuatityStock(Integer quatityStock) {
        this.quantityStock = quatityStock;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
