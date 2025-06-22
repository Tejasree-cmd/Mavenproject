package Amazon_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import AMAZON_Source.Amazon_Homepage;
import pack1.Class_81_reporter_generator;

public class TC1_Login_To_Amazon extends BaseClass {
	
	
	@Test
	public void Amazonlogin() throws InterruptedException {     
		/*if (Extentreportclass.extent == null) {
            Extentreportclass.startReport();
        } */

		Extentreportclass.test = Extentreportclass.extent.createTest("Amazon login Test");
		Amazon_Homepage homepage=new Amazon_Homepage(driver);
		Extentreportclass.test.info("Login Page");
		homepage.login();
		Thread.sleep(2000);
		homepage.username();
		homepage.continu();
		homepage.otpbtn();
		Thread.sleep(15000);
		homepage.otpsub();
		homepage.logout(driver);
		
		
		
	}

}
