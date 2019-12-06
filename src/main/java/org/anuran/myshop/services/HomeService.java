package org.anuran.myshop.services;

import java.util.List;

import javax.transaction.Transactional;

import org.anuran.myshop.entities.Deal;
import org.anuran.myshop.entities.ProductCategory;
import org.anuran.myshop.repositories.DealRepository;
import org.anuran.myshop.repositories.ProductCategoryRepository;
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
