package org.cloudstar.productapi.controllers;

import java.util.List;

import org.cloudstar.productapi.entities.Deal;
import org.cloudstar.productapi.entities.ProductCategory;
import org.cloudstar.productapi.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/home")
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
