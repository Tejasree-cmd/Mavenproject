package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class_57_FacebookLogin_excel {
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
	public Object[][] data1() throws EncryptedDocumentException, IOException{
		Object [][] d1=new Object[5][2];
		FileInputStream f1=new FileInputStream("C:\\Users\\sai\\MKT-Java-Training\\practiceJava\\Excel-Sheet\\Teja-exccel.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un1=w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
		d1[i][j]=w1.getSheet("Login").getRow(i).getCell(j).getStringCellValue();
			}
		}
	
		return d1;
	
	}
		
}

