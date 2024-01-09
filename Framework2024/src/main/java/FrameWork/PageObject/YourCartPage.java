package FrameWork.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

WebDriver driver;
	
	public YourCartPage(WebDriver driver )
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css =".cart_item")
	List<WebElement> productList;
	
	@FindBy(id = "checkout")
	WebElement checkoutButton;
	
	
	
	public String VerifyCartProduct()
	{

		WebElement exactProd = (WebElement) productList.stream().filter(product -> product.findElement(By.linkText("Sauce Labs Fleece Jacket")).getText().equalsIgnoreCase("Sauce Labs Fleece Jacket"));
		String prodName = exactProd.findElement(By.cssSelector(".pricebar button")).getText();
		
		return prodName;
	}
	
	public void clickOnCheckoutButton()
	{
		checkoutButton.click();
	}
	
	
	
	
	
}
