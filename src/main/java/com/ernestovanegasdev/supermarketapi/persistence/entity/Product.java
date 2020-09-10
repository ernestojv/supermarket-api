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

    @Column(name = "quatity_stock")
    private Integer quatityStock;

    private Boolean status;

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
        return quatityStock;
    }

    public void setQuatityStock(Integer quatityStock) {
        this.quatityStock = quatityStock;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
