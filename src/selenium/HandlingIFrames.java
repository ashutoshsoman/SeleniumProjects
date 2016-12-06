package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingIFrames {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =    new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe1");
		
		driver.findElement(By.linkText("Partial Link Test")).click();
		
		System.out.println("The link is clicked");
		
		driver.findElement(By.id("exp-0")).click();

    	System.out.println("The radio button is clicked");		
		driver.switchTo().defaultContent();
		
		System.out.println("The tile of the page is : "+ driver.getTitle());	
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
