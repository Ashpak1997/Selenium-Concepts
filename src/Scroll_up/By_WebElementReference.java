package Scroll_up;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_WebElementReference 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.navigate().to("https://jqueryui.com/");
	  
	   WebElement r = driver.findElement(By.xpath("//a[text()='Add Class']"));
	   
	   JavascriptExecutor ref =  (JavascriptExecutor)driver;
	   
	   Thread.sleep(2000);
	   
	   ref.executeScript("arguments[0].scrollntoView(true);",r);
	   
	   
	   
	}
}





