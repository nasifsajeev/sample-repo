package interfacepackage;

public class InterfaceChild implements InterfaceParent,GrandParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj = new InterfaceChild();
		obj.display();
		obj.show();
		obj.show1();


	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method");
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("show1 method");
		
	}

}
