package selenium;

import java.awt.Dimension;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElements {

	public static void main(String[] args) {

       FirefoxDriver driver = new FirefoxDriver();
       driver.get("file:///D:/Ashutosh/Selenium%20WebDriver%20Training/SeleniumVideos/HTML%20Files/MultipleCheckbox.html");
       List<WebElement> e = driver.findElements(By.name("chk"));
      
       //e.get(0).click();
       
       driver.manage().window().maximize();;
       
//       for( int i = 0; i<e.size(); i++)
//       {
//    	  e.get(i).click();
//    	
//       }
	}

}
