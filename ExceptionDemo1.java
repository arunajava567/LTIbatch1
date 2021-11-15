import java.io.*;

class DepositException extends Exception{
	DepositException(String msg){
		System.out.println(msg);
		
	}
}

class A{
	void show() throws InterruptedException,IOException
	{
		try {
			String s="Ram";
			System.out.println(s.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ExceptionDemo1 extends A{
	
	 void show() throws InterruptedException // ,IOException 
	 {
		Thread.sleep(400); 
		//FileReader f1=new FileReader("e:\\abc.txt");
	}
	
//exception propagation
	public static void main(String[] args)throws DepositException,InterruptedException,IOException 
	{  
		
		int amt=1500;
		if(amt<1000) {
			throw new DepositException("Minimum amount to be deposited is 1000/-");
		}
		else
			System.out.println(" Thanks for deposit transaction");
		
		
		ExceptionDemo1 ed1=new ExceptionDemo1();
		
		try {
			ed1.show();  //java7 
		} catch (InterruptedException  e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		//   compiler    , JVM
		
		String name=null;
		
		
	//	System.out.println(name.length()); //runtime
		
		//int x[]= {4,5,6};
		
	//	System.out.println(x[4]);  //runtime
		
	//	Thread.sleep(400);  //compile 
		
		try {//executable   //file, db,socket
			
			try {
				int y=4/0;
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int x[]= {4,5,6};  //0,1,2
			
				System.out.println(x[4]);  //runtime
				
		} 
		//System.out.println("====");
		/*
		 * catch (ArithmeticException e) { //to display exception // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		
		catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace(); //
			//System.out.println(e);
			try {
				
			}
			catch(ArithmeticException e1)
			{}
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {  // closing resource , exception is raised / not raised 
			   //optional
		System.out.println("Thank you");
		try {
			
		}
		catch(ArithmeticException e1)
		{}
		}

		// try {} finally{}  -> catch is optional
		//try {} catch{}  finally is optional
		
	}

}
