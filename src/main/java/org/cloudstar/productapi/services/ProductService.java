package org.cloudstar.productapi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.cloudstar.productapi.entities.Product;
//import org.cloudstar.productapi.entities.Deal;
import org.cloudstar.productapi.entities.ProductCatalog;
//import org.cloudstar.productapi.repositories.DealRepository;
import org.cloudstar.productapi.repositories.ProductCatalogRepository;
import org.cloudstar.productapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductCatalogRepository catalogRepo;
	
	@Autowired
	private ProductRepository productRepo;
	
	/*@Autowired
	private DealRepository dealRepo;*/
	
	public List<ProductCatalog> getProductCatalog() {
		return catalogRepo.findAll();	
	}
	
	public List<Product> getAllProducts() {
		return productRepo.findAll();	
	}
	
	public List<Product> getProductByProductCatalogId(Integer pcId) {
		return productRepo.findByProductCatalogId(pcId);	
	}
	
	/*public List<Deal> getProductDeals() {
		return dealRepo.findAll();	
	}*/
}
