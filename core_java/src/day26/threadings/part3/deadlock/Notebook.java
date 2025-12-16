package day26.threadings.part3.deadlock;

public class Notebook {

	
	public synchronized void use() {
		System.out.println(Thread.currentThread().getName() +" got notebook");
	}
}