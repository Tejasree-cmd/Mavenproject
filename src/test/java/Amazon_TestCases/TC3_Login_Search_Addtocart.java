package Amazon_TestCases;

import org.testng.annotations.Test;

import AMAZON_Source.Amazon_Homepage;
import AMAZON_Source.Amazon_ProductPage1;
import AMAZON_Source.Amazon_Searchresultpage;

public class TC3_Login_Search_Addtocart extends BaseClass{
	@Test
	public void Amazonlogin() throws InterruptedException {
        //EdgeDriver driver=new EdgeDriver();		
		
		Extentreportclass.test = Extentreportclass.extent.createTest("Amazon add to cart");
		Amazon_Homepage homepage=new Amazon_Homepage(driver);
		Extentreportclass.test.info("Login Page");
		homepage.login();
		Thread.sleep(2000);
		homepage.username();
		homepage.continu();
		Thread.sleep(3000);
		homepage.otpbtn();
		Thread.sleep(15000);
		homepage.otpsub();
		Thread.sleep(3000);
		homepage.search();
		Thread.sleep(3000);
		
		Amazon_Searchresultpage search=new Amazon_Searchresultpage(driver);
		search.product1(driver);
		Thread.sleep(3000);
		
		Amazon_ProductPage1 cartpage=new Amazon_ProductPage1(driver);
		cartpage.cartbtn();
		
		homepage.logout(driver);
		
	}
}
