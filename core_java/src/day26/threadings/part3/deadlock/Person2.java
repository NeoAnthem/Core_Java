package day26.threadings.part3.deadlock;

public class Person2 extends Thread {
	
	public Notebook notebook;
	
	public Pen pen;

	public Person2(Notebook notebook, Pen pen) {
		super();
		this.notebook = notebook;
		this.pen = pen;
	}
	
	@Override
	public void run() {

		// Person 2 Notebook
//		notebook.use();
		pen.write(notebook);
	}

}