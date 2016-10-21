package example;		

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	

public class NewTest {		
	private WebDriver driver;	
	private String baseUrl = "http://www.guru99.com/selenium-tutorial.html";
	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aaron\\Documents\\eclipse\\geckodriver.exe");
	    driver = new FirefoxDriver();  
	}	
	
	@Test				
	public void testEasy() {	
		driver.get(baseUrl);  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Free Selenium Tutorials")); 		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}	