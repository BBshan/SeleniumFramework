package FrameWork.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStep {

	WebDriver driver;

	public CheckOutStep(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "checkout")
	WebElement checkOutButton;
	
	@FindBy(id = "first-name")
	WebElement firstName;

	@FindBy(id = "last-name")
	WebElement lastName;

	@FindBy(id = "postal-code")
	WebElement PostalCode;

	@FindBy(id = "continue")
	WebElement continueButton;
	
	@FindBy(id = "finish")
	WebElement finishButton;

	public void clickOnCheckOut() {
		checkOutButton.click();
	}
	
	public void EnterFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	public void EnterLsatName(String lName) {
		lastName.sendKeys(lName);
	}

	public void EnterPostalCodeName(String pCode) {
		PostalCode.sendKeys(pCode);
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public CheckOutCompletePage clickOnFinishButton()
	{
		finishButton.click();
		
		return new CheckOutCompletePage(driver);
	}

}
