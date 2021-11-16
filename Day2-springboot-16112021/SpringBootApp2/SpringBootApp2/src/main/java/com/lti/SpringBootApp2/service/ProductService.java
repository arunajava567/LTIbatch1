package com.lti.SpringBootApp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.SpringBootApp2.dao.ProductDao;
import com.lti.SprongBootApp2.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}
	
	
	public List<Product> getAllProducts() {
		return productDao.getallProducts();
		
	}
	

}
