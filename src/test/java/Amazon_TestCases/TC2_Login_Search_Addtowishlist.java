package Amazon_TestCases;

import org.testng.annotations.Test;

import AMAZON_Source.Amazon_Homepage;
import AMAZON_Source.Amazon_ProductPage1;
import AMAZON_Source.Amazon_Searchresultpage;

public class TC2_Login_Search_Addtowishlist extends BaseClass {
	
	@Test
	public void Amazonlogin() throws InterruptedException {
        //EdgeDriver driver=new EdgeDriver();		
		
		Extentreportclass.test = Extentreportclass.extent.createTest("Amazon Wishlist");
		Amazon_Homepage homepage=new Amazon_Homepage(driver);
		homepage.login();
		Extentreportclass.test.info("Login Page");
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
		
		Amazon_ProductPage1 product=new Amazon_ProductPage1(driver);
		product.wishlist();
		
		Thread.sleep(3000);
		product.contshopping();
		
		homepage.logout(driver);
		
	}


}
