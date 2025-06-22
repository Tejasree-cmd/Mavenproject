package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class_61_Rety_autosuggestion {
	
	@Test(retryAnalyzer = Class_61_retrylogic.class)
	public void amazonautosuggest() throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox")); // right one
		//WebElement e1=driver.findElement(By.id("twotabsearchtextbox123"));
		e1.sendKeys("Shoe");
		
		Thread.sleep(2000);
		List<WebElement> shoe=e1.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		shoe.get(2).click();
		
		
		//List<WebElement> list=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-square-aspect']"));
		System.out.println(list.size());
		list.get(0).click();

	}

}
