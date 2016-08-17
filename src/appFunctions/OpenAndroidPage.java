package appFunctions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;
import bugRegressionSuite.BaseTestIOS;

import appFunctions.OpenHomePage;

import pageObjects.BugRegressionAppConstants;
import pageObjects.SanitySuiteAppConstants;

public class OpenAndroidPage extends BaseTestIOS {

	public static void openAndroidPage() {
		try {
			OpenHomePage.openHomePage();
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			// clickName(AppConstants.NavDrawer_Mobile_tablets_link);
			if (packName.contains("functionalScenarios")) {
				clickName(BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
				extentInfoLogs("Open Android phone category");
				if(findElementsByName(BugRegressionAppConstants.AndroidPhones_name).size()>0){
				clickName(BugRegressionAppConstants.AndroidPhones_name);
				}else{
					driver.swipe(0, 500, 0, 1000, 3000);
					clickName(BugRegressionAppConstants.AndroidPhones_name);
				}
				
			} else {
				clickOnCategoryByName(BugRegressionAppConstants.Home_Menu_Id,
						BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
				clickId(BugRegressionAppConstants.Android_phones_id);
			}
			// clickClassName(AppConstants.Open_Navigation_Drawer);
			// clickName(AppConstants.NavDrawer_Mobile_tablets_link);
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	public static void clickOnAndroidProduct_CurrentPage() throws Exception {
		List<WebElement> elements = null;
		try {

			if (packName.contains("Functional_Scenarios")) {
				elements = driver.findElements(By.id(SanitySuiteAppConstants.MyAccountFirstFavouriteProduct_id));
			} else {
				elements = driver.findElements(By.id(BugRegressionAppConstants.MyAccountFirstFavouriteProduct_id));

			}
			for (WebElement elemnt : elements) {
				elemnt.click();

				Thread.sleep(1000);

				clickClassName(BugRegressionAppConstants.ProductDetailsBackbutton_xpath);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	public static void openAndroidPageFromHomeScreen() {
		try {
			clickXpath(BugRegressionAppConstants.Open_Navigation_Drawer_xpath);
			clickName(BugRegressionAppConstants.NavDrawer_Mobile_tablets_link);
			clickId(BugRegressionAppConstants.ProductionAndroid_phones_id);
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
	}

	public static String clickOnCategoryByName(String id, String category) {

		try {
			List<WebElement> elements = driver.findElements(By.id(id));
			for (WebElement elemnt : elements) {
				if (elemnt.getText().replace(" ", "").toLowerCase()
						.contains(category.replace(" ", "").toLowerCase())) {
					elemnt.click();
					break;
				}
			}
		} catch (Exception e) {
			throw (e);
		}
		return category;
	}

	public static String clickOnFirstAndroidProduct() throws Exception {
		String productName = null;
		// String packageName = BaseTestBugRegression.packName;
		List<WebElement> elements = null;
		WebElement element = null;
		try {
			List<WebElement> cell=	driver.findElements(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/*"));
			Thread.sleep(8000);
			cell.get(0).click();
			System.out.println("cell size is "+ cell.size());
//			try{
//				for(WebElement ele:cell){
//					System.out.println("the location is "+ele.getLocation());
//					System.out.println("the size is :" +ele.getSize());
//					System.out.println("the text is :" +ele.getText());
//					System.out.println("the display is " + ele.isDisplayed());
//					System.out.println("element enabled or not " + ele.isEnabled());
//					System.out.println("eleemnts is selected or not "+ele.isSelected());
//					
//				}
//				
//			}catch(Exception e){
////				driver.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 78); put("y", (double) 219); }});
//				e.getMessage();
//				
//			}
		
//		    for(int i=0 ;i<cell.size();i++){
//		    	System.out.println("display is "+cell.get(i).isDisplayed());
//		    	if(cell.get(i).isDisplayed()==true){
//		    		try{
//		    		cell.get(0).click();
//		    		}catch(Exception e){
//			    		driver.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 78); put("y", (double) 219); }});
//
//		    		}
//		    	}else{
//		    		JavascriptExecutor je= null;
//		    		driver.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 78); put("y", (double) 219); }});
//		    	}
//		    }

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}
		return productName;
	}

	@Test(enabled = false)
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub

	}

}
