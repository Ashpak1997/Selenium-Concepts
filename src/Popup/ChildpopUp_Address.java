package Popup;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildpopUp_Address 
{
public static void main(String[] args) throws InterruptedException 
{
  System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver(); 
  
  driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");  // Main window
  
  WebElement button1 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")); 
  WebElement button2 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
  WebElement button3 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
  WebElement button4 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
   
  button1.click();        // 1st child window click
  Thread.sleep(1000);
  button2.click();        // 2nd child window click
  Thread.sleep(1000);
  button3.click();        // 4th child window click
  Thread.sleep(1000);
  button4.click();        // 3rd child window click
  
  //String MainAdd = driver.getWindowHandle(); // Getting address of main window only
  //System.out.println(MainAdd);  
  
  ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());  // getWindowHandles() syntax 
  
  String Win1 = addr.get(0);   // get address of main window
  String Win2 = addr.get(1);   // get address of main window1
  String Win3 = addr.get(2);   // get address of main window2
  String Win4 = addr.get(3);   // get address of main window3
  String Win5 = addr.get(4);   // get address of main window4
  
  System.out.println(Win1);      // getting address of index 0 window (Main Window)
  System.out.println(Win2);      // getting address of index 1 window
  System.out.println(Win3);      // getting address of index 2 window
  System.out.println(Win4);      // getting address of index 3 window
  System.out.println(Win5);      // getting address of index 4 window
  
  String MainUrl = driver.getCurrentUrl();
  System.out.println(MainUrl);
  
System.out.println("------------------------------------------------------------------------------------------------------------");
  
  driver.switchTo().window(Win1);            // switch  the focus main window to window1(Main Window)
  String Win1_Url = driver.getCurrentUrl();  // getting url of Win1
  System.out.println(Win1+" "+Win1_Url);     // print address with Url
  
  driver.switchTo().window(Win2);            // switch  the focus main window to window2
  String Win2_Url = driver.getCurrentUrl();  // getting url of Win2
  System.out.println(Win2+" "+Win2_Url);     // print address with Url
  
  driver.switchTo().window(Win3);            // switch  the focus main window to window3
  String Win3_Url = driver.getCurrentUrl();  // getting url of Win3
  System.out.println(Win3+" "+Win3_Url);     // print address with Url
  
  driver.switchTo().window(Win4);            // switch  the focus main window to window4
  String Win4_Url = driver.getCurrentUrl();  // getting url of Win4
  System.out.println(Win4+" "+Win4_Url);     // print address with Url
  
  driver.switchTo().window(Win5);            // switch  the focus main window to window5
  String Win5_Url = driver.getCurrentUrl();  // getting url of Win5
  System.out.println(Win5+" "+Win5_Url);     // print address with Url
  
  driver.quit();
  
 }
}
//  getWindowHandle() - used to get address of main window
//  getWindowHandles() - used to get address of all window by using the get() 