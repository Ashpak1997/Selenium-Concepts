package Methods_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected
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
       
       WebElement radiobutton = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));  // radio button output in form of boolean
       boolean result = radiobutton.isSelected();  // checking the radio button is selected or not
       
       Thread.sleep(2000);
       
       System.out.println(result);
       if(result==false)
    	{
  		  radiobutton.click();
   	    }     
  }
}
