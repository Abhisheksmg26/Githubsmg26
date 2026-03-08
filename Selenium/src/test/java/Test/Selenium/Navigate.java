package Test.Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.programiz.com/java-programming/online-compiler");
		
		WebElement python=driver.findElement(By.xpath("(//a[@title='Online Python Compiler'])[2]"));
		python.click();
		
		String Expectedtitle="Online Python Compiler (Interpreter) - Programiz";
		
		String parenthandle=driver.getWindowHandle();
		
		     Set<String> handles=driver.getWindowHandles();
		      {
		    	  
		    	  for(String handle:handles)
		    	  if(!handle.equals(parenthandle))
		    	  {
		    		  driver.switchTo().window(handle);
		    	  }
		      }
		      
		      
		
		String ActualTitle=driver.getTitle();
		
		System.out.println(ActualTitle);
		System.out.println(Expectedtitle);
		
		Assert.assertEquals(ActualTitle, Expectedtitle);
		
		
		
		
		

	}

}
