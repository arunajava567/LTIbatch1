package com.lti.SpringApp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App   // app is dependent on product
{
    public static void main( String[] args )
    {
    //  Product p=new Product(101,"Box");
      
      //System.out.println(p);
    	
    	//container ? IOC
    	
    	//BeanFactory context=new XmlBeanFactory(new )
    	//FileSystemXmlApplicationContext("......\beans.xml");
    	//WebXmlApplicationContext("......\beans.xml");
    	 //Annotation....	
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	
    	Product p= (Product)context.getBean("p");
    	System.out.println(p+"  "+p.hashCode());
    	Product p1= (Product)context.getBean("p");
    	System.out.println(p1+"   "+p1.hashCode());
    	Account a1=(Account)context.getBean("a");
    	System.out.println(a1);
    //	context.registerShutdownHook();
    	//context.stop();
    	//context.destroy();
    	context.close();
    	
    }
}
