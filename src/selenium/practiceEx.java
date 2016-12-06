
//    Launch a new Firefox browser.
//    Open Store.DemoQA.com
//    Get Page Title name and Title length
//    Print Page Title and Title length on the Eclipse Console.
//    Get Page URL and verify if the it is a correct page opened
//    Get Page Source (HTML Source code) and Page Source length
//    Print Page Length on Eclipse Console.
//    Close the Browser.

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practiceEx {

	public static void main(String[] args) {
		
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("http://Store.DemoQA.com");
		
		String title = driver.getTitle();
		
		System.out.println("Title");
		
		int length = driver.getTitle().length();
		
		System.out.println("The length of the tile is" + length );
		String Url = "http://store.demoqa.com/";
		String pageUrl = driver.getCurrentUrl();
		System.out.println(" The current Url is: " + pageUrl);
		if(pageUrl.equals(Url))
			
		{
			
			System.out.println("This is the correct page");
		}else
			System.out.println("Thus is not the correct page");
		
		String pageSrc = driver.getPageSource();
		System.out.println(" The source code is: "+ 
		                                        pageSrc);
		
		driver.close();
		
		}

	}


