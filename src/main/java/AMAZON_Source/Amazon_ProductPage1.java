package AMAZON_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage1 {
	WebDriver driver;
	//Step 1 Locate Each Element using @FindBy Annotation
	@FindBy(id="wishListMainButton")
	WebElement wishlist;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement cartbtn;
	
	@FindBy(xpath="//input[@aria-label='Continue shopping']")
	WebElement contshopping;
	

	public void wishlist() {
		wishlist.click();
		
	}
	
	public void contshopping() {
	contshopping.click();
	}

	public void cartbtn() {
		cartbtn.click();
		
	}

	
	//Step 3 that was missing : initialize the Elements using pager Factory class inside the Constructor
	public Amazon_ProductPage1(WebDriver driver) {
		//this.driver=driver //other way
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	

}
