package AMAZON_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_addAddress {
	
	WebDriver driver;
	//Step 1 Locate Each Element using @FindBy Annotation
	@FindBy(xpath="//span[.='Edit addresses for orders and gifts']")
	WebElement addressadd;
	
	@FindBy(xpath="//div[.='Add address']")
	WebElement newaddress;
	
	//Step2 Create methods
	public void addressadd() {		
		addressadd.click();		
	}
	
	public void newaddress() {		
		newaddress.click();		
	}

	
	//Step 3 that was missing : initialize the Elements using pager Factory class inside the Constructor
	public Amazon_addAddress(WebDriver driver) {
		//this.driver=driver //other way
		PageFactory.initElements(driver,this);
		
		
	}

}
