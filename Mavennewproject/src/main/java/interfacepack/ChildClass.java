package interfacepack;

public class ChildClass implements Interface_A,Interface_B{
	
	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		obj.sum();
		obj.sub();
		obj.mul();

	}

	@Override
	public void sub() {
		System.out.println("Hello");
		
	}

	@Override
	public void sum() {
		System.out.println("Hi");
		
	}

	@Override
	public void mul() {
		System.out.println("hi rama");
		
	}

	

}
