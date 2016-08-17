package functionalScenarios;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestIOS;

import appFunctions.OpenHomePage;

public class sim {

	IOSDriver driver= null;
	@Test
	public void simu() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "9.3"); //Replace this with your iOS version
		caps.setCapability("deviceName", "iPhone 6"); //Replace this with your simulator/device version
		caps.setCapability("app", "/Users/LP1-276/Desktop/zopper-ios.app"); //Replace this with app path in your system
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.findElement(By.name("OK")).click();
	}
	@Test
	public void executeTestCase() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
