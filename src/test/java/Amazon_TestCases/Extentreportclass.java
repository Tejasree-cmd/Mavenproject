package Amazon_TestCases;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Extentreportclass {
	public static ExtentReports extent;
    public static ExtentTest test;
    public static void startReport()
 {
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReporttest.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Tejasree");
    }
    public static void flushReport() {
        extent.flush();
    }


}



