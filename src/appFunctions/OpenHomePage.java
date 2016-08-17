package appFunctions;

import io.appium.java_client.remote.HideKeyboardStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;

//This function is used to open Homepage of application

public class OpenHomePage extends BaseTestIOS {
	static boolean staging = false;

	public static void openHomePage() {
		try {
			if (packName.contains("functionalScenarios")) {
				if(findElementsByName(BugRegressionAppConstants.NotificationPopUP_name).size()>0){
					clickName(BugRegressionAppConstants.NotificationPopUP_name);
					
				}
				if(findElementsByName(BugRegressionAppConstants.LetsGoShopping_name).size()>0){
				clickName(BugRegressionAppConstants.LetsGoShopping_name);
				}
			} else {
				if(findElementsById(BugRegressionAppConstants.Lets_Go_Shopping_Id).size()>0){
				clickId(BugRegressionAppConstants.Lets_Go_Shopping_Id);
				}
			}
			if (verifyElementExistByName(BugRegressionAppConstants.DetectAutomatically_name))
				clickName(BugRegressionAppConstants.DetectAutomatically_name);
			if(findElementsByName(BugRegressionAppConstants.LocationPopUp_name).size()>0){
				clickName(BugRegressionAppConstants.LocationPopUp_name);
			}
//			if(driver.findElementsByXPath("//UIAApplication[1]/UIAWindow[4]/UIAKeyboard[1]").size()>0){
//	              driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAButton[2]").click();
//	              driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAButton[1]").click();
//				}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	public static void clickOnCategoryByName(String category) {
		List<WebElement> elements = null;

		try {
			elements = driver.findElements(By.name(SanitySuiteAppConstants.NavDrawerCategories_id));
			for (WebElement elemnt : elements) {
				if (elemnt.getText().equalsIgnoreCase(category)) {
					elemnt.click();
					break;
				}
			}
		} catch (Exception e) {
		}
	}
	
	public static void clickOnCategoryByXpath(String category) {
		List<WebElement> elements = null;
		System.out.println(category);

		try {
			for(int i=1;i<9;i++){
			WebElement element = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+i+"]/UIAStaticText[1]"));
			System.out.println(i);
			//for (WebElement elemnt : elements) {
				System.out.println(element.getText());
				if (element.getText().equalsIgnoreCase(category)) {
					element.click();
					break;
				}
			//}
			}
		} catch (Exception e) {
		}
	}

	public static void goToHomePage() {
		try {
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			clickId(BugRegressionAppConstants.Homelink_Prod_id);
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	public static void clickOnFirstIndex(String id) {
		try {
			List<WebElement> elements = driver.findElements(By.id(id));
			for (WebElement ele : elements) {
				ele.click();
				break;
			}
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
