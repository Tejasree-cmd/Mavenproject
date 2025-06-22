package Project1_TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Source.P1_Amazon_Accounts_Page;
import Project1_Source.P1_Amazon_Homepage;
@Listeners(Listners_Project1.class)
public class P1_TC4_Profile_Edit extends BaseClass {
	
	@Test(retryAnalyzer = RetryLogic.class)
	public void EditProfile() throws InterruptedException, EncryptedDocumentException, IOException {
		P1_Amazon_Homepage homepage=new P1_Amazon_Homepage(driver);
		homepage.login();
		homepage.username();
		homepage.continu();
		homepage.otpbtn();
		Thread.sleep(20000);
		homepage.otpsub();
		homepage.profile(driver);
		
		P1_Amazon_Accounts_Page profilepage=new P1_Amazon_Accounts_Page(driver);
		profilepage.security();
		profilepage.editname();
		profilepage.nameinput();
		profilepage.upbtn();
		profilepage.toastmsg(driver);
		
		
		
	}

}
