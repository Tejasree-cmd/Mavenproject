package AMAZON_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Searchresultpage {
	WebDriver driver;
	//Step 1 Locate Each Element using @FindBy Annotation
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement product1;
	

	
	
	public void product1(WebDriver driver) {
		product1.click();
		Set<String> pcid=driver.getWindowHandles();
		Iterator<String> i=pcid.iterator();
		String parent=i.next();
		String child=i.next();
		driver.switchTo().window(child);
		
		
	}
	


	
	//Step 3 that was missing : initialize the Elements using pager Factory class inside the Constructor
	public Amazon_Searchresultpage(WebDriver driver) {
		//this.driver=driver //other way
		PageFactory.initElements(driver,this);
		
		
	}
	

}
