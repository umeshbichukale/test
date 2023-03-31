package finalTest;

public class Test //extends Student 
{

	/*
	 * void show() { System.out.println("Inside Test"); }
	 */
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	private void display() {
		System.out.println("Inside private TEst display method");
	}
	
	static void m1() {
		System.out.println("Inside static Test m1 method");
	}
	
	public static void main(String[] args) {
		
		Test obj = new Test();
		
		Student obj1  =new Student();
		
		obj1.show();
		//obj1.display();
		
		obj.m1();
		
		Student.m1();
	}
}
