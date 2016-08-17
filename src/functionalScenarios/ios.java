package functionalScenarios;

import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import bugRegressionSuite.BaseTestBugRegression;


public class ios {

	@Test
	public void executeTestCase() throws Exception {
	 File currDir = new File("");
     String path = currDir.getAbsolutePath();
     System.out.println("path is :" +path);
     File app = null;
     String appPath = path + "/app";
     System.out.println("appPath is : " +appPath);
     
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("platformName", "iOS");
	cap.setCapability("deviceName","Zopper" );//"SM-N750"
	cap.setCapability("udid", "0532bef2379f1be3cee91d63b556dc4252a9080a");//f001f49141e4618303aec2793e9830fe288ac0bf//0532bef2379f1be3cee91d63b556dc4252a9080a
	cap.setCapability("launchTimeout", "12000");
	cap.setCapability("nativeInstrumentsLib", true);
	cap.setCapability("bundleId", "com.zopper.zopper-stag");
	cap.setCapability("platformVersion", "");//5.1.1
	app = new File(appPath, "zopper-stag.ipa");//app-staging-debug-1.3.7-dev.apk//"zopper-stag.ipa"
    System.out.println("app is :"+ app);
	cap.setCapability("app", app.getAbsolutePath());
	IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver.quit();
		
	}

}
