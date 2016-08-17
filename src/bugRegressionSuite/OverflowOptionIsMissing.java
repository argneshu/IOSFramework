package bugRegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import appFunctions.OpenHomePage;

import pageObjects.AppVerificationChecks;
import pageObjects.BugRegressionAppConstants;

//Test case info: In this test case we are verifying that overflow option is not missing  
public class OverflowOptionIsMissing extends BaseTestBugRegression {

	@Override
	@Test
	public void executeTestCase() throws Exception {
		try{
			OpenHomePage.openHomePage();
			clickName(BugRegressionAppConstants.HomeOverflow_name);
			Assert.assertTrue(AppVerificationChecks.MyProfiletext.equals(findElementByName(BugRegressionAppConstants.MyProfileText).getText()));
			}
			catch(Exception e){
				e.printStackTrace();
				takeSnapShot("D:\\takeScreenshots", "Overflow option is missing");
				throw(e);
			}
		
	}

}
