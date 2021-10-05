package day6_2;

import org.testng.annotations.Test;
import java.util.List;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HotelBookingFinal {
 
	static WebDriver driver=null;
	 @Test(priority=1,enabled=true,description="For checking whether user is on main page or not ")
	  public void test1() {
		  driver.get("https://www.easemytrip.com/");
			boolean x=driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).isDisplayed();
				  assertTrue(x);
		  
	  }
		@Test(priority=2,enabled=true,description ="For chceking whether user is on Hotels page or not")
		public void test2() {
			  driver.get("https://www.easemytrip.com/");
			driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
			boolean x=driver.findElement(By.xpath("//a[normalize-space()='Hotels']")).isDisplayed();
			  assertTrue(x);
			
	  
	} 
		@Test(priority=3,enabled=true,description ="For checking whether user is able to enter any city name")
		public void test3() throws InterruptedException {
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			 driver.get("https://www.easemytrip.com/");
				driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
				
				driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}	
		
		 
		@Test(priority=4,enabled=true,description ="For checking whether user is able to select city from list")
		public void test4() throws InterruptedException {
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			 driver.get("https://www.easemytrip.com/");
				driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
				driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
				Thread.sleep(2000);
				for(int i = 0;i<3;i++)
				{
				
				driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
				
				}
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				
		} 
		
		
			
		@Test(priority=5,enabled=true,description ="For checking whether user is able to select any hotel name")
		public void test5() throws InterruptedException {
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			 driver.get("https://www.easemytrip.com/");
				driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
				
				driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Trident");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		}	
			
		 @Test(priority=6,enabled=true,description ="For checking whether user is able to select hotel from list")
		public void test6() throws InterruptedException {
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			 driver.get("https://www.easemytrip.com/");
				driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
				driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Trident");
				Thread.sleep(2000);
				
				for(int i = 0;i<4;i++)
				{
				
				driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
				}
				

				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
		}
		

	@Test(priority=7,enabled=true,description ="For checking whether user is able to select check in date")
	public void test7() throws InterruptedException {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		 driver.get("https://www.easemytrip.com/");
			driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);

				
			WebElement E1=driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]"));
			E1.click();
			Thread.sleep(2000);
			
				Actions a=new Actions(driver);	
				a.moveToElement(E1).doubleClick().build().perform();
				WebElement E2=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[4]/td[6]/a"));
			Thread.sleep(2000);
			
			a.moveToElement(E2).click().build().perform();
			Thread.sleep(2000);
	}
			
	
	@Test(priority=8,enabled=true,description ="For checking whether user is able to select check out date")
	public void test8() throws InterruptedException {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		 driver.get("https://www.easemytrip.com/");
			driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			WebElement E1=driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]"));
			E1.click();
			Thread.sleep(2000);
			
				Actions a=new Actions(driver);	
				a.moveToElement(E1).doubleClick().build().perform();
				WebElement E2=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[4]/td[6]/a"));
			Thread.sleep(2000);
			
			a.moveToElement(E2).click().build().perform();
			Thread.sleep(2000);
			WebElement E3=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[5]/td[1]/a"));
			
			Thread.sleep(2000);
			a.moveToElement(E3).click().build().perform();
			Thread.sleep(2000);
	} 
	@Test(priority=9,enabled=true,description ="For checking whether user is able to add or subtract adults")
	public void test9() throws InterruptedException {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		 driver.get("https://www.easemytrip.com/");
			driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
			//Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			WebElement E1=driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]"));
			E1.click();
			Thread.sleep(2000);
			
				Actions a=new Actions(driver);	
				a.moveToElement(E1).doubleClick().build().perform();
				WebElement E2=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[4]/td[6]/a"));
			Thread.sleep(2000);
			
			a.moveToElement(E2).click().build().perform();
			Thread.sleep(2000);
			WebElement E3=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[5]/td[1]/a"));
			
			Thread.sleep(2000);
			a.moveToElement(E3).click().build().perform();
			Thread.sleep(2000);
			driver.findElement(By.id("Adults_room_1_1_plus")).click();
			driver.findElement(By.id("Adults_room_1_1_plus")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Adults_room_1_1_minus")).click();
			Thread.sleep(2000);
			
	} 
	@Test(priority=10,enabled=true,description ="For checking whether user is able to add or subtract no of children and select their age")
	public void test10() throws InterruptedException {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		 driver.get("https://www.easemytrip.com/");
			driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			WebElement E1=driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]"));
			E1.click();
			Thread.sleep(2000);
			
				Actions a=new Actions(driver);	
				a.moveToElement(E1).doubleClick().build().perform();
				WebElement E2=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[4]/td[6]/a"));
			Thread.sleep(2000);
			
			a.moveToElement(E2).click().build().perform();
			Thread.sleep(2000);
			WebElement E3=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[5]/td[1]/a"));
			
			Thread.sleep(2000);
			a.moveToElement(E3).click().build().perform();
			Thread.sleep(2000);
			driver.findElement(By.id("Adults_room_1_1_plus")).click();
			driver.findElement(By.id("Children_room_1_1_plus")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Children_room_1_1_plus")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Children_room_1_1_minus")).click();
			Thread.sleep(2000);
			Select s1=new Select(driver.findElement(By.id("Child_Age_1_1")));
			s1.selectByIndex(2);
			Thread.sleep(2000);
			
	} 
		
	@Test(priority=11,enabled=true,description ="For checking whether user is able to add or remove rooms and click on done")
	public void test11() throws InterruptedException {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		 driver.get("https://www.easemytrip.com/");
			driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			WebElement E1=driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]"));
			E1.click();
			Thread.sleep(2000);
			
				Actions a=new Actions(driver);	
				a.moveToElement(E1).doubleClick().build().perform();
				WebElement E2=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[4]/td[6]/a"));
			Thread.sleep(2000);
			
			a.moveToElement(E2).click().build().perform();
			Thread.sleep(2000);
			WebElement E3=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[5]/td[1]/a"));
			
			Thread.sleep(2000);
			a.moveToElement(E3).click().build().perform();
			Thread.sleep(2000);
			driver.findElement(By.id("Adults_room_1_1_plus")).click();
			driver.findElement(By.id("Children_room_1_1_plus")).click();
			Thread.sleep(2000);
			
			
			Select s1=new Select(driver.findElement(By.id("Child_Age_1_1")));
			s1.selectByIndex(2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"addhotelRoom\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"removehotelRoom\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"exithotelroom\"]")).click();
			Thread.sleep(2000);
			

			
	} 
	 
		
	@Test(priority=12,enabled=true,description ="For checking whether Search button is working or not")
	public void test12() throws InterruptedException {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		 driver.get("https://www.easemytrip.com/");
			driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement E1=driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]"));
			E1.click();
			Thread.sleep(2000);
			
				Actions a=new Actions(driver);	
				a.moveToElement(E1).doubleClick().build().perform();
				WebElement E2=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[4]/td[6]/a"));
			Thread.sleep(2000);
			
			a.moveToElement(E2).click().build().perform();
			Thread.sleep(2000);
			WebElement E3=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[5]/td[1]/a"));
			
			Thread.sleep(2000);
			a.moveToElement(E3).click().build().perform();
			Thread.sleep(2000);
			driver.findElement(By.id("Adults_room_1_1_plus")).click();
			driver.findElement(By.id("Children_room_1_1_plus")).click();
			Thread.sleep(2000);
			
			
			Select s1=new Select(driver.findElement(By.id("Child_Age_1_1")));
			s1.selectByIndex(2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"addhotelRoom\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"removehotelRoom\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"exithotelroom\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[4]/input")).click();
			Thread.sleep(2000);
			
		
			
	} 
		
			 
			@Test(priority=13,enabled=true,description ="For checking whether user is able to book hotel room")
			public void test13() throws InterruptedException {
				 
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
				 driver.get("https://www.easemytrip.com/");
					driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Hotels']")).click();
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class='htl_location']/span[1]")).click();
					driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys("Mumbai");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='txtCity']")).sendKeys(Keys.ENTER);
					Thread.sleep(2000);
					WebElement E1=driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]"));
					E1.click();
					Thread.sleep(2000);
					
						Actions a=new Actions(driver);	
						a.moveToElement(E1).doubleClick().build().perform();
						WebElement E2=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[4]/td[6]/a"));
					Thread.sleep(2000);
					
					a.moveToElement(E2).click().build().perform();
					Thread.sleep(2000);
					
					WebElement E3=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[5]/td[1]/a"));
				
					Thread.sleep(2000);
					a.moveToElement(E3).click().build().perform();
					Thread.sleep(2000);
					driver.findElement(By.id("Adults_room_1_1_plus")).click();
					driver.findElement(By.id("Children_room_1_1_plus")).click();
					Select s1=new Select(driver.findElement(By.id("Child_Age_1_1")));
					s1.selectByIndex(2);
					

					
					driver.findElement(By.xpath("//*[@id=\"exithotelroom\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[4]/input")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[5]/div[2]/div[4]/div[2]/div[2]/div[1]/a[1]/div[1]/h3[1]/span[1]")).click();
					
					Thread.sleep(5000);
				
					 Set<String> allwin=driver.getWindowHandles();
					 int n=allwin.size();
					 List<String> ls=new
							 ArrayList<String>(allwin);
					 for(String i:allwin)
					 {
						 ls.add(i);
					 }
					 driver.switchTo().window(ls.get(1));
					 					
					 					 driver.findElement(By.xpath("//div[@class='btnhcol']//a[@class='fill-btn'][normalize-space()='Book Now']")).click();
					 					Thread.sleep(2000);

					 
					
			} 
		
						
				
				
				
				
		
		@BeforeTest
		  public void beforeTest() {
			  System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		       driver=new ChromeDriver();
		       
		  }

		  @AfterTest
		  public void afterTest()throws Exception {
			  
			  Thread.sleep(3000);
			  driver.quit();
		  }
	}

  
