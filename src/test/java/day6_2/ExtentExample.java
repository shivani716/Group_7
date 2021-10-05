package day6_2;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ExtentExample {
	WebDriver driver;
  @Test
  public void f() {
	  ExtentReports ex=new ExtentReports();
	  ex.attachReporter(new ExtentHtmlReporter("bing.html"));
	  ExtentTest tc= ex.createTest("SearchTest");
	  tc.info("Opening url");
	  driver.get("http://bing.com");
	  tc.info("typing search KeyWord");
	  driver.findElement(By.name("q")).sendKeys("lti");
	  tc.info("Pressing Enter");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  tc.info("Verifying title");
	  Assert.assertTrue(driver.getTitle().contains("lti"));
	  tc.pass("Test Pass");
	  ex.flush();
	  		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
      driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() throws Exception{
	  Thread.sleep(2000);
	  driver.quit();
  }

}
