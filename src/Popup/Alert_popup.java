package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 
{
public static void main(String[] args) throws InterruptedException 
{
	
  System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
 
  WebDriver driver =  new ChromeDriver();
  
  driver.navigate().to("https://demo.guru99.com/V4/index.php");
  
  Thread.sleep(1000);
  
  driver.manage().window().maximize();
  
  Thread.sleep(1000);
  
  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();  // another not store in variable  
  
  Thread.sleep(1000);
  
  Alert ref = driver.switchTo().alert();   // crate object of Alert interface
  
  Thread.sleep(1000);
  
  String text = ref.getText();    // To get text on popup
  System.out.println(text);
  
  // ref.accept();     // to accept the alert/warning
  
  ref.dismiss();       // to reject the alert/warning
   
  driver.quit();
   	  
 }
}
