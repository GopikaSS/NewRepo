package superkey;

public class Superkey_Child extends Superkey_Parent{

	
	String color="WHITE";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		
		Superkey_Child obj=new Superkey_Child();
		System.out.println(obj.color);
		obj.display();
	}

}
