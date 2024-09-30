package visionSTUDIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReportSuite {
	WebDriver driver;
	String FilterValue = "KE";

	@Parameters("ApplicationURL")
	@BeforeMethod
	public void setUp(String applicationURL) throws InterruptedException {
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
//	@Test(dataProvider = "loginCredentials", priority = 1)
//	public void REP_DC_004(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Report suite click--//
//		driver.findElement(By.xpath("//p[contains(text(),'Report Suite')]")).click();
//		Thread.sleep(2000);
//		//-- Ra Reports click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		//-- Operational report click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Financial report click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- RA Audit click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 2)
//	public void REP_DC_005(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Report suite click--//
//		driver.findElement(By.xpath("//p[contains(text(),'Report Suite')]")).click();
//		Thread.sleep(2000);
//		//-- Ra Reports click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		//-- Operational report click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(1000);
//		//-- Report click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Leakage Summary (Bank Wise)')]")).click();///-- 3rd feb report--//
//		Thread.sleep(3000);
//		//-- Report suite click--//
//		driver.findElement(By.xpath("//p[contains(text(),'Report Suite')]")).click();
//		Thread.sleep(2000);
//		//-- Report click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Leakage Summary (SBU Wise)')]")).click();///-- 3rd feb report--//
//		Thread.sleep(3000);		
//	}
//	@Test(dataProvider = "loginCredentials", priority = 3)
//	public void REP_DC_006(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Report suite click--//
//		driver.findElement(By.xpath("//p[contains(text(),'Report Suite')]")).click();
//		Thread.sleep(2000);
//		//-- Ra Reports click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		//-- Operational report click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(1000);
//		//-- Report click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Leakage Summary (Bank Wise)')]")).click();///-- 3rd feb report--//
//		Thread.sleep(3000);
//		//-- Advance settings click--//
//		driver.findElement(By.xpath("//span[contains(text(),'settings')]")).click();
//		Thread.sleep(3000);
//		//--Apply grouping click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
//		Thread.sleep(1000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\REP_DC_006.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" REP_DC_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("REP_DC_006 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//	@Test(dataProvider = "loginCredentials", priority = 4)
//	public void REP_DC_007(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Report suite click--//
//		driver.findElement(By.xpath("//p[contains(text(),'Report Suite')]")).click();
//		Thread.sleep(2000);
//		//-- Ra Reports click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		//-- Operational report click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
//		Thread.sleep(1000);
//		//-- Report click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Leakage Summary (Bank Wise)')]")).click();///-- 3rd feb report--//
//		Thread.sleep(3000);
//		//-- Advance settings click--//
//		driver.findElement(By.xpath("//span[contains(text(),'settings')]")).click();
//		Thread.sleep(3000);
//		//-- Filter cilick--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/a[1]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Type click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/form[1]/div[2]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- Type select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Contains / Like')]")).click();
//		//-- Value send keys--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/form[1]/div[2]/div[3]/input[1]")).sendKeys(FilterValue);
//		//-- Submit click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
//		Thread.sleep(5000);
//	}
	@Test(dataProvider = "loginCredentials", priority = 5)
	public void REP_DC_008(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//-- Report suite click--//
		driver.findElement(By.xpath("//p[contains(text(),'Report Suite')]")).click();
		Thread.sleep(2000);
		//-- Ra Reports click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
		//-- Operational report click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
		Thread.sleep(1000);
		//-- Report click--//
		driver.findElement(By.xpath("//span[contains(text(),'Leakage Summary (Bank Wise)')]")).click();///-- 3rd feb report--//
		Thread.sleep(3000);
		//-- Advance settings click--//
		driver.findElement(By.xpath("//span[contains(text(),'settings')]")).click();
		Thread.sleep(3000);
		//-- View all untick--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
		Thread.sleep(1000);
		//-- Check box click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[6]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
		//-- Check box click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[7]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
		//-- Check box click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
		//-- Check box click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
		//-- Filter click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/a[1]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Type click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/form[1]/div[2]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(2000);
		//-- Type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Contains / Like')]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/form[1]/div[2]/div[3]/input[1]")).sendKeys(FilterValue);
		//-- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
	}
	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
