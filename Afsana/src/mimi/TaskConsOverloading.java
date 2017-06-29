package mimi;

public class TaskConsOverloading {

	public static void main(String[] args) {
		Task t1 = new Task();
		Task t2 = new Task(30);
		Task t3 = new Task(30, 40);
		
		t1.show();
		t2.show();
		t3.show();

	}

}
