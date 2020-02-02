package org.cloudstar.productapi.repositories;

import java.util.List;

import org.cloudstar.productapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	//@Query("FROM Product p where p.productCatalogId = :pcId")
	@Query("FROM Product p where p.productCatalog.commodityId = :pcId")
	List<Product> findByProductCatalogId(@Param("pcId") Integer pcId);
}
