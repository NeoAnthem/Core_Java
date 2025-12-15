package day25.threadings.part2;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		
		
		for(int i = 10; i>=1;i--) {
			try {
				System.out.println(Thread.currentThread().getName() + " = "+i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}