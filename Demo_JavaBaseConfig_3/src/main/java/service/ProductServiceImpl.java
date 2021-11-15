package service;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import dto.Product;
public class ProductServiceImpl  implements ProductService{

	public boolean validateAllProducts(Map<Integer,Product> pmap)
	{   // product id should be 1 to 100
		boolean result=false;
		int count=0;
		Set pset=pmap.entrySet();
		Iterator i=pset.iterator();   // key,proudct
		while(i.hasNext()) {
			Entry e=(Entry)i.next();   // getKey() , getValue() - ---> Object
			
			System.out.println((Product)e.getValue());
			if( (Integer)e.getKey()>=1 && (Integer)e.getKey() <=100)
				count++;
		}
			if(count==pmap.size())
				 result=true;
		
		return result;
	}
}
