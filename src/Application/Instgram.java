package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instgram 
{
	public static void main(String[] args) throws InterruptedException 
	 {
	    System.setProperty("webdriver.chrome.driver", "D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	    WebDriver tuesday = new ChromeDriver();
	    
	    tuesday.navigate().to("https://www.instagram.com/");
	    
	    Thread.sleep(2000);
	    
	    WebElement ID = tuesday.findElement(By.xpath("//label[@class='f0n8F ']//input[@name='username']"));
	    ID.sendKeys("Ashpak");                                           // enter the value of the ID 
	    
	    Thread.sleep(1000);
	    
	    WebElement Password = tuesday.findElement(By.xpath("//label[@class='f0n8F ']//input[@name='password']"));
	    Password.sendKeys("12121212");                                   // enter the value of the password
	    
	    Thread.sleep(2000);
	    
	    WebElement login = tuesday.findElement(By.xpath("//button[@type='submit']"));    login.click();                                                 // click login button
	    
	    Thread.sleep(2000);
	    
	    WebElement Signup = tuesday.findElement(By.xpath("//span[text()='Sign up']"));
	    Signup.click();                                                // click on signup button
	    
	    Thread.sleep(2000);
	    
	    WebElement costomlogin = tuesday.findElement(By.xpath("//button[@type='submit']"));
	    costomlogin.isEnabled();                           // asper limit ID & password takle tr login button visible hoto ka nahi te check krto
	    
	    Thread.sleep(2000);
	    
	    boolean ans =costomlogin.isEnabled();
	    Thread.sleep(2000);
	    System.out.println(ans);
 }
}
