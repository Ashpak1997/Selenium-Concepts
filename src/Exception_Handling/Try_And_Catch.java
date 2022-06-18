package Exception_Handling;

public class Try_And_Catch  // Its Used for - Runtime time exception
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
		System.out.println(d[5]);   // Exception Code - ArrayOutofBondException
	 }
	
//	catch(ArithmeticException e)
//	 {
//		System.out.println("Arthrmatic Exception resolve"); // Alternate code
//		
//		 b = 2;   // change the Value of b
//		 c = a/b;
//	 }
//	
//	catch(ArrayIndexOutOfBoundsException f)
//	 {
//		System.out.println("Array Exception resolve"); // Alternate code
//		
//	 }
	
	catch(Exception g)  // Exception declare here
	 {
		System.out.println("Exception from Exception class"); // Alternate code
		
		g.printStackTrace();
		g.getMessage();
		g.toString();
	 }
	 
   System.out.println("Program Run");
   
 }
}
