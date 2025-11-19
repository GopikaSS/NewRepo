package exception;

public class CustomExeption {

	public static void main(String[] args) throws votingException {
		int age=15;
		if(age>18)
		{
		System.out.println("Eligible for votting");
	     }
		else
		{
			throw new votingException("Not eligible");
		}
}
}

