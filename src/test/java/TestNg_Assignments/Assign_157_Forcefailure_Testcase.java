package TestNg_Assignments;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assign_157_Forcefailure_Testcase {
	@Test(timeOut=1000)
	public void forcefailure() {
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		
	}
	

}
