package TestNG_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Anno 
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
	  public void testcases()
	   {
		  System.out.println("Test");  
	   }
	  
	//  @Test
	//  public void testcases2()
	//   {
//		  System.out.println("Test2");  
	//   }
	  
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
