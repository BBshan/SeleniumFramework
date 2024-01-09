package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import FrameWork.BaseComponent.BaseTest;
import FrameWork.PageObject.CheckOutCompletePage;
import FrameWork.PageObject.CheckOutStep;
import FrameWork.PageObject.LoginPage;
import FrameWork.PageObject.ProductPage;

public class FirstTest extends BaseTest {

	@Test
	public void PrcheshProduct() {
		LoginPage p = new LoginPage(driver);

		p.enterUserName("standard_user");
		p.enterPassword("secret_sauce");
		ProductPage clickOnProduct = p.submit();

		clickOnProduct.findProduct();

		CheckOutStep CheckOutStepVar = clickOnProduct.clickOnCart();

		CheckOutStepVar.clickOnCheckOut();
		CheckOutStepVar.EnterFirstName("BBshan");
		CheckOutStepVar.EnterLsatName("Chaudhari");
		CheckOutStepVar.EnterPostalCodeName("123");
		CheckOutStepVar.clickOnContinueButton();
		CheckOutCompletePage CheckOutCompletepageVar = CheckOutStepVar.clickOnFinishButton();
		String orderStatus = CheckOutCompletepageVar.CheckOrderStatus();

		assertEquals(orderStatus, "Thank you for your order!");

		CheckOutCompletepageVar.goToHome();

	}

}
