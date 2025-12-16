package day26.threadings.part3.sync;

public class Counter {
	
	public int count = 0;
	
	public synchronized void increment() {
		count++;
	}

}