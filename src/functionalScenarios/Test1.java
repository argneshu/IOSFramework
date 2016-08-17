package functionalScenarios;

import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	   private  Process process;
	    private  String APPIUMSERVERSTART = "/usr/local/bin/appium"; 
	    
	    @BeforeSuite
	    public static void startAppiumServer() throws IOException, InterruptedException {

	       
	        CommandLine command = new CommandLine("/Applications/Appium.app/Contents/Resources/node/bin/node");
	        command.addArgument("/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js", false);
	        command.addArgument("--address", false);
	        command.addArgument("127.0.0.1");
	        command.addArgument("--port", false);
	        command.addArgument("4723");
	        command.addArgument("--full-reset", false);
	        DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
	        DefaultExecutor executor = new DefaultExecutor();
	        executor.setExitValue(1);
	        executor.execute(command, resultHandler);

	        Thread.sleep(5000);
	            System.out.println("Appium server started");
	    }
	    
	    @BeforeTest
	    public void func(){
	    	
	    }
	    
	    @Test
	    public void test() throws MalformedURLException{
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
	   	cap.setCapability("bundleId", "com.zopper.zopper-ios");
	   	cap.setCapability("platformVersion", "");//5.1.1
	   	app = new File(appPath, "Zopper 1.3.8.ipa");//app-staging-debug-1.3.7-dev.apk//"zopper-stag.ipa"
	       System.out.println("app is :"+ app);
	   	cap.setCapability("app", app.getAbsolutePath());
	   	IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    	
	    }
	    
	    @AfterSuite
	    public static  void stopAppiumServer() throws IOException {
	        String[] command ={"/usr/bin/killall","-KILL","node"};
	        Runtime.getRuntime().exec(command);
	        System.out.println("Appium server stop");
	    }

	//static WebDriver driver;

	    
	   
//	public static void main(String[] args) throws IOException, InterruptedException {
//		startAppiumServer();
//		stopAppiumServer();
//		File chromeDriver = new File("");
//		String path = chromeDriver.getAbsolutePath();
//		String driverPath = path+"/chromedriver";
//		System.out.println(driverPath);
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("http://www.zopper.com");
//		driver.findElement(By.id("iphone-app")).click();
//		String parentHandle =driver.getWindowHandle();
//		Set<String> handles=driver.getWindowHandles();
//		for(String handle: handles){
//
//			if(!handle.equals(parentHandle)){
//
//				driver.switchTo().window(handle);
//
//			}
//		}
//		driver.findElement(By.xpath("//*[@id='left-stack']/div[1]/a[2]/span")).click();
//		System.out.println("parent handle"+ driver.getWindowHandle());
//		
//		Set<String> handles_1=driver.getWindowHandles();
//		for(String handle: handles_1){
//			System.out.println(handle);
//		}
//		
		

	//}
	
	

}
