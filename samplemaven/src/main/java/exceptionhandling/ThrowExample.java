package exceptionhandling;

public class ThrowExample {
	
	ThrowExample(int age){
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		else {
			throw new NumberFormatException("Age under 18");
		}
	}
	public static void main(String[] args) {
		ThrowExample obj = new ThrowExample(7);
	}

}
