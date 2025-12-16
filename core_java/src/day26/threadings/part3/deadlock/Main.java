package day26.threadings.part3.deadlock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen pen = new Pen();
		Notebook notebook = new Notebook();
		
		Person1 person1 = new Person1(notebook, pen);
		Person2 person2 = new Person2(notebook, pen);
		
		person1.setName("Person 1 Thread");
		person2.setName("Person 2 Thread");
		
		person1.start();
		person2.start();

	}

}