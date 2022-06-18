package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard 
{
	   @FindBy(xpath = "//b[text()='Dashboard']")   // Declare webelement as a data members
	   private WebElement Dashboard_Title;
	   
	   @FindBy(xpath = "//span[text()='Assign Leave']")
	   private WebElement Assign_Leave;
	   
	   @FindBy(xpath = "//span[text()='My Timesheet']")
	   private WebElement My_Timesheet;
	   
	   
	   public Dashboard (WebDriver driver)    // Constrctor calling - as public
	    {  
		    PageFactory.initElements(driver, this);
	    }
	   
	   
	   public void Dashboard_Title()        // Methods for every Web-actions
	    {
		   boolean result = Dashboard_Title.isDisplayed();
		   System.out.println(result);
	    }
	   
	   public void Assign_Leave()
	    {
		   boolean result1 = Assign_Leave.isDisplayed();
		   System.out.println(result1);
	    }
	   
	   public void My_Timesheet()
	    {
		   boolean result2 = My_Timesheet.isDisplayed();  
		   System.out.println(result2);
	    }
}




