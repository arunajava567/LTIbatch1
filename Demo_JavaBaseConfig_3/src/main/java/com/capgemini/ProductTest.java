package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ProductTest {
	@Autowired
static	ProductServiceImpl productServiceImpl;
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= 
				new AnnotationConfigApplicationContext(ProductConfig.class);
		//Book book1=(Book)ctx.getBean("book");
		ProductServiceImpl productServiceImpl=(ProductServiceImpl)ctx.getBean("productServiceImpl");

		
		Product p=new Product();
		p.setName("book");
		p.setPrice(234.99);
		System.out.println("in product app");
		//ProductService ps=new ProductServiceImpl();
		productServiceImpl.addProduct(p);
		System.out.println("product list");
		List<Product> plist= productServiceImpl.listAllProducts();
		//plist.stream().forEach(System.out::println);
		for(Product p1: plist) {
			System.out.println(p1);
		}
		/*System.out.println("product details for product id : 46 ");
		
		Product p2=ps.getProductById(46);
		System.out.println(p2);
		
	System.out.println("delete  : 46 ");
		
		ps.deleteProduct(46);
		System.out.println("deleted...");
		
System.out.println("update : 49");
		
		ps.updateProduct(49);
		System.out.println("deleted...");
		*/
	
	}
}
