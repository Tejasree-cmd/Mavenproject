package Project1_Source;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Project1_Source.P1_Source_DDT_file;

public class P1_Amazon_Homepage {

	    P1_Source_DDT_file P1=new P1_Source_DDT_file();
	    SoftAssert s=new SoftAssert();
		WebDriver driver;
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//Step 1 Locate Each Element using @FindBy Annotation
		//registration Elements
		@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
		WebElement login;
		
		@FindBy(linkText="Start here.")
		WebElement register;
		
		@FindBy(xpath="//span[.='Your Account']")
		WebElement account;
		
		@FindBy(id="ap_email_login")
		WebElement email;
		
		@FindBy(xpath="//input[@class='a-button-input']")
		WebElement cont;
		
		@FindBy(xpath="//input[@class='a-button-input']")
		WebElement regicont;
		
		//Login Elements
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(id="continue")
		WebElement continu;
		
		@FindBy(id="auth-login-via-otp-btn")
		WebElement otpbtn ;
		
		@FindBy(id="cvf-submit-otp-button")
		WebElement otpsub;
		
		@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
		WebElement validmsg;
		
		@FindBy(xpath="//div[.='Invalid OTP. Please check your code and try again.']")
		WebElement Invalidmsg;
		
		//Search box using Sibling node
		@FindBy(xpath="//label/following-sibling::input")
		WebElement Search;
		
		//Address elements
		@FindBy(xpath="//span[.='Your Account']")
		WebElement profile;
		
		@FindBy(xpath="//div/child::span[.='Hello, sign in']")
		WebElement valid;
		
		//Registration
		public void login() {
			login.click();
			
		}		
		public void register(WebDriver driver) {
			Actions a1=new Actions(driver);
			a1.moveToElement(account).perform();
			register.click();
				
		}
		
		public void profile(WebDriver driver) {
			Actions a1=new Actions(driver);
			a1.moveToElement(login).perform();
			profile.click();
			
			
		}
		public void email() throws EncryptedDocumentException, IOException {
		    String s1=(String) P1.un.get(0);
			email.sendKeys(s1);			
		}
		public void cont() {
			cont.click();			
		}
		public void regicont() {
			regicont.click();			
		}

	//Login Functions
		public void username() throws EncryptedDocumentException, IOException {
			String s2=(String) P1.un.get(1);
			username.sendKeys(s2);
			
		}
		
		public void continu() {
			continu.click();
			
		}
		
		public void otpbtn() {
			otpbtn.click();
		}
		
		public void otpsub() {
			otpsub.click();
			
		}
		public void valid() {
			String v=validmsg.getText();
			s.assertNotEquals("Hello, sign in" ,v);
		}
        public void validmsg() {
        	String v=validmsg.getText();
			s.assertNotEquals("Hello, sign in" ,v);
			Reporter.log("Actual Element Text  and Initial Elemenet Test are not Matching , hence Passed");
        	
        }
        public String Invalidmsg() {
        	return Invalidmsg.getText();
        }
       // Page Search
    	public void Search() {
    		wait.until(ExpectedConditions.elementToBeClickable(Search));
    		String ip=(String) P1.pas.get(3);
    		Search.sendKeys(ip+Keys.ENTER);
    	}
	public P1_Amazon_Homepage(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
		try {
	        P1.ddtfile(); // Load once when object is created
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
		
		
	}
	


