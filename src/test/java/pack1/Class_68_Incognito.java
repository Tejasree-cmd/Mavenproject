package pack1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Class_68_Incognito {
	@Test
	public void incognito() throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement e=links.get(i);
			String url=e.getDomAttribute("href");
			//String text1=e.getText();
			//System.out.println("URL " +url);
			verifythelink(url);
	}

	}
	static void verifythelink(String link) throws IOException {
		try {
		URL u1=new URL(link);
		HttpURLConnection c1= (HttpURLConnection) u1.openConnection(); // upcasting
		if(c1.getResponseCode() ==200) {
			System.out.println("This is Valid link "+ link + c1.getResponseMessage());
			
		}
		else {
			System.out.println("No a Valid link");
		}
		}
		catch (MalformedURLException e1) {
			System.out.println("Exception Encountered" + link);
			
			
		}
	}

}
