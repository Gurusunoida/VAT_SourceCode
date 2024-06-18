package visionDQ.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DQProfiler {
	WebDriver driver;
	String Alpha = "ABC<>";
	ExtentReports report_extent;
	@Parameters("ApplicationURL")
	@BeforeMethod
	public void BrowserOpening(String applicationURL) throws InterruptedException {
		//-- File creation
				String File = System.getProperty("user.dir")+"\\Reports\\index.html";
				ExtentSparkReporter Report = new ExtentSparkReporter(File);
				//-- Configuration of report
				Report.config().setReportName("DQ_Test_report");
				Report.config().setDocumentTitle("DQ_Tilte");
				//-- Attaching details 
				report_extent = new ExtentReports();
				report_extent.attachReporter(Report);
				report_extent.setSystemInfo("Tested", "QA");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeDriver() {
		if (driver != null) {
			driver.quit();
		}

	}
	@Test(priority = 1, dataProvider = "getUserNameList")
	public void DQ_DP_001 (String loginName, String loginPwd) throws InterruptedException {
		ExtentTest eTest = report_extent.createTest("Test profiler");
		eTest.info("DQ_DP_001");
		//--Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		//--Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		//--Login Click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//-- Project select--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		//-- Edit click--//
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(2000);
		//-- Next Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		//-- COlumn name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- All Statistics select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).click();
		//-- COlumn name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		eTest.info("Success");
	}
	@Test(priority = 2, dataProvider = "getUserNameList")
	public void DQ_DP_002 (String loginName, String loginPwd) throws InterruptedException {
		ExtentTest eTest = report_extent.createTest("Test profiler");
		eTest.info("DQ_DP_002");
		//--Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		//--Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		//--Login Click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//-- Project select--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		//-- Edit click--//
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(2000);
		//-- Next Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		//-- COlumn name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- COlumn name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Length click--//
		driver.findElement(By.xpath("//span[contains(text(),'Length')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 3, dataProvider = "getUserNameList")
	public void DQ_DP_003 (String loginName, String loginPwd) throws InterruptedException {
		ExtentTest eTest = report_extent.createTest("Test profiler");
		eTest.info("DQ_DP_003");
		//--Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		//--Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		//--Login Click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//-- Project select--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		//-- Edit click--//
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(2000);
		//-- Next Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		//-- COlumn name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		//---All statistics select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).click();
		//-- Clear Button---//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[3]/div[1]/div[1]/button[2]")).click();
		//-- Yes Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 4, dataProvider = "getUserNameList")
	public void DQ_DP_004 (String loginName, String loginPwd) throws InterruptedException {
		//--Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		//--Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		//--Login Click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//-- Project select--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		//-- Edit click--//
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(2000);
		//-- Next Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		//-- Custom analysis Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Custom Analysis')]")).click();
		//-- COlumn name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Alpha click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		 //--- Alpha sendkeys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys(Alpha);
		WebElement DataProfiler=driver.findElement(By.xpath("//div[contains(text(),'* Alphabets only allowed')]"));
		String Alphatext = DataProfiler.getText();
		System.out.println(Alphatext);
		//-- Take screenshot and save it to a file--//
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\DQ_DP_004.png";
        //-- save the screenshot --//
        File destinationFile = new File(Location);
        // Move the screenshot file to the specified destination
        try {
            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
            System.out.println(" DQ_DP_004 Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("DQ_DP_004 Failed to save screenshot: " + e.getMessage());
        }	
	}
	@Test(priority = 5, dataProvider = "getUserNameList")
	public void DQ_DP_005 (String loginName, String loginPwd) throws InterruptedException {
		//--Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		//--Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		//--Login Click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//-- Project select--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		//-- Edit click--//
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(2000);
		//-- Next Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		//-- COlumn name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		//---All statistics select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).click();
		//--Back button--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/a[1]/i[1]")).click();
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\DQ_DP_005.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" DQ_DP_005 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("DQ_DP_005 Failed to save screenshot: " + e.getMessage());
		}	
	}
	@Test(priority = 6, dataProvider = "getUserNameList")
	public void DQ_DP_007 (String loginName, String loginPwd) throws InterruptedException {
		//--Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		//--Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		//--Login Click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//-- Project select--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		//-- Edit click--//
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(2000);
		//-- Next Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		//-- Custom analysis Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Custom Analysis')]")).click();
		//-- COlumn name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Alpha click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		//-- Filter click--//
		driver.findElement(By.xpath("//span[contains(text(),'Filter')]")).click();
		Thread.sleep(3000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\DQ_DP_007.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" DQ_DP_007 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("DQ_DP_007 Failed to save screenshot: " + e.getMessage());
		}	
		
	}
	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];
		loginDetails[0][0] = "bb.satyaprakash";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}

}
