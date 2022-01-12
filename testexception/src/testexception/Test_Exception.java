package testexception;

public class Test_Exception {

	
	public static void main(String[] args) {

		 /*int a=7;
		 int b=0;
		 int c= a/b;*/
		String a="5.25";
		double b=0.0;
		
		try { 									// Block of code to try
		
			double c= Double.parseDouble (a)/b;
		
		 System.out.println("c = "+c);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("good Luck");
			
		}
		
		}

}
