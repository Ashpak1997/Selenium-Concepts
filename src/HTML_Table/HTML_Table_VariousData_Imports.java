package HTML_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Table_VariousData_Imports 
{
public static void main(String[] args) throws InterruptedException 
{		
  System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 100\\chromedriver_win32\\chromedriver.exe");	
  WebDriver driver =  new ChromeDriver();
		  
  driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		  
  Thread.sleep(2000);
		  
System.out.println("----------- All Data data imported---------------------------------------------------------------");
	
		  
//  List<WebElement> AllTable_Data = driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
//		
//  for (int i=0; i<AllTable_Data.size(); i++)
//   {
//	 String Cellvalue = AllTable_Data.get(i).getText();
//	 System.out.println(Cellvalue);
//   }
  
//System.out.println("-----------Column-1 data imported---------------------------------------------------------------");

// Column-1 data imported
  
//List<WebElement> AllTable_Data1 = driver.findElements(By.xpath("//table[@id='customers']//tr//td[1]"));
//  
//  for(int i=0; i<AllTable_Data1.size(); i++)
//    {
//	  String Cellvalue1 = AllTable_Data1.get(i).getText();
//	  System.out.println(Cellvalue1);
//    }
  
//System.out.println("-----------Column-2 data imported---------------------------------------------------------------");
  
  
//List<WebElement> AllTable_Data2 = driver.findElements(By.xpath("//table[@id='customers']//tr//td[2]"));
//  
//  for(int i=0; i<AllTable_Data2.size(); i++)
//    {
//	  String Cellvalue2 = AllTable_Data2.get(i).getText();
//	  System.out.println(Cellvalue2);
//    }
  
//System.out.println("-----------Column-3 data imported---------------------------------------------------------------");

  
//List<WebElement> AllTable_Data3 = driver.findElements(By.xpath("//table[@id='customers']//tr//td[3]"));
//  
//  for(int i=0; i<AllTable_Data3.size(); i++)
//    {
//	  String Cellvalue3 = AllTable_Data3.get(i).getText();
//	  System.out.println(Cellvalue3);
//    }
//  
System.out.println("-----------Row-1 data imported---------------------------------------------------------------");

  
List<WebElement> AllTable_Data4 = driver.findElements(By.xpath("//table[@id='customers']//tr[2]//td"));
    
    for(int i=0; i<AllTable_Data4.size(); i++)
      {
  	    String Cellvalue4 = AllTable_Data4.get(i).getText();
  	    System.out.println(Cellvalue4);
      }
    
System.out.println("-----------Row-2 data imported---------------------------------------------------------------");

    
List<WebElement> AllTable_Data5 = driver.findElements(By.xpath("//table[@id='customers']//tr[3]//td"));
        
for(int i=0; i<AllTable_Data5.size(); i++)
 {
   String Cellvalue5 = AllTable_Data5.get(i).getText();
   System.out.println(Cellvalue5);
 }

System.out.println("-----------Row-3 data imported---------------------------------------------------------------");

List<WebElement> AllTable_Data6 = driver.findElements(By.xpath("//table[@id='customers']//tr[4]//td"));

for(int i=0; i<AllTable_Data6.size(); i++)
 {
   String Cellvalue6 = AllTable_Data6.get(i).getText();
   System.out.println(Cellvalue6);
 }
    
driver.quit();

}
}
