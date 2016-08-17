package appFunctions;

import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import pageObjects.BugRegressionAppConstants;

public class OpenNavigationDrawer extends BaseTestIOS {

	public static void openNavigationDrawer() {
		try {
			extentInfoLogs("Open Home page");
			OpenHomePage.openHomePage();
			extentInfoLogs("Open Navigation drawer");
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
		} catch (Exception e) {
			throw (e);
		}
	}

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub

	}

}
