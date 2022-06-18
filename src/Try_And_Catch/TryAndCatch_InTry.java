package Try_And_Catch;

public class TryAndCatch_InTry 
{
public static void main(String[] args)
	{
	   int a = 10;
	   int b = 0;
	   int c = 0;
	   int s[] = { 1,2,3,4};  // array declare
		
		try
		 {
			System.out.println(s[2]);      // Pass - Not Exception
			
			try
			 {
			   c = a/b;                    // Exception Code - ArithmeticException
			 }
			
			catch(ArithmeticException e)
			 {
				System.out.println("Try & Catch In Try run Succesfully ");
			 }	
		 }
		
		catch(Exception f)   // not run this part
		 {
			System.out.println("Arthrmatic Exception resolve"); // Alternate code
	     }
		
	   System.out.println("Program Run");  
  }
}

