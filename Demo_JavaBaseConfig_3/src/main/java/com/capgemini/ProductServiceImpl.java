package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl  implements ProductService{
   @Autowired
	ProductDaoImpl productDaoImpl;//=new ProductDaoImpl();

	public void addProduct(Product p) {
		System.out.println("in   service....");
		productDaoImpl.addProduct(p);
	}
	 public List<Product> listAllProducts(){
		 List<Product> plist=productDaoImpl.listAllProducts();
		 return plist;
	 }
	 public Product getProductById(int id) {
		 Product p=productDaoImpl.getProductById(id);
		 return p;
	 }
	 public void  deleteProduct(int id) {
		 productDaoImpl.deleteProduct(id);
	 }
	 public void  updateProduct(int id) {
		 productDaoImpl.updateProduct(id);
	 }
}
