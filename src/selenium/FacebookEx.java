package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FirefoxDriver driver = new FirefoxDriver();
       
       driver.get("https://www.facebook.com/");
       
      String title =  driver.getTitle();
      
     WebElement fname =  driver.findElement(By.id("u_0_3"));
     fname.clear();
     fname.sendKeys("Ashu");
     
     WebElement createAccount = driver.findElement(By.id("u_0_j"));
     createAccount.click();
     
     String fvalue = fname.getAttribute("value");
          
     System.out.println(" The value inserted for the firstname textbox is:" + fvalue);
     
       
	}

}
