package inheritance;

public class Hira_Child1 extends Hira_Parent{
	
	public void view()
	{
		System.out.println("Rama");
	}

	public static void main(String[] args) {
		
		Hira_Child1 obj=new Hira_Child1();
		obj.display();
		obj.view();

	}

}
