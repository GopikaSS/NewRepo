package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		System.out.println(l);
		// add() ; Add method:in set new element in the collection
	l.add("Red");
	l.add("Green");
	l.add("Blue");
	l.add("Blue");
	System.out.println(l);
	
	// indexOf(): to return the index of the object
	
	System.out.println(l.indexOf("Green"));
	System.out.println(l.indexOf("Blue"));//repeated obj will take first occurance
	
	// lastIndexOf(): will give index of last occurance
	
	System.out.println(l.lastIndexOf("Blue"));
	
	System.out.println(l.lastIndexOf("White"));// checking the index of not in the object in the list
	
	//Contains();to check whether an element is present or not.If it is present  it return true value or it show false
	
	System.out.println(l.contains("Green"));
	System.out.println(l.contains("White"));
	
	// get(): to get an element based on index postion
	
	System.out.println(l.get(2));
	
	//remove(): to remove elemts based on index
	
	System.out.println(l.remove(1));
	System.out.println(l);
	
	//isEmpty:To check whether an list is empty or not
	
	System.out.println(l.isEmpty());
	
	for(int i=0;i<=2;i++)
	{
	System.out.println(l.get(i));
	
	
	}
}
}
