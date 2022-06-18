package TestNG_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Login_Page;

public class Orange_HRM
{
	WebDriver driver;   // declare driver golabally 
	
@BeforeClass
  public void beforeClass()
   {
     System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 101\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
			   
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
   }
	  
//@BeforeMethod
// public void beforemethod()
//  {
//		 
//  }
	  
@Test 
 public void testcasesA()
  {
	 Login_Page login = new Login_Page(driver);   // We create object of login page and methods
                login.userNName();        // Encapulation & Abstration follows
                login.password();         // Encapulation & Abstration follows
                login.submitButton();     // Encapulation & Abstration follows	    
  }

@Test       
 public void testcasesB()
  {
		 
  }

@AfterMethod
  public void aftermethod()
  {
		
  }
	  
@AfterClass
  public void afterclass()
  {
	driver.quit();	   
  }
}
