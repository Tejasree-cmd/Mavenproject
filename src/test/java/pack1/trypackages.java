package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class trypackages {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandles());

	}

}
