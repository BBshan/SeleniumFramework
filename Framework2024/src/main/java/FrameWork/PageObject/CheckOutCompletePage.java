package FrameWork.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePage {

	
WebDriver driver;
	
	public CheckOutCompletePage(WebDriver driver )
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css =".complete-header")
	WebElement CheckOutComplete;
	
	@FindBy(id ="back-to-products")
	WebElement backToHome;
	
	public String CheckOrderStatus()
	{
		return CheckOutComplete.getText();
	}
	
	public void goToHome()
	{
		backToHome.click();
	}
}
