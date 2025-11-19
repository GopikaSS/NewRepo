package final_keyword;

public class ClassFinal_keyword {
	
	public final void finalmethod()
	{
		System.out.println("HI");
	}

	public static void main(String[] args) {
		
     final int a=6;
      // a=40; final variable value can't edit
     
     ClassFinal_keyword obj=new ClassFinal_keyword();
     obj.finalmethod();
	}

}
