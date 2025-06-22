package Project1_Source;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class P1_Amazon_Accounts_Page {
	P1_Source_DDT_file P4=new P1_Source_DDT_file();
	WebDriver driver;
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert s1=new SoftAssert();
	//Login and Security Edit page Elements 
	@FindBy(xpath="//span[.='Edit login, name, and mobile number']")
	WebElement security;
	
	@FindBy(xpath="//a[@aria-label='Edit email address']")
	WebElement editop;
	
	@FindBy(name="cvf_email")
	WebElement upemail;
	
	@FindBy(id="cvf-input-code")
	WebElement otpmail;
	
	@FindBy(xpath="//span[@class='a-button-inner']/child::a[@href='/ap/profile/name?openid.mode=checkid_setup&ref_=ax_am_landing_change_name&openid.assoc_handle=inflex&openid.ns=http://specs.openid.net/auth/2.0']")
    WebElement editname;
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement nameinput;
	
	@FindBy(xpath="//div[@id='SUCCESS_MESSAGES']/descendant::div[@class='a-alert-content']")
	WebElement toastmsg;
	
	@FindBy(xpath="//span[@class='a-button a-button-primary']")
	WebElement upbtn;
	
	//Login and Security Edit page Methods
	public void security() {
		wait.until(ExpectedConditions.elementToBeClickable(security));
		security.click();
	}
	
	public void editop() {
		editop.click();
	}
	public void upemail() {
		upemail.sendKeys("iamtejutab@gmail.com");
	}
	public void otpmail() {
		otpmail.click();
	}
	public void editname() {
		wait.until(ExpectedConditions.elementToBeClickable(editname));
		editname.click();
		
	}
	public void nameinput() throws EncryptedDocumentException, IOException {
		wait.until(ExpectedConditions.visibilityOf(nameinput));
		String s1=(String) P4.un.get(3);
		nameinput.clear();
		nameinput.sendKeys(s1);
	}
	public void upbtn() {
		upbtn.click();
	}
	
	public void toastmsg(WebDriver driver) {
		String s2=driver.getTitle();
		System.out.println(s2);
		String msg=toastmsg.getText();
		s1.assertEquals(msg, "Name updated. ");
		s1.assertEquals(s2, "Login and Security");
	  
	}
	
public P1_Amazon_Accounts_Page(WebDriver driver) {

	PageFactory.initElements(driver,this);
	try {
        P4.ddtfile(); // ✅ Load Excel data once
    } catch (Exception e) {
        e.printStackTrace();
    }
	
	
}
	
	

}
