package day26.threadings.part3.deadlock;

public class Person1 extends Thread {
	
	public Notebook notebook;
	
	public Pen pen;

	public Person1(Notebook notebook, Pen pen) {
		super();
		this.notebook = notebook;
		this.pen = pen;
	}
	
	@Override
	public void run() {

		// Person 1 Pen
		pen.write(notebook);
	}

}