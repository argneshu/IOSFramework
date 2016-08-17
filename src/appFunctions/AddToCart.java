package appFunctions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import pageObjects.BugRegressionAppConstants;

public class AddToCart extends BaseTestIOS {

	public static void addToCart() {
		try {
			if(findElementsByName(BugRegressionAppConstants.ContinueToCart_name).size()>0){
				clickName(BugRegressionAppConstants.ContinueToCart_name);			}

		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Override
	@Test(enabled = false)
	public void executeTestCase() throws Exception {

		// TODO Auto-generated method stub

	}

}
