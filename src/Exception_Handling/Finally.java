package Exception_Handling;

public class Finally
{
	public static void main(String[] args)
	 {
	   int a = 10;
	   int b = 0;
	   int c = 0;
	   int d[] = { 1,2,3,4};  // array declare
		
	   try
		 {
			System.out.println(d[6]);   // Exception Code - ArrayOutofBondException
		 }
		
	   catch(ArithmeticException e)
		 {
			System.out.println("Hi");
		     c = a/b;                    // Exception Code - ArithmeticException
		 }
		
		finally 
		{
			System.out.println("Inside of Finally() code is run");
		}	
	 }
}
