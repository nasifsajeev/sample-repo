package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("Nasif");
		l.add(4);
		System.out.println(l);
		l.add("Badusha");
		l.add("Arshid");
		System.out.println(l);
		System.out.println(l.get(3));
		l.set(3, 6);
		System.out.println(l);
		System.out.println(l.indexOf("Badusha"));
		System.out.println(l.lastIndexOf(6));
		l.remove("Badusha");
		System.out.println(l);
		System.out.println(l.contains("Badusha"));
		System.out.println(l.isEmpty());
		System.out.println(l.size());

	}

}
