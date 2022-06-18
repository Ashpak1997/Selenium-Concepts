package HTML_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMl_SameTable 
{
public static void main(String[] args) throws InterruptedException 
{		
  System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");	
  WebDriver driver =  new ChromeDriver();
			  
  driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
			  
  Thread.sleep(2000);		
			  
  for (int r=2; r<=7; r++)    // row
  { 
	  for(int c=0; c<3; c++)  // column
	  {
		  List<WebElement> AllTable = driver.findElements(By.xpath("//table[@id='customers']//tr["+r+"]//td"));
		  String Table = AllTable.get(c).getText();
		  		  
		  System.out.print(Table + "  ||  ");
	  }
	System.out.println();
  }
}
}
