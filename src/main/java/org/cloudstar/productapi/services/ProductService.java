package org.cloudstar.productapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	
	public List<Product> getProductsByProductCatalogId(Integer pcId) {
		return productRepo.findByProductCatalogId(pcId);	
	}
	
	public List<Product> getProductsByClassId(Integer pcId) {
		return productRepo.findByClassId(pcId);	
	}
	
	public List<Product> getProductsByFamilyId(Integer pcId) {
		return productRepo.findByFamilyId(pcId);	
	}
	
	public List<Product> getProductsBySegmentId(Integer pcId) {
		return productRepo.findBySegmentId(pcId);	
	}
	
	public List<Product> searchProductsByText(String srchText) {
		List<ProductCatalog> pcList = catalogRepo.findAll();
		List<ProductCatalog> resultPcList = pcList.stream()
				.filter(pc -> pc.getCommodityName().contains(srchText))
				.collect(Collectors.toList());
		
		List<Product> retProdList;
		
		if (resultPcList.size() > 0) {
			retProdList = new ArrayList<Product>();
			
			resultPcList.forEach(pc -> 
			retProdList.addAll(productRepo.findByProductCatalogId(pc.getCommodityId())));
		}
		else {
			List<Product> prodList = productRepo.findAll();
			retProdList = prodList.stream()
					.filter(prod -> prod.getItemName().contains(srchText) || prod.getDescription().contains(srchText))
					.collect(Collectors.toList());
		}
		
		return retProdList;
	}
	
	/*public List<Deal> getProductDeals() {
		return dealRepo.findAll();	
	}*/
}
