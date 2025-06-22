package Project1_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass extends Listners_Project1{
	 @Parameters("browser")
     @BeforeMethod
     public void laucnching(@Optional("edge") String nameofbrowser) {
		if(nameofbrowser.equals("chrome")) {
			 driver=new ChromeDriver();
			
		}
		if(nameofbrowser.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		if(nameofbrowser.equals("firefox")) {
			 driver=new FirefoxDriver();
			
		}
    	 //driver=new EdgeDriver();
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

		//driver.close();
    	 Reporter.log("Browser is Successfully Closed");
     }

}
