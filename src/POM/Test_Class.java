package POM;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Class 
{
public static void main(String[] args) 
  {
	
   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 101\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
	   
   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
   
   Login_Page login = new Login_Page(driver);   // We create object of login page and methods
              login.userNName();        // Encapulation & Abstration follows
              login.password();         // Encapulation & Abstration follows
              login.submitButton();     // Encapulation & Abstration follows
   
   Dashboard Dash_Page = new Dashboard (driver); 
             Dash_Page.Dashboard_Title();
             Dash_Page.Assign_Leave();
             Dash_Page.My_Timesheet();
                
   driver.quit();
 }
}
