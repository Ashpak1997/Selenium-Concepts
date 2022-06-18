package Methods_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_list 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.navigate().to("https://www.facebook.com/");
	   
	   Thread.sleep(2000);
	   
	   WebElement nextpage = driver.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']")); 
	   nextpage.click();                                            // click on create account button
		
	   Thread.sleep(2000);
	   
	   WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));  // for dropdown list
	   Select listDate = new Select(date);     // need to create object(object is always for non-static))
	   listDate.selectByIndex(8);              // select by index method
	   
	   Thread.sleep(2000);
	   
	   WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	   Select monthlist =  new Select(month);
	   monthlist.selectByValue("7");
	   
	   Thread.sleep(2000);
	   
	   
	   WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
	   Select yearlist = new Select(year);
	   yearlist.selectByVisibleText("1997");

	}
}
