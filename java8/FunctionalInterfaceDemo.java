package java8;

//@FunctionalInterface
interface Arith{
	
	int op(int a,int b);
	
	//int product(int a,int b);
}
//java8
interface X{
	
	default void disp() {
		
	}
	
	static void showsttaic() {
		
	}
}

/*
 * class sub implements Arith{ 
 * public int op(int a,int b) 
 * { return a+b; }
 * 
 * }
 */
//() -> { }
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		Arith arith=(a,b)-> a+b ;
		System.out.println(arith.op(5,6));
		
		Arith arith1=(a,b)-> a*a+b*2 ;
		System.out.println(arith1.op(5,6));
		
	}

}


//FI   ->
//Interface - default, static 
//Lambda Expression
//Stream()
//Optional 
//Date and Time
