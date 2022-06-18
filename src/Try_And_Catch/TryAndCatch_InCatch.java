package Try_And_Catch;

public class TryAndCatch_InCatch 
{
	public static void main(String[] args)
	 {
	   int a = 10;
	   int b = 0;
	   int c = 0;
	   int d[] = { 1,2,3,4};  // array declare
		
		try
		 {
			 c = a/b;                    // ( Fail ) Exception Code - Arithmetic Exception
		 }
			
		catch(ArithmeticException f)
		 {
			
			System.out.println("Alternate code"); // Alternate code
			
			try
			{
				System.out.println(d[5]);      // ( Fail ) Exception Code - ArrayOutofBondException
			}
			
			catch(Exception e)
			{
				System.out.println("Try & Catch In Catch run succesfuly");
			}
		 }		 
	   System.out.println("Program Run");
	   
	 }
}
