package exceptionhandling;

public class CustomException {
	  CustomException(int age) throws VotingException{
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		else {
			throw new VotingException("Age under 18");
		}
	}

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		CustomException obj = new CustomException(5);
	}
	
}
