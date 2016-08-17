package appFunctions;

import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import pageObjects.BugRegressionAppConstants;

public class RegisteredGmailUser extends BaseTestIOS {

	public static void gmailUserLogin() {
		try {
//			clickClassName(AppConstants.Skip_button);
//			clickName(AppConstants.DetectAutomatically_name);
			OpenHomePage.openHomePage();
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			clickId(BugRegressionAppConstants.NavDrawer_Login_button_id);
			//clickXpath(AppConstants.Google_button_xpath);
			GmailLogin.gmailLogin();
			//clickXpath(AppConstants.Gmail_account_id_option1_xpath);
			//clickId(AppConstants.Gmail_account_ok_button);
			//clickClassName(AppConstants.Back_Arrow_ClassName);
			//clickClassName(AppConstants.Open_Navigation_Drawer);
			//clickId(AppConstants.NavDrawer_Login_button_id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(enabled=false)
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub

	}

	

}

