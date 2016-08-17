package appFunctions;

import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;

public class OpenLoginPage extends BaseTestIOS {

	public static void openLoginPage() {
		OpenHomePage.openHomePage();
		clickXpath(SanitySuiteAppConstants.MyAccountbutton_xpath);
		extentInfoLogs("click on myaccount button");
		clickName(SanitySuiteAppConstants.NavDrawer_Login_button_name);

	}

	public static void logOutFromPage() {
		clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
		clickId(BugRegressionAppConstants.SignUpIcon_id);
		clickName(BugRegressionAppConstants.Logout_button_Prod_name);
	}

	@Test(enabled = false)
	public void executeTestCase() throws Exception {

	}
}
