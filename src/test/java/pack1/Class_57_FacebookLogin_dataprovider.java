package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class_57_FacebookLogin_dataprovider {
    @Test(dataProvider="data1")
	public void login(String username,String pass) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("email"));
		e1.sendKeys(username);
		WebElement e2=driver.findElement(By.id("pass"));
		e2.sendKeys(pass);
		Thread.sleep(1000);
		WebElement e3=driver.findElement(By.name("login"));
		e3.click();
		Thread.sleep(1000);
		

	}
	@DataProvider
	public Object[][] data1(){
		Object [][] d1=new Object[5][2];
		d1[0][0]="test";
		d1[0][1]="123456";
		d1[1][0]="t.l.tejasree@gmail.com";
		d1[1][1]="teja@0601";
		d1[2][0]="test";
		d1[2][1]="123456";
		d1[3][0]="test";
		d1[3][1]="123456";
		d1[4][0]="test";
		d1[4][1]="123456";
		return d1;
	
	}
		
}

