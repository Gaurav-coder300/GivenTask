package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import browser.Initialization;
import seleniumUtil.SeleniumUtil;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase"+ result.getName()+"has been started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase"+ result.getName()+"has been Passed");
		SeleniumUtil.capturescreen(Initialization.driver,result.getName(),"SUCCESS");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the testcase failed is :"+result.getName());
		SeleniumUtil.capturescreen(Initialization.driver,result.getName(),"FAILURE");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	

}
