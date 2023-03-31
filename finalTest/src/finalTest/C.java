package finalTest;

public class C extends B {
	
	public C() {
		super(10);
		System.out.println("Inside C default constructor");
	}
	
	public C(int a) {
		this();
		System.out.println("Inside C int constructor");
	}
	
	static {
		System.out.println("Inside Static block");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		C obj = new C();
		
		C obj1 = new C(10);
	}
	
	//Output
	//Inside static block
	//Inside main method
	//Inside B int constructor
	//Inside non static block
	//Inside C default constructor
	//Inside B int constructor
	//Inside non static block
	//Inside C default constructor
	//--Inside non static block
	//Inside C int constructor

}
