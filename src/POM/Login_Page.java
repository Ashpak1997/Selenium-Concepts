package POM;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page 
{
   @FindBy(xpath = "//input[@name='txtUsername']")   // Declare webelement as a data members
   private WebElement UserNName;
   
   @FindBy(xpath = "//input[@name='txtPassword']")
   private WebElement Password;
   
   @FindBy(xpath = "//input[@name='Submit']")
   private WebElement SubmitButton;
   
   
   public Login_Page(WebDriver driver)    // Constrctor calling - as public
    {  
	    PageFactory.initElements(driver, this);
    }
   
   
   public void userNName()        // Methods for every Web-actions
    {
	   UserNName.sendKeys("Admin");      //  send username
    }
   
   public void password()
    {
	   Password.sendKeys("admin123");    // send password
    }
   
   public void submitButton()
    {
	   SubmitButton.click();             // click on button
    }
}


