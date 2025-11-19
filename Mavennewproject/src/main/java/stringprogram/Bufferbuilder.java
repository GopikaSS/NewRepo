package stringprogram;

public class Bufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1= new StringBuffer("Rama");
		StringBuilder s2=new StringBuilder("Deva");
		System.out.println(s1);
		System.out.println(s2); //sysoutctrlspace
		
		// insert();to insert new value into string based on the index position.
		System.out.println(s1.insert(2, "Lakshman"));
		System.out.println(s1);
		
	//apppend(): add the new string at last
		System.out.println(s1.append("Devi"));
		
		// replace(): to replace a string to another string based on index
		System.out.println(s1.replace(1, 4, "priya"));
		System.out.println(s1.replace(1, 18, "ama"));
		
		// delete(): to delete based on index
		
		System.out.println(s2.delete(1, 3));
		
		//reverse(): to reverse a string
		
		System.out.println(s1.reverse());
		
		
	}

}
