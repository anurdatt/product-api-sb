package org.cloudstar.productapi.controllers;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.cloudstar.productapi.entities.Product;
//import org.cloudstar.productapi.entities.Deal;
import org.cloudstar.productapi.entities.ProductCatalog;
import org.cloudstar.productapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping("/Products")
	public List<Product> getProducts() {
		List<Product> products = product.getAllProducts();
		return products;
	}
	
	@RequestMapping("/Products/{pc_id}")
	public List<Product> getProducts(@PathVariable("pc_id") Integer pcId) {
		System.out.println("in getProducts with pcId=" + pcId);
		List<Product> products = product.getProductByProductCatalogId(pcId);  //TODO - To change
		return products;
	}
	
	@RequestMapping(value="/SearchProductsByText", method=RequestMethod.POST)
	public ResponseEntity<List<Product>> searchProductsByText(@RequestBody ProductSearchDTO searchDTO) {
		List<Product> products = product.searchProductsByText(searchDTO.getSearchText());
		//return ResponseEntity.of(Optional.of(products)).status(HttpStatus.OK).build();
		return ResponseEntity.ok(products);
	}
	
	/*@RequestMapping("/getProductDeals")
	public List<Deal> getProductDeals() {
		List<Deal> deals = home.getProductDeals();
		return deals;
	}*/
}
