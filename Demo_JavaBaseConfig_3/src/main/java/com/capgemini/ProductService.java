package com.capgemini;

import java.util.List;



public interface ProductService {

	
	 public void addProduct(Product p);
	 
	 public List<Product> listAllProducts();
	 
	 public Product getProductById(int id);
	 public void  deleteProduct(int id) ;
	 public void  updateProduct(int id) ;
}
