package listTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListIteratorTest {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(5);
		al.add(8);
		al.add(9);
		
		ListIterator<Integer> litr = al.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
	}

}
