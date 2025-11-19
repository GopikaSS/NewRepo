package inheritance;

public class Child_Class extends Intermediate_Class {
	
	public void display()
	{
		System.out.println("Hi");
	}
	

	public static void main(String[] args) {
		
		Child_Class obj3= new Child_Class();
		obj3.display();
		obj3.view();
		obj3.show();
		

	}

}
