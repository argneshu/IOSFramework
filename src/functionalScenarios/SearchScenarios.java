package functionalScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import appFunctions.OpenHomePage;

import pageObjects.AppData;
import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;

//Test case info:In this test case we are  verifying multiple cases
//In first test case we are searching the product by product categories
//In second test case are verifying auto suggest results
//Author: Argneshu Gupta

public class SearchScenarios extends BaseTestIOS {
	boolean found = false;

	@Override
	@Test(enabled = true)
	public void executeTestCase() throws Exception {
		try {
			extentInfoLogs("Call the function of home page function");
			OpenHomePage.openHomePage();
		//	Thread.sleep(4000);
		//	swipeWithAxis(200, 300, 100, 100, 3000);
			extentInfoLogs("Click on home search icon");
			clickXpath(SanitySuiteAppConstants.HomeSearchButton_xpath);
			extentInfoLogs("click on search textbox");
			clickName(SanitySuiteAppConstants.SearchHomepagetextbox_name);
			String[] categories = { "Power Bank"}; //, "Pressure Cooker"};
			for (String category : categories) {
				extentInfoLogs("Enter search string as " + category);
				sendKeysForXpath(SanitySuiteAppConstants.SearchButtontextbox_xpath, category);
				extentInfoLogs("Click on auto suggest first item");
				BaseTestIOS.clickOnFirstSuggestedProduct();
				extentInfoLogs("Assert for suggested first product");
				List<WebElement> list = driver.findElementsByXPath(SanitySuiteAppConstants.AndroidPhoneslist_xpath);
				System.out.println("enabled element " +list.get(0).isEnabled());
				System.out.println("size is :"+list.size());
				Assert.assertTrue(
						findElementsByXpath(SanitySuiteAppConstants.AndroidPhoneslist_xpath).get(0).isEnabled());
				extentInfoLogs("Assert for suggested second product");
				Assert.assertTrue(
						findElementsByXpath(SanitySuiteAppConstants.AndroidPhoneslist_xpath).get(1).isEnabled());

				extentInfoLogs("Click on home search icon");
				clickXpath(SanitySuiteAppConstants.HomeSearchButton_xpath);
			}
		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}

	}

	@Test(enabled = true)
	public void autoSuggestResult() throws Exception {
		try {
			extentInfoLogs("Call the function of home page function");
			OpenHomePage.openHomePage();
			//Thread.sleep(4000);
			//swipeWithAxis(200, 300, 100, 100, 3000);
			extentInfoLogs("Click on home search icon");
			clickXpath(SanitySuiteAppConstants.HomeSearchButton_xpath);
			clickName(SanitySuiteAppConstants.SearchHomepagetextbox_name);
			extentInfoLogs("click on search textbox");
			extentInfoLogs("Enter search string as " + AppData.Producttext9);
			sendKeysForXpath(SanitySuiteAppConstants.SearchButtontextbox_xpath, AppData.Producttext9);
			while (!found)
			{
				System.out.println(found);
				extentInfoLogs("Getting suggested list");
				//WebElement li = findElementByClassName(BugRegressionAppConstants.ListView_class);
				List<WebElement> text = driver.findElements(By.xpath(BugRegressionAppConstants.SearchLinearLayout_xpath));
				for (int i = 0; i < text.size(); i++) {
					System.out.println(text.get(i).getText());
					boolean valid = text.get(i).isDisplayed();
					extentInfoLogs("Assert for element displayed");
					Assert.assertEquals(valid, true);
                    text.get(0).click();
                    backButton();
					swipeVertically(3000);
					break;
				}
				if (text.get(8).isDisplayed()) {
					found = true;
					System.out.println(text.get(8).getText());
					boolean productDisplayed8 = text.get(8).isDisplayed();
					extentInfoLogs("Assert for presence " + productDisplayed8);
					Assert.assertEquals(productDisplayed8, true);
					break;
				} else {
					extentInfoLogs("Swipe vertically");
					swipeVertically(3000);
				}

			}

		} catch (Exception e) {
			e.getMessage();
			throw (e);
		}
	}
	
	@Test(enabled = true)
	public void searachWithOneCharacter(){
		try{
			extentInfoLogs("Open home page");
			OpenHomePage.openHomePage();
			clickXpath(SanitySuiteAppConstants.HomeSearchButton_xpath);
			extentInfoLogs("click on search textbox");
			clickName(SanitySuiteAppConstants.SearchHomepagetextbox_name);
			extentInfoLogs("click on search textbox");
			sendKeysForXpath(SanitySuiteAppConstants.SearchButtontextbox_xpath, AppData.SeacrhWithOneCharacter);
			List<WebElement> list = findElementsByXpath(BugRegressionAppConstants.SearchLinearLayout_xpath);
			int count =list.size();
			Assert.assertTrue(count==10);
			
		}catch(Exception e){
			throw(e);
		}
	}
	
	@Test(enabled = true)
	public void synonymSearch() throws Exception{
		try{
			extentInfoLogs("Open home page");
			OpenHomePage.openHomePage();
			clickXpath(SanitySuiteAppConstants.HomeSearchButton_xpath);
			extentInfoLogs("click on search textbox");
			clickName(SanitySuiteAppConstants.SearchHomepagetextbox_name);
			extentInfoLogs("click on search textbox");
			String [] catKeyword = {"ac","fridge"};
			for(String searchKeyWord : catKeyword){
				//sendKeysForID(BugRegressionAppConstants.Home_SearchEditBox_id,
					//	searchKeyWord);
				sendKeysForXpath(SanitySuiteAppConstants.SearchButtontextbox_xpath, searchKeyWord);
				clickName(SanitySuiteAppConstants.SearchButton_name);
				Assert.assertTrue(driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[9]")).getText().contains(searchKeyWord));
				
				//driver.sendKeyEvent(AndroidKeyCode.ENTER);
				//BaseTestBugRegression.clickOnFirstSuggestedProduct();
				backButton();
			}
			
		}catch(Exception e){
			e.getMessage();
			throw(e);
			
		}
		
	}

}