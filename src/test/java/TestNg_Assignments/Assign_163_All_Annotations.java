package TestNg_Assignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assign_163_All_Annotations {
	@BeforeSuite
	public void BS(){
	System.out.println("BS");
	}
	@AfterSuite
	public void AS(){
		System.out.println("AS");
	}

	@BeforeTest
	public void BT(){
		System.out.println("BT");
	}

	@AfterTest
	public void AT(){
	
	System.out.println("AT");
	}

	@BeforeClass
	public void BC(){
		System.out.println("BC");
	}

	@AfterClass
	public void AC(){
		System.out.println("AC");
	}

	@BeforeMethod
	public void BM(){
		System.out.println("BM");
	}


	@AfterMethod
	public void AM(){
		System.out.println("AM");
	}
	@Test
	public void Testmethod1(){
		System.out.println("Test Method1");
	}
	
	@Test
	public void Testmethod2(){
		System.out.println("Test Method2");
	}
	
	}



