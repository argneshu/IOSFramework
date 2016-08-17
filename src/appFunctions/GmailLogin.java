package appFunctions;

import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;

//This function is created to handle the Gmail login from Login page
public class GmailLogin extends BaseTestIOS {

	public static void gmailLogin() {
		String pckgeName = BaseTestIOS.packName;

		try {
			if (pckgeName.contains("functionalScenarios")) {
				clickName(SanitySuiteAppConstants.GoooglePlus_SignInButton_name);
			} else {
				clickName(SanitySuiteAppConstants.GoooglePlus_SignInButton_name);
			}
			if(findElementsByXpath(BugRegressionAppConstants.GoogleAllow_xpath).size()>0){
				clickXpath(BugRegressionAppConstants.GoogleAllow_xpath);
			}
			if(findElementsByXpath(BugRegressionAppConstants.GoogleAllow_xpath).size()>0){
				clickXpath(BugRegressionAppConstants.GoogleAllow_xpath);
			}

			//clickXpath(BugRegressionAppConstants.Gmail_account_id_option2_xpath);
			//clickId(BugRegressionAppConstants.Gmail_account_ok_button);


		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	@Test(enabled = false)
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub

	}

}
