package pack1;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_67_broswerbasedpopup {
	@Test
	public void facebooklogin() throws InterruptedException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		
		EdgeDriver driver=new EdgeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("email"));
		e1.sendKeys("t.l.tejasree@gmail.com");
		WebElement e2=driver.findElement(By.id("pass"));
		e2.sendKeys("teja@0601");
		Thread.sleep(2000);
		WebElement e3=driver.findElement(By.name("login"));
		e3.click();
		Thread.sleep(1000000);
	    Assert.assertEquals(false, false);
		
		
	}

}
