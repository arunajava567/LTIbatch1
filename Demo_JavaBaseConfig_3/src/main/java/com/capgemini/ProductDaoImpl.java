package com.capgemini;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {
	 EntityManager entityManager=JPAUtil.getEntityManager();
			 
	 
	// EntityManager entityManager=entityManagerFactory.createEntityManager();
	 public void addProduct(Product p) {
		 
		 System.out.println(" in dao....");
		 entityManager.getTransaction().begin();
		 entityManager.persist(p);   //insert
		 entityManager.getTransaction().commit();
		 System.out.println(" ...persisted....");
	 }
	 
	 public List<Product> listAllProducts(){
		 
		
		 Query q=entityManager.createQuery("select p from Product p");
	     List<Product> plist=q.getResultList();  //select
		 return plist;
	 }
	 
	 public Product getProductById(int id) {
		 Product p=entityManager.find(Product.class, id);  //select
		 return p; 
	 }
	 public void  deleteProduct(int id) {
		 Product p=entityManager.find(Product.class, id);
		 entityManager.getTransaction().begin();
		 entityManager.remove(p);  //delete
		 entityManager.getTransaction().commit();
		 System.out.println(" ...deleeted...");
	 }
	 public void  updateProduct(int id) {
		 Product p=entityManager.find(Product.class, id);
		 entityManager.getTransaction().begin();
		 p.setName("xxxx");
         p.setPrice(6666.88);
		 entityManager.getTransaction().commit();   //update 
		 System.out.println(" ...deleeted...");
	 }

}
