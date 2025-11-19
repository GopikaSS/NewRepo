package accesspecifier;

public class Accessspecifier {
	
	public void dispaly()
    {
    	System.out.println("PUBLIC METHPD");
    }
    private void view()
    {
    	System.out.println("PRIVATE METHOD");
    }
    void defaultmethod()
    {
    	System.out.println("DEFAULT METHOD");
    }
    protected void show()
    {
    	System.out.println("PROTECTED METHOD");
    }
	public static void main(String[] args) {

		Accessspecifier obj=new Accessspecifier();
		obj.dispaly();
		obj.view();
		obj.defaultmethod();
		obj.show();

	}

}
