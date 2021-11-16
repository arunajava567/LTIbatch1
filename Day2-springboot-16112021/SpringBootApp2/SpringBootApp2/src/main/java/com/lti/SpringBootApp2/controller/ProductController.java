package com.lti.SpringBootApp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.SpringBootApp2.service.ProductService;
import com.lti.SprongBootApp2.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	/*
	 * @RequestMapping("/productdetails") public String getProductDetails() { return
	 * "Product details are here..."; }
	 */
	@GetMapping("/products")
	public List<Product> getAllProductDetails() {
		return productService.getAllProducts();  //response enitty as list of json
	}
	@PostMapping("/addproduct")
	public Product productService(@RequestBody Product product) {
		Product product1=productService.addProduct(product);
		return product1; //responseentity , 200 OK
	}
	@DeleteMapping("/deleteproduct/{id}")
	public String addProduct(  @PathVariable("id") Integer id ) {
		return "delete of product is done"+id;
	}
	@PutMapping("/updateproduct/{id}")
	public String updateProduct(  @PathVariable("id") Integer id ) {
		return "update product is done"+id;
	}
	
	
	
	
	
	
	

}
