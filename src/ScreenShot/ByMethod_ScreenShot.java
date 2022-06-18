package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ByMethod_ScreenShot 
{
	static WebDriver driver;
	static int i=1;
	
public static void CaptureScreenShot() throws IOException

	  {
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		File location = new File("C:\\Users\\Ashpak\\Desktop\\Testing Notes\\Screenshots\\Ashpak"+i+".jpeg");
	   
		FileHandler.copy(source, location);
		
		i++;
	 }
	
public static void main(String[] args) throws IOException, InterruptedException 
   {
	 System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	 
	 driver = new ChromeDriver();
	   
	 driver.navigate().to("https://www.facebook.com/");
	 
	 //Thread.sleep(2000);
	 
	 CaptureScreenShot();
	
	 WebElement nextpage = driver.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']"));
	 nextpage.click();                                   
	
	 Thread.sleep(2000);
	
	 CaptureScreenShot();  
	 
	 driver.quit();
	 
 }
}

