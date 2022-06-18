package TestNG_Keywords;

//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod 
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
	  
	 @Test 
	   public void testcasesB()   // Login Page
	   {
		  System.out.println("Test_B");
//		  Assert.fail();                     if we want fail any test case
	   }
	  
	 @Test (dependsOnMethods = {"testcasesB"})  // DependsOnMethod KeyWords 
	  public void testcasesA()    // Home Page
	   {
		  System.out.println("Test_A");  
	   }
	 
	 @Test
	  public void testcasesc()   // Login Page
	   {
		  System.out.println("Test_c");  
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
