package Project1_TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pack2.Class_61_retrylogic;
import Project1_Source.P1_Amazon_Homepage;
import Project1_Source.P1_Amazon_RegisterPage;

@Listeners(Listners_Project1.class)
public class P1_TC1_Amazon_User_Registration extends BaseClass {
	
	@Test(retryAnalyzer = RetryLogic.class)
	public void Amazonlogin() throws InterruptedException, EncryptedDocumentException, IOException {
     
		
		P1_Amazon_Homepage homepage=new P1_Amazon_Homepage(driver);
		homepage.login();
	
		//homepage.register(driver);
		homepage.email();
		homepage.cont();
		//Thread.sleep(15000);
		homepage.regicont();
		
		P1_Amazon_RegisterPage register=new P1_Amazon_RegisterPage(driver);
		//register.phno();
		register.uname();
		register.upswd();
		register.vcont();
		Thread.sleep(20000);
		register.otpinp();
		Thread.sleep(20000);
		register.create();
		
		
		
	}
	

}
