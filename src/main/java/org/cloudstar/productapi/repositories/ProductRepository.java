package org.cloudstar.productapi.repositories;

import org.cloudstar.productapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
