package AMAZON_Source;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Homepage {
	WebDriver driver;
	//Step 1 Locate Each Element using @FindBy Annotation
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement login;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement address;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continu;
	
	@FindBy(id="auth-login-via-otp-btn")
	WebElement otpbtn ;
	
	@FindBy(id="cvf-submit-otp-button")
	WebElement otpsub;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath="//span[.='Your Account']")
	WebElement account;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement logout;
	
	// Step2 
	public void links() throws IOException {
		//Iterator i1=links.iterator();
		int count=links.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement e=links.get(i);
			String url=e.getDomAttribute("href");
			//String text1=e.getText();
			//System.out.println("URL " +url);
			verifythelink(url);
		}
	}
		static void verifythelink(String link) throws IOException {
			try {
			URL u1=new URL(link);
			HttpURLConnection c1= (HttpURLConnection) u1.openConnection(); // upcasting
			if(c1.getResponseCode() ==200) {
				System.out.println("This is Valid link "+ link + c1.getResponseMessage());
				
			}
			else {
				System.out.println("No a Valid link");
			}
			}
			catch (MalformedURLException e1) {
				System.out.println("Exception Encountered" + link);
				
				
			}
			
		
		
		
	}
	public void login() {
		login.click();
		
	}
	public void logout(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(address).perform();
		logout.click();
	}
	
	public void address(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(address).perform();
		account.click();
			
	}
	public void username() {
		username.sendKeys("9791250091");
		
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

	public void search() {
	
		search.sendKeys("Shoe"+Keys.ENTER);
		
	}

	
	//Step 3 that was missing : initialize the Elements using pager Factory class inside the Constructor
	public Amazon_Homepage(WebDriver driver) {
		//this.driver=driver //other way
		PageFactory.initElements(driver,this);
		
		
	}
	

}
