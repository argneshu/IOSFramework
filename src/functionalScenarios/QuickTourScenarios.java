package functionalScenarios;

import java.util.HashMap;

import io.appium.java_client.SwipeElementDirection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import appFunctions.TourPage;

import pageObjects.AppData;
import pageObjects.BugRegressionAppConstants;

//Test case info: In this test case we are verifying two scenarios
//1.Quick tour page should be completely scrollable
//2.User should be able to skip Quick tour page
//Author: Argneshu Gupta

public class QuickTourScenarios extends BaseTestIOS {

	@Override
	@Test(enabled = true)//automated
	public void executeTestCase() throws Exception {
		try {
			extentInfoLogs("quick tour test case started");
			if(findElementsByName(BugRegressionAppConstants.NotificationPopUP_name).size()>0){
				clickName(BugRegressionAppConstants.NotificationPopUP_name);
				
			}
			if(findElementsById(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id).size()>0){
			extentInfoLogs("Wait for let's go shoping");
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.id(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id)));
			for (int i = 0; i < 6; i++) {
				extentInfoLogs("Swipe screen horizontally");
				swipeWithAxis(248, 284, 104, 285, 0);
			}
			extentInfoLogs("Click on skip tour");
			TourPage.tourSkip();
			if (verifyElementExistByName(BugRegressionAppConstants.DetectAutomatically_name))
				clickName(BugRegressionAppConstants.DetectAutomatically_name);
			if(findElementsByName(BugRegressionAppConstants.LocationPopUp_name).size()>0){
				clickName(BugRegressionAppConstants.LocationPopUp_name);
			}
			extentInfoLogs("Assert for Home exciting categories");
			Assert.assertTrue(findElementsByName(BugRegressionAppConstants.HomePageExploreExcitingCategories_text).size()>0);

			}else{
				if (verifyElementExistByName(BugRegressionAppConstants.DetectAutomatically_name))
					clickName(BugRegressionAppConstants.DetectAutomatically_name);
				if(findElementsByName(BugRegressionAppConstants.LocationPopUp_name).size()>0){
					clickName(BugRegressionAppConstants.LocationPopUp_name);
				}
				extentInfoLogs("quick tour test case started");
				Assert.assertTrue(findElementsByName(BugRegressionAppConstants.HomePageExploreExcitingCategories_text).size()>0);
			}

		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}

	}

	@Test(enabled = true)//automated
	public void skipQuickTour() {
		try {
			extentInfoLogs("quick tour test case started");
			if(findElementsByName(BugRegressionAppConstants.NotificationPopUP_name).size()>0){
				clickName(BugRegressionAppConstants.NotificationPopUP_name);
				
			}
			if(findElementsByName(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id).size()>0){
				extentInfoLogs("Click on skip tour");
				TourPage.tourSkip();
				if (verifyElementExistByName(BugRegressionAppConstants.DetectAutomatically_name))
					clickName(BugRegressionAppConstants.DetectAutomatically_name);
				Assert.assertTrue(findElementsByName(BugRegressionAppConstants.HomePageExploreExcitingCategories_text).size()>0);
				}else{
					extentInfoLogs("verifying assertion");
					if (verifyElementExistByName(BugRegressionAppConstants.DetectAutomatically_name))
						clickName(BugRegressionAppConstants.DetectAutomatically_name);
					Assert.assertTrue(findElementsByName(BugRegressionAppConstants.HomePageExploreExcitingCategories_text).size()>0);
				}


		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}
	}

	@Test(enabled = false) //This test case require driver.startActivity method to execute which is not implemented for IOS driver yet
	public void quickTourForExistingApp() throws Exception {
		try {
			if(findElementsById(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id).size()>0){
			extentInfoLogs("Click on skip tour");
			TourPage.tourSkip();
			
			extentInfoLogs("Install retailer app");
			System.out.println(path);
			Runtime.getRuntime().exec("adb install "+path+"/app/RMS-staging-debug-22200.apk");
			Thread.sleep(5000);
			extentInfoLogs("Switch to retailer app");
		//	driver.startActivity(AppData.Retailer_PackageName, AppData.Retailer_ActivityName);
			Thread.sleep(5000);
			extentInfoLogs("Switch to consumer app");
			System.out.println(Con_Activity_Name);
			System.out.println(Con_Package_Name);
			//driver.startActivity(Con_Package_Name, Con_Activity_Name);
			extentInfoLogs("Assert for select location");
			Assert.assertTrue(findElementByName(BugRegressionAppConstants.HomePageExploreExcitingCategories_text)
					.getText().equals(AppData.HomePageExploreExcitingCategories_text));
			}else{
				extentInfoLogs("Install retailer app");
				System.out.println(path);
				Runtime.getRuntime().exec("adb install "+path+"/app/RMS-staging-debug-22200.apk");
				Thread.sleep(5000);
				extentInfoLogs("Switch to retailer app");
			//	driver.startActivity(AppData.Retailer_PackageName, AppData.Retailer_ActivityName);
				Thread.sleep(5000);
				extentInfoLogs("Switch to consumer app");
				System.out.println(Con_Activity_Name);
				System.out.println(Con_Package_Name);
				//driver.startActivity(Con_Package_Name, Con_Activity_Name);
				extentInfoLogs("Assert for select location");
				Assert.assertTrue(findElementByName(BugRegressionAppConstants.HomePageExploreExcitingCategories_text)
						.getText().equals(AppData.HomePageExploreExcitingCategories_text));
			}
		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}
	}
	
	//@Test
	public void swipe(){
		Dimension screenSize = driver.manage().window().getSize();
		extentInfoLogs("Swipe screen horizontally");
		int screenWidth = screenSize.getWidth();
		System.out.println("SW is: "+screenWidth);
	    int screenHight = screenSize.getHeight() ;
		System.out.println("SH is "+ screenHight);
	}
	
}
