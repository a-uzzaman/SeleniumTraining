package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTest {

	WebDriver driver;


	@BeforeTest
	public void browserOn() {

		//SETTING driver property
		System.setProperty("webdriver.chrome.driver", "/Users/a.uzzaman/eclipse-workspace/SeleniumTraining/Drivers/chromedriver");
		//Open Browser
		driver =new ChromeDriver();
		//		  Go to the website
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//		  Maximize screen size
		driver.manage().window().maximize(); 

	}

	@Test
	public void LoginTest() {


		//	  Go to element with id and clear data
		driver.findElement(By.id("txtUsername")).clear();
		//	  Go to the element with id and type the username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//	  Go to the element with id and type the Password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//	  Go to the element with id and click on login button
		driver.findElement(By.id("btnLogin")).click();
		
		
	}
	
	@Test
	public void LoginTest2() {
//		
		
	}



	@AfterTest
	public void teardown() {

		//	  Close all browsers
		driver.quit();
	}

}
