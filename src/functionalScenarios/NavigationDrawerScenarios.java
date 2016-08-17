package functionalScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import appFunctions.GmailLogin;
import appFunctions.OpenHomePage;
import appFunctions.OpenLoginPage;

import pageObjects.AppData;
import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;
import utility.EmailValidator;
import utility.UsernameValidator;

public class NavigationDrawerScenarios extends BaseTestIOS {
	// Test case info:In this test case we are verifying mutiple scenarios for
	// navigation drawer functionality
	// In first test case we are verifying all root categories are clickable in
	// nav drawer
	// In second test case we are verifying gmail login from nav Drawer
	// In third test case we are verifyig normal user login
	// In fourth test case we are verifying trending products screen
	// In fifth test case we are verifying Popular category
	// Author : Argneshu Gupta

	@Override
	@Test(enabled = true)// automated
	public void executeTestCase() throws Exception {
		try {
			extentInfoLogs("open Home Page");
			OpenHomePage.openHomePage();
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			extentInfoLogs("open navigation drawer");
			clickName(BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
			extentInfoLogs("click on Mobile and tablets link");
			System.out.println(findElementByXpath(
					BugRegressionAppConstants.MTtext_xpath).getText());
			Assert.assertTrue(findElementByXpath(
					BugRegressionAppConstants.MTtext_xpath).getText().equals(
					AppData.MTtext));
			extentInfoLogs("verifying assertion");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			extentInfoLogs("open navigation drawer");
			clickName(BugRegressionAppConstants.NavDrawer_Kitchen_Appliances_link);
			extentInfoLogs("click on Kitchen appliances link");
			Assert.assertTrue(findElementByXpath(
					BugRegressionAppConstants.KPtext_xpath).getText().equals(
					AppData.KAtext));
			extentInfoLogs("verifying assertion");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			extentInfoLogs("open navigation drawer");
			clickName(BugRegressionAppConstants.NavDrawer_Home_Appliances_link);
			extentInfoLogs("click on Home appliances link");
			Assert.assertTrue(findElementByXpath(
					BugRegressionAppConstants.HPtext_xpath).getText().equals(
					AppData.HAtext));
			extentInfoLogs("verifying assertion");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			Thread.sleep(2000);
			// swipeWithAxis(10, 500, 50, 200, 2000);
			extentInfoLogs("open navigation drawer");
			clickName(BugRegressionAppConstants.NavDrawer_TV_Home_Entertainment_link);
			extentInfoLogs("click on Tv and video appliances link");
			Assert.assertTrue(findElementByXpath(
					BugRegressionAppConstants.THtext_xpath).getText().equals(
					AppData.TVVtext));
			extentInfoLogs("verifying assertion");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			Thread.sleep(2000);
			// swipeWithAxis(10, 500, 50, 200, 2000);
			extentInfoLogs("open navigation drawer");
			clickName(BugRegressionAppConstants.NavDrawerComputerAccessorieslink_name);
			extentInfoLogs("click on Computer Acessories link");
			Assert.assertTrue(findElementByXpath(
					BugRegressionAppConstants.CAtext_xpath).getText().equals(
					AppData.CAtext));
			extentInfoLogs("verifying assertion");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			Thread.sleep(2000);
			// swipeWithAxis(10, 500, 50, 200, 2000);
			extentInfoLogs("open navigation drawer");

			// swipeWithAxis(10, 500, 50, 200, 2000);
			clickName(BugRegressionAppConstants.NavDrawerPersonalCare_name);
			OpenHomePage
					.clickOnCategoryByName(BugRegressionAppConstants.PCtext_xpath);
			extentInfoLogs("click on Personal care link");
			Assert.assertTrue(findElementByXpath(
					BugRegressionAppConstants.PCtext_xpath).getText().equals(
					AppData.PCtext));
			extentInfoLogs("verifying assertion");
			// clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			// clickName(BugRegressionAppConstants.NavDrawerAutomotive_name);
			// extentInfoLogs( "click on Computer Acessories link");
			// Assert.assertTrue(findElementByXpath(BugRegressionAppConstants.ATtext_xpath).getText()
			// .equals(AppData.ATtext));

		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}

	}

	@Test(enabled = true)// automated
	public void gmailLoginFromNavDrawer() throws Exception {
		try {
			extentInfoLogs("open Home Page");
			OpenHomePage.openHomePage();
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			extentInfoLogs("open navigation drawer");
			clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
			extentInfoLogs("click on myaccount button");
			clickName(SanitySuiteAppConstants.NavDrawer_Login_button_name);
			extentInfoLogs("clicking on Login text on nav drawer");
			GmailLogin.gmailLogin();
			extentInfoLogs("appying gmail functions");
			String text = findElementByXpath(
					BugRegressionAppConstants.UserEmailtext_xpath).getText();
			String emailText = text.split("\\s")[2];
			EmailValidator em = new EmailValidator();
			boolean valid = em.validate(emailText);
			extentInfoLogs("validating email id");
			Assert.assertEquals(valid, true);
			extentInfoLogs("verifying assertion");
			String text1 = findElementByXpath(
					SanitySuiteAppConstants.NavDrawer_Login_Title_xpath)
					.getText();
			String userText = text.split("\\s")[0];
			UsernameValidator uv = new UsernameValidator();
			boolean valid1 = uv.validate(userText);
			extentInfoLogs("applying validator");
			Assert.assertEquals(valid1, true);

		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}

	}

	@Test(enabled = true)// automated
	public void normalUserLogin() throws Exception {
		try {

			extentInfoLogs("open Home Page");
			OpenHomePage.openHomePage();
			clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
			extentInfoLogs("click on myaccount button");
			clickName(SanitySuiteAppConstants.NavDrawer_Login_button_name);
			extentInfoLogs("clicking on Login text on nav drawer");
			sendKeysForXpath(BugRegressionAppConstants.Login_UserName_xpath,
					AppData.username);
			extentInfoLogs("entering username");
			sendKeysForXpath(BugRegressionAppConstants.Login_Password_xpath,
					AppData.password);
			extentInfoLogs("entering password");
			clickName(BugRegressionAppConstants.LoginPageButton_name);
			extentInfoLogs("clicking on login button");
			// extentInfoLogs( "entering password");
			// clickName(BugRegressionAppConstants.LoginButton_name);
			extentInfoLogs("clicking on login button");
			String text = findElementByXpath(
					BugRegressionAppConstants.UserEmailtext_xpath).getText();
			System.out.println("text is " + text);
			String emailText = text.split("\\s")[1];
			System.out.println("email text is " + emailText);
			EmailValidator em = new EmailValidator();
			boolean valid = em.validate(emailText);
			extentInfoLogs("validating email id");
			Assert.assertEquals(valid, true);
			extentInfoLogs("verifying assertion");
			String text1 = findElementByXpath(
					SanitySuiteAppConstants.NavDrawer_Login_Title_xpath)
					.getText();
			String userText = text1.split("\\s")[0];
			System.out.println("usertext is " + userText);
			UsernameValidator uv = new UsernameValidator();
			boolean valid1 = uv.validate(userText);
			extentInfoLogs("applying validator");
			Assert.assertEquals(valid1, true);

		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}
	}

	@Test(enabled = true)// automated
	@SuppressWarnings("unchecked")
	public void facebook() throws Exception {
		// startTestCase("gmailLoginFromNavDrawer");
		// extentInfoLogs("executing home functions");
		extentInfoLogs("open Home Page");
		OpenHomePage.openHomePage();
		clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
		extentInfoLogs("click on myaccount button");
		clickName(SanitySuiteAppConstants.NavDrawer_Login_button_name);
		extentInfoLogs("clicking on Login text on nav drawer");
		clickName(BugRegressionAppConstants.Facebook_button_name);
		extentInfoLogs("click on fb button");
		// driver.findElement(
		// By.xpath(BugRegressionAppConstants.FacebookUserName_xpath))
		// .sendKeys("zopperprachi@gmail.com");
		// driver.findElement(
		// By.xpath(BugRegressionAppConstants.FacebookPassword_xpath))
		// .sendKeys("qa@zopper");
		// driver.findElement(
		// By.xpath(BugRegressionAppConstants.FacebookLoginButton_name))
		// .click();
		clickXpath(SanitySuiteAppConstants.FacebookOkButton_xpath);
		String text = findElementByXpath(
				BugRegressionAppConstants.UserEmailtext_xpath).getText();
		String emailText = text.split("\\s")[1];
		System.out.println("email text is " + emailText);
		EmailValidator em = new EmailValidator();
		boolean valid = em.validate(emailText);
		extentInfoLogs("validating email id");
		Assert.assertEquals(valid, true);
		extentInfoLogs("verifying assertion");
		// Set<String> contextNames = driver.getContextHandles();
		// System.out.println(contextNames);
		// for (String contextName : contextNames) {
		// System.out.println(contextName);
		// if (contextName.contains("WEBVIEW")) {
		// driver.context(contextName);
		// }
		// }

	}

	@Test(enabled = true)// automated
	public void trendingProductsScreen() throws Exception {
		try {
			extentInfoLogs("open Login Page");
			OpenLoginPage.openLoginPage();

			extentInfoLogs("Gmail Login Page");
			GmailLogin.gmailLogin();
			extentInfoLogs("Click on cart icon");
			clickXpath(SanitySuiteAppConstants.Cartbutton_xpath);
			extentInfoLogs("Delete all cart products");
			for (int i = 0; i <= 3; i++) {
				if (findElementsByName(
						BugRegressionAppConstants.Prod_CartDeleteButton_name)
						.size() > 0) {
					List<WebElement> delButton = findElementsByName(BugRegressionAppConstants.Prod_CartDeleteButton_name);
					for (int j = 0; j < delButton.size(); j++) {
						wait.until(ExpectedConditions.elementToBeClickable(By
								.name(BugRegressionAppConstants.Prod_CartDeleteButton_name)));
						clickName(BugRegressionAppConstants.Prod_CartDeleteButton_name);
						clickName(AppData.Delete_text);
					}
				} else {
					break;
				}
			}
			extentInfoLogs("Click on tranding products link");
			clickName(AppData.SEEWHATTRENDING_Text);
			extentInfoLogs("Assert for Trending in you city");
			Assert.assertTrue(findElementByName(
					SanitySuiteAppConstants.PeopleChoice_name).isDisplayed());

		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}
	}

	@Test(enabled = true)// automated
	public void weCareLink() throws Exception {
		try {
			extentInfoLogs("open Home Page");
			OpenHomePage.openHomePage();
			clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
			extentInfoLogs("click on myaccount button");
			swipeVertically_FullPage();
			extentInfoLogs("clicking on Overflow menu");
			try {
				clickName(BugRegressionAppConstants.ContactUs_name);
			} catch (Exception e) {
				swipeVertically_FullPage();
				clickName(BugRegressionAppConstants.ContactUs_name);
			}
			try {
				Assert.assertTrue(findElementByXpath(
						BugRegressionAppConstants.wecarelink_xpath)
						.isDisplayed());
			} catch (Exception e) {
				Assert.assertTrue(findElementsByXpath(
						BugRegressionAppConstants.wecarelink_xpath).size() > 0);
			}
			clickXpath(BugRegressionAppConstants.wecarelink_xpath);
			Assert.assertTrue(findElementsByXpath(
					BugRegressionAppConstants.NewMessage_xpath).size() > 0);
		} catch (Exception e) {
			throw (e);
		}
	}

	// @Test(enabled = true)
	// public void viewPopularAndMoreCategory() throws Exception {
	// try {
	// extentInfoLogs( "open Home Page");
	// OpenHomePage.openHomePage();
	// String[] categories = {
	// BugRegressionAppConstants.NavDrawer_Mobile_tablets_link,
	// BugRegressionAppConstants.NavDrawer_Kitchen_Appliances_link,
	// BugRegressionAppConstants.NavDrawer_Home_Appliances_link,
	// BugRegressionAppConstants.NavDrawer_TV_Home_Entertainment_link,
	// BugRegressionAppConstants.NavDrawerComputerAccessorieslink_name,
	// BugRegressionAppConstants.NavDrawerPersonalCare_name };
	// for (String category : categories) {
	//
	// extentInfoLogs( "Click on navigation drawer");
	// clickClassName(BugRegressionAppConstants.Open_Navigation_Drawer);
	// if (!verifyElementDisplayedByName(category)) {
	// swipeVertically(200);
	// }
	// extentInfoLogs( "Click on "+category);
	// clickName(category);
	//
	// extentInfoLogs( "Assert for popular categories");
	// Assert.assertEquals(findElementById(BugRegressionAppConstants.PopularCategories_id).getText(),
	// AppData.PopularCategoriestext);
	// swipeVertically_FullPage();
	// extentInfoLogs( "Assert for more categories");
	// Assert.assertEquals(findElementById(BugRegressionAppConstants.MoreCategories_id).getText(),
	// AppData.MoreCategoriestext);
	// extentInfoLogs( "Assert for android phones");
	// Assert.assertTrue(findElementById(BugRegressionAppConstants.ProductionAndroid_phones_id).isDisplayed());
	// extentInfoLogs( "Assert for iphones");
	// Assert.assertTrue(findElementById(BugRegressionAppConstants.Productioniphone_id).isDisplayed());
	// }
	//
	// } catch (Exception e) {
	// e.getMessage();
	// throw (e);
	//
	// }
	//
	// }

	@Test(enabled = true)//automated
	public void phoneNumberlogin() {
		try {
			extentInfoLogs("open Home Page");
			OpenHomePage.openHomePage();
			clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
			extentInfoLogs("click on myaccount button");
			clickName(SanitySuiteAppConstants.NavDrawer_Login_button_name);
			extentInfoLogs("clicking on Login text on nav drawer");
			sendKeysForXpath(BugRegressionAppConstants.Login_UserName_xpath,
					AppData.usermobileno);
			extentInfoLogs("entering username");
			sendKeysForXpath(BugRegressionAppConstants.Login_Password_xpath,
					AppData.userpassword);
			extentInfoLogs("entering password");
			clickName(BugRegressionAppConstants.LoginPageButton_name);
			extentInfoLogs("clicking on login button");
			String text = findElementByXpath(
					BugRegressionAppConstants.UserEmailtext_xpath).getText();
			System.out.println("text is " + text);
			String emailText = text.split("\\s")[2];

			System.out.println("email text is " + emailText);
			EmailValidator em = new EmailValidator();
			boolean valid = em.validate(emailText);
			extentInfoLogs("validating email id");
			Assert.assertEquals(valid, true);
		} catch (Exception e) {
			throw (e);
		}
	}
}
