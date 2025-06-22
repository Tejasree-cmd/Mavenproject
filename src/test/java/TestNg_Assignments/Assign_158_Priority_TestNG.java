package TestNg_Assignments;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assign_158_Priority_TestNG {
	@Test(priority=0)
	public void forcefailure() {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.close();
		
	}
	@Test(priority=1)
	public void chrometest() {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		
	}

}
