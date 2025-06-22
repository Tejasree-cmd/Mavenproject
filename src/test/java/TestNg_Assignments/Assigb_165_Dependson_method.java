package TestNg_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assigb_165_Dependson_method {
	
	@Test(timeOut=100)
	public void LogintoAmzon() {
		WebDriver driver=new EdgeDriver();
		
	}
	@Test(dependsOnMethods= "LogintoAmzon")
	public void LogintoAmzon2() {
		System.out.println("Test Case Executed :( ");
		
	}

}
