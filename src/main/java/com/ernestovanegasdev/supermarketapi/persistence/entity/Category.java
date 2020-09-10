package com.ernestovanegasdev.supermarketapi.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer idCategory;

    private String description;

    private Boolean status;
}
