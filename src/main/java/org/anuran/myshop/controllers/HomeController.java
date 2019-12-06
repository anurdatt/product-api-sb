package org.anuran.myshop.controllers;

import java.util.List;

import org.anuran.myshop.entities.Deal;
import org.anuran.myshop.entities.ProductCategory;
import org.anuran.myshop.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

	@Autowired
	private HomeService home;
	
	@RequestMapping("/getProductCategories")
	public List<ProductCategory> getProductCategories() {
		List<ProductCategory> categories = home.getProductCategories();
		return categories;
	}
	
	@RequestMapping("/getProductDeals")
	public List<Deal> getProductDeals() {
		List<Deal> deals = home.getProductDeals();
		return deals;
	}
}
