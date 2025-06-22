package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_59_Amazon_Login_Assert3 {
	@BeforeSuite
	public void extent() {
		Class_81_reporter_generator.startReport();
	}
	@Test
	public void amazonlog() throws InterruptedException {
		Class_81_reporter_generator.test = Class_81_reporter_generator.extent.createTest("Amazon login Test");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Class_81_reporter_generator.test.info("Navigated to Amazon");
		//Class_81_reporter_generator.test.pass("Navigated to Amazon");
		WebElement e1=driver.findElement(By.name("email"));
		e1.sendKeys("9791250091");
		Class_81_reporter_generator.test.info("Entered Username");
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		Thread.sleep(1000);
		WebElement e3=driver.findElement(By.id("auth-login-via-otp-btn"));
		e3.click();
		Thread.sleep(10000);
		Class_81_reporter_generator.test.info("Entered OTP");
		WebElement e4=driver.findElement(By.id("cvf-submit-otp-button"));
		e4.click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(),"Your Amazon.in");
		//WebElement e5=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		//Assert.assertEquals(e5.getText(),"Hello, TEJASREE");
		Class_81_reporter_generator.test.pass("Login Successful");
		
		
	}

	@AfterSuite
	public void extentAdter() {
		Class_81_reporter_generator.flushReport();
	}
}
