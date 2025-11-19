package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		
		s.add("Welcome");
		s.add("To");
		s.add(null);
		s.add("Team");
		s.add("Welcome");
		s.add(null);
		System.out.println(s);
		// set is unordered,not related to index based
		//Duplication is not allowed.eg:null will print only one
		
		//addall()
		//size()
		//remove()
		//IsEmpty()
		
	 s.remove("Team");// object will remove
	 System.out.println(s);
	 //containsall();
	 // clear: to clear complete set
	 s.clear();
	 System.out.println(s);
	 
		s.add("Welcome");
		s.add("To");
		s.add(null);
		s.add("Team");
		s.add("Welcome");
		s.add(null);
		System.out.println(s);

	}

}
