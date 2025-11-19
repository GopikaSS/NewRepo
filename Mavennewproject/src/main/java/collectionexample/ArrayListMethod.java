package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Deva");
		obj.add("Rama");
		obj.add("Seetha");
		
		System.out.println(obj);
		
		ArrayList<String> a = new ArrayList<String>();// a is variable
		a.add("Priya");
		a.add("Diya");
		a.add("Ramya");
		System.out.println(a);
		
		// addAll():To add elements from one list to another list or combine two list
		 //we will get the true/false
		System.out.println(obj.addAll(a));//adding a to obj
		System.out.println(obj);
		
		//containsAll: to check whether a list is present in another list
		
		System.out.println(obj.containsAll(a));// true
		System.out.println(a.containsAll(obj));// false
		
		// size(): to check the length of the list
		
		System.out.println(obj.size());
		
		// Iterator
		
		//hasnext():It return true if the collections has more element,and enter into the loop
		//next():Print the next element in the iteration
		//remove():used to remove the last element
		
		Iterator<String> b= obj.iterator();
		
		while(b.hasNext())
		{
		System.out.println(b.next());
		}
	b.remove();
	System.out.println(obj);
	

}
}
