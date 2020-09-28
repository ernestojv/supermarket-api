package com.ernestovanegasdev.supermarketapi.persistence.mapper;

import com.ernestovanegasdev.supermarketapi.domain.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategory", target = "categoryId"),
            @Mapping(source = "description", target = "category"),
            @Mapping(source = "status", target = "active"),
    })
    Category toCategory(com.ernestovanegasdev.supermarketapi.persistence.entity.Category category);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    com.ernestovanegasdev.supermarketapi.persistence.entity.Category toCategoria(Category category);
}
