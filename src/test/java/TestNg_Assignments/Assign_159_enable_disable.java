package TestNg_Assignments;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assign_159_enable_disable {
	@Test(enabled=false)
	public void forcefailure() {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.close();
		
	}
	@Test()
	public void chrometest() {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		
	}

}
