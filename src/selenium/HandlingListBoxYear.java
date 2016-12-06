package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxYear {

	public static void main(String[] args) {
		WebDriver driver  =  new FirefoxDriver();
	    driver.get("http://fb.com");
	    
	    driver.manage().window().maximize();
	    
	    WebElement yearWE = driver.findElement(By.id("year"));
	    
	    Select yearSelect =  new Select(yearWE);
	    
	    List<WebElement> yearList =  yearSelect.getOptions();
	    
	    System.out.println("The size of the year List is " + yearList.size() );
	    
	    
	    for(int i = 0; i<= yearList.size() ; i++)
	    {
	    	if(yearList.get(i).getText().equals("2016"))
	    	{
	    		yearList.get(i).click();
	    		break;
	    	}
	    			
	    }
	    
	       
	    
	    driver.close();
	   
		

	}

}
