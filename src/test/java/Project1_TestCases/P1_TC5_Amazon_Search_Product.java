package Project1_TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Project1_Source.P1_Amazon_Homepage;
import Project1_Source.P1_Amazon_ProductPage;
import Project1_Source.P1_Source_DDT_file;

public class P1_TC5_Amazon_Search_Product extends BaseClass{
	@Test(retryAnalyzer = RetryLogic.class)
	public void AmazonProductSearch() throws InterruptedException, EncryptedDocumentException, IOException {
		/*P1_Source_DDT_file src=new P1_Source_DDT_file();
		src.ddtfile();		
		System.out.println(src.pas); */
		
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
		
		
	}
}
