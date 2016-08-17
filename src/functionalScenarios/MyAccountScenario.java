package functionalScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AppData;
import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;
import utility.EmailValidator;
import appFunctions.ChangeZopperPassword;
import appFunctions.GmailLogin;
import appFunctions.OpenLoginPage;
import bugRegressionSuite.BaseTestIOS;

//Test case info:In this test case we are  verifying multiple cases
//In first test case we are verifying connection error should get displayed MY account page on closing internet connection
//In second test  case we are verifying forget password functionality
//Author: Arvind
public class MyAccountScenario extends BaseTestIOS {
	
	public boolean reIntializeBrowser() throws Exception{
		boolean flag = false;
		ChangeZopperPassword.openBrowser(AppData.Rediff_URL);

		extentInfoLogs("Rediff login");
		ChangeZopperPassword.rediffLogin();

		ChangeZopperPassword.closeChildWindow();

		extentInfoLogs("Click on mail box link");
		ChangeZopperPassword.openMailBox();

		ChangeZopperPassword.closeChildWindow();

		extentInfoLogs("Click on mail");
		ChangeZopperPassword.clickChangePasswordMail();
		Thread.sleep(5000);

		extentInfoLogs("Click on link in mail");
		ChangeZopperPassword.clickMailLink();

		Thread.sleep(5000);

		extentInfoLogs("Switch to child window");
		ChangeZopperPassword.switchToChildWindow();

		extentInfoLogs("Reset password");
		flag = ChangeZopperPassword.resetPassword();

		extentInfoLogs("Close selenium session");
		ChangeZopperPassword.closeBrowser();
		return flag;
	}

	public String verifyConnectionErrorOnAllTabs() {
		String tabs = AppData.ConnectionErrortext;
		int i = 1;
		try {
			WebElement element = driver.findElement(By.className(SanitySuiteAppConstants.MyAccountTabsParent_class));
			List<WebElement> elements = element
					.findElements(By.className(SanitySuiteAppConstants.MyAccountTabsChilld_class));
			for (WebElement elemnt : elements) {
				elemnt.click();
				try{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(BugRegressionAppConstants.ConnectionErrorPage_name)));
				}catch(Exception e){
					wait.until(ExpectedConditions.presenceOfElementLocated(By.name(BugRegressionAppConstants.ConnectionErrorPage_name)));
				}
				if (verifyElementDisplayedByName(BugRegressionAppConstants.ConnectionErrorPage_name)) {
				} else {
					tabs = tabs + " Tab " + i;
				}
				i++;
				backButton();
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
		return tabs;
	}

	@Test(enabled = false)
	public void verifyConnectionErrorOnMyAccountPage() throws Exception {
		try {
			extentInfoLogs("Open login page");
			OpenLoginPage.openLoginPage();
			extentInfoLogs("Gmail Login Page");
			GmailLogin.gmailLogin();
			Thread.sleep(5000);
			extentInfoLogs("Switch off the wifi");
			hitADBCommandForWiFi("off");
			Thread.sleep(8000);
			extentInfoLogs("Verify connection error on my account tabs");
			String err_Tabs = verifyConnectionErrorOnAllTabs();
			Assert.assertEquals(err_Tabs, AppData.ConnectionErrortext);
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			extentInfoLogs("Open Wi-Fi connection");
			hitADBCommandForWiFi("on");
		}
	}

	@Test(enabled = true)//automated
	public void forgotPasswordFunctionality() throws Exception {
		boolean flag = false;
		try {
			extentInfoLogs("Open Login Page");
			OpenLoginPage.openLoginPage();
			extentInfoLogs("Click Forgot password link");
			clickName(BugRegressionAppConstants.Forgot_Password_Link_name);
			extentInfoLogs("sending data for email id");
			clickXpath(BugRegressionAppConstants.Forgot_Email_xpath);
			sendKeysForXpath(BugRegressionAppConstants.Forgot_Email_xpath, AppData.UserId);

			extentInfoLogs("Click submit button");
			clickName(BugRegressionAppConstants.Forgot_Submit_name);
//			if(findElementsByName(BugRegressionAppConstants.Forgot_Submit_name).size()>0){
//				clickName(BugRegressionAppConstants.Forgot_Submit_name);
//			}
			Thread.sleep(5000);
			extentInfoLogs("Close Appium Session");
			closeAppiumSession();
			Thread.sleep(20000);

			extentInfoLogs("Open selenium browser");
			ChangeZopperPassword.openBrowser(AppData.Rediff_URL);

			extentInfoLogs("Rediff login");
			ChangeZopperPassword.rediffLogin();

			ChangeZopperPassword.closeChildWindow();

			extentInfoLogs("Click on mail box link");
			ChangeZopperPassword.openMailBox();

			ChangeZopperPassword.closeChildWindow();

			extentInfoLogs("Click on mail");
			ChangeZopperPassword.clickChangePasswordMail();
			Thread.sleep(5000);

			extentInfoLogs("Click on link in mail");
			ChangeZopperPassword.clickMailLink();

			Thread.sleep(5000);

			extentInfoLogs("Switch to child window");
			ChangeZopperPassword.switchToChildWindow();
			Thread.sleep(5000);
			extentInfoLogs("Reset password");
			flag = ChangeZopperPassword.resetPassword();

			extentInfoLogs("Close selenium session");
			ChangeZopperPassword.closeBrowser();
			if(flag==false){
				boolean newFlag = reIntializeBrowser();
				Assert.assertEquals(newFlag, true);

			}else{
				Assert.assertEquals(flag, true);

			}


			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	@Test(enabled = true)//, dependsOnMethods = { "forgotPasswordFunctionality" }) //automated
	public void loginWithChangedPassword() throws Exception {
		boolean flag = false;
		try {
			extentInfoLogs("open Login Page");
			OpenLoginPage.openLoginPage();

			extentInfoLogs("Enter Login user name");
			sendKeysForXpath(BugRegressionAppConstants.Login_UserName_xpath, AppData.UserId);

			extentInfoLogs("Enter Login Password");
			sendKeysForXpath(BugRegressionAppConstants.Login_Password_xpath, AppData.password);

			extentInfoLogs("Click On Login button");
			clickName(BugRegressionAppConstants.Login_Button_name);

			// extentInfoLogs("Open My Account Page");
			// clickClassName(App_Constants.Open_Navigation_Drawer);
			// clickId(App_Constants.SignUpIcon_id);
			String text = findElementByXpath(BugRegressionAppConstants.UserEmailtext_xpath).getText();
			String emailText =text.split("\\s")[1];
			System.out.println("email text is :" + emailText);
			EmailValidator em = new EmailValidator();
			boolean valid = em.validate(emailText);
			extentInfoLogs( "validating email id");
			Assert.assertEquals(valid, true);
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	@Test(enabled = true)//automated
	public void logOutPopupOnMyAccount() throws Exception {
		try {
			extentInfoLogs("Open Login Page");
			OpenLoginPage.openLoginPage();
			extentInfoLogs("Gmail Login Page");
			GmailLogin.gmailLogin();
			Thread.sleep(2000);
			swipeVertically(3000);
			clickName(BugRegressionAppConstants.Logout_button_Prod_name);

			extentInfoLogs("Verifying Logout pop out");
			Assert.assertTrue(findElementByXpath(BugRegressionAppConstants.myAccount_LogOutPopupMessage_xpath).isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}
	
	
	@Test(enabled = true) //automated
	public void forgotPasswordFunctionality_SocialLogin() throws Exception {
		try {
			extentInfoLogs("Open Login Page");
			OpenLoginPage.openLoginPage();
			extentInfoLogs("Click Forgot password link");
			clickName(BugRegressionAppConstants.Forgot_Password_Link_name);
			extentInfoLogs("sending data for email id");
			clickXpath(BugRegressionAppConstants.Forgot_Email_xpath);
			sendKeysForXpath(BugRegressionAppConstants.Forgot_Email_xpath, AppData.Gmail_MailId);

			extentInfoLogs("Click submit button");
			clickName(BugRegressionAppConstants.Forgot_Submit_name);

			Thread.sleep(2000);

			clickName(BugRegressionAppConstants.Forgot_Password_Link_name);
			extentInfoLogs("sending data for email id");
			clickXpath(BugRegressionAppConstants.Forgot_Email_xpath);
			sendKeysForXpath(BugRegressionAppConstants.Forgot_Email_xpath, AppData.Facebook_MailId);

			extentInfoLogs("Click submit button");
			clickName(BugRegressionAppConstants.Forgot_Submit_name);

			extentInfoLogs("Close Appium Session");
			closeAppiumSession();
			Thread.sleep(20000);

			extentInfoLogs("Open selenium browser");
			ChangeZopperPassword.openBrowser(AppData.Gmail_URL);
			extentInfoLogs("Gmail login");
			ChangeZopperPassword.gMailLogin(AppData.Gmail_MailId, AppData.password);
			extentInfoLogs("Click on received change password link");
			Thread.sleep(5000);
			ChangeZopperPassword.clickOnZopperForgotPasswordLink();

			Thread.sleep(5000);

			extentInfoLogs("Switch to child window");
			ChangeZopperPassword.switchToChildWindow();

			extentInfoLogs("Reset zopper password");
			ChangeZopperPassword.changeZopperGmailPassword(AppData.password);

			wDriver.quit();
			Thread.sleep(5000);
			extentInfoLogs("Open selenium browser");
			ChangeZopperPassword.openBrowser(AppData.Gmail_URL);

			extentInfoLogs("Gmail login");
			ChangeZopperPassword.gMailLogin(AppData.Facebook_MailId, AppData.password);
			extentInfoLogs("Click on received change password link");
			ChangeZopperPassword.clickOnZopperForgotPasswordLink();
			
			Thread.sleep(5000);
			
			extentInfoLogs("Switch to child window");
			ChangeZopperPassword.switchToChildWindow();

			extentInfoLogs("Reset zopper password");
			ChangeZopperPassword.changeZopperGmailPassword(AppData.password);
			
			wDriver.quit();

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}
	
	
    


	@Test(enabled = false)
	public void executeTestCase() throws Exception {
		ChangeZopperPassword.openBrowser(AppData.Rediff_URL);

	}
	
	public static void main(String []args){
		ChangeZopperPassword.openBrowser(AppData.Rediff_URL);

	}

}
