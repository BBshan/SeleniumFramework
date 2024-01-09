package FrameWork.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver )
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id ="user-name")
	WebElement userId;
	
	@FindBy(id ="password")
	WebElement password;
	
	@FindBy(id ="login-button")
	WebElement submitButton;
	
	
	
	
	public void enterUserName(String uName)
	{
		userId.sendKeys(uName);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public ProductPage submit()
	{
		submitButton.click();
		
		return new ProductPage(driver);
	}
	
	public void goTo()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	
	
}
