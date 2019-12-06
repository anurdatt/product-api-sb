package org.cloudstar.productapi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.cloudstar.productapi.entities.Deal;
import org.cloudstar.productapi.entities.ProductCategory;
import org.cloudstar.productapi.repositories.DealRepository;
import org.cloudstar.productapi.repositories.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HomeService {
	
	@Autowired
	private ProductCategoryRepository categoryRepo;
	
	@Autowired
	private DealRepository dealRepo;
	
	public List<ProductCategory> getProductCategories() {
		return categoryRepo.findAll();	
	}
	
	public List<Deal> getProductDeals() {
		return dealRepo.findAll();	
	}
}
