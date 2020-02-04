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
	
	@Query("FROM Product p where p.productCatalog.classId = :pcId")
	List<Product> findByClassId(@Param("pcId") Integer pcId);
	
	@Query("FROM Product p where p.productCatalog.familyId = :pcId")
	List<Product> findByFamilyId(@Param("pcId") Integer pcId);
	
	@Query("FROM Product p where p.productCatalog.segmentId = :pcId")
	List<Product> findBySegmentId(@Param("pcId") Integer pcId);
	
	@Query("FROM Product p where p.itemName = :name")
	List<Product> findByItemName(@Param("name") String name);
}
