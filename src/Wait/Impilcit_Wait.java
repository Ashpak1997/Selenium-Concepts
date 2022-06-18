package Wait;    // one webpage - one wait

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impilcit_Wait 
{
public static void main(String[] args)
 {
		
   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 101\\chromedriver_win32\\chromedriver.exe");	
   WebDriver driver =  new ChromeDriver();
		  
   driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		  
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // latest version 4.1.3
   
   WebElement button1 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")); 
   
   button1.click();
		 
 }
}


   // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // old version - 3.14
