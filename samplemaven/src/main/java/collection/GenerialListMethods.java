package collection;

import java.util.ArrayList;
import java.util.List;

public class GenerialListMethods {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> l = new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("Blue");
		l.add("Green");
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(1, "orange");
		System.out.println(l);
		System.out.println(l.indexOf("Blue"));
		System.out.println(l.lastIndexOf("Green"));
		System.out.println(l.remove("Blue"));
		System.out.println(l);
		System.out.println(l.contains("Green"));
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		
	}

}
