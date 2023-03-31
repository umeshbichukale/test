package finalTest;

public class X {
	
	{
		System.out.println("Inside non static bloc");
	}

	public X() {
		System.out.println("Inside default const");
	}
	
	public X(int val) {
		this();
		System.out.println("Inside int constructor");
	}
	
	public static void main(String[] args) {
		
		X obj = new X();
		
		X obj1 = new X(10);
		
	}
}
