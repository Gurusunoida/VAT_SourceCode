package visionETL.Test.Java17;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Listeners1 implements ITestListener {
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private ThreadLocal<ExtentTest> classNode = new ThreadLocal<>();
    private Map<String, ExtentTest> classNodes = new HashMap<>();
    private Map<String, Boolean> classStatus = new HashMap<>();
    private ExtentSparkReporter report;
    private ExtentReports extent;

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Execution of ETL_Application started");
        report = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\ETL_Connector & Category1.html");
        report.config().setDocumentTitle("VAT_Report_ETL");
        report.config().setReportName("ETL_Report");
        report.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(report);
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Execution Test started");
        String className = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();

        if (!classNodes.containsKey(className)) {
            ExtentTest classTest = extent.createTest(className);
            classNodes.put(className, classTest);
            classStatus.put(className, true); // Initialize as true (no failure yet)
            classNode.set(classTest);
        } else {
            classNode.set(classNodes.get(className));
        }
        ExtentTest methodTest = classNode.get().createNode(methodName);
        test.set(methodTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Execution Test Passed");
        test.get().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Execution Test Failed");
        String className = result.getTestClass().getName();
        classStatus.put(className, false);
        ExtentTest currentTest = test.get();
        if (currentTest != null) {
            currentTest.log(Status.FAIL, "Failed TestCase_ID " + result.getThrowable());
            try {
                attachScreenshotIfAvailable(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Execution Test Skipped");
        if (test.get() != null) {
            test.get().log(Status.SKIP, "Skipped TestCase_ID " + result.getName());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Execution of ETL_Application Completed");
        extent.flush();
    }

    private void attachScreenshotIfAvailable(ITestResult result) throws IOException {
        WebDriver driver = null;
        Object testInstance = result.getInstance();
        if (testInstance instanceof BaseClass) {
            driver = ((BaseClass) testInstance).getDriver();
        }
        
        if (driver != null) {
            String screenshotPath = captureScreenshot(driver, result.getMethod().getMethodName());
            if (screenshotPath != null) {
                ExtentTest currentTest = test.get();
                if (currentTest != null) {
                    currentTest.info("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
                }
            }
        }
    }

    private String captureScreenshot(WebDriver driver, String screenshotName) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String location = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + ".png";
        File destinationFile = new File(location);
        try {
            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
            System.out.println(screenshotName + " Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println(screenshotName + " Failed to save screenshot: " + e.getMessage());
        }
        return location;
    }
}
