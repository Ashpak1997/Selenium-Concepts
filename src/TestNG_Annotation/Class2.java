package TestNG_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 
{
private static final String priority  = null;

	@BeforeClass
	  public void beforeClass()
	   {
		  System.out.println("beforeClass from Class2");
	   }
	  
	  @BeforeMethod
	  public void beforemethod()
	   {
		  System.out.println("beforemethod from Class2");
	   }
	  
	  @Test (priority = 1)
	  public void testcasesA()
	   {
		  System.out.println("Test from A ");  
	   }
	  
	  @Test (priority = -1)
	  public void testcasesB()
	   {
		  System.out.println("Test from B ");  
	   }
	  
	  @Test 
	  public void testcasesC()
	   {
		  System.out.println("Test from C ");  
	   }
	  
	  @AfterMethod
	  public void aftermethod()
	   {
		  System.out.println("aftermethod from Class2"); 
	   }
	  
	  @AfterClass
	  public void afterclass()
	   {
		  System.out.println("afterclass from Class2"); 
	   }
}
