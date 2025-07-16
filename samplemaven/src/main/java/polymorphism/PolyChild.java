package polymorphism;

public class PolyChild extends PolyParent{
	public void display(int a , int b) {
		int sub = a - b;
		System.out.println(sub);
		super.display(7, 8);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChild obj = new PolyChild();
		obj.display(9,8);
	}

}
