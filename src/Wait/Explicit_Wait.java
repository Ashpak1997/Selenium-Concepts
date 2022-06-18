package Wait;     // Mostly Used

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait 
{
 public static void main(String[] args)
  {	
	 System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 101\\chromedriver_win32\\chromedriver.exe");	
	 WebDriver driver =  new ChromeDriver();
			  
	 driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   // latest version  4.1.3
	
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Try it Yourself »'])[1]")));
 }
}





// old version - 3.14

//WebDriverWait wait = new WebDriverWait(driver, 10);

//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Try it Yourself »'])[1]")));