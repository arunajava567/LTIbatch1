package com.capgemini;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



@Configuration  //spring version 4.0....
public class ProductConfig {
		
	
	@Bean
	public ProductServiceImpl productServiceImpl() {
		ProductServiceImpl productServiceImpl=new ProductServiceImpl();
		return productServiceImpl;
	}
	@Bean
	ProductDaoImpl productDaoImpl() {
		ProductDaoImpl productDaoImpl=new ProductDaoImpl();
		return productDaoImpl;
	}


	}
