package day26.threadings.part3.reusable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain2 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(() -> {

			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " = " + i);

				try {
					System.out.println(Thread.currentThread().getName() + " sleeping for 1sec" );
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});

		executorService.execute(() -> {

			for (int i = 100; i >= 10; i-=10) {
				System.out.println(Thread.currentThread().getName() + " = " + i);

				try {
					System.out.println(Thread.currentThread().getName() + " sleeping for 2sec" );
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		executorService.shutdown();
	}

}