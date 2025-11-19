package encapsulation;

public class Parent_Encapsulation {
	
	private String name;
	private int age;
	
	public void setName(String name)
	{
	this.name=name;
	}
    public String getName()// return use chyyunnond bcz it is a get method,value will be return String used
    
    {
    	return name;
    }
    public void setAge(int age)
    
    {
    this.age=age;	
    }
    
    public int getAge()
    {
    	return age;
    }
}
