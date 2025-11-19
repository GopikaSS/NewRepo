package accessspecidfier2;

import accesspecifier.Accessspecifier;

public class Class_Accessspecifier_Second extends Accessspecifier{

	
	public static void main(String[] args) {
		Class_Accessspecifier_Second obj=new Class_Accessspecifier_Second();
		obj.dispaly();
		obj.show();
		Accessspecifier obj1=new Accessspecifier();
		obj1.dispaly();
		// obj1.show():outside the package ,will take child class only
				
	}

}
