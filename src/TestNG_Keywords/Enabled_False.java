package TestNG_Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled_False
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
	  
	@Test (enabled = false)
	  public void testcasesA()
	   {
		  System.out.println("Test_A");  
	   }
	  
	@Test        
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
