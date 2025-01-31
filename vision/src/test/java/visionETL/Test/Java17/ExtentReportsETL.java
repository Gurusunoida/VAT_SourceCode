package visionETL.Test.Java17;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsETL implements ITestNGListener {
		public ExtentSparkReporter Report;//-- UI of the Report--//
		public ExtentReports extent;//-- Common Info--//
		public ExtentTest Test;//-- Create entries in report and status--//
		
		public void onStart(ITestContext context) {
			   System.out.println("Execution of Connector started");
			   //-- Report Location--//
			   Report = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\Connector1.html");
			   //-- Doc Title--//
			   Report.config().setDocumentTitle("VAT_Report_ETL");
			   //-- Name of the report--//
			   Report.config().setReportName("ETL_Report");
			   Report.config().setTheme(Theme.DARK);
			   extent = new ExtentReports();
			   extent.attachReporter(Report);
			   extent.setSystemInfo("L-6", "Sunoida");
			   extent.setSystemInfo("Testing", "QA");
			   extent.setSystemInfo("Name", "Guru Prasad M");
			  }
		 public  void onTestSuccess(ITestResult result) {
			 System.out.println("Execution Test Passed");
			 Test = extent.createTest(result.getName());
			 Test.log(Status.PASS, "Passed is : "+ result.getName());
			 
			  }
		 
		 public  void onTestFailure(ITestResult result) {
			 System.out.println("Execution Test Failed");
			 Test = extent.createTest(result.getName());
			 Test.log(Status.FAIL, "Failed is "+ result.getName());
			 Test.log(Status.FAIL, "Failed is "+ result.getThrowable());
			  }
		 
		 public void onTestSkipped(ITestResult result) {
			 Test = extent.createTest(result.getName());
			 System.out.println("Execution Test Skipped");
			 Test.log(Status.SKIP, "Skipped is "+ result.getName());
		 }
		 
		 public void onFinish(ITestContext context) {
			 System.out.println("Execution of Connector Completed");
			 extent.flush();
			  }
		
}
