package com.lti.SpringBootApp2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.SprongBootApp2.model.Product;

@Repository
public class ProductDao {
	
	public static ArrayList<Product> productList=new ArrayList<>();
	
	public Product addProduct(Product product) {
		productList.add(product);
		return product;
	}
	
	public List<Product> getallProducts() {
		return productList;
	}

}
