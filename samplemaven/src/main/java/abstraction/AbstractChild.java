package abstraction;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj = new AbstractChild();
		obj.display(5,6);
		obj.show();

	}
	

	@Override
	public void display(int a, int b) {
		// TODO Auto-generated method stub
		
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
