package day25.threadings.part2;

public class ThreadMain2 {

	public static void main(String[] args) throws Exception {
		RunnableImpl runnableImpl = new RunnableImpl();
		
		Thread thread1 = new Thread(runnableImpl);
		
		CustomThread thread2 = new CustomThread();
		
		thread1.setName("my_thread_1");
		thread2.setName("my_thread_2");
		
		// We have to start the thread not call run method 
		// start will internally call run() method
		thread1.start();
		thread1.join();
		
		thread2.start();
		thread2.join(5000);
		
		
		System.out.println("I am Main Message My THread Name is: "+Thread.currentThread().getName());
	}
}