package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_MethodForOpenmultiple_Window 
{

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver","D:\\soft\\\\Chrome 100\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver(); 
	  
	  driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");  // Main window
	  
	  List <WebElement> Buttons = driver.findElements(By.xpath("//a[text()='Try it Yourself �']"));
	  
	  for (int i=0; i<Buttons.size(); i++) // open all window related to x-path - code optimization
	  {
		  Buttons.get(i).click();
	  }
	  
//	  Buttons.get(0).click();   // click on 1st button
//	  Buttons.get(1).click();   // click on 2nd button
//	  Buttons.get(2).click();   // click on 3rd button
//	  Buttons.get(3).click();   // click on 4th button
	 
}
}

// For Avoiding below data we used for loop


//WebElement button1 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself �'])[1]")); 
//WebElement button2 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself �'])[2]"));
//WebElement button3 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself �'])[3]"));
//WebElement button4 =  driver.findElement(By.xpath("(//a[text()='Try it Yourself �'])[4]"));
// 
//button1.click();        // 1st child window click
//Thread.sleep(1000);
//button2.click();        // 2nd child window click
//Thread.sleep(1000);
//button3.click();        // 4th child window click
//Thread.sleep(1000);
//button4.click();        // 3rd child window click