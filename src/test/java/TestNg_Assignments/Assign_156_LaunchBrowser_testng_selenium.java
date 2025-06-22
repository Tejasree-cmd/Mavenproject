package TestNg_Assignments;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assign_156_LaunchBrowser_testng_selenium {
@Test
public void launchwebsite() {
	EdgeDriver driver=new EdgeDriver();
	//driver.get("https://www.google.com");	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in");
}
}
