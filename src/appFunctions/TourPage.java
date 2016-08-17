package appFunctions;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;
import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;

public class TourPage extends BaseTestIOS {

	public static void tourSkip() {
		try {
			if(packName.contains("functionalScenarios")){
				clickName(BugRegressionAppConstants.Prod_Lets_Go_Shopping_Id);
			}else{
				clickId(BugRegressionAppConstants.Lets_Go_Shopping_Id);
			}
		

		} catch (Exception e) {
			e.printStackTrace();
			//UserDefined.takeSnapShot("D:\\takeScreenshots", "gmailLogin function");
			throw(e);
		}
	}

	@Override
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		
	}


}
