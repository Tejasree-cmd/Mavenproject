package Project1_TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project1_Source.P1_Amazon_Homepage;

public class P1_TC2_Amazon_Login_Verification extends BaseClass{
	
	@Test(retryAnalyzer = RetryLogic.class)
	public void AmazonValidlogin() throws InterruptedException, EncryptedDocumentException, IOException {
		
		P1_Amazon_Homepage homepage=new P1_Amazon_Homepage(driver);
		homepage.login();
		homepage.username();
		homepage.continu();
		homepage.otpbtn();
		Thread.sleep(15000);
		homepage.otpsub();
		homepage.valid();
		
		
		
	}
	}
	


