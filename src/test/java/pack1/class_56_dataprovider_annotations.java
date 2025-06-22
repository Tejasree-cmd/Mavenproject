package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class class_56_dataprovider_annotations {
	
	@Test(dataProvider="data1")
	public void login(String input) {
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(input+Keys.ENTER);
		
		//e1.sendKeys(Keys.ENTER);
		
	}
	
	@DataProvider
	public Object[][] data1(){
		Object [][] d1=new Object[10][1];
		d1[0][0]="Shoe";
		d1[1][0]="mouse";
		d1[2][0]="mobile";
		d1[3][0]="tshirt";
		d1[4][0]="pendriver";
		d1[5][0]="toys";
		d1[6][0]="kurtis";
		d1[7][0]="tomato";
		d1[8][0]="stickers";
		d1[9][0]="hairpins";
		return d1;
		
	}
}
