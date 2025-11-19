package interfacepack;

public class Childclass_Interface implements Interface_Parent{

	public static void main(String[] args) {
		Childclass_Interface obj=new Childclass_Interface();
		obj.display();
		obj.view();
		Interface_Parent.show();
		System.out.println(a);
		Interface_Parent obj1=new Childclass_Interface();
		obj1.display();
		obj1.view();

	}

	@Override
	public void display() {
		System.out.println("display");
		
	}

}
