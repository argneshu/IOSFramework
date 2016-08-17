package functionalScenarios;

import java.util.HashMap;
import java.util.List;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AppVerificationChecks;
import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;
import appFunctions.AddToCart;
import appFunctions.GmailLogin;
import appFunctions.OpenAndroidPage;
import appFunctions.OpenHomePage;
import bugRegressionSuite.BaseTestIOS;

//Test case info:In this test case we are  verifying multiple cases
//In first test case we are verifying store details on Cart
//In second test case we are verifying cart should get empty on changing location
//Author : Argneshu Gupta

public class CartScenarios extends BaseTestIOS {

	@Override
	@Test(enabled = true, priority = 1)//automated
	public void executeTestCase() throws Exception {
		try {
			extentInfoLogs("Open Home page");
			OpenHomePage.openHomePage();
			extentInfoLogs("open navigation drawer");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			info("open navigation drawer");
			extentInfoLogs("click on Mobiles and Tablets link");
			clickName(BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
			extentInfoLogs("Open Android phone category");
			clickName(BugRegressionAppConstants.PowerBank_name);
			extentInfoLogs("click On First Android Product");
			OpenAndroidPage.clickOnFirstAndroidProduct();
			extentInfoLogs("click on Buy Now button ");
			clickName(BugRegressionAppConstants.ProductDetailsBuyNow_xpath);

			info("clicking on Buy Now button");
			AddToCart.addToCart();
			extentInfoLogs("verifying assertion for login screen");
			Assert.assertEquals(
					findElementByName(BugRegressionAppConstants.Login_text)
							.getText(), AppVerificationChecks.Logintext);
			info("verifying assertion");
			extentInfoLogs("Login to Gmail");
			GmailLogin.gmailLogin();
			extentInfoLogs("Verifying assertion for store locality");
			Assert.assertTrue(findElementsByXpath(
					BugRegressionAppConstants.StoreLocality_xpath).size() > 0);
			Assert.assertTrue(findElementsByXpath(
					BugRegressionAppConstants.StoreTitle_xpath).size() > 0);

		} catch (Exception e) {
			e.getMessage();
			// takeSnapShot("D:\\takeScreenshots",
			// "Store details on Cart Page");
			throw (e);
		}

	}

	@Test(enabled = true, priority = 2)//automated
	public void emptyCartOnChangingLocation() throws Exception {
		try {
			extentInfoLogs("Open Home page");
			OpenHomePage.openHomePage();
			extentInfoLogs("open navigation drawer");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			info("open navigation drawer");
			extentInfoLogs("click on Mobiles and Tablets link");
			clickName(BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
			extentInfoLogs("click on Mobile and tablets link");
			extentInfoLogs("Open Android Phone category");
			clickName(BugRegressionAppConstants.PowerBank_name);
			extentInfoLogs("click On First Android Product");
			OpenAndroidPage.clickOnFirstAndroidProduct();
			extentInfoLogs("click on Buy Now button ");
			clickName(BugRegressionAppConstants.ProductDetailsBuyNow_xpath);
			extentInfoLogs("clicking on Buy Now button");
			AddToCart.addToCart();
			extentInfoLogs("Login to Gmail");
			GmailLogin.gmailLogin();
			extentInfoLogs("click on close button");
			clickName(SanitySuiteAppConstants.CloseButton_name);
			extentInfoLogs("Navigate back");
			backButton();
			extentInfoLogs("Navigate back");
			backButton();
			extentInfoLogs("click on home icon");
			clickXpath(SanitySuiteAppConstants.HomeIcon_xpath);
			extentInfoLogs("clicking on location icon");
			clickXpath(SanitySuiteAppConstants.SelectedLocation_xpath);
			extentInfoLogs("clicking on bangalore");
         	clickXpath(BugRegressionAppConstants.BangaloreLocation_xpath);
			extentInfoLogs("clicking on BTM location");
			clickXpath(BugRegressionAppConstants.BTMLocation_xpath);
			info("clicking on BTM location");
			extentInfoLogs("clicking on cart alert");
			clickName(BugRegressionAppConstants.LocationChangeCartPrompt_name);
			info("clicking on cart alert");
			extentInfoLogs("clicking on cart");
			clickCart();
			info("clicking on cart");
			extentInfoLogs("Verifying assertion for empty cart");
			Assert.assertEquals(
					findElementByName(BugRegressionAppConstants.NoItemInCart_name)
							.getText(), AppVerificationChecks.NoItemInCart);

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}
	@Test(enabled = true, priority = 3)
	public void itemVerificationInCart() throws Exception {
		try {
			extentInfoLogs("Open Home page");
			OpenHomePage.openHomePage();
			extentInfoLogs("open navigation drawer");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			info("open navigation drawer");
			extentInfoLogs("click on Mobiles and Tablets link");
			clickName(BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
			extentInfoLogs("click on Mobile and tablets link");
			extentInfoLogs("Open Android Phone category");
			clickName(BugRegressionAppConstants.PowerBank_name);
			extentInfoLogs("click On First Android Product");
			OpenAndroidPage.clickOnFirstAndroidProduct();
			extentInfoLogs("click on Buy Now button ");
			clickName(BugRegressionAppConstants.ProductDetailsBuyNow_xpath);
			extentInfoLogs("clicking on Buy Now button");
			AddToCart.addToCart();
			extentInfoLogs("Login to Gmail");
			GmailLogin.gmailLogin();
			extentInfoLogs("appying gmail functions");
			int counter=0;
			while (counter<2) {
				if (findElementsByName(
						BugRegressionAppConstants.NoItemInCart_name).size() > 0) {
					clickName(BugRegressionAppConstants.CartGoHome_name);
					break;
				} else {
					if (findElementsByName(
							BugRegressionAppConstants.CartDeleteButton_name)
							.size() > 0) {
						clickName(BugRegressionAppConstants.CartDeleteButton_name);
						clickXpath(BugRegressionAppConstants.CartDeletePopup_xpath);
						if(findElementsByName(BugRegressionAppConstants.CartGoHome_name).size()>0){
						clickName(BugRegressionAppConstants.CartGoHome_name);
						}
					}
				}
				counter++;
			}
			extentInfoLogs("open navigation drawer");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			info("open navigation drawer");
			extentInfoLogs("click On First Android Product");
			OpenAndroidPage.clickOnFirstAndroidProduct();
			clickName(BugRegressionAppConstants.ProductDetailsBuyNow_xpath);
			int i=0;
			while(i<5){
				extentInfoLogs("click on Increase Item Count");
				clickName(BugRegressionAppConstants.CartPlus_name);
				i++;
			}
			String ItemCount=findElementByXpath(BugRegressionAppConstants.CartItemCount_xpath).getText();
			String splitText = ItemCount.split(":")[1];
			Assert.assertTrue(splitText.contains("5"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw (e);
		}
	}
	
}
