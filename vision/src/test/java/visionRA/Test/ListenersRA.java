package visionRA.Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersRA implements ITestListener  {
	public ExtentSparkReporter Report;//-- UI of the Report--//
	public ExtentReports extent;//-- Common Info--//
	public ExtentTest Test;//-- Create entries in report and status--//
	
	 public void onStart(ITestContext context) {
		   System.out.println("Execution of RA_Application started");
		   //-- Report Location--//
		   Report = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\RA_ReportFail.html");
		   //-- Doc Title--//
		   Report.config().setDocumentTitle("VAT_Report_RA");
		   //-- Name of the report--//
		   Report.config().setReportName("RA_Report");
		   Report.config().setTheme(Theme.DARK);
		   extent = new ExtentReports();
		   extent.attachReporter(Report);
		   extent.setSystemInfo("L-6", "Sunoida");
		   extent.setSystemInfo("Testing", "QA");
		   extent.setSystemInfo("Name", "Guru Prasad M");
		   extent.setSystemInfo("Name", "Karthi MJ");
		  }
	 
	public  void onTestStart(ITestResult result) {
		 System.out.println("Execution Test started");
	  }
	
	 public  void onTestSuccess(ITestResult result) {
		 System.out.println("Execution Test Passed");
		 Test = extent.createTest(result.getName());
		 Test.log(Status.PASS, "Passed TestCase_ID   : "+ result.getName());
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
		 System.out.println("Execution of RA_Application Completed");
		 extent.flush();
		  }

}
