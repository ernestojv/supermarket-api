package com.ernestovanegasdev.supermarketapi.persistence.crud;

import com.ernestovanegasdev.supermarketapi.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
    List<Product> findByIdCategory(int idCategory);
    Optional<List<Product>> findByQuantityStockLessThanAndStatus(int quatityStock, boolean status);

}
