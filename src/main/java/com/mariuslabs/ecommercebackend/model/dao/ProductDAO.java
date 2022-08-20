package com.mariuslabs.ecommercebackend.model.dao;

import com.mariuslabs.ecommercebackend.model.Product;
import org.springframework.data.repository.ListCrudRepository;

/**
 * Data Access Object for accessing Product data.
 */
public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
