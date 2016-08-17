package bugRegressionSuite;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import appFunctions.OpenAndroidPage;
import appFunctions.OpenHomePage;

import pageObjects.BugRegressionAppConstants;

public class CallingTablet_AN197 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		
		try{
			OpenHomePage.openHomePage();
			//clickId(AppConstants.SkipButton_id);
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			//clickName(AppConstants.NavDrawer_Mobile_tablets_link);
			OpenAndroidPage.clickOnCategoryByName(BugRegressionAppConstants.Home_Menu_Id,BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
			//swipeWithAxis(200,750,200,200,3000);
			//swipeWithAxis(200,750,200,200,3000);
			clickName(BugRegressionAppConstants.CallingTbalets_text);
			AssertJUnit.assertEquals("Tablets",
					findElementByName(BugRegressionAppConstants.CallingTabletTitle_text).getText());
			
//			clickId(AppConstants.Android_phones_id);
//			Assert.assertEquals("Android Phones", findElementByName(AppConstants.Android_Phone_text).getText());
//			backButton();
//			clickId(AppConstants.iphone_id);
//			backButton();
//			clickId(AppConstants.iPad_id);
//			backButton();
//			clickId(AppConstants.Windows_phones_id);
//			backButton();
//			clickName(AppConstants.Other_smart_phone_text);
//			backButton();
			
		}
		catch(Throwable e){
			e.printStackTrace();
			//System.out.println("Inside Outer Catch");
		}
	}

}

