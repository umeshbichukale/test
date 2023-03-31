package A;

public  class Q {
	
	public int b = 20;
	
	private static Q obj = null;
	
	public  void m2() {
		System.out.println("Inside Q.m2");
	}
	
	
	private Q() { System.out.println("Inside Q constructor"); }
	 
	public static Q getObject() {
		
		if(obj == null) {
			obj = new Q();
			
			return obj;
		}
		
		return obj;
		
	}
	
	
	public static void main(String[] args) {
		
		Q obj = new Q();
		
		System.out.println(obj.b);
		
		obj.m2();
		
		//Default we can access in same package
		
		P pObj = new P();
		pObj.m3();
		System.out.println(pObj.a);
		
		A aObj = new A();
		aObj.m1();
		System.out.println(aObj.val);
	}

}
