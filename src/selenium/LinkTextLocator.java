package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		 driver.findElement(By.linkText("Create a Page")).click();
			
		
	}

}
