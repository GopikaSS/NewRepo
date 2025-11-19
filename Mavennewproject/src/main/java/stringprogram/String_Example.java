package stringprogram;

public class String_Example {

	public static void main(String[] args) {
		
		String s ="Hi Deva";
		System.out.println(s);
				String s1=new String(" Hi Shiva");
				System.out.println(s1);
		// legnth() length of the String
				
				System.out.println(s.length());
				
				// concate-add two strings
				
				System.out.println(s.concat(s1));
				System.out.println(s);
				//charAt()---to return the character of the string

				System.out.println(s.charAt(3));
				//contains--to check whether a character or word present in the string/if it is present will return true
	String g="Hi all good morning and have a nice a day";
	
	System.out.println(g.contains("good"));
	System.out.println(g.contains("bad"));
	
	String i= "java";
	String j="java";
	String k="Java";
	String l="Selenium";
	
	//equals()--to compare two strings
	
	System.out.println(i.equals(j));
	System.out.println(i.equals(k));
	System.out.println(i.equals(l));
	
	//equalsIgnoreCase()-will ignore the case,will return the content only
	System.out.println(i.equalsIgnoreCase(k));
	//toUpperCase()--to convert the lowercase to uppercase
	
	System.out.println(i.toUpperCase());
	
	//toLwerCase()--covert upper to lower
	
	System.out.println(i.toLowerCase());
	
   //isEmpty()-check whether a string is empty or not
	String p="Selenium";
	System.out.println(p.isEmpty());
	
	String q="";
	
	System.out.println(q.isEmpty());
	
	//valueOf()--to convert any datatype to string
	
	int t=20;

	System.out.println(String.valueOf(t));
	
	int o=10;
	System.out.println(String.valueOf(o));
	
	String x="Rama";
	String y="Rama";
	String z= new String ("Rama");
	System.out.println(x.equals(y));
	System.out.println(x==y);
	System.out.println(x.equals(z));
	System.out.println(x==z);// The == operator is used to compare object references, meaning it checks if two variables point to the same memory location.
	//On the other hand, the .equals() method is used to compare the values of objects.
	
	}	
}
