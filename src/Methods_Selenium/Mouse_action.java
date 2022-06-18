package Methods_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action 
{
public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.navigate().to("https://www.facebook.com/");
	   
	   WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	   email.sendKeys("Shaikhashpak348");                           // enter the value of email 
	 	
	   Thread.sleep(2000);
		
	   WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
	   password.sendKeys("Ashpak@1997");                           // enter the value of the password 
		
	   Thread.sleep(2000);
		
	   WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
//	   button.click();   
	   
	   Actions mouse = new Actions(driver);
	   
//	   mouse.click();                               - left click
//	   mouse.doubleClick();                         - double click         
//	   mouse.contextClick();                        - right click
//	   mouse.moveToElement(null);                   - move the cursor on specific elements
//	   mouse.build();                               - multiple mouse action in single statements
//	   mouse.perform();                             - to excute the mouse actions
//	   mouse.dragAndDrop(source, destination);      - perform the drag the drop opration
	   
	   
//	   mouse.click().perform();
//	   mouse.contextClick().perform();
//	   mouse.moveToElement(password).perform();
	   mouse.moveToElement(button).click().build().perform();    
	}  
}
