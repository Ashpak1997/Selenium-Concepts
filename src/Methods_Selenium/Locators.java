package Methods_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	
	public static void main(String[] args) throws InterruptedException
	 {
	   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	   WebDriver ash = new ChromeDriver();
	   
	   ash.navigate().to("https://www.facebook.com/");       // launch the facebook             
	   
	   Thread.sleep(3000);
	  
	   ash.navigate().back();             // backword acton on page
	   
	   Thread.sleep(3000);
	   
	   ash.navigate().forward();          //forward action on page
	    
	   Thread.sleep(3000);
	   
	   ash.navigate().refresh();         // refresh action on page
	  
	   String url = ash.getCurrentUrl();
	   System.out.println(url);
		
	   String title = ash.getTitle();
	   System.out.println(title);
	   
	   ash.manage().window().maximize();
	   
	   Thread.sleep(3000);
	   
	  Dimension d = new Dimension (500,700);
	   ash.manage().window().setSize(d);
	   
	   Thread.sleep(3000);
	   
	   Point p = new Point(300,300);
	   ash.manage().window().setPosition(p);
	   
	   ash.close();
	   
	   Thread.sleep(3000);
	   
	   ash.quit();
	  
	  WebElement username = ash.findElement(By.id("email"));
	  username.sendKeys("shaikhashpak348348@gmail.com");
	  
	  Thread.sleep(3000);
	  
	  WebElement password = ash.findElement(By.name("pass"));
	  password.sendKeys("9271470786");
	
	  Thread.sleep(3000);
	  
//	  WebElement login = ash.findElement(By.tagName("button"));
//	  login.click();
	  
	  WebElement login = ash.findElement(By.name("login"));
	  login.click();   
  }
}   
	   



