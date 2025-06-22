package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Class_66_explicit_alartispresent {
	@Test
	public void explicit() {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		wait.until(ExpectedConditions.urlToBe(""));
		
		WebElement e1=driver.findElement(By.id("APjFqb"));
		e1.sendKeys("India");
		
		FluentWait<EdgeDriver> wait1=new FluentWait<EdgeDriver>(driver); // Object Creation
		               // Call its non static Methods using wait class or object
		
		
		
		
	}

}
