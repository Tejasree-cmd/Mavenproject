package Project1_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_Amazon_RegisterPage {
	
	WebDriver driver;
	@FindBy(id="ap_phone_number")
	WebElement phno;
	
	@FindBy(id="ap_customer_name")
    WebElement uname;
	
	@FindBy(id="ap_password")
	WebElement upswd;
	
	@FindBy(id="continue")
	WebElement vcont;
	
	@FindBy(xpath="//input[@aria-describedby='inline-otp-messages']")
	WebElement otpinp;
	
	@FindBy(id="cvf-submit-otp-button")
	WebElement create;
	
	public void phno() {
		phno.sendKeys("9703366818");			
	}
	
	public void uname() {
		uname.sendKeys("Padma");
	}
	
	public void upswd() {
		upswd.sendKeys("Padma@2811");
	}
	public void vcont() {
		vcont.click();
	}
	
	public void otpinp() {
		otpinp.click();
	}
	
	public void create() {
		create.click();
	}
	


public P1_Amazon_RegisterPage(WebDriver driver) {

	PageFactory.initElements(driver,this);
	
	
}
	
	

}
