package org.cloudstar.productapi.controllers;

import java.util.List;

//import org.cloudstar.productapi.entities.Deal;
import org.cloudstar.productapi.entities.ProductCatalog;
import org.cloudstar.productapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	@Autowired
	private ProductService product;
	
	@RequestMapping("/ProductCatalog")
	public List<ProductCatalog> getProductCatalog() {
		List<ProductCatalog> catalog = product.getProductCatalog();
		return catalog;
	}
	
	/*@RequestMapping("/getProductDeals")
	public List<Deal> getProductDeals() {
		List<Deal> deals = home.getProductDeals();
		return deals;
	}*/
}
