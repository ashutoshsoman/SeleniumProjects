// There are 3 methods in order to identify the frames
// driver.swithcTo().frame(arg0)
// arg0 can be:  1. id/name, 2. webElement , 3. index

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		//focus is changed from top window to frame
		driver.switchTo().frame("packageListFrame");
		
		// find element by link text
		driver.findElement(By.linkText("org.openqa.selenium.firefox")).click();
		
		System.out.println("The click to object is successfull");
		
		// Go back to Top Window  ----->  Very Important
		driver.switchTo().defaultContent();
		
	}
	

}


