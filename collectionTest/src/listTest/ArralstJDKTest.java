package listTest;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArralstJDKTest {
	
	public static void main(String[] args) {
		
		
		ArrayList arrayList = new ArrayList();
		
		Integer ival = new Integer(1);
		
		arrayList.add(ival);
		
		Integer val = (Integer)arrayList.get(0);
		int fval = val.intValue();
		
		System.out.println(fval);
		
		
	}

}
