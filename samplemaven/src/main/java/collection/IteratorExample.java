package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> s = new HashSet<String>();
		s.add("Nasif");
		s.add("Thoufeek");
		s.add("Arshid");
		System.out.println(s);
		System.out.println(s);
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(s);
		
		

	}

}
