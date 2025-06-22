package Project1_TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project1_Source.P1_Amazon_Homepage;

public class P1_TC3_Amazon_Invalid_Login extends BaseClass{

	@Test(retryAnalyzer = RetryLogic.class)
	public void AmazonInValidlogin() throws InterruptedException, EncryptedDocumentException, IOException {
		
		P1_Amazon_Homepage homepage=new P1_Amazon_Homepage(driver);
		homepage.login();
		homepage.username();
		homepage.continu();
		homepage.otpbtn();
		Thread.sleep(15000);
		homepage.otpsub();
		SoftAssert s=new SoftAssert();
		s.assertEquals("Invalid OTP. Please check your code and try again.",homepage.Invalidmsg());
		
		
		
	}
	
}
