package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{		
	  System.setProperty("webdriver.chrome.driver", "D:\\soft\\chromedriver_win32\\chromedriver.exe");	
	  
	  WebDriver driver = new ChromeDriver();       // up-casting
	  
	  
//	  driver.navigate().to("https://www.facebook.com/");
//	  
//	  Thread.sleep(2000);
//	  
//	  driver.manage().window().maximize();
//	  
//	  Thread.sleep(2000);
//	  
//	  WebElement userName = driver.findElement(By.id("email"));           // id locator        
//	  userName.sendKeys("shaikhashpak348@gmail.com");                     // sendKey() used for type the email  
//	  
//	  Thread.sleep(2000);
//	  
//	  WebElement password = driver.findElement(By.name("pass"));         // Name locator 
//    password.sendKeys("Ashpak@1997");                                  // sendKey() used for type password 		
//	  
//	  Thread.sleep(2000);
//	  
//	  WebElement tagname = driver.findElement(By.tagName("button"));     // tagname locator 
// 	  tagname.click();                                                   // click() used to click on button
 	  
 	 driver.navigate().to("https://www.flipkart.com/");
 	 
 	 Thread.sleep(2000);
 	 
 	 WebElement login = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));    // by x-path index
 	 login.sendKeys("9271470786");
 	 
 	 Thread.sleep(2000);
 	
 	 WebElement password = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));   // by x-path index
   	password.sendKeys("Ashpak@1997"); 
 	
 	Thread.sleep(2000);
 	
 	WebElement enter = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
 	enter.click();
 	
 	Thread.sleep(2000);
	}
}
