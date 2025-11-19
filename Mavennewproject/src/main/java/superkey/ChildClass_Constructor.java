package superkey;

public class ChildClass_Constructor extends ParentClass_Constructor {
	
	public ChildClass_Constructor()
	{
		// super();
		System.out.println("non para child");
	}
	public ChildClass_Constructor(int a,int b)
	{
		super(6);
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
	
		ChildClass_Constructor obj1=new ChildClass_Constructor();
		// ParentClass_Constructor obj2=new ParentClass_Constructor();
		ChildClass_Constructor obj3=new ChildClass_Constructor(20,30);
		//ParentClass_Constructor obj4=new ParentClass_Constructor(6);
	}

}
