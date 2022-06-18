package Methods_Selenium;

import org.openqa.selenium.By
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.navigate().to("https://www.instagram.com/");
	   
	   Thread.sleep(1000);
	   
	   WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	   boolean result =  login.isEnabled();
	   System.out.println(result);
	   
	   Thread.sleep(1000);
	   
	}   
	   
}
