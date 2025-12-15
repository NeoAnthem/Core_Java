package day25.threadings.part1;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		
		
		for(int i = 10; i>=1;i--) {
			System.out.println(Thread.currentThread().getName() + " = "+i);
		}
		
	}

}