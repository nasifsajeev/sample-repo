package multipleinheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2{
	public void print() {
		System.out.println("Print method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj = new MultipleChild();
		obj.display();
		obj.print();
		obj.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method");
		
	}

}
