package TestNG_Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority 
{
	 @BeforeClass
	  public void beforeClass()
	   {
		  System.out.println("beforeClass");
	   }
	  
	 @BeforeMethod
	  public void beforemethod()
	   {
		  System.out.println("beforemethod");
	   }
	  
	 @Test (priority=2)          // Priority Keywords
	  public void testcasesA()
	   {
		  System.out.println("Test_A");  
	   }
	  
	 @Test (priority=1)         // Priority Keywords
      public void testcasesB()
	   {
		  System.out.println("Test_B");  
	   }

	 @AfterMethod
	  public void aftermethod()
	   {
		  System.out.println("aftermethod"); 
	   }
	  
	 @AfterClass
	  public void afterclass()
	   {
		  System.out.println("afterclass"); 
	   }
}
