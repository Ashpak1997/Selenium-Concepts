package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Globally 
{
	 WebDriverWait wait;
	
	 @FindBy(xpath = "//input[@name='txtUsername']")   // Declare webelement as a data members
	 private WebElement UserNName;
	   
	 @FindBy(xpath = "//input[@name='txtPassword']")
	 private WebElement Password;
	   
	 @FindBy(xpath = "//input[@name='Submit']")
	 private WebElement SubmitButton;
	   
	   
	public Wait_Globally (WebDriver driver)    // Constrctor calling - as public
	  { 
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	  }
	   
	   
	 public void userNName()        // Methods for every Web-actions
	  {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));
		UserNName.sendKeys("Admin");      //  send username
	  }
	   
	 public void password()
	  {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtPassword']")));
	     Password.sendKeys("admin123");    // send password
	  }
	   
	 public void submitButton()
	  {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Submit']")));
		SubmitButton.click();             // click on button
	  }
}
