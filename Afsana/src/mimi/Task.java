package mimi;

public class Task {
	int p;
	int q;
	public Task() {
		p = 3;
		q = 6;
		System.out.println("This is the first constructor.");
	}
	
	public Task(int a) {
		p = a;
		System.out.println("This is the second constructor.");
	}
	
	public Task(int a, int b) {
		p = a;
		q = b;
		System.out.println("This is the third constructor.");
	}
	
	public void show() {
		System.out.println("The value of p is: " + p);
		System.out.println("The value of q is: " + q);
	}
	 
}
