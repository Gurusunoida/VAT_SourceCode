package visionETL.Test;

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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Base64;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//
//public class New_class implements ITestListener {
//
//    private static final String REPORTS_PATH = System.getProperty("user.dir") + "\\Reports\\Dummy.html";
//    private static final String SCREENSHOTS_DIR = System.getProperty("user.dir") + "\\Screenshots\\";
//
//    private ExtentSparkReporter reporter;
//    private ExtentReports extent;
//    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
//    private Map<String, ExtentTest> classNodes = new HashMap<>();
//    private Map<String, Integer> totalTestCase = new HashMap<>();
//    private Map<String, Integer> passedTestCase = new HashMap<>();
//    private Map<String, Integer> failedTestCase = new HashMap<>();
//    private Map<String, Integer> ignoredTestCase = new HashMap<>();
//    private Map<String, Boolean> classTotal = new HashMap<>();
//
//    @Override
//    public void onStart(ITestContext context) {
//        System.out.println("Execution of ETL_Application started");
//        reporter = new ExtentSparkReporter(REPORTS_PATH);
//
//        //-- Update our custom CSS file --//
//        try {
//            String Customcss = readCSSFile("src/main/resources/static/assets/custom.css");
//            reporter.config().setCss(Customcss);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        
//        reporter.config().setDocumentTitle("VAT_Report_ETL");
//        reporter.config().setReportName("ETL_Report");
//        extent = new ExtentReports();
//        extent.attachReporter(reporter);
//        extent.setSystemInfo("Testing", "QA");
//    }
//
//    private String readCSSFile(String filePath) throws IOException {
//        Path path = Paths.get(filePath);
//        return new String(Files.readAllBytes(path));
//    }
//
//    @Override
//    public void onTestStart(ITestResult result) {
//        System.out.println("Execution Test started: " + result.getMethod().getMethodName());
//        String className = result.getTestClass().getName();
//        totalTestCase.put(className, totalTestCase.getOrDefault(className, 0) + 1);
//        passedTestCase.putIfAbsent(className, 0);
//        failedTestCase.putIfAbsent(className, 0);
//        ignoredTestCase.putIfAbsent(className, 0);
//        classTotal.putIfAbsent(className, false);
//
//        String methodName = result.getMethod().getMethodName();
//        Method method = getMethod(result);
//        String description = getMethodDescription(method);
//        String fullTestName = methodName + " - " + description;
//        ExtentTest classTest = classNodes.computeIfAbsent(className, k -> extent.createTest(className));
//        ExtentTest methodTest = classTest.createNode(fullTestName);
//        test.set(methodTest);
//        test.get().info("<b>Description:</b> " + description);
//    }
//
//    private Method getMethod(ITestResult result) {
//        try {
//            return result.getMethod().getConstructorOrMethod().getMethod();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    private String getMethodDescription(Method method) {
//        if (method == null) {
//            return "No description provided";
//        }
//        TestDescription annotation = method.getAnnotation(TestDescription.class);
//        if (annotation != null) {
//            return annotation.value();
//        }
//        return "No description provided";
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        System.out.println("Execution Test Passed: " + result.getMethod().getMethodName());
//        ExtentTest currentTest = test.get();
//        if (currentTest != null) {
//            currentTest.log(Status.PASS, "Test Passed");
//        }
//        String className = result.getTestClass().getName();
//        passedTestCase.put(className, passedTestCase.get(className) + 1);
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        System.out.println("Execution Test Failed: " + result.getMethod().getMethodName());
//        ExtentTest currentTest = test.get();
//        if (currentTest != null) {
//            currentTest.log(Status.FAIL, "Failed TestCase_ID " + result.getName());
//            currentTest.log(Status.FAIL, "Exception: " + result.getThrowable());
//            try {
//                attachScreenshotIfAvailable(result);
//            } catch (IOException e) {
//                currentTest.log(Status.FAIL, "Failed to capture screenshot: " + e.getMessage());
//            }
//        }
//        String className = result.getTestClass().getName();
//        failedTestCase.put(className, failedTestCase.get(className) + 1);
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        System.out.println("Execution Test Skipped: " + result.getMethod().getMethodName());
//        ExtentTest currentTest = test.get();
//        if (currentTest != null) {
//            currentTest.log(Status.SKIP, "Skipped TestCase_ID " + result.getName());
//        }
//        String className = result.getTestClass().getName();
//        ignoredTestCase.put(className, ignoredTestCase.getOrDefault(className, 0) + 1);
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        System.out.println("Execution of ETL_Application Completed");
//        // Log the counts to the extent report
//        for (String className : totalTestCase.keySet()) {
//            if (!classTotal.get(className)) {
//                int total = totalTestCase.get(className);
//                int passed = passedTestCase.get(className);
//                int failed = failedTestCase.get(className);
//                int ignored = ignoredTestCase.get(className);
//                
//                ExtentTest classTest = classNodes.get(className);
//                if (classTest != null) {
//                    classTest.info(String.format("Total Tests: %d", total));
//                    classTest.info(String.format("Passed Tests: %d", passed));
//                    classTest.info(String.format("Failed Tests: %d", failed));
//                    classTest.info(String.format("Ignored/Skipped Tests: %d", ignored));
//                }
//                classTotal.put(className, true);
//            }
//        }
//        extent.flush();
//    }
//
//    public static void reportTestDetails1(String screenName, String testCaseId, String notes) {
//        ExtentTest currentTest = test.get();
//        if (currentTest != null) {
//            currentTest.info("<b>Screen Name:</b> " + screenName);
//            currentTest.info("<b>Test Case ID:</b> " + testCaseId);
//            currentTest.info("<b>Description:</b> " + notes);
//        }
//    }
//
//    private void attachScreenshotIfAvailable(ITestResult result) throws IOException {
//        WebDriver driver = null;
//        Object testInstance = result.getInstance();
//        if (testInstance instanceof BaseClass) {
//            driver = ((BaseClass) testInstance).getDriver();
//        }
//
//        if (driver != null) {
//            String screenshotPath = captureScreenshot(driver, result.getMethod().getMethodName());
//            if (screenshotPath != null) {
//                // Convert to base64 and embed
//                String base64Image = encodeImageToBase64(screenshotPath);
//                String base64String = "data:image/png;base64," + base64Image;
//                ExtentTest currentTest = test.get();
//                if (currentTest != null) {
//                    currentTest.info("Screenshot", MediaEntityBuilder.createScreenCaptureFromBase64String(base64String).build());
//                }
//            }
//        }
//    }
//
//    private String encodeImageToBase64(String imagePath) throws IOException {
//        File imageFile = new File(imagePath);
//        FileInputStream fileInputStream = new FileInputStream(imageFile);
//        byte[] imageBytes = new byte[(int) imageFile.length()];
//        fileInputStream.read(imageBytes);
//        fileInputStream.close();
//        return Base64.getEncoder().encodeToString(imageBytes);
//    }
//
//    private String captureScreenshot(WebDriver driver, String screenshotName) {
//        String uniqueScreenshotName = screenshotName + "_" + UUID.randomUUID().toString() + ".png";
//        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File destinationFile = new File(SCREENSHOTS_DIR + File.separator + uniqueScreenshotName);
//        try {
//            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//            return destinationFile.getPath(); // Return relative path
//        } catch (IOException e) {
//            System.err.println("Failed to save screenshot: " + e.getMessage());
//            return null;
//        }
//    }
//}

