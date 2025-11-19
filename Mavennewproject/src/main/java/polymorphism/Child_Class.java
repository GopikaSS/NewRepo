package polymorphism;

public class Child_Class extends Parent_Class {
	
	public void dispaly(int a,int b) // same method
	{
		super.dispaly(10, 20);// parent call
		int c=a+b;
		System.out.println(c);
	}
	public int show(int i,int j) 
	{
	System.out.println(super.show(40,10));
		int d=i*j;
		return d;
	}
	
	
	@Override
	public void view(float a, float b) {
		
		super.view(80.00f, 20.00f);
		System.out.println(a-b);
	}
	public static void main(String[] args) {

		Child_Class obj=new Child_Class();
		obj.dispaly(20, 30);
       System.out.println(obj.show(30, 100));
       obj.view(20.00f, 10.09f);
	}
	
}
