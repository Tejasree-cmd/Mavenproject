package Project1_TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners_Project1 implements ITestListener {
	//public WebDriver driver = BaseClass.driver;
	 public static WebDriver driver;
	    Date d1=new Date();
	    String fs=d1.toString()	;
		
		String date=fs.substring(8,10);
		String mon=fs.substring(4,7);
		String year=fs.substring(fs.length()-4); // full length -last 4 --> will print last 4 disgits while using substring
		String hour=fs.substring(11,13);
		String min=fs.substring(14,16);
		String sec=fs.substring(17,19);
		String f1=date.concat(mon).concat(year).concat(hour).concat(min).concat(sec);
		
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("This is Start of method     "+f1);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(f1);
		
		//WebDriver driver = BaseClass.driver;
		if (driver != null) {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String className = result.getTestClass().getRealClass().getSimpleName();
		    String methodName = result.getMethod().getMethodName();
			File destination = new File("C:\\Users\\sai\\MKT-Java-Training\\practiceJava\\Screenshots\\PASS\\amz" 
		
			                            +f1 + className + methodName + ".png");
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Driver is null in onTestSuccess");
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
	//	WebDriver driver = BaseClass.driver;
		System.out.println(f1);

		if (driver != null) {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String className = result.getTestClass().getRealClass().getSimpleName();
			String methodName = result.getMethod().getMethodName();
			File destination = new File("C:\\Users\\sai\\MKT-Java-Training\\practiceJava\\Screenshots\\FAIL\\" 
			                            +f1+ className + methodName + ".png");
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Driver is null in onTestFailure");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("This is on Finish of method     "+f1);
	}
}
