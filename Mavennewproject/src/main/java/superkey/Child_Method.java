package superkey;

public class Child_Method extends Parent_Method {
	
	public void show()
	{
		System.out.println("THIS IS CHILD METHOD");
		super.display();// super keyword is 
		super.view(20, 30);
		this.match();// current class we call call using this keyword
	}

	public void match()
	{
		System.out.println("METHOD");
	}
	public static void main(String[] args) {
		
		Child_Method obj=new Child_Method();
		// obj.display();
		obj.show();
		

	}

}
