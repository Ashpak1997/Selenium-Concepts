package Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait 
{
public static void main(String[] args)
 {
			
    System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 101\\chromedriver_win32\\chromedriver.exe");	
    WebDriver driver =  new ChromeDriver();
			  
    driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
  
    Wait<WebDriver> FWait = new FluentWait<WebDriver>(driver)     // type casting
    		               .withTimeout(Duration.ofSeconds(10))   // set delay time 
    		               .pollingEvery(Duration.ofSeconds(1))   // check every 1  senconds
    		               .ignoring(NoSuchElementException.class);     // directly provide exception
 }
}

	