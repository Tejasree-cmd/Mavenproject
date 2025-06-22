package pack1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Class_81_reporter_generator {
	public static ExtentReports extent;
    public static ExtentTest test;
    public static void startReport()
 {
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Tejasree");
    }
    public static void flushReport() {
        extent.flush();
    }

}
