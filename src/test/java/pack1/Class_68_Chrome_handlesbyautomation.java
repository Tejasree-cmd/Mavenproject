package pack1;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class_68_Chrome_handlesbyautomation {
	
	@Test
	public void handleautoalert() {
		
	
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	options.setExperimentalOption("useAutomationExtension", false);
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://www.google.com");
	WebElement e1=	driver.findElement(By.linkText("Gmail"));

	Actions a1=new Actions(driver);
	a1.doubleClick(e1).perform();
	}

}
