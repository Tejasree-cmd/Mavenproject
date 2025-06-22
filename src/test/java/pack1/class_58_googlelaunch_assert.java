package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class class_58_googlelaunch_assert {

	@Test
	public void googleassert() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "google");
		
		
	}

}
