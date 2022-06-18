package Methods_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.navigate().to("https://www.facebook.com/");
	   
	   Thread.sleep(2000);
	   	
   	   WebElement nextpage = driver.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']"));
       nextpage.click();
       
       Thread.sleep(2000);
	   
	   WebElement costumbutton = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
	   //above is hidden parts x-path
	   boolean result = costumbutton.isDisplayed();  // checking the costom button hidden data diplayed or not 
	   System.out.println(result);
		
	   Thread.sleep(1000);
		
	   if(result==false)
		 {
			System.out.println("Dropdown not available, please click on COSTOM button");
			
			WebElement costumpress = driver.findElement(By.xpath("//label[contains(text(),'Custom')]"));
			costumpress.click();
			
			Thread.sleep(1000);
		 }
	  else
		 {
			System.out.println("Dropdown is already displayed");
		 }
	   
		System.out.println("answer after click is " + costumbutton.isDisplayed());
	}
}
