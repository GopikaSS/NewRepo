package encapsulation;

public class Child_Encapsulation {

	public static void main(String[] args) {
		
		Parent_Encapsulation obj=new Parent_Encapsulation();
		obj.setName("Deva");
		obj.setAge(25);
		System.out.println(obj.getName());// return type used,so invoke in print
		System.out.println(obj.getAge());

	}

}
