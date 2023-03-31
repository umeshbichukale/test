package finalTest;

public class A {
	
	static final int a = 20;
	
	final int b;
	
	final static int c;
	
	static {
		c = 40;
	}
	
	public A(int val) {
		b = val;
		//c = 30;
	}
	
	void m1() {
		//b = 30;
	}
	
	public static void main(String[] args) {
		
		//a=30;
		A obj = new A(10);
		
		//obj.b = 80;
		//c = 100;
	}

}
