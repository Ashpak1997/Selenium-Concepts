package Try_And_Catch;

public class Methods_ofTryAndCatch 
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
		
		catch(Exception g)  // Exception declare here
		 {
			System.out.println("Exception from Exception class"); // Alternate code
			
			g.printStackTrace();  // which exsception
			g.getMessage();       // where is coming      
			g.toString();
		 }
		 
	   System.out.println("Program Run");
	   
	 }
}
