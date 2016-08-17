package bugRegressionSuite;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pageObjects.BugRegressionAppConstants;

public class LocationShownOnDrawerScreen_Sno_35 extends BaseTestBugRegression{

	@Override
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		try{
			clickId(BugRegressionAppConstants.Lets_Go_Shopping_Id);
			clickName(BugRegressionAppConstants.DelhiLocation_text);
			clickName(BugRegressionAppConstants.DelhiSubLocation_AnandLok_text);
			//clickId(AppConstants.SkipButton_id);
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			AssertJUnit.assertEquals((String)driver.findElement(By.name(BugRegressionAppConstants.DelhiLocation_text)).getText(),(String)driver.findElement(By.name(BugRegressionAppConstants.NavDrawer_Location_text)).getText());
			AssertJUnit.assertEquals((String)driver.findElement(By.name(BugRegressionAppConstants.DelhiSubLocation_AnandLok_text)).getText(),(String)driver.findElement(By.id(BugRegressionAppConstants.NavDrawer_SubLocation_id)).getText());
//			System.out.println(driver.findElement(By.name(AppConstants.DelhiSubLocation_AnandLok_text)).getText());
//			System.out.println(driver.findElement(By.id(AppConstants.NavDrawer_SubLocation_id)).getText());
			clickId(BugRegressionAppConstants.NavDrawer_Login_button_id);
			AssertJUnit.assertEquals("LOGIN", driver.findElement(By.name(BugRegressionAppConstants.Login_text)).getText());
//			System.out.println("Test Stop");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

