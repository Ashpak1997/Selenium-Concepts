package Scroll_up;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Pixel 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.navigate().to("https://jqueryui.com/");
	   
	   Thread.sleep(2000);
	      
	   JavascriptExecutor ref = (JavascriptExecutor)driver;
	   ref.executeScript("window.scrollBy(0,800)");    // scroll Down
	   
	   Thread.sleep(2000);
	   
 	   ref.executeScript("window.scrollBy(0,-500)");   // scroll up
	   
	   Thread.sleep(2000);
	   
       ref.executeScript("window.scrollBy(500,0)");    // scroll right
	   
	   Thread.sleep(2000);
	   
       ref.executeScript("window.scrollBy(-500,0)");   // scroll left
	   
	   Thread.sleep(2000);
	   
	   driver.quit();
}
}
