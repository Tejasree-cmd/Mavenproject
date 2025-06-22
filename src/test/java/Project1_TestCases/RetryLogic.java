package Project1_TestCases;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;




public class RetryLogic implements IRetryAnalyzer  {
	int retrycount=0;
	int initialcount=0;
	@Override
	public boolean retry(ITestResult  result)
	{
	if(initialcount<retrycount){
	initialcount++;
	return true; // go and retry
	}

	return false; // dont retry

	}

}
