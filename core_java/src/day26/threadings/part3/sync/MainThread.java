package day26.threadings.part3.sync;

public class MainThread {
	
	public static void main(String[] args) throws Exception {
		
		Counter counter = new Counter();
		
		CustomThread t1 = new CustomThread(counter);
		CustomThread t2 = new CustomThread(counter);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		t1.start();
		
		t2.start();
	
		
	}

}