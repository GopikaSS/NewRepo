package exception;

public class Throw_Parent {

	public static void main(String[] args) throws Exception{
	 int age =15;
	 if(age> 18) {
		 System.out.println("Eligible for votting");
	 }
	 else {
		 
		 throw new Exception("Not eligible for votting");
	 }
		 

	}

}
