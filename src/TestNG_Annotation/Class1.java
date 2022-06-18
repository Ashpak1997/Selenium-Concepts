package TestNG_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1
{
	@BeforeClass
	  public void beforeClass()
	   {
		  System.out.println("beforeClass from Class1");
	   }
	  
	  @BeforeMethod
	  public void beforemethod()
	   {
		  System.out.println("beforemethod from Class1");
	   }
	  
	  @Test
	  public void testcases()
	   {
		  System.out.println("Test from Class1");  
	   }
	  
	  @AfterMethod
	  public void aftermethod()
	   {
		  System.out.println("aftermethod from Class1"); 
	   }
	  
	  @AfterClass
	  public void afterclass()
	   {
		  System.out.println("afterclass from Class1"); 
	   }

}
