package Pratice;

import java.io.File;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Facebook_Pratice 
{
public static void main(String[] args) throws InterruptedException, IOException
 {
   System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
   WebDriver ash = new ChromeDriver();
   
//   ash.navigate().to("https://www.facebook.com/");       // launch the facebook             
   
//   Thread.sleep(3000);
//   
//   ash.navigate().back();             // backword acton on page
//   
//   Thread.sleep(3000);
//   
//   ash.navigate().forward();          //forward action on page
//    
//   Thread.sleep(3000);
//   
//   ash.navigate().refresh();         // refresh action on page
  
//   String url = ash.getCurrentUrl();
//   System.out.println(url);
//	
//   String title = ash.getTitle();
//   System.out.println(title);
//   
//   ash.manage().window().maximize();
//   
//   Thread.sleep(3000);
////   
//   Dimension d = new Dimension (500,700);
//   ash.manage().window().setSize(d);
////   
//  Thread.sleep(3000);
////   
//   Point p = new Point(300,300);
//   ash.manage().window().setPosition(p);
   
//   ash.manage().window().maximize();
   
   Thread.sleep(3000);
   
  // ash.close();
   
  // Thread.sleep(3000);
   
  // ash.quit();
  
//   WebElement username = ash.findElement(By.id("email"));
//   username.sendKeys("shaikhashpak348348@gmail.com");
//  
//   Thread.sleep(3000);
//  
//   WebElement password = ash.findElement(By.name("pass"));
//   password.sendKeys("9271470786");
//
//   Thread.sleep(3000);
//  
//   WebElement login = ash.findElement(By.tagName("button"));
//   login.click();
//  
//   WebElement login = ash.findElement(By.name("login"));
//   login.click();
//   
//   WebElement ID = ash.findElement(By.xpath("//input[@name='email']"));
//   ID.sendKeys("AshpakAS");
//     
//   Thread.sleep(2000);
//   
//   WebElement password = ash.findElement(By.xpath("//input[@type='password']"));
//   password.sendKeys("1212121212");
//   
//   Thread.sleep(2000);
//   
//   WebElement login = ash.findElement(By.xpath("//button[@name='login']"));
//   login.click();
//   
//   Thread.sleep(2000);
   
//   int i=1;
//   
//   File source =((TakesScreenshot)ash).getScreenshotAs(OutputType.FILE);
//   
//   File dest = new File("C:\\Users\\Ashpak\\Desktop\\Testing Notes\\Screenshots\\ashpak"+i+".jpeg");
//   
//   FileHandler.copy(source, dest);

//   
//    Actions act = new Actions (ash);
//   
     Thread.sleep(2000);
     
//   act.click(); - for left click  
//   act.doubleClick(); - used to double click
//   act.contextClick();  - for left click
//   act.moveToElement(null); - move to culsur on specific element
//   act.build(); - multiple mouse action in one line
//   act.perform(); - perform every mouse action coonect end of end of line
//   act.dragAndDrop(null, null); - insert one part into another
   
// Example :-
     
//   act.click().perform();
//   act.contextClick().perform();
//   act.moveToElement(ID).contextClick().build().perform();
//     act.moveToElement(login).click().build().perform(); 
   
  ash.navigate().to("https://jquery.com/");
  
  Thread.sleep(2000);
     
  JavascriptExecutor ref =  (JavascriptExecutor)ash;
  ref.executeScript("window.scrollBy(0,800)");
  
  Thread.sleep(2000);
  
  ref.executeScript("window.scrollBy(0,-500)");
  
  Thread.sleep(2000);
     
     
     
     
     
     
     
     
 }
}
