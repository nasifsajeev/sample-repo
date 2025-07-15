package inheritance;

public class HeirarchialChild2 extends HeirarchialParent {
	public void display3() {
		System.out.println("child2 class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialChild2 obj1 = new HeirarchialChild2();
		obj1.display1();
		obj1.display3();
	}

}
