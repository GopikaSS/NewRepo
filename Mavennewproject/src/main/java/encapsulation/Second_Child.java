package encapsulation;

public class Second_Child {

	public static void main(String[] args) {
		
		Second_Parent obj=new Second_Parent();
		obj.setName("Deva");
		obj.setAge(25);
		System.out.println(obj.getName());
        System.out.println(obj.getAge());
	}

}
