package Try_And_Catch;

public class Simple_TryAndCatch 
{
	public static void main(String[] args)
	 {
	   int a = 10;
	   int b = 0;
	   int c = 0;
	   int d[] = { 1,2,3,4};  // array declare
		
		try
		 {
			// c = a/b;                    // Exception Code - ArithmeticException
			System.out.println(d[5]);      // Exception Code - ArrayOutofBondException
		 }
		
//		catch(ArithmeticException e)
//		 {
//			System.out.println("Arthrmatic Exception resolve"); // Alternate code
//			
//			 b = 2;   // change the Value of b
//			 c = a/b;
//		 }
	//	
		catch(ArrayIndexOutOfBoundsException f)
		 {
			System.out.println("Array Exception resolve"); // Alternate code			
		 }		 
	   System.out.println("Program Run");
	   
	 }
}

