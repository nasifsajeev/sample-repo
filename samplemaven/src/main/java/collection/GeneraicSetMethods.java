package collection;

import java.util.HashSet;
import java.util.Set;

public class GeneraicSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s = new HashSet<String>();
		s.add("Apple");
		s.add("Orange");
		System.out.println(s);
		Set <String> s1 = new HashSet<String>();
		s1.add("Banana");
		s1.add("Pineapple");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1.contains("Banana"));
		System.out.println(s.contains("Banana"));
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		System.out.println(s.remove("Apple"));
		System.out.println(s);
		System.out.println(s.removeAll(s1));
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.size());
		System.out.println(s);
		s.clear();
		System.out.println(s);
		System.out.println(s1);
		s1.clear();
		System.out.println(s1);
		s1.add("banana");
		s1.add("apple");
		s1.add("skjdfk");
		System.out.println(s1);
	}

}
