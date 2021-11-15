package com.cg.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//     <context:component-scan base-package="com.cg.anno"/>

//@Component ,@Value  ,@Autowired 


public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {
		//container to create beans,maintain scope of the bean, lifeyccle 
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("anno.xml");
		
		/*
		 * CurrencyConverter curr = (CurrencyConverter)
		 * factory.getBean("currencyConverter");
		 * 
		 * CurrencyConverterImpl client= new CurrencyConverterImpl(); double rupees =
		 * curr.dollarsToRupees(50.0); System.out.println("50 $ is "+rupees+" Rs.");
		 */	
		//Product p=new Product();
		//singleton
		Product pp=(Product)factory.getBean("p");
		
		Product pp1=(Product)factory.getBean("p");
		System.out.println(pp+"   "+pp1);
		System.out.println(pp.productDetails());
		System.out.println(pp1.id  +"   "+pp1.name);
		factory.destroy();
		
	}
}
