package com.ernestovanegasdev.supermarketapi.persistence.mapper;

import com.ernestovanegasdev.supermarketapi.domain.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses={CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "idCategory", target = "categoryId"),
            @Mapping(source = "quatityStock", target = "stock"),
            @Mapping(source = "salePrince", target = "price"),
            @Mapping(source = "status", target = "active"),
            @Mapping(source = "category", target = "category"),
    })
    Product toProduct(com.ernestovanegasdev.supermarketapi.persistence.entity.Product product);
    List<Product> toProducts(List<com.ernestovanegasdev.supermarketapi.persistence.entity.Product> products);

    @InheritInverseConfiguration
    @Mapping(target = "barcode", ignore = true)
    com.ernestovanegasdev.supermarketapi.persistence.entity.Product toProducto(Product product);
}
