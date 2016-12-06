package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver =  new FirefoxDriver();
     
     driver.get("http://fb.com");
     
      WebElement dayWE =   driver.findElement(By.id("day"));
      
      Select dayselect =  new Select(dayWE);
      
      dayselect.selectByValue("12");
      
    //  Thread.sleep(3000);
      
    //  dayselect.deselectByValue("12");
      
      List <WebElement> dayList =  dayselect.getOptions();
      
      System.out.println(" The size of the list is " + dayList.size() );
      
      for(int i = 0 ; i <= dayList.size(); i++ )
    	  
      {
   
		if(dayList.get(i).getText().equals("20") )
		{ 
    		
			dayList.get(i).click();
			break;
    	  
      }
      

	}

	}}
