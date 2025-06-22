package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_59_Amazon_WrongLogin_Assert {
	@Test
	public void amazonlog() throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("email"));
		e1.sendKeys("9791250091");
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		Thread.sleep(2000);
		WebElement e3=driver.findElement(By.id("auth-login-via-otp-btn"));
		e3.click();
		Thread.sleep(10000);
		WebElement e4=driver.findElement(By.id("cvf-submit-otp-button"));
		e4.click();
		Thread.sleep(3000);
		
		WebElement we=driver.findElement(By.xpath("(//div[@class='a-section cvf-alert-section cvf-widget-alert-message'])[3]"));
		String s1=we.getText();
		System.out.println("String is "+s1);
		Assert.assertEquals(s1,"Invalid OTP. Please check your code and try again.");
		
		//Assert.assertEquals(driver.getTitle().contains("Amazon.in"),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		//WebElement e5=driver.findElement(By.xpath("nav-link-accountList-nav-line-1"));
		//Assert.assertEquals(e5.getText(),"Hello, TEJASREE");
		
		
		
	}

}
