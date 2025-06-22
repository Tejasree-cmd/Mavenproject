package pack1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class_62_Broken_with_Protocal_domain {
	@Test
	public void brokenlinks() throws IOException {
		EdgeDriver driver=new EdgeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement e=links.get(i);
			String url=e.getDomAttribute("href");
			//String text1=e.getText();
			//System.out.println("URL " +url);
			if( url==null ) {
				System.out.println("URL is Null ");
				
			}
			//else if(url.matches("(.*)https://www.amazon.in(.*)") || url.matches("(.*)https://www.amazon.in") || url.matches("(.*)https://www.amazon.com(.*)") || url.matches("(.*)https://www.aboutamazon.in(.*)")  ) { ////https://www.amazon.in
			//else if(url.matches("(.*)https://www.amazon(.*)")  || url.matches("(.*)https://www.aboutamazon.in(.*)" ) || url.matches("(.*)https://amazon.jobs(.*)")){	
			else if(url.matches("(.*)https://(.*)")) {
			verifythelink(url);			
			}
			else {
				System.out.println("Before URL "+ url);
				url="https://www.amazon.in"+url;
				System.out.println("Matches URL "+url);
				verifythelink(url);
			}
			
	}

	}
	static void verifythelink(String link) throws IOException {
		try {
		URL u1=new URL(link);
		HttpURLConnection c1= (HttpURLConnection) u1.openConnection(); // upcasting 
		
		if(c1.getResponseCode() ==200) {
			System.out.println("This is Valid link "+c1.getResponseCode() + " "+ link +" "+ c1.getResponseMessage());
			
		}
		else {
			System.out.println("No a Valid link " +c1.getResponseCode() + " "+ link +" "+ c1.getResponseMessage() );
		}
		}
		catch (MalformedURLException e1) {
			System.out.println(" Malformed exception Exception Encountered " +link);
			
			
		}
		catch (ClassCastException e2) {
			System.out.println("Handled Exception 2 ");
		}
		
	}
	
}
