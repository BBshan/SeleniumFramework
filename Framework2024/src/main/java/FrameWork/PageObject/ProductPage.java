package FrameWork.PageObject;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

WebDriver driver;
	
	public ProductPage(WebDriver driver )
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css =".inventory_item")
	List<WebElement> productList;
	
	@FindBy(css =".shopping_cart_link")
	WebElement CartIcon;
	
	public void findProduct()
	{
		WebElement exactProd = (WebElement) productList.stream().filter(product -> product.findElement(By.cssSelector(".inventory_item_name"))
				.getText().equalsIgnoreCase("Sauce Labs Fleece Jacket")).findFirst().orElse(null);
		exactProd.findElement(By.cssSelector(".pricebar button")).click();
		
		
	
	}
	
	public CheckOutStep clickOnCart()
	{
		CartIcon.click();
		return new CheckOutStep(driver);
	}
	
	
	
	
	
	
	
	
	
}
