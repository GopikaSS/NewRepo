package abstrac;

public class Class_Abstract extends Parent_Abstract{

	public static void main(String[] args) {
		
		Class_Abstract obj=new Class_Abstract();
		obj.display();
		System.out.println(obj.show());
		obj.view();

	}

	@Override
	public void display() {
		
		System.out.println("hello");
		
	}

	@Override
	public int show() {
		

		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}

}
