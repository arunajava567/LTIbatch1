package client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import dto.Product;
import  service.ProductService;
import  service.ProductServiceImpl;
public class ProductTest {

	public static void main(String[] args) {
		
		
		
		//List<Product>  plist=new ArrayList<Product>();
		Map<Integer,Product> pmap=new HashMap<Integer,Product>();
		//entre login details
		System.out.println("entre product details");
		Scanner sc=new Scanner(System.in);
		int pid=0;
		String name=null;
		// reading  product objects list
		for(int i=0;i<3;i++) {
			pid=sc.nextInt();
			sc.nextLine();
			name=sc.nextLine();
		Product p=new Product();//sttaic 
		p.setId(pid);
		p.setName(name);   //dynamics
		pmap.put(pid,p);
		}
		//System.out.println(plist);
		ProductService ps =new ProductServiceImpl();
		boolean result= ps.validateAllProducts(pmap);
		System.out.println("Final result is :"+result );
	}

}
