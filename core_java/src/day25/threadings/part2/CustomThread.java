package day25.threadings.part2;

public class CustomThread extends Thread {
	
	@Override
	public void run() {


		for(int i = 1; i<= 20; i++) {
			
			try {
				System.out.println(Thread.currentThread().getName()+" = "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}