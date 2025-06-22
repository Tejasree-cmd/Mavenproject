package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_55_testCase_Parallel {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void logintoamazon(String nameofbrowser) {
	  //ChromeDriver driver=new ChoromeDriver();
	 // EdgeDriver driver=new EdgeDriver();
		if(nameofbrowser.equals("chrome")) {
			 driver=new ChromeDriver();
			
		}
		if(nameofbrowser.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		if(nameofbrowser.equals("firefox")) {
			 driver=new FirefoxDriver();
			
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}

	
}
