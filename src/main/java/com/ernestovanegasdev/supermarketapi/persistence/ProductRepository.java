package com.ernestovanegasdev.supermarketapi.persistence;

import com.ernestovanegasdev.supermarketapi.persistence.crud.ProductCrudRepository;
import com.ernestovanegasdev.supermarketapi.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int idCategory) {
        return (List<Product>) productCrudRepository.findByIdCategory(idCategory);
    }

    public Optional<List<Product>> getScarce(int quatityStock) {
        return productCrudRepository.findByQuantityStockLessThanAndStatus(quatityStock, true);
    }

    public Optional<Product> getProduct(int id) {
        return productCrudRepository.findById(id);
    }

    public Product save(Product product) {
        return productCrudRepository.save(product);
    }

    public void delete(int idProduct) {
        productCrudRepository.deleteById(idProduct);
    }
}
