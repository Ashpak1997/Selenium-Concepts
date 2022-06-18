package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Once_ScreenShot 
{
public static void main(String[] args) throws IOException 

	{
	   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.navigate().to("https://www.facebook.com/");
	   	   
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   File location = new File("C:\\Users\\Ashpak\\Desktop\\Testing Notes\\Screenshots\\Ashpak.jpeg");
	   
	   FileHandler.copy(source, location);
	   
	   driver.quit();
	}
}
