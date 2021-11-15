package java8;

		interface Sayable{  
			    void say();  
			}  
		public class MethodReferenceStaticDemo {
           public static void saySomething(){  
		        System.out.println("Hello, this is static method.");  
			    }  
			    public static void main(String[] args) {  
			        // Referring static method  
		        Sayable sayable = MethodReferenceStaticDemo::saySomething;  
			        // Calling interface method  
			        sayable.say();  
			    }  
			}  
