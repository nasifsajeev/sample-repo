package inheritance;

public class HeirarchialChild1 extends HeirarchialParent{
	
	public void display2() {
		System.out.println("child1 class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialChild1 obj1 = new HeirarchialChild1();
		obj1.display1();
		obj1.display2();
	}

}
