package Try_And_Catch;

public class Using_ExceptionClass 
{
	public static void main(String[] args)
	 {
	   int a = 10;
	   int b = 0;
	   int c = 0;
		
		try
		 {
			 c = a/b;                    // Exception Code - ArithmeticException
		 }
		
		catch(Exception g)  // Exception class declare here
		 {
			System.out.println("Exception from Exception class"); // Alternate code
		 }
		 
	   System.out.println("Program Run");
	   
	 }
}

