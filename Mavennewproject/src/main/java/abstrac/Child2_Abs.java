package abstrac;

public class Child2_Abs extends Abs_Second_Class{
	
	public Child2_Abs()
	{
		super(20);
		System.out.println("CHILD CLASS CONSTRUCTOR");
	}
	
	public void show()
	{
	System.out.println("THIS IS A CHILD CLASS");
	}

	public static void main(String[] args) {
		
		Abs_Second_Class obj=new Child2_Abs();//
		
		obj.display();
		obj.view();
		// obj.show: we can't access child cls property by creating parent cls object or reference.Need to create child cls object.
	}

	@Override
	public void display() {
		
		System.out.println("Hi Deva");
		
		System.out.println("Hi Rama");
		
	}

}
