package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild() {
		super(5,6);
		System.out.println("Superconstructor child");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();
	}

}
