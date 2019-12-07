package org.cloudstar.productapi.services;

import java.util.List;

import javax.transaction.Transactional;

//import org.cloudstar.productapi.entities.Deal;
import org.cloudstar.productapi.entities.ProductCatalog;
//import org.cloudstar.productapi.repositories.DealRepository;
import org.cloudstar.productapi.repositories.ProductCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HomeService {
	
	@Autowired
	private ProductCatalogRepository catalogRepo;
	
	/*@Autowired
	private DealRepository dealRepo;*/
	
	public List<ProductCatalog> getProductCatalog() {
		return catalogRepo.findAll();	
	}
	
	/*public List<Deal> getProductDeals() {
		return dealRepo.findAll();	
	}*/
}
