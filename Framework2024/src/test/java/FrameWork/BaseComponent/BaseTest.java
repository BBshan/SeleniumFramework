package FrameWork.BaseComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import FrameWork.PageObject.LoginPage;


public class BaseTest {
	
	public WebDriver driver;
	
	
	public WebDriver setupBrowser()
	{
		driver = new ChromeDriver();
		
		return driver;
		
	}
	 
	@BeforeTest
	public void launchBrowser()
	{
		setupBrowser();
		
		LoginPage page = new LoginPage(driver);
		
		page.goTo();
		
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	

}
