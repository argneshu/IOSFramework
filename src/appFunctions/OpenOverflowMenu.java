package appFunctions;

import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import pageObjects.BugRegressionAppConstants;

public class OpenOverflowMenu extends BaseTestIOS{
	
	public static void openOverflowMenu(){
		OpenHomePage.openHomePage();
		clickName(BugRegressionAppConstants.HomeOverflow_name);
	}

	@Override
	@Test(enabled=false)
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
