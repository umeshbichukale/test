package B;


import A.*;
import A.X;

public class Y extends A{
	
	public static void main(String[] args) {
		
		X obj = new X();
		
		obj.a = -20;
		
		System.out.println(obj.a);
		
		obj.m1();
		
		
		
		/* Q obj1 = new Q(); System.out.println(obj1.b); obj1.m2(); */ 
		 
		 Q Qobj = Q.getObject();
		 
		 Qobj.m2();
		 System.out.println(Qobj.b);
		 
		 P pObj = new P();
		 //pObj.m3();
		 //System.out.println(pObj.a);
		 
		A aObj = new A();
		//aObj.m1();
		//System.out.println(aObj.val);
		
		A aobject = new A();
		
		Y yObj = new Y();
		yObj.m1();
		System.out.println(yObj.val);
			
		
	}

}
