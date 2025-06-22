package Amazon_TestCases;

import org.testng.annotations.Test;

import AMAZON_Source.Amazon_Homepage;
import AMAZON_Source.Amazon_Newadresspage;
import AMAZON_Source.Amazon_addAddress;

public class TC4_Login_Addnewaddress extends BaseClass{
	@Test
	public void Login_addnewaddress() throws InterruptedException {
	Extentreportclass.test = Extentreportclass.extent.createTest("Amazon add new address");
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
	homepage.address(driver);
	//Thread.sleep(2000);
	Amazon_addAddress accountpage=new Amazon_addAddress(driver);
	accountpage.addressadd();
	//Thread.sleep(2000);
	accountpage.newaddress();
	//Thread.sleep(3000);
	
	Amazon_Newadresspage addresspage=new Amazon_Newadresspage(driver);
	addresspage.Selectcountry();
	//Thread.sleep(3000);
	addresspage.Firstname();
	//Thread.sleep(3000);
	addresspage.phonenumber();
	//Thread.sleep(2000);
	addresspage.postalcode();
	//Thread.sleep(2000);
	addresspage.addline1();
	//Thread.sleep(2000);
	addresspage.city();
	//Thread.sleep(2000);
	addresspage.state();
	//Thread.sleep(2000);
	addresspage.submitbutton();
	Thread.sleep(5000);
	
	homepage.logout(driver);
	
	
	}
}
