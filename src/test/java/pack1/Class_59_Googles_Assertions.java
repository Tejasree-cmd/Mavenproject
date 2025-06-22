package pack1;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

public class Class_59_Googles_Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Assertion a1=new Assertion();
		a1.assertEquals(driver.getTitle(),"Google");
		
		
	}

}
