package functionalScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;

import appFunctions.AddToCart;
import appFunctions.GmailLogin;
import appFunctions.OpenAndroidPage;
import appFunctions.OpenHomePage;

import pageObjects.AppData;
import pageObjects.AppVerificationChecks;
import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;

//Test case info:In this test case we are Ola money scenarios
//In first test  case we are verifying different options which are displayed on OLA money page
//Author:Argneshu Gupta
public class OLAMoneyScenarios extends BaseTestBugRegression {

	@Override
	@Test(enabled = true)
	public void executeTestCase() throws Exception {
		try {
			extentInfoLogs("open Home Page");
			OpenHomePage.openHomePage();

			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			extentInfoLogs("open navigation drawer");

			OpenHomePage.clickOnCategoryByName(BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
			extentInfoLogs("click on Mobile and tablets link");
			extentInfoLogs("click on android phones");
			clickName(BugRegressionAppConstants.AndroidPhones_name);
			extentInfoLogs("click on first android phones");
			OpenAndroidPage.clickOnFirstAndroidProduct();
			clickXpath(BugRegressionAppConstants.ProductDetailsBuyNow_xpath);
			extentInfoLogs("clicking on Buy Now button");
			AddToCart.addToCart();
			Assert.assertEquals(findElementByName(BugRegressionAppConstants.Login_text).getText(),
					AppVerificationChecks.Logintext);
			extentInfoLogs("verifying assertion");
			extentInfoLogs("Gmail login");
			GmailLogin.gmailLogin();
			//clickId(BugRegressionAppConstants.ProductionCheckoutButton_id);
			extentInfoLogs("clicking on checkout button");

			if (findElementsById(SanitySuiteAppConstants.Shipping_FullName_Id).size() > 0) {
				extentInfoLogs("Enter user name in shipping address");
				sendKeysForID(SanitySuiteAppConstants.Shipping_FullName_Id, AppData.Shipping_UserName);
				extentInfoLogs("Enter address in shipping address");
				sendKeysForID(SanitySuiteAppConstants.Shipping_Address_Id, AppData.ShippingAddress);
				extentInfoLogs("Enter Pincode in shipping address");
				sendKeysForID(SanitySuiteAppConstants.Shipping_Pincode_Id, AppData.ShippingPincode);
				extentInfoLogs("Click on save button");
				//clickId(SanitySuiteAppConstants.Shipping_SaveButton_Id);
			}

			//clickId(BugRegressionAppConstants.ProductionContinueButton_id);
			extentInfoLogs("clicking on continue button");
			Thread.sleep(5000);
			swipeVertically(300);
			clickOnCategoryByName(BugRegressionAppConstants.AllPaymentMode_id, AppData.OlaMoney);
			// clickName(BugRegressionAppConstants.OlaMoneyIcon_name);
			extentInfoLogs("clicking on Ola Money");
			extentInfoLogs("Assert for Ola debit card name");
			Assert.assertTrue(findElementByName(BugRegressionAppConstants.OLADEBITCREDITCARDS_name).getText()
					.equals(AppVerificationChecks.OLADEBITCREDITCARDS));
			extentInfoLogs("Assert for Ola net banking name");
			Assert.assertTrue(findElementByName(BugRegressionAppConstants.OLANETBANKING_name).getText()
					.equals(AppVerificationChecks.OLANETBANKING));
			extentInfoLogs("Assert for Ola amount");
			Assert.assertTrue(findElementById(BugRegressionAppConstants.OLAAmount_id).isDisplayed());
			extentInfoLogs("Assert for Ola balance");
			Assert.assertTrue(findElementById(BugRegressionAppConstants.OLABalance_id).isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);

		}

	}
	
	@Test(enabled = true)
	public void olaWalletMoney() throws Exception{
		try{
		Thread.sleep(5000);
		driver.startActivity("com.olacabs.customer", "com.olacabs.customer.ui.SplashActivity");
		extentInfoLogs("launching ola app");
		clickId(SanitySuiteAppConstants.OlaNavDrawer);
		String olaWallet = findElementById(SanitySuiteAppConstants.OlaWalletMoney).getText();
		String olaWalletText = olaWallet.split("\\₹")[1];
		if(BugRegressionAppConstants.buildType.contains(".staging")){
		driver.startActivity("com.zopperapp.staging", "com.zopper.aegon.ui.activity.SplashActivity");
		}else{
			driver.startActivity("com.zopperapp", "com.zopper.aegon.ui.activity.SplashActivity");
		}
		//Thread.sleep(2000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id)));
		if(findElementsByName(BugRegressionAppConstants.LetsGoShopping_name).size()>0){
			clickName(BugRegressionAppConstants.LetsGoShopping_name);
		}
		clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
		extentInfoLogs("open navigation drawer");
		OpenHomePage.clickOnCategoryByName(BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
		extentInfoLogs("click on Mobile and tablets link");
		extentInfoLogs("click on android phones");
		clickName(BugRegressionAppConstants.AndroidPhones_name);
		extentInfoLogs("click on first android phones");
		OpenAndroidPage.clickOnFirstAndroidProduct();
		clickXpath(BugRegressionAppConstants.ProductDetailsBuyNow_xpath);
		extentInfoLogs("clicking on Buy Now button");
		AddToCart.addToCart();
		Assert.assertEquals(findElementByName(BugRegressionAppConstants.Login_text).getText(),
				AppVerificationChecks.Logintext);
		extentInfoLogs("verifying assertion");
		extentInfoLogs("Gmail login");
		GmailLogin.gmailLogin();
	//	clickId(BugRegressionAppConstants.ProductionCheckoutButton_id);
		extentInfoLogs("clicking on checkout button");

		if (findElementsById(SanitySuiteAppConstants.Shipping_FullName_Id).size() > 0) {
			extentInfoLogs("Enter user name in shipping address");
			sendKeysForID(SanitySuiteAppConstants.Shipping_FullName_Id, AppData.Shipping_UserName);
			extentInfoLogs("Enter address in shipping address");
			sendKeysForID(SanitySuiteAppConstants.Shipping_Address_Id, AppData.ShippingAddress);
			extentInfoLogs("Enter Pincode in shipping address");
			sendKeysForID(SanitySuiteAppConstants.Shipping_Pincode_Id, AppData.ShippingPincode);
			extentInfoLogs("Click on save button");
		//	clickId(SanitySuiteAppConstants.Shipping_SaveButton_Id);
		}

		//clickId(BugRegressionAppConstants.ProductionContinueButton_id);
		extentInfoLogs("clicking on continue button");
		Thread.sleep(5000);
		swipeVertically(300);
		clickOnCategoryByName(BugRegressionAppConstants.AllPaymentMode_id, AppData.OlaMoney);
		Assert.assertTrue(findElementById(SanitySuiteAppConstants.UtilizeOlaWalletMoney).getText().split("\\₹")[1].replaceAll("\\)", "").trim().equalsIgnoreCase(olaWalletText.trim()));
		}catch(Exception e){
			throw(e);
		}
		
		}
}
