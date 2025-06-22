package Amazon_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pack1.Class_81_reporter_generator;

public class BaseClass {
	@BeforeSuite
	public void extent() {
		Extentreportclass.startReport();
	}
	@AfterSuite
	public void extentAdter() {
		Extentreportclass.flushReport();
	}
         WebDriver driver;
         @BeforeMethod
         public void laucnching() {
        	 driver=new EdgeDriver();
        	 driver.get("https://www.amazon.in");
        	 driver.manage().window().maximize();
        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	 Reporter.log("Browser is Successfully launched");
        	 
         }
         
         @AfterMethod
         public void closing() {
        	// driver.get("https://www.amazon.in");
        	// driver.manage().window().maximize();
        	// driver.close();
        	 Reporter.log("Browser is Successfully Closed");
         }
}
