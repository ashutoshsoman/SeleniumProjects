package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingIfm {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		//Focus is in the topwindow
		driver.get("http://www.rediff.com/");
		
		
		//Logic Starts
		//Switch to package frame
		driver.switchTo().frame("moneyiframe");
		String WE = driver.findElement(By.xpath("//*[@id='mw001_widget_feeds_author']/span[1]")).getText();
		
		System.out.println(" The text is " + WE );
			
		
		//Go back to topwindow
		driver.switchTo().defaultContent();
	
		String title= driver.getTitle();
		System.out.println("The title of the page is and this shows that we are on TOP window : " 
		+ title);
		
		driver.close();
	
		
	}
}
