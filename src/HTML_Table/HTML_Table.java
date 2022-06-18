package HTML_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Table 
{
public static void main(String[] args) throws InterruptedException 
{
	
	  System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver =  new ChromeDriver();
	  
	  driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> AllTable_Data = driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
	  
	  String Cellvalue = AllTable_Data.get(0).getText();   
	  
	  String Cellvalue1 = AllTable_Data.get(1).getText();
	  
	  String Cellvalue2 = AllTable_Data.get(2).getText();
	  
	  System.out.println(Cellvalue);
	  System.out.println(Cellvalue1);
	  System.out.println(Cellvalue2);
	  
// I want row-7 & coloumn 2 data
	  
	  List<WebElement> AllTable_Data1 = driver.findElements(By.xpath("//table[@id='customers']//tr[7]//td[2]")); 
	  String Cell = AllTable_Data1.get(0).getText(); 
	  System.out.println(Cell);
	  
	  driver.quit();
}
}


// List<WebElement> - collect multiple webelement
// get() - collect one webelement
// findElements() -  used to multiple data have same x-path