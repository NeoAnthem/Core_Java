package day26.threadings.part3.reusable;

public class ThreadMain {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			
			System.out.println("Thread 1 Started");
		}) ;
		
		t1.start();
		Thread t2 = new Thread(()->{
			
			System.out.println("Thread 2 Started");
		}) ;
		
		t2.start();
	}

}