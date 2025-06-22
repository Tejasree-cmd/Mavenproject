package POM_facebook_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class_63_facebook_login_source {
	EdgeDriver driver;
	//Step 1 Locate Each Element using @FindBy Annotation
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	
	// Step2 
	
	public void un() {
		username.sendKeys("t.l.tejasree@gmail.com");
		
	}
	public void pas() {
		password.sendKeys("teja@0601");
	}
	public void login() {
		login.click();
	}
	
	//Step 3 that was missing : initialize the Elements using pager Factory class inside the Constructor
	public class_63_facebook_login_source(EdgeDriver driver) {
		//this.driver=driver //other way
		PageFactory.initElements(driver,this);
		
		
	}
	
	

}
