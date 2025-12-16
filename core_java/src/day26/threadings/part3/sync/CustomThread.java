package day26.threadings.part3.sync;

public class CustomThread extends Thread {
	
	public Counter counter;

	public CustomThread(Counter counter) {
		
		this.counter = counter;
	}
	
	
	@Override
	public void run() {

		for(int i = 1; i<=50;i++) {
			counter.increment();
		}
		System.out.println("Value of counter by "+Thread.currentThread().getName()+" is = "+counter.count);
		
	}
	

}