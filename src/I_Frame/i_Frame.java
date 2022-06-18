package I_Frame;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_Frame 
{
public static void main(String[] args) throws InterruptedException 
{
   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");	
   WebDriver driver =  new ChromeDriver();
  
   driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");  // open webpage
  
   Thread.sleep(1000);
  
   WebElement Mbutton = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
   Mbutton.click();  // click on main page try yourself button
  
   Thread.sleep(2000);
  
   ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());  // getting all window address
	
   // String Win1 = addr.get(1);
   
   driver.switchTo().window(addr.get(1));  //Switch focus main window to child window 
  
   Thread.sleep(2000);
  
   driver.switchTo().frame(1);    // Switch focus chind window to own frame
  
   Thread.sleep(2000);
  
   WebElement Tryit_Button = driver.findElement(By.xpath("//button[text()='Try it']"));
   Tryit_Button.click();   // click on button present on frame 
            
   Thread.sleep(2000);  // after clicking alert is open so 
   
   
   Alert act = driver.switchTo().alert();
   act.accept();
   
   driver.switchTo().parentFrame(); // Switch focus child window to main window 
    
   Thread.sleep(2000);
   
   WebElement RunButton = driver.findElement(By.xpath("//button[@id='runbtn']"));
   RunButton.click();
   
   driver.quit();
   
 }
}
