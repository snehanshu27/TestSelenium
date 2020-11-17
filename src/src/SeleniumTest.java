package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void f() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  	 
	  	//Setting the driver to chrome driver
	  	  driver = new ChromeDriver();
	  	  String url = "https://www.google.com";
	  	  driver.get(url);
	  	  //Capturing the title and validating if expected is equal to actual
	  	  String expectedTitle = "Google";
	  	  String actualTitle = driver.getTitle();
	  	  Assert.assertEquals(actualTitle, expectedTitle);
  }
}
