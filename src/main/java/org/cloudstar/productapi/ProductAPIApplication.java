package org.cloudstar.productapi;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ProductAPIApplication implements CommandLineRunner{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductAPIApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Map<String, Object>> a = jdbcTemplate.queryForList("show tables");
		a.forEach(System.out::println);
	}
	
}
