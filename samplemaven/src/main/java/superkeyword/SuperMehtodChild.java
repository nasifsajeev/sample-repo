package superkeyword;

public class SuperMehtodChild extends SuperMethodParent{
	public void print() {
		System.out.println(" mehtod print");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMehtodChild obj = new SuperMehtodChild();
		obj.print();
	}

}
