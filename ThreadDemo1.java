
class T1 extends Thread{ // start, stop, join, sleep...
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}

class T2 extends A  implements Runnable { //run
     public void run() {
    		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) { //JVM
		
		T1 t1=new T1();
		t1.start();
		t1.setName("Student");
		//t1.setDaemon(true);
		//t1.interrupt();
		//t1.suspend();
		//t1.resume();
		//Thread.sleep(5000);
		
		T2 t2=new T2();
		Thread tt2=new Thread(t2); //runnable
		tt2.start();
		tt2.setName("Faculty");
		
		System.out.println(Thread.activeCount());
		// main
		System.out.println(Thread.currentThread().getName());

		
		
		try {
			t1.join();
			tt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());
	}

}
