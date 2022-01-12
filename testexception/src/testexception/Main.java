package testexception;

public class Main {

	public static double operation (double a, double b) throws Myexception 
	{
	
		if (b==0.0) 
			throw new Myexception("numerator cannot be zero");
			return a/b;
			
		
	}
	public static void main(String[] args) {

		String a= "12.50";
		double b= 0.0;
		
		try {
			double c = Double.parseDouble(a);
			System.out.println("opt: " +operation(c,b));
		}
		catch (Myexception e)
		{
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("\ngood Luck-->!!");
		}
	}

}
