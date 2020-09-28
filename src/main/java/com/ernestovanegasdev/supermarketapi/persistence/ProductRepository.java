package com.ernestovanegasdev.supermarketapi.persistence;

import com.ernestovanegasdev.supermarketapi.persistence.crud.ProductCrudRepository;
import com.ernestovanegasdev.supermarketapi.persistence.entity.Product;
import com.ernestovanegasdev.supermarketapi.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository implements com.ernestovanegasdev.supermarketapi.domain.respository.ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<com.ernestovanegasdev.supermarketapi.domain.Product> getAll() {
        List<Product> products = (List<Product>) productCrudRepository.findAll();
        return mapper.toProducts(products);
    }
    @Override
    public Optional<List<com.ernestovanegasdev.supermarketapi.domain.Product>> getByCategory(int categoryId) {
        List<Product> products  = productCrudRepository.findByIdCategory(categoryId);
        return Optional.of(mapper.toProducts(products));
    }

    @Override
    public Optional<List<com.ernestovanegasdev.supermarketapi.domain.Product>> getScarceProducts(int quantity) {
        Optional<List<Product>> products = productCrudRepository.findByquantityStockLessThanAndStatus(quantity, true);
        return products.map(prods -> mapper.toProducts(prods));
    }
    @Override
    public Optional<com.ernestovanegasdev.supermarketapi.domain.Product> getProduct(int productId) {
        return productCrudRepository.findById(productId).map(product -> mapper.toProduct(product));
    }

    @Override
    public com.ernestovanegasdev.supermarketapi.domain.Product save(com.ernestovanegasdev.supermarketapi.domain.Product product) {
        return mapper.toProduct(productCrudRepository.save(mapper.toProducto(product)));
    }
    @Override
    public void delete(int productId) {
        productCrudRepository.deleteById(productId);
    }
}
