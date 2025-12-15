package day25.threadings.part1;

public class CustomThread extends Thread {
	
	@Override
	public void run() {


		for(int i = 1; i<= 20; i++) {
			System.out.println(Thread.currentThread().getName()+" = "+i);
		}
		
	}

}