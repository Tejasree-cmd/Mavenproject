package Pack2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Class_61_retrylogic implements IRetryAnalyzer {
	int retrycount=2;
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


