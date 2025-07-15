package inheritance;

public class Child extends Parent{
	public void display3() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.display1();
		obj.display2();
		obj.display3();
	}
}
