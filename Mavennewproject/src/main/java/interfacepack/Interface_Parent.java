package interfacepack;

public interface Interface_Parent {
	
	public static final int a=6;
	int b=4;

	public abstract void display();
	default void view()
	{
		//b=9; final field can't assign no value,cant change
		System.out.println("view");
	}
	public static void show()
	{
		System.out.println("show");	
	}
}

