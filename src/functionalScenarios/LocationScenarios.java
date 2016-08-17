package functionalScenarios;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import appFunctions.OpenHomePage;
import appFunctions.OpenNavigationDrawer;

import pageObjects.AppData;
import pageObjects.AppVerificationChecks;
import pageObjects.BugRegressionAppConstants;
import utility.TesseractOCR;

//Test case info:In this test case we are  verifying multiple cases
//In first test case we are verifying correct location is selected and detect automatically is working
//In second test case we are verifying mutiple cities
//In third test case we are verifying that correct prompt is displayed on clicking link App displays a popup if user tap on Dont see your city in the list
//In fourth test case we are verifying locality 
//Author: Argneshu Gupta

public class LocationScenarios extends BaseTestIOS {
	static String path = "";

	static {
		File currDir = new File("");
		path = currDir.getAbsolutePath();
	}

	@Override
	@Test(enabled = true)
	public void executeTestCase() throws Exception {

		try {
			extentInfoLogs("Open homepage");
			OpenHomePage.openHomePage();
			extentInfoLogs("clicking on location icon");
			clickXpath(BugRegressionAppConstants.Location_xpath);
			extentInfoLogs("clicking on baglaore location");
			clickXpath(BugRegressionAppConstants.BangaloreLocation_xpath);
			extentInfoLogs("clicking on Banglaore location");
			clickXpath(BugRegressionAppConstants.BTMLocation_xpath);
			extentInfoLogs("clicking on BTM location");
			Assert.assertTrue(findElementsByXpath(BugRegressionAppConstants.Location_xpath).size()>0);

		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}

	}

	@Test(enabled = true)
	public void mutipleCities() {
		try {
			extentInfoLogs("Open homepage");
			OpenHomePage.openHomePage();
			extentInfoLogs("clicking on location icon");
			clickXpath(BugRegressionAppConstants.Location_xpath);
			List<WebElement> cities = findElementsByXpath(BugRegressionAppConstants.Location_CitiesNames_xpath);
			extentInfoLogs("verifying cities content");
			Assert.assertTrue(cities.size() > 0);
		}

		catch (Exception e) {
			throw (e);
		}
	}

	@Test(enabled = true) 
	public void unavailableCitiesPopUpConfirmation() throws Exception {
		try {
			extentInfoLogs("Open homepage");
			OpenHomePage.openHomePage();
			extentInfoLogs("clicking on location icon");
			clickXpath(BugRegressionAppConstants.Location_xpath);
			clickName(BugRegressionAppConstants.AbsentCity_name);
			swipeVertically_FullPage();
			clickName(BugRegressionAppConstants.AbsentCity_name);
			Assert.assertTrue(findElementsByName(BugRegressionAppConstants.Oops_name).size()>0);

//			for (int i = 0; i < 6; i++) {
//				swipeVertically_FullPage();
//			}
//			extentInfoLogs("Applying swipe on the page");
//			extentInfoLogs("Absent city pop up is displayed");
//			clickId(BugRegressionAppConstants.AbsentCity_id);
//			Thread.sleep(2000);
//			extentInfoLogs("Verifying Pop up");
			
		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}

	}

	//@Test(enabled = false) //Not feasible for ios app
	public void enterDataInCitiesPopUp() throws Exception {
		try {
			extentInfoLogs("Open nav drawer");
			OpenNavigationDrawer.openNavigationDrawer();
			extentInfoLogs("clicking on location icon");
			clickId(BugRegressionAppConstants.NavDrawerLocationIcon_id);
			wait.until(ExpectedConditions.presenceOfElementLocated(By
					.name(BugRegressionAppConstants.SelectLocation_text)));
			for (int i = 0; i < 6; i++) {
				swipeWithAxis(10, 700, 10, 250, 3000);
			}
			extentInfoLogs("applying swipe function");
			extentInfoLogs("Pop up displayed for absent cities");
		//	clickId(BugRegressionAppConstants.AbsentCity_id);
			extentInfoLogs("clicking on url ->App displays a popup if user tap on Dont see your city in the list");
			info("enter mail id ,city name and click on OK button");
			extentInfoLogs("enter mail id ,city name and click on OK button");
			sendKeysForID(BugRegressionAppConstants.EmailIdTextBox_Id,
					AppData.UserId);
			sendKeysForID(BugRegressionAppConstants.YourCityTextBox_Id,
					AppData.Location_text);
			clickId(BugRegressionAppConstants.OkButton_Id);
		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}

	}

	//@Test(enabled = false) //not feasible for ios app
	public void localitySelection() throws Exception {
		try {
			extentInfoLogs("Calling home page ");
			OpenHomePage.openHomePage();
			extentInfoLogs("Open Nav Drawer");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			extentInfoLogs("click on location icon");
			extentInfoLogs("open menu drawer");
			clickId(BugRegressionAppConstants.NavDrawerLocationIcon_id);
			extentInfoLogs("clicking on location icon");
			String locality = getTextByName(
					BugRegressionAppConstants.Citylocality_id,
					AppVerificationChecks.locality);
			Assert.assertEquals(locality, AppVerificationChecks.locality);

		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}

	}

	@Test(enabled = true)
	public void locationCount() throws Exception {
		int count = 0;
		String lastName = "", cLastName = "";
		String allLoc = "";

		try {
			extentInfoLogs("Open homepage");
			OpenHomePage.openHomePage();
			extentInfoLogs("clicking on location icon");
			clickXpath(BugRegressionAppConstants.Location_xpath);
			extentInfoLogs("verifying cities content");
			for (int i = 3; i < 35; i++) {
				if(findElementsByXpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+i+"]/UIAStaticText[1]").size()>0){
				WebElement ele = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+i+"]/UIAStaticText[1]");
		//= findElementsByXpath(BugRegressionAppConstants.Location_CitiesNames_xpath);
				//for (WebElement ele : locations) {
				//	System.out.println("element text is :"+ele.getText());
				//	System.out.println("before if block alloc value :"+ allLoc);

					if (!allLoc.contains(ele.getText().trim())) {
						count++;
						System.out.println("count is :" +count);
						allLoc = allLoc + "##" + ele.getText().trim();
						//System.out.println("after if block alloc value :"+ allLoc);
					}
//					cLastName = ele.getText().trim();
//					System.out.println("cLastName value is:" + cLastName);
//				//}
//				if (!lastName.equals(cLastName)) {
//					System.out.println("lastname is : "+ lastName);
//					lastName = cLastName;
//					swipeVertically_FullPage();
//				}
					}
					else{
					break;
					}

			}
			extentInfoLogs("Total location available: " + count);
			Assert.assertTrue(count == 28);
		} catch (

		Exception e)

		{
			e.getMessage();
			throw (e);
		}

	}

	//@Test(enabled = false) //not feasible for ios app
	public void autoDetectLocation() throws Exception {
		// Method method = null;
		// method = LocationScenarios.class.getMethod("autoDetectLocation",
		// null);
		try {
			extentInfoLogs("clicking on let go shopping link");
			// TesseractOCR ocr = new TesseractOCR();
			if(findElementsById(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id).size()>0){
			clickId(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id);
			extentInfoLogs("detecting auto lcoation");
			wait.until(ExpectedConditions.presenceOfElementLocated(By
					.id(BugRegressionAppConstants.AutoLocationToast_id)));
			captureScreenShot(driver, path + "/Tesseract-OCR", "Toast");
			TesseractOCR.excCommand();
			Thread.sleep(3000);
			String text = TesseractOCR.readTextFile(path
					+ "/Tesseract-OCR/out.txt");
			System.out.println(text);
			// Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
			// System.out.println(text);
			Assert.assertTrue(text.trim().contains(
					AppVerificationChecks.AutoLocationtext.trim()));
			}else{
				extentInfoLogs("detecting auto lcoation");
//				wait.until(ExpectedConditions.presenceOfElementLocated(By
//						.id(BugRegressionAppConstants.AutoLocationToast_id)));
				captureScreenShot(driver, path + "/Tesseract-OCR", "Toast");
				TesseractOCR.excCommand();
				Thread.sleep(3000);
				String text = TesseractOCR.readTextFile(path
						+ "/Tesseract-OCR/out.txt");
				System.out.println(text);
				// Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
				// System.out.println(text);
				Assert.assertTrue(text.trim().contains(
						AppVerificationChecks.AutoLocationtext.trim()));
			}
			// closeAppiumSession();
		} catch (Exception e) {
			throw (e);
		}
	}

	//@Test(enabled = false)//not feasible for ios app
	public void changeLinkforAutoDetectLocation() throws Exception {
		// Method method1 = null;
		// method1 = LocationScenarios.class.getMethod(
		// "changeLinkforAutoDetectLocation", null);
		try {
			if(findElementsById(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id).size()>0){
			extentInfoLogs("clicking on let go shopping link");
			clickId(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id);
			String change = driver.findElement(
					By.id("com.zopperapp:id/snackbar_action")).getText();
			// findElementById(BugRegressionAppConstants.AutoLocationChangetext_id).getText();
			System.out.println(change);
			Assert.assertTrue(change.contains("CHANGE"));
			}else{
				String change = driver.findElement(
						By.id("com.zopperapp:id/snackbar_action")).getText();
				// findElementById(BugRegressionAppConstants.AutoLocationChangetext_id).getText();
				System.out.println(change);
				Assert.assertTrue(change.contains("CHANGE"));
			}
		} catch (Exception e) {
			throw (e);
		}
	}
}
