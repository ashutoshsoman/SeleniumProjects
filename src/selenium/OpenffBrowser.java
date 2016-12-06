package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenffBrowser
{
	public static void main(String args[])
	{
		// Create an instance of firefox		
		FirefoxDriver driver = new FirefoxDriver();
		// pass the URL on address bar 
		driver.get("http://Google.com");
		// store the value of the title
		String actual = driver.getTitle();
		
		System.out.println("The actual is "+ actual);
		// store the expected value
		String expected= "google";
		System.out.println("The expected  is "+ expected);
		// using the conditional operatior to compare actual vs expected value 
		if (actual.equals(expected) )
		{

			//Printing the value
			System.out.println("TC Passed");
		}else{

			System.out.println("TC Failed");
		}


	}

}



