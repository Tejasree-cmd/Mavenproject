package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Class_66_Explicit_wait_methods {
	@Test
	public void explicit() {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Goo"));
		wait.until(ExpectedConditions.alertIsPresent());
		
		WebElement e1=driver.findElement(By.id("APjFqb"));
		e1.sendKeys("India");
		
		
	}

}
