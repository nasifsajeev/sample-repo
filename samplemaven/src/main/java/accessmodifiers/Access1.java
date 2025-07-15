package accessmodifiers;

public class Access1 {
	public void display1() {
		System.out.println("public");
	}
	private void display2() {
		System.out.println("private");
	}
	protected void display3() {
		System.out.println("protected");
	}
	void display4() {
		System.out.println("default");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj1 = new Access1();
		obj1.display1();
		obj1.display2();
		obj1.display3();
		obj1.display4();
	}

}
