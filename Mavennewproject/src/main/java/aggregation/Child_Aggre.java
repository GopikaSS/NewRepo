package aggregation;

public class Child_Aggre {
   String subject;// instance variable
   int id;
   Parent_Aggre ref;
	public Child_Aggre(String subject,int id,Parent_Aggre ref)//constructor
	{
		this.subject=subject;// using this keyword-refer to the method
		this.id=id;
		this.ref=ref;
	}
	
	public void display()// method
	
	{
		
		System.out.println(subject+ " "+ id);
		System.out.println(ref.name+" "+ ref.age);
	}
	public static void main(String[] args) {
		Parent_Aggre obj1=new Parent_Aggre("Deva",26);
		Child_Aggre obj=new Child_Aggre("Maths",1234,obj1);//child class object creation
		obj.display();
	}

}
