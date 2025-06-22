package pack1;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class class_56_dependencytestcase {
	
	@Test(timeOut=100)
	public void LogintoAmzon() {
		WebDriver driver=new EdgeDriver();
		
	}
	@Test(dependsOnMethods= "LogintoAmzon")
	public void testcase5() {
		
	}

}
