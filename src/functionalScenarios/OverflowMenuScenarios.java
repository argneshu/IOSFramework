package functionalScenarios;

import java.sql.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AppData;
import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;
import appFunctions.ChangeZopperPassword;
import appFunctions.GmailLogin;
import appFunctions.OpenHomePage;
import appFunctions.OpenLoginPage;
import bugRegressionSuite.BaseTestIOS;

//Test case info:In this test case we are  verifying multiple cases
//In first test case we are  verifying Sending Feedback using Contact Us option
//In second test case  we are verifying BackLink Functionality On FAQs AboutUs Page
//In third test case we are verifying share app fuctionality
//Author: Argneshu Gupta
public class OverflowMenuScenarios extends BaseTestIOS {

	@Override
	@Test(enabled =true)
	public void executeTestCase() throws Exception {
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
			extentInfoLogs("clicking on Contact us option");
			clickName(BugRegressionAppConstants.SelectNatureofFeedback_name);
			extentInfoLogs("cliking on select nature of feedback id");
		    clickName(BugRegressionAppConstants.PaymentRelated_name);
		   // clickName(BugRegressionAppConstants.HowAreYouFeeling_name);
//			extentInfoLogs("clicking on Payment related option");
			//clickName(BugRegressionAppConstants.Happy_name);
		//	extentInfoLogs("Selecting happy value");
			sendKeysForXpath(BugRegressionAppConstants.Fullname_xpath, AppData.Fullname);
			extentInfoLogs("entering data for fullname");
			sendKeysForXpath(BugRegressionAppConstants.EmailID_xpath, AppData.EmailID);
			//swipeVertically(3000);
			//extentInfoLogs("entering data for email ID");
			sendKeysForXpath(BugRegressionAppConstants.WriteAfeedback_xpath, AppData.Feedback);
			clickName(BugRegressionAppConstants.SubmitButton_name);
			clickName(BugRegressionAppConstants.OkButton_name);
			extentInfoLogs("clicking on submit button");
			Assert.assertTrue(findElementsByName(SanitySuiteAppConstants.MyAccountTitle_name).size()>0);
					
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);

		}

	}

	// Author:Arvind

	@SuppressWarnings("unchecked")
	@Test(enabled = true)
	public void verifyBackLinkFunctionalityOnFAQsAboutUsPage() throws Exception {
		try {
			extentInfoLogs("open Home Page");
			OpenHomePage.openHomePage();
			clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
			extentInfoLogs("click on myaccount button");
			swipeVertically_FullPage();
			extentInfoLogs("clicking on Overflow menu");;
			try {
				clickName(BugRegressionAppConstants.FAQ_name);
			} catch (Exception e) {
				swipeVertically_FullPage();
				clickName(BugRegressionAppConstants.FAQ_name);
			}
			try{
				driver.findElement(By.xpath("//UIAStaticText[@name='ABOUT ZOPPER']")).click();
				driver.findElement(By.xpath("//UIAStaticText[@name='BACK']")).click();
			}catch(Exception e){
				
			}
//			Set<String> contexts =driver.getContextHandles();
//			for(String context : contexts){
//				if(context.contains("WEBVIEW")){
//					driver.context(context);
//					System.out.println(context);
//					
//				}
//			}

			extentInfoLogs("Assert for about us");
			Assert.assertTrue(findElementsByXpath("//UIAStaticText[@name='ABOUT ZOPPER']").size()>0);

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	@Test(enabled = true)
	public void WarrantyOnFAQs() throws Exception {

		try {
			extentInfoLogs("open Home Page");
			OpenHomePage.openHomePage();
			clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
			extentInfoLogs("click on myaccount button");
			swipeVertically_FullPage();
			extentInfoLogs("clicking on Overflow menu");;
			try {
				clickName(BugRegressionAppConstants.FAQ_name);
			} catch (Exception e) {
				swipeVertically_FullPage();
				clickName(BugRegressionAppConstants.FAQ_name);
			}
			extentInfoLogs("Click on About zopper");
			clickXpath("//UIAStaticText[@name='WARRANTY']");
			Assert.assertTrue(findElementsByXpath(BugRegressionAppConstants.WarrantyFAQsHeader_xpath).size()>0);

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}

	}
	// Autor:Arvind

	// @Test(enabled = true) Functionality removed
	public void verifyShareAppFunctionality() throws Exception {
		boolean flag = false;
		try {
			extentInfoLogs("open Login Page");
			OpenLoginPage.openLoginPage();

			extentInfoLogs("Gmail Login Page");
			GmailLogin.gmailLogin();

			extentInfoLogs("Click on more options link");
			clickName(BugRegressionAppConstants.HomeOverflow_name);

			extentInfoLogs("Click on Share app");
			clickName(BugRegressionAppConstants.ShareApp_name);

			extentInfoLogs("Click on Gmail app");
			try {
				clickName(BugRegressionAppConstants.Gmail_name);
			} catch (Exception e) {
			}
			// System.out.println("1");
			// System.out.println(findElementByXpath(App_Constants.Mail_To_xpath).isDisplayed());
			extentInfoLogs("Waiting for mail to text field");
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(BugRegressionAppConstants.Mail_To_id)));
			extentInfoLogs("Enter TO mail id");

			sendKeysForID(BugRegressionAppConstants.Mail_To_id, AppData.UserId);

			java.util.Date date = new java.util.Date();
			String timeStamp = AppData.MailSubject + " " + new Timestamp(date.getTime()).toString();

			hideKeyboard();
			extentInfoLogs("Enter subject");
			// clickId(App_Constants.Mail_From_id);

			sendKeysForID(BugRegressionAppConstants.Mail_Subject_id, timeStamp);

			extentInfoLogs("Click on send button");
			clickId(BugRegressionAppConstants.Mail_Send_id);

			extentInfoLogs("Close Appium Session");
			closeAppiumSession();

			// ==================================================================================

			extentInfoLogs("Running selenium script");

			extentInfoLogs("Open selenium browser");
			ChangeZopperPassword.openBrowser(AppData.Rediff_URL);

			extentInfoLogs("Rediff login");
			ChangeZopperPassword.rediffLogin();

			extentInfoLogs("Closing child window");
			ChangeZopperPassword.closeChildWindow();

			extentInfoLogs("Click on mail box link");
			ChangeZopperPassword.openMailBox();

			// ChangeZopperPassword.closeChildWindow();

			extentInfoLogs("Click on mail");
			flag = ChangeZopperPassword.verifyMailHeader(timeStamp.trim());

			extentInfoLogs("Close selenium session");
			ChangeZopperPassword.closeBrowser();

			Assert.assertEquals(flag, true);

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}
	
	
}
