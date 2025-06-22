package AMAZON_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Newadresspage {
	
	WebDriver driver;
	//Step 1 Locate Each Element using @FindBy Annotation
	@FindBy(xpath="//select[@id='address-ui-widgets-countryCode-dropdown-nativeId']")
	WebElement Selectcountry;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement postalcode;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement addline1;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId']")
	WebElement state;
	
	@FindBy(xpath="//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
	WebElement submitbutton;
	
	//Step2 Create methods
	public void Selectcountry() {		
		Select s1=new Select(Selectcountry); 
		
		s1.selectByVisibleText("India");		
	}
	
	public void Firstname() {		
		Firstname.sendKeys("Tejasree");		
	}

	public void phonenumber() {		
		phonenumber.sendKeys("9791250091");		
	}
	
	public void postalcode() {		
		postalcode.sendKeys("517299");		
	}
	
	public void addline1() {		
		addline1.sendKeys("Bazaar Street,7/23,Sepoy Building,vayalpad");		
	}
	public void city() {	
		city.clear();
		city.sendKeys("Vayalpad");		
	}
	
	public void state() {		
		Select s1=new Select(state); 
		
		s1.selectByVisibleText("ANDHRA PRADESH");		
	}
	
	public void submitbutton() {		
		submitbutton.click();		
	}
	
	
	//Step 3 that was missing : initialize the Elements using pager Factory class inside the Constructor
	public Amazon_Newadresspage(WebDriver driver) {
		//this.driver=driver //other way
		PageFactory.initElements(driver,this);
		
		
	}

}
