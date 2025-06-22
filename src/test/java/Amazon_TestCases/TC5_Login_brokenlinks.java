package Amazon_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import AMAZON_Source.Amazon_Homepage;
import AMAZON_Source.Amazon_addAddress;

public class TC5_Login_brokenlinks extends BaseClass {
	
	@Test
	public void Login_brokenlinks() throws InterruptedException, IOException {
	Extentreportclass.test = Extentreportclass.extent.createTest("Amazon Broken links");
	Amazon_Homepage homepage=new Amazon_Homepage(driver);
	homepage.login();
	Extentreportclass.test.info("Login Page");
	//Thread.sleep(2000);
	homepage.username();
	homepage.continu();
	homepage.otpbtn();
	Thread.sleep(15000);
	homepage.otpsub();
	//Thread.sleep(4000);
	
	//Thread.sleep(2000);
	homepage.links();
	homepage.logout(driver);
	
	}
}
