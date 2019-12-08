package org.cloudstar.productapi.controllers;

import java.util.List;

//import org.cloudstar.productapi.entities.Deal;
import org.cloudstar.productapi.entities.ProductCatalog;
import org.cloudstar.productapi.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

	@Autowired
	private HomeService home;
	
	@RequestMapping("/getProductCatalog")
	public List<ProductCatalog> getProductCatalog() {
		List<ProductCatalog> catalog = home.getProductCatalog();
		return catalog;
	}
	
	/*@RequestMapping("/getProductDeals")
	public List<Deal> getProductDeals() {
		List<Deal> deals = home.getProductDeals();
		return deals;
	}*/
}
