package logtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class udemytest {
static WebDriver webDriver;
	
	@BeforeTest
	public void stating() throws Exception {
		System.setProperty("webdriver.chrome.driver","src\test\resources\chromedriver.exe");
		webDriver=new ChromeDriver();
	}
	
	@AfterTest
	public void teare() throws Exception {
		Thread.sleep(3000);
		webDriver.quit();
	}
	@Test 
	public void dologin() throws Exception {
	
		webDriver.manage().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
		webDriver.get("https://www.udemy.com/");
		webDriver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
		webDriver.findElement(By.name ("email")).sendKeys ("admin");

		webDriver.findElement(By.name("password")).sendKeys ("admin123"); 
		webDriver.findElement (By.name ("submit")).click();
		boolean x =webDriver

		.findElement(By.xpath("//div[contains (text(), 'We found your account. It looks like a*****@**)]"))

		.isDisplayed();

		Assert.assertTrue(x);
	}

}
