package functionalScenarios;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import appFunctions.ChangeZopperPassword;
import appFunctions.GmailLogin;
import appFunctions.OpenHomePage;
import appFunctions.OpenLoginPage;

import pageObjects.AppData;
import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;

public class WarrantyScenarios extends BaseTestIOS {

	@Test(enabled = true, priority = 0)//automated
	public void addWarrantyProduct() throws Exception {
		boolean flag = false;
		try {

			extentInfoLogs("Open Home page");
			OpenHomePage.openHomePage();

			extentInfoLogs("click on my account page");
			clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
			extentInfoLogs("Click on my account warranty");
			// driver.findElements(By.id(App_Constants.MyAccountTabs)).get(3).click();
			clickName(BugRegressionAppConstants.myAccount_Warranty_name);

			extentInfoLogs("Gmail login");
			GmailLogin.gmailLogin();

			extentInfoLogs("Click on Add a product link");
			Thread.sleep(3000);
//			

			if(findElementByName(BugRegressionAppConstants.Add_Product_name).isDisplayed()==true){
				clickName(BugRegressionAppConstants.Add_Product_name);
			}else{
				((JavascriptExecutor) driver).executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 154); put("y", (double) 88); }});

			}

			extentInfoLogs("Click on enter your product name");
			clickName(BugRegressionAppConstants.Add_Product_Name_name);

			// for (int i = 0; i < 3; i++) {
			// if
			// (findElementsByName(BugRegressionAppConstants.Warranty_Product_Category_name).size()
			// > 0) {
			extentInfoLogs("Click on refrigrator product category");
			clickName(BugRegressionAppConstants.Warranty_Product_Category_name);
			extentInfoLogs("Enter product name");
			// sendKeysForID(BugRegressionAppConstants.Home_SearchEditBox_id,
			// AppData.LG_Name);
			findElementByName(BugRegressionAppConstants.Home_SearchEditBox_name)
					.click();
			findElementByName(BugRegressionAppConstants.Home_SearchEditBox_name)
					.sendKeys(AppData.LG_Name);

			// } else
			// break;
			// }
			Thread.sleep(5000);

			extentInfoLogs("Click on first index product");
			String productName = driver
					.findElement(
							By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAStaticText[1]"))
					.getText();
			System.out.println("text is " + productName);
			List<WebElement> ele = driver
					.findElements(By
							.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/*"));
			System.out.println("the size is :" + ele.size());
			ele.get(0).click();
			// wait.until(ExpectedConditions
			// .elementToBeClickable(findElementByXpath(BugRegressionAppConstants.Warranty_Product_xpath)));
			// extentInfoLogs("Click on first index product");
			// String productName =
			// findElementByXpath(BugRegressionAppConstants.Warranty_Product_xpath).getText();
			// findElementByXpath(BugRegressionAppConstants.Warranty_Product_xpath).click();
			// clickId(BugRegressionAppConstants.Warranty_Product_id);

			extentInfoLogs("Click on select");
			clickId(BugRegressionAppConstants.Select_name);
			int i = 0;
			while (i < 1) {
				if (findElementsById(BugRegressionAppConstants.Select_name)
						.size() > 0) {
					clickId(BugRegressionAppConstants.Select_name);
					break;
				} else {

				}
				i++;
			}

			extentInfoLogs("Click on camera image");
			clickName(BugRegressionAppConstants.Camera_name);

			String osName = System.getProperty("os.name");
			System.out.println(osName);

			if (osName.contains("Mac")) {
				extentInfoLogs("Capture image");
				clickName(BugRegressionAppConstants.CameraButton_name);
				extentInfoLogs("click on use photo");
				clickName(BugRegressionAppConstants.CameraUsePhoto_name);
				// hitADBCommandForCamera("27");
				//
				// extentInfoLogs("Save image");
				// hitADBCommandForCamera("21");
				// hitADBCommandForCamera("22");
				// hitADBCommandForCamera("23");
				Thread.sleep(5000);
			} else {
				// driver.sendKeyEvent(KeyEvent.KEYCODE_CAMERA);
				Runtime.getRuntime().exec("adb shell input keyevent 23");
				Thread.sleep(2000);
				clickId(BugRegressionAppConstants.LollipopCameraSaveButton_id);
				// Runtime.getRuntime().exec("adb shell input keyevent 23");
				// Thread.sleep(2000);
				// Runtime.getRuntime().exec("adb shell input keyevent 27");
				// Thread.sleep(5000);
				// Runtime.getRuntime().exec("adb shell input keyevent 61");
				// Thread.sleep(2000);
				// Runtime.getRuntime().exec("adb shell input keyevent 61");
				// Thread.sleep(2000);
				// Runtime.getRuntime().exec("adb shell input keyevent 66");
				// Thread.sleep(5000);
			}

			extentInfoLogs("Click next button");

			try {
				wait.until(ExpectedConditions.elementToBeClickable(By
						.name(BugRegressionAppConstants.Next_Add_Warrenty_One_name)));
				clickName(BugRegressionAppConstants.Next_Add_Warrenty_One_name);
			} catch (Exception e) {
				clickName(BugRegressionAppConstants.Next_Add_Warrenty_One_name);
			}

			extentInfoLogs("Warranty valid for");
			clickName(BugRegressionAppConstants.type_name);
			clickXpath(AppData.Warrant_For_xpath);

			extentInfoLogs("Select date");
			clickName(BugRegressionAppConstants.Warranty_Purchase_Date_name);
			clickName(BugRegressionAppConstants.Warranty_Date_Done_name);

			extentInfoLogs("Click next button");
			clickId(BugRegressionAppConstants.Next_Add_Warrenty_Two_id);

			extentInfoLogs("Assert for product name");
			flag = verifyElementExistByName(productName);
			Assert.assertEquals(flag, true);
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}

	}

	@Test(enabled = true)//automated
	public void claimAfterWarrantyValidForIsDisplayed() throws Exception {
		try {
			extentInfoLogs("Add warranty");
			addWarrantyProduct();

			extentInfoLogs("Click on warranty product");
			try{
				if(findElementByName(BugRegressionAppConstants.Warrant_Product_name).isDisplayed()==true){
			findElementByName(BugRegressionAppConstants.Warrant_Product_name).click();
				}else{
					((JavascriptExecutor)driver).executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 284); put("y", (double) 263); }});
				}
			}catch(Exception e){
				findElementByName(BugRegressionAppConstants.Warrant_Product_name).click();

			}
			
			extentInfoLogs("First Warranty product on list");
			Assert.assertTrue(findElementsByName(
					BugRegressionAppConstants.Claim_Warranty_Header_Text)
					.size() > 0);
			extentInfoLogs("Claim warranty page open");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw (ex);
		}
	}

	@Test(enabled = true, priority = 0)//automated
	public void claimWarranty() throws Exception {
		try {
			extentInfoLogs("Add warranty");
			addWarrantyProduct();
			// OpenHomePage.openHomePage();
			// clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
			// extentInfoLogs("Click on my account warranty");
			//
			// clickName(BugRegressionAppConstants.myAccount_Warranty_name);
			//
			// extentInfoLogs("Gmail login");
			// GmailLogin.gmailLogin();
			try{
				if(findElementByName(BugRegressionAppConstants.Warrant_Product_name).isDisplayed()==true){
					findElementByName(BugRegressionAppConstants.Warrant_Product_name).click();
						}else{
							((JavascriptExecutor)driver).executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 284); put("y", (double) 263); }});
						}
			}catch(Exception e){
				findElementByName(BugRegressionAppConstants.Warrant_Product_name)
				.click();
			}
			// if
			// (findElementsByXpath(BugRegressionAppConstants.WarrantyReason_id)
			// .size() < 0) {
			// findElementsByName(
			// BugRegressionAppConstants.Warrant_Product_name).get(1)
			// .click();
			// }
			driver.findElement(By.xpath("//UIATextView[@value='Claim Reason']"))
					.sendKeys(AppData.ProductReasons);
			// sendKeysForXpath(BugRegressionAppConstants.WarrantyReason_xpath,
			// AppData.ProductReasons);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(BugRegressionAppConstants.ClaimWarrantyPageClaimButton_name)));
			findElementByName(
					BugRegressionAppConstants.ClaimWarrantyPageClaimButton_name)
					.click();
			clickName(BugRegressionAppConstants.WarrantyRequestConfirmationPage_text);
			// swipeWithAxis(200, 500, 200, 300, 2000);
			// extentInfoLogs("Enter product reason");
			// sendKeysForID(BugRegressionAppConstants.WarrantyReason_xpath,
			// AppData.ProductReasons);
			// extentInfoLogs("Enter Contact no");
			// if (findElementsById(
			// BugRegressionAppConstants.ClaimWarrantyPencil_id).size() > 0) {
			// clickId(BugRegressionAppConstants.ClaimWarrantyPencil_id);
			// }
			// sendKeysForID(BugRegressionAppConstants.WarrantyContactNo_id,
			// AppData.Contacts);
			// hideKeyboard();
			// swipeVertically_FullPage();
			// // Thread.sleep(5000);
			// extentInfoLogs("Click on Warranty claim button");
			// clickId(BugRegressionAppConstants.WarrantyClaimButton_id);
			//
			// extentInfoLogs("Assert for warranty confirmation");
			// Assert.assertTrue(findElementByName(
			// BugRegressionAppConstants.WarrantyRequestConfirmation_text)
			// .isDisplayed());
			// extentInfoLogs("Navigate back");
			// navigateBack();
			// extentInfoLogs("Navigate back");
			// navigateBack();
			// Thread.sleep(5000);
			// extentInfoLogs("Click on my account warranty");
			// clickName(BugRegressionAppConstants.myAccount_Warranty_name);
			// extentInfoLogs("Click on first warrant product");
			// findElementsByName(BugRegressionAppConstants.Warrant_Product_name)
			// .get(0).click();
			// extentInfoLogs("Assert for warranty claim id");
			Assert.assertTrue(findElementsByName(
					BugRegressionAppConstants.Warranty_ClaimStatus_name).size() > 0);

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	@Test(enabled = false, priority = 2)//not implemented in ios app
	public void shareWarrantyInvoice() throws Exception {
		try {
			extentInfoLogs("open Login Page");
			OpenLoginPage.openLoginPage();

			extentInfoLogs("Gmail Login Page");
			GmailLogin.gmailLogin();

			extentInfoLogs("Click on warranty tab");
			clickName(BugRegressionAppConstants.myAccount_Warranty_name);
			extentInfoLogs("Click on view warranty invoice link");
			findElementsById(BugRegressionAppConstants.View_Warranty_Invoice_Id)
					.get(0).click();
			extentInfoLogs("Click on share button");
			clickId(BugRegressionAppConstants.ImageShareButton_Id);
			for (int k = 0; k < 3; k++) {
				if (findElementsById(
						BugRegressionAppConstants.ImageShareButton_Id).size() > 0) {
					clickId(BugRegressionAppConstants.ImageShareButton_Id);
				} else {
					break;
				}
			}
			try {
				swipeVertically_FullPage();
				clickName(BugRegressionAppConstants.Gmail_name);
			} catch (Exception e) {
			}
			extentInfoLogs("Dynamic wait for mail To");
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By
					.id(BugRegressionAppConstants.Mail_To_id)));
			extentInfoLogs("Enter TO mail id");

			extentInfoLogs("Enter user mail id");
			sendKeysForID(BugRegressionAppConstants.Mail_To_id, AppData.UserId);

			java.util.Date date = new java.util.Date();
			String timeStamp = AppData.MailSubject + " "
					+ new Timestamp(date.getTime()).toString();

			extentInfoLogs("Enter subject");
			hideKeyboard();
			sendKeysForID(BugRegressionAppConstants.Mail_Subject_id, timeStamp);

			extentInfoLogs("Click on send button");
			clickId(BugRegressionAppConstants.Mail_Send_id);
			Thread.sleep(3000);
			extentInfoLogs("Assert for share button");
			Assert.assertTrue(findElementById(
					BugRegressionAppConstants.ImageShareButton_Id)
					.isDisplayed());
			extentInfoLogs("Close session");
			closeAppiumSession();

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	@Test(enabled = false, priority = 3)
	public void warrantyRemainingDay() throws Exception {
		try {
			extentInfoLogs("open Login Page");
			OpenLoginPage.openLoginPage();
			extentInfoLogs("Gmail Login Page");
			GmailLogin.gmailLogin();
			extentInfoLogs("Click on warranty tab");
			clickName(BugRegressionAppConstants.myAccount_Warranty_name);
			extentInfoLogs("Assert for warrant valid for date");
			Thread.sleep(5000);
		String wDate =findElementByXpath(BugRegressionAppConstants.WarrantyPage_Valid_For_xpath).getText();
		System.out.println(wDate);
		Assert.assertTrue(wDate.contains("Brand Warranty Valid For: 0 Year, 11 Months, 29 Days"));
//			Assert.assertTrue(findElementsByXpath(
//					BugRegressionAppConstants.Warranty_Valid_For_xpath).size() > 0);
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw (ex);
		}
	}

	@Test(enabled = true, priority = 3)//automated
	public void warrantyAddFromDrawerMenu() throws Exception {
		try {
			extentInfoLogs("open Login Page");
			extentInfoLogs("open Login Page");
			OpenLoginPage.openLoginPage();
			extentInfoLogs("Gmail Login Page");
			GmailLogin.gmailLogin();
			extentInfoLogs("Click on warranty tab");
			clickName(BugRegressionAppConstants.myAccount_Warranty_name);

			extentInfoLogs("Assert for add product header");
			Assert.assertTrue(findElementsByName(
					BugRegressionAppConstants.myAccount_Warranty_name).size()>0);
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw (ex);
		}
	}

	@Test(enabled = false, dependsOnMethods = { "claimWarranty" }, priority = 4)
	public void generateFreshdeskTicket() throws Exception {
		try {
			extentInfoLogs("open Login Page");
			OpenLoginPage.openLoginPage();
			extentInfoLogs("Gmail Login");
			GmailLogin.gmailLogin();
			String emailid = findElementById(
					BugRegressionAppConstants.MyAccountEmail_id).getText();
			String splitemailid[] = emailid.split("@");
			System.out.println(splitemailid[0]);
			extentInfoLogs("clicking on my account warranty");
			clickName(BugRegressionAppConstants.myAccount_Warranty_name);
			// String warrantyClaimID = findElementById(
			// BugRegressionAppConstants.Warranty_ClaimId_Id).getText();
			// System.out.println(warrantyClaimID);
			closeAppiumSession();
			Thread.sleep(5000);
			String emailidname = openFreshDesk();
			Assert.assertTrue(splitemailid[0].equalsIgnoreCase(emailidname));
			// wDriver.close();
		} catch (Exception e) {
			throw (e);
		}

	}

	@SuppressWarnings("null")
	public static String openFreshDesk() {
		String email_id = null;
		Actions action = null;
		try {
			ChangeZopperPassword.openBrowser(AppData.Freshdesklink);
			wDriver.findElement(
					By.id(SanitySuiteAppConstants.FresdeskUsername_id))
					.sendKeys(AppData.FreshdeskUsername);
			wDriver.findElement(
					By.id(SanitySuiteAppConstants.FreshdsekPassword_id))
					.sendKeys(AppData.FreshdeskPassword);
			wDriver.findElement(
					By.xpath(SanitySuiteAppConstants.FreshdeskButton_xpath))
					.click();
			if (verifyElementDisplayedByLink(SanitySuiteAppConstants.zoppertest_link)) {
				Assert.assertTrue(wDriver.findElements(
						By.linkText(SanitySuiteAppConstants.zoppertest_link))
						.size() > 0);
			} else {
				List<WebElement> anchortags = wDriver.findElements(By
						.tagName("a"));
				for (WebElement anchortag : anchortags) {
					if (anchortag.getText().equals(
							SanitySuiteAppConstants.zoppertest_link)) {
						System.out.println(anchortag.getText());
						break;
					}

				}

			}
			email_id = SanitySuiteAppConstants.zoppertest_link;
			ChangeZopperPassword.closeBrowser();
		} catch (Exception e) {
			throw (e);
		}
		return email_id;
	}

	@Test(enabled = false, priority = 3)
	public void addWarrantyFromHomePage() throws Exception {

		try {
			extentInfoLogs("open home Page");
			OpenHomePage.openHomePage();
			// extentInfoLogs("Click on navigation drawer");
			// clickClassName(BugRegressionAppConstants.Open_Navigation_Drawer);
			Thread.sleep(2000);
			int i = 15;
			while (i-- > 0) {
				swipeWithAxis(300, 700, 300, 200, 2000);
			}
			extentInfoLogs("Click on add warranty");
			clickName(BugRegressionAppConstants.AddWarrantyFromHome_Text);
			extentInfoLogs("Gmail login");
			GmailLogin.gmailLogin();
			extentInfoLogs("Assert for add product header");
			Assert.assertTrue(findElementByName(
					BugRegressionAppConstants.Add_Product_Header_Text)
					.isDisplayed());
		} catch (Exception e) {
			throw (e);
		}
	}

	@Test(enabled = false)
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub

	}

}
