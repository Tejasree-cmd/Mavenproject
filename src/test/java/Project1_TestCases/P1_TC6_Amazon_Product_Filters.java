package Project1_TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Source.P1_Amazon_Homepage;
import Project1_Source.P1_Amazon_ProductPage;
@Listeners(Listners_Project1.class)
public class P1_TC6_Amazon_Product_Filters extends BaseClass {
	@Test(retryAnalyzer = RetryLogic.class)
	public void AmazonProductFilters() throws InterruptedException, EncryptedDocumentException, IOException {
	P1_Amazon_Homepage homepage=new P1_Amazon_Homepage(driver);
	P1_Amazon_ProductPage prd=new P1_Amazon_ProductPage(driver);
	
	homepage.login();
	homepage.username();
	homepage.continu();
	homepage.otpbtn();
	Thread.sleep(15000);
	homepage.otpsub();
	homepage.validmsg();	
	homepage.Search();
	prd.toysearch(driver);
	prd.TodayFilter();
	prd.BrandFilter(driver);
	prd.PriceFilter();
	
}
}
