package POM_facebook_testcases;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import POM_facebook_source.class_63_facebook_login_source;

public class Class_63_facebook_testcase2_Logout {
	@Test
	public void facelogin_validcreds() {
        EdgeDriver driver=new EdgeDriver();		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		class_63_facebook_login_source loginpage=new class_63_facebook_login_source(driver);
		loginpage.un();
		loginpage.pas();
		loginpage.login();
		
		
		
	}

}
