package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\soft\\Chrome 101\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver AS = new ChromeDriver();
		
		AS.navigate().to("https://www.facebook.com/");              // navigate the facebook
		
		WebElement email = AS.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		email.sendKeys("Shaikhashpak348");                           // enter the value of email 
	 	
		Thread.sleep(2000);
		
		WebElement password = AS.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys("Ashpak@1997");                           // enter the value of the password 
		
		Thread.sleep(2000);
	//	
//		WebElement button = AS.findElement(By.xpath("//button[@name='login']"));
//		button.click();                                             // click on button login button
	//	
//		Thread.sleep(2000);
		
		WebElement nextpage = AS.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']"));
		nextpage.click();                                            // click on crete account button
		
		Thread.sleep(2000);
		
		WebElement first = AS.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("Ashpak");                                    // enter the value of first name
		
		Thread.sleep(1000);
		
		WebElement last = AS.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("Shaikh");                                     // enter the value of the last name
		
		Thread.sleep(1000);
		
		WebElement mobile = AS.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("9271470786");                                   // enter the value of mobile number
		                      
		Thread.sleep(1000);
		
		WebElement newpass = AS.findElement(By.xpath("//input[@autocomplete='new-password']"));
		newpass.sendKeys("123456789");                              // enter the value of newpassword
		
//		WebElement radiobutton = AS.findElement(By.xpath("//label[contains(text(),'Female')]"));   // radio button output in form of boolean
//		boolean Ashpak=radiobutton.isSelected();                    // checking the radio button is selected or not
//		System.out.println(Ashpak);                                          
	//	
//		if(Ashpak==false)
//		{
//			radiobutton.click();
//		}
		
		WebElement costumbutton = AS.findElement(By.xpath("//select[@name='preferred_pronoun']"));  //hidden parts x-path
		boolean ans = costumbutton.isDisplayed();                   // checking the costom button hidden data diplayed or not 
		System.out.println(ans);
		
		Thread.sleep(1000);
		
		if(ans==false)
		  {
			System.out.println("Dropdown not available, please click on COSTOM button");
			
			WebElement costumpress = AS.findElement(By.xpath("//label[contains(text(),'Custom')]"));
			costumpress.click();
			
			Thread.sleep(1000);
		  }
		else
		  {
			System.out.println("Dropdown is already displayed");
		  }
		System.out.println("answer after click is " + costumbutton.isDisplayed());
		
		  Thread.sleep(1000);
		 
		 
//		  WebElement button = AS.findElement(By.xpath("//button[@name='login']"));
//		  
//		  String text = button.getText();                        // used to getting the text of x-path
//		  System.out.println(text);
//		  
//		  Thread.sleep(1000);
//		  
//		  String attributes = button.getAttribute("class");     // used to getting the class of x-path
//		  System.out.println(attributes);
//		  
		  
		  WebElement date = AS.findElement(By.xpath("//select[@title='Day']"));  // for dropdown list
		  Select listDate = new Select(date);            // need to create object(object is always for non-static)) 
		  listDate.selectByIndex(8);                     // select by index method
		  
		  WebElement month = AS.findElement(By.xpath("//select[@title='Month']"));
		  Select listMonth = new Select(month);
		  listMonth.selectByValue("7");                  // select value
		  
		  WebElement Year = AS.findElement(By.xpath("//select[@title='Year']"));
		  Select listYear = new Select(Year);
		  listYear.selectByVisibleText("1997");          // select by visible text method
		  
		//   int i=1;
		//   
		//   File source =((TakesScreenshot)ash).getScreenshotAs(OutputType.FILE);
		//   
		//   File dest = new File("C:\\Users\\Ashpak\\Desktop\\Testing Notes\\Screenshots\\ashpak"+i+".jpeg");
		//   
		//   FileHandler.copy(source, dest);

		//   
		     Actions act = new Actions (AS);
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
		     
		     act.click().perform();
		//   act.contextClick().perform();
		//   act.moveToElement(ID).contextClick().build().perform();
		//   act.moveToElement(button).click().build().perform();
		     
		     Thread.sleep(3000); 
		     AS.quit();
		     
}
}
