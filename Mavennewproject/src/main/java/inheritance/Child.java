package inheritance;

public class Child extends Parent {

	
	public void display ()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		Child obj=new Child ();
		obj.display();
		 obj.show();
		 Parent obj1=new Parent();
		 obj1.show();
		// obj1.display(): we can not access child class property by creating parent class object

	}

}
