package inheritance;

public class SingleChild extends SingleParent {
	
	
		public void print()
		{
			System.out.println("child class");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SingleChild obj1 = new SingleChild();
			obj1.display();
			obj1.print();
			obj1.display();
	}

}
