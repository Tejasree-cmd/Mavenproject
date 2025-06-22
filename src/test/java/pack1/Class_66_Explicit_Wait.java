package pack1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class_66_Explicit_Wait {
	@Test
	public void amazonetoe() throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		
		WebElement e1=driver.findElement(By.name("email"));
		e1.sendKeys("9791250091");
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		Thread.sleep(2000);
		WebElement e3=driver.findElement(By.id("auth-login-via-otp-btn"));
		e3.click();
		Thread.sleep(10000);
		WebElement e4=driver.findElement(By.id("cvf-submit-otp-button"));
		e4.click();
		Thread.sleep(3000);
		//Assertion s1=new Assertion();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(driver.getTitle(),"Your Amazon.in");
		
	
		WebElement e5=driver.findElement(By.id("twotabsearchtextbox"));
		e5.sendKeys("Shoe");
		//e1.sendKeys(Keys.CONTROL.ENTER);
		Thread.sleep(2000);
		List<WebElement> shoe=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		shoe.get(0).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));		
		System.out.println(list.size());
		s1.assertEquals(list.size()>20, true);
		list.get(4).click();
		Set<String> pcid=driver.getWindowHandles();
		System.out.println(pcid);
		Iterator<String> i1=pcid.iterator();
		i1.next();
		driver.switchTo().window(i1.next());
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		WebElement e=driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		e.click();
		Thread.sleep(5000);
		
		
		Thread.sleep(3000);
		WebElement conf=driver.findElement(By.xpath("//span[@class='a-size-medium-plus huc-atwl-header-main']"));
		s1.assertEquals(conf.getText(), "One item added to");
	
		s1.assertAll();
		
	
}
}
