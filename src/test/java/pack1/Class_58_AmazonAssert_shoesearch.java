package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_58_AmazonAssert_shoesearch {
	@Test
	public void amazonassert() throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Shoe"+Keys.ENTER);
	Thread.sleep(4000);
	List l1=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	Assert.assertEquals(l1.size()<40,true,"Sorry Count is not matching for shoe");
			
	}

}
