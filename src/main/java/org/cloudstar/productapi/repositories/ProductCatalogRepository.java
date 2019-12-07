package org.cloudstar.productapi.repositories;

import org.cloudstar.productapi.entities.ProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCatalogRepository extends JpaRepository<ProductCatalog, Integer> {

}
