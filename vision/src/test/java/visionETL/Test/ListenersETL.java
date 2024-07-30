package visionETL.Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersETL implements ITestListener  {
	public ExtentSparkReporter Report;//-- UI of the Report--//
	public ExtentReports extent;//-- Common Info--//
	public ExtentTest Test;//-- Create entries in report and status--//
	 private ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	    private ThreadLocal<ExtentTest> classNode = new ThreadLocal<>();
	
	 public void onStart(ITestContext context) {
		   System.out.println("Execution of ETL_Application started");
		   //-- Report Location--//
		   Report = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\ETL_Category.html");
		   //-- Doc Title--//
		   Report.config().setDocumentTitle("VAT_Report_ETL");
		   //-- Name of the report--//
		   Report.config().setReportName("ETL_Report");
		   Report.config().setTheme(Theme.DARK);
		   extent = new ExtentReports();
		   extent.attachReporter(Report);
//		   extent.setSystemInfo("L-6", "Sunoida");
//		   extent.setSystemInfo("Testing", "QA");
//		   extent.setSystemInfo("Name", "Guru Prasad M");
//		   extent.setSystemInfo("Name", "Karthi MJ");
		  }
	 
	public  void onTestStart(ITestResult result) {
		 String className = result.getTestClass().getName();
	        if (classNode.get() == null || !classNode.get().getModel().getName().equals(className)) {
	            ExtentTest classTest = extent.createTest(className);
	            classNode.set(classTest);
	        }
	        ExtentTest methodTest = classNode.get().createNode(result.getMethod().getMethodName());
	        test.set(methodTest);
		 System.out.println("Execution Test started");
	  }
	
	 public  void onTestSuccess(ITestResult result) {
		 System.out.println("Execution Test Passed");
		 Test = extent.createTest(result.getName());
		 Test.log(Status.PASS, "Passed TestCase_ID : "+ result.getName());
		  }
	 
	 
	 public  void onTestFailure(ITestResult result) {
		 System.out.println("Execution Test Failed");
		 Test = extent.createTest(result.getName());
		 Test.log(Status.FAIL, "Failed TestCase_ID "+ result.getName());
		 Test.log(Status.FAIL, "Failed TestCase_ID "+ result.getThrowable());
		 
		 
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		 Test = extent.createTest(result.getName());
		 System.out.println("Execution Test Skipped");
		 Test.log(Status.SKIP, "Skipped TestCase_ID "+ result.getName());
	 }
	 
	 public void onFinish(ITestContext context) {
		 System.out.println("Execution of ETL_Application Completed");
		 extent.flush();
		  }

	
}
