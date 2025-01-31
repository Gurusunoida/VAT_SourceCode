package visionETL.Test.Java17;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.Login;
import Package_PageObject.POM_ETL;
import Package_PageObject.POM_General;

public class ETLProfileSetup extends BaseClass {
	String PROFILE = "Pilot";
	String CONNECTOR = "Connector Config";
	String CONNECTOR_SCRIPT = "Connector Script";
	String CONNECTOR_QUERY = "Connector Query";
	String CATEGORY = "ETL Category";
	String FEED_CONFIGURATION = "ETL Feed Configuration";
	String FilePath = ("D:\\Guru prasad documents\\sel.tz.reconfile.csv");

	private Login LoginPage;

	@BeforeMethod
	public void setUpLogin() {
		LoginPage = new Login(driver);
	}
	
	private POM_ETL Profile;
	@BeforeMethod
	public void ProfileSetup() {
		Profile = new POM_ETL(driver);
	}

	private POM_General ETL_General;

	@BeforeMethod
	public void ETL() {
		ETL_General = new POM_General(driver);
	}

//	@Parameters("ApplicationURL")
//	@BeforeMethod
//	public void BrowserOpening(String applicationURL) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(applicationURL);
//		driver.manage().window().maximize();
//	}
//
//	@AfterMethod
//	public void closeDriver() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}

	@Test(priority = 1, dataProvider = "getUserNameList")
	@TestDescription("User Should be able to do all operations")
	public void ETL_PS_001(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "ProfileSetup";
		String testCaseId = "ETL_PS_001";
		String notes = "User Should be able to do all operations";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(loginName);
		LoginPage.loginPassword(loginPwd);
		LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- ProfileSetup click--//
		Profile.ProfileSetup();
		Thread.sleep(3000);
		// -- User group dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();		//-- COlumn click--//
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_001.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_001 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_001 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		// -- Select All Button in Operation--///
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]"))
//				.click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_001_1.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_001_1 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_001_1 Failed to save screenshot: " + e.getMessage());
//		}

	}
//
//	@Test(priority = 2, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do Add operation")
//	public void ETL_PS_002(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_002";
//		String notes = "User Should not be able to do Add operation";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// -- Add restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_002.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_002 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_002 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --ETL- Admin click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Profile setup select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		// -- Select All Button in Operation--///
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]"))
//				.click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_002_2.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_002_2 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_002_2 Failed to save screenshot: " + e.getMessage());
//		}
//
//	}
//
//	@Test(priority = 3, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do modify operation")
//	public void ETL_PS_003(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_003";
//		String notes = "User Should not be able to do modify operation";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// -- Modify restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_003.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_003 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_003 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		// -- Select All Button in Operation--///
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]"))
//				.click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_003_3.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_003_3 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_003_3 Failed to save screenshot: " + e.getMessage());
//		}
//
//	}
//
//	@Test(priority = 4, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do delete operation")
//	public void ETL_PS_004(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_004";
//		String notes = "User Should not be able to do delete operation";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// -- Delete restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_004.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_004 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_004 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		// -- Select All Button in Operation--///
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]"))
//				.click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_004_4.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_004_4 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_004_4 Failed to save screenshot: " + e.getMessage());
//		}
//
//	}
//
//	@Test(priority = 5, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do download operation")
//	public void ETL_PS_005(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_005";
//		String notes = "User Should not be able to do download operation";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// -- Download restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_005.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_005 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_005 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		// --Success Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]"))
//				.click();
//		Thread.sleep(3000);
//		WebElement elementToHoverLogs = driver.findElement(By.xpath("//span[contains(text(),'Finished')]"));
//		Actions actionsClickLogs = new Actions(driver);
//		actionsClickLogs.moveToElement(elementToHoverLogs).perform();
//		WebElement Logs = driver.findElement(By.xpath("//span[contains(text(),'Finished')]"));
//		Logs.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_005_5.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_005_5 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_005_5 Failed to save screenshot: " + e.getMessage());
//		}
//
//	}
//
//	@Test(priority = 6, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to View record")
//	public void ETL_PS_006(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_006";
//		String notes = "User Should be able to View record";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// -- All Restrict only View --//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_006.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_006 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		// --Success Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Select All __//
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]"))
//				.click();
//		WebElement elementToHoverLogs = driver.findElement(By.xpath("//span[contains(text(),'Finished')]"));
//		Actions actionsClickLogs = new Actions(driver);
//		actionsClickLogs.moveToElement(elementToHoverLogs).perform();
//		WebElement Logs = driver.findElement(By.xpath("//span[contains(text(),'Finished')]"));
//		Logs.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_006_6.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_006_6 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_006_6 Failed to save screenshot: " + e.getMessage());
//		}
//
//	}
//
//	@Test(priority = 7, dataProvider = "getUserNameList")
//	@TestDescription("Screen should not be visible")
//	public void ETL_PS_007(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_007";
//		String notes = "Screen should not be visible";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// --Profile status click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Delete click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		// --Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_007.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_007 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_007 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("001SAR");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_007_7.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_007_7 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_007_7 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//
//	@Test(priority = 8, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to do all operations")
//	public void ETL_PS_008(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_008";
//		String notes = "User Should be able to do all operations";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_008.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_008 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_008 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.Connector();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		// -- Column click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_008_1.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_008_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_008_1 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 9, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do Add operation(Connector)")
//	public void ETL_PS_009(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_009";
//		String notes = "User Should not be able to do Add operation(Connector)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Add restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_009.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_009 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_009 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.Connector();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		// -- Column click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_009_1png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_009_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_009_1 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 10, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do modify operation(Connector)")
//	public void ETL_PS_010(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_010";
//		String notes = "User Should not be able to do modify operation(Connector)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Modify restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_010.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_010 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.Connector();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		// -- Column click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_010_1.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_010_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_010_1 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 11, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do delete operation(Connector)")
//	public void ETL_PS_011(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_011";
//		String notes = "User Should not be able to do delete operation(Connector)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Delete restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_011.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_011 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_011 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.Connector();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		// -- Column click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("App");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_011_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_011_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_011_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 12, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do approve operation(Connector)")
//	public void ETL_PS_012(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_012";
//		String notes = "User Should not be able to do approve operation(Connector)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Verify restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_012.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_012 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_012 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.Connector();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_012_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_012_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_012_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 13, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to View record(Connector)")
//	public void ETL_PS_013(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_013";
//		String notes = "User Should be able to View record(Connector)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Only view --//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_013.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_013 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_013 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.Connector();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_013_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_013_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_013_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 14, dataProvider = "getUserNameList")
//	@TestDescription("Screen should not be visible(Connector)")
//	public void ETL_PS_014(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_014";
//		String notes = "Screen should not be visible(Connector)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// --Profile status click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Delete click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		// --Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_014.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_014 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_014 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("001SAR");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- conector dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_014_Console014.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_014_Console014 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_014_Console014 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//
//	@Test(priority = 15, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to do all operations(Connector_Script)")
//	public void ETL_PS_015(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_015";
//		String notes = "User Should be able to do all operations(Connector_Script)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_015.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_015 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_015 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.ConnectorScript();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_015_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_015_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_015_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 16, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do Add operation(Connector_Script)")
//	public void ETL_PS_016(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_016";
//		String notes = "User Should not be able to do Add operation(Connector_Script)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Add restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_016.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_016 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_016 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Script click--//
//		Profile.ConnectorScript();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_016_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_016_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_016_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 17, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do modify operation(Connector_Script)")
//	public void ETL_PS_017(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_017";
//		String notes = "User Should not be able to do modify operation(Connector_Script)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Modify restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_017.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_017 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_017 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Script click--//
//		Profile.ConnectorScript();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_017_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_017_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_017_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 18, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do delete operation(Connector_Script)")
//	public void ETL_PS_018(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_018";
//		String notes = "User Should not be able to do delete operation(Connector_Script)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Delete restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_018.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_018 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_018 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Script click--//
//		Profile.ConnectorScript();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("App");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_018_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_018_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_018_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 19, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do approve operation(Connector_script)")
//	public void ETL_PS_019(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_019";
//		String notes = "User Should not be able to do approve operation(Connector_script)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Verify restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_019.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_019 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_019 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Sccript click--//
//		Profile.ConnectorScript();
//		Thread.sleep(2000);
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_019_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_019_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_019_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 20, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to View record(Connector_script)")
//	public void ETL_PS_020(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_020";
//		String notes = "User Should be able to View record(Connector_script)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Only View restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_020.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_020 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_020 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.ConnectorScript();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_020_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_020_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_020_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 21, dataProvider = "getUserNameList")
//	@TestDescription("Screen should not be visible(Connector_Script)")
//	public void ETL_PS_021(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_021";
//		String notes = "Screen should not be visible(Connector_Script)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// --Profile status click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Delete click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		// --Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_021.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_021 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_021 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("001SAR");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- conector dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_021_Console021.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_021_Console021 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_021_Console021 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//
//	@Test(priority = 22, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to do all operations(Connector_Query)")
//	public void ETL_PS_022(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_022";
//		String notes = "User Should be able to do all operations(Connector_Script)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_022.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_022 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_022 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.ConnectorQuery();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_022_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_022_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_022_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 23, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do Add operation(Connector _Query)")
//	public void ETL_PS_023(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_023";
//		String notes = "";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Add restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_023.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_023 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_023 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Query click--//
//		Profile.ConnectorQuery();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_023_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_023_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_023_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 24, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do modify operation(Connector_Query)")
//	public void ETL_PS_024(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_024";
//		String notes = "User Should not be able to do modify operation(Connector_Query)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Modify restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_024.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_024 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_024 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Query click--//
//		Profile.ConnectorQuery();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_024_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_024_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_024_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 25, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do delete operation(Connector_Query)")
//	public void ETL_PS_025(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_025";
//		String notes = "User Should not be able to do delete operation(Connector_Query)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Delete restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_025.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_025 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_025 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Query click--//
//		Profile.ConnectorQuery();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("App");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_025_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_025_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_025_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 26, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do approve operation(Connector_Query)")
//	public void ETL_PS_026(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_026";
//		String notes = "User Should not be able to do approve operation(Connector_Query)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Verify restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_026.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_026 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_026 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Query click--//
//		Profile.ConnectorQuery();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_026_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_026_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_026_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 27, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to View record(Connector_Query)")
//	public void ETL_PS_027(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_027";
//		String notes = "User Should be able to View record(Connector_Query)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Only View restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_027.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_027 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_027 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Query click--//
//		Profile.ConnectorQuery();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_027_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_027_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_027_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 28, dataProvider = "getUserNameList")
//	@TestDescription("Screen should not be visible(Connector-Query)")
//	public void ETL_PS_028(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_028";
//		String notes = "Screen should not be visible(Connector-Query)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- COlumn click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// --Profile status click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Delete click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		// --Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_028.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_028 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_028 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("001SAR");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_028_Console028.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_028_Console028 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_028_Console028 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//
//	@Test(priority = 29, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to do all operations(Category)")
//	public void ETL_PS_029(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_029";
//		String notes = "User Should be able to do all operations(Category)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_029.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_029 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_029 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.Category();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_029_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_029_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_029_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 30, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do Add operation(Category)")
//	public void ETL_PS_030(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_030";
//		String notes = "User Should not be able to do Add operation(Category)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Add restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_030.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_030 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_030 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.Category();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_030_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_030_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_030_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 31, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do modify operation(Category)")
//	public void ETL_PS_031(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_031";
//		String notes = "User Should not be able to do modify operation(Category)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Modify restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_031.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_031 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_031 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.Category();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_031_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_031_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_031_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 32, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do delete operation(Category)")
//	public void ETL_PS_032(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_032";
//		String notes = "User Should not be able to do delete operation(Category)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Delete restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_032.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_032 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_032 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.Category();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		// -- Column click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("App");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_032_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_032_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_032_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 33, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do approve operation(Category)")
//	public void ETL_PS_033(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_033";
//		String notes = "User Should not be able to do approve operation(Category)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Verify restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_033.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_033 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_033 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.Category();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_033_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_033_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_033_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 34, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to View record(Category)")
//	public void ETL_PS_034(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_034";
//		String notes = "User Should be able to View record(Category)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Only view restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_034.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_034 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_034 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Profile Setup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.Category();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_034_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_034_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_034_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 35, dataProvider = "getUserNameList")
//	@TestDescription("Screen should not be visible(Category)")
//	public void ETL_PS_035(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_035";
//		String notes = "Screen should not be visible(Category)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// --Profile status click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Delete click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		// --Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_035.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_035 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_035 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("001SAR");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_035_Console0.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_035_Console035 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_035_Console035 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//
//	@Test(priority = 36, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to do all operations(Feed_Configuration)")
//	public void ETL_PS_036(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_036";
//		String notes = "User Should be able to do all operations(Feed_Configuration)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_036.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_036 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_036 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.FeedConfiguration();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Feed1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_036_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_036_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_036_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 37, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do Add operation(Feed_Configuration)")
//	public void ETL_PS_037(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_037";
//		String notes = "User Should not be able to do Add operation(Feed_Configuration)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Add restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_037.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_037 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_037 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(4000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.FeedConfiguration();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_037_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_037_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_037_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 38, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do modify operation(Feed_Configuration)")
//	public void ETL_PS_038(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_038";
//		String notes = "User Should not be able to do modify operation(Feed_Configuration)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Modify restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_038.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_038 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_038 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(4000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.FeedConfiguration();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		// -- Column click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_038_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_038_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_038_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 39, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do delete operation(Feed_Configuration)")
//	public void ETL_PS_039(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_039";
//		String notes = "User Should not be able to do delete operation(Feed_Configuration)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Delete restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_039.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_039 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_039 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(4000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.FeedConfiguration();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("App");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_039_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_039_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_039_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 40, dataProvider = "getUserNameList")
//	@TestDescription("User Should not be able to do approve operation(Feed_Configuration)")
//	public void ETL_PS_040(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_040";
//		String notes = "User Should not be able to do approve operation(Feed_Configuration)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Verify restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_040.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_040 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_040 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(4000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.FeedConfiguration();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_040_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_040_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_040_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 41, dataProvider = "getUserNameList")
//	@TestDescription("User Should be able to View record(Feed_Configuration)")
//	public void ETL_PS_041(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_041";
//		String notes = "User Should be able to View record(Feed_Configuration)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Only View restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_041.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_041 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_041 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(4000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.FeedConfiguration();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_041_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_041_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_041_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 42, dataProvider = "getUserNameList")
//	@TestDescription("Screen should not be visible(Feed_Configuration)")
//	public void ETL_PS_042(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_042";
//		String notes = "Screen should not be visible(Feed_Configuration)";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// --Profile status click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Delete click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		// --Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_042.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_042 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_042 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- CMS Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("MIS");
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("001SAR");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_042_Console042.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_042_Console042 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_042_Console042 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//
//	@Test(priority = 43, dataProvider = "getUserNameList")
//	@TestDescription(" Back to Normal")
//	public void BackToNormal_Profile_setup(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "No Test case ID ( Back to Normal)";
//		String notes = "Back to Normal";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		// --Add click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
//				.click();
//		// --Delete Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
//				.click();
//		// -- Verify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Upload click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Download Click---//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify CLick--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Back Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Value clear--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.clear();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_Config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_Config.click();
//		Thread.sleep(2000);
//		// --Add click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
//				.click();
//		// --Delete Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
//				.click();
//		// -- Verify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Upload click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Download Click---//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify CLick--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Back Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send11 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send11.click();
//		Thread.sleep(2000);
//		Send11.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Value clear--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.clear();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector_Script = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_Script.click();
//		Thread.sleep(2000);
//		// --Add click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
//				.click();
//		// --Delete Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
//				.click();
//		// -- Verify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Upload click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Download Click---//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify CLick--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Back Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send111 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send111.click();
//		Thread.sleep(2000);
//		Send111.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Value clear--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.clear();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM111 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick111 = new Actions(driver);
//		actionsClick111.moveToElement(elementToHoverM111).perform();
//		WebElement Connector_Query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_Query.click();
//		Thread.sleep(2000);
//		// --Add click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
//				.click();
//		// --Delete Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
//				.click();
//		// -- Verify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Upload click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Download Click---//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify CLick--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Back Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1111 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1111.click();
//		Thread.sleep(2000);
//		Send1111.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Value clear--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.clear();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM1111 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1111 = new Actions(driver);
//		actionsClick1111.moveToElement(elementToHoverM1111).perform();
//		WebElement Category = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Category.click();
//		Thread.sleep(2000);
//		// --Add click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
//				.click();
//		// --Delete Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
//				.click();
//		// -- Verify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Upload click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Download Click---//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify CLick--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Back Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send11111 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send11111.click();
//		Thread.sleep(2000);
//		Send11111.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Value clear--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.clear();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM11111 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick11111 = new Actions(driver);
//		actionsClick11111.moveToElement(elementToHoverM11111).perform();
//		WebElement FeedConfig = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		FeedConfig.click();
//		Thread.sleep(2000);
//		// --Add click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
//				.click();
//		// --Delete Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
//				.click();
//		// -- Verify Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Upload click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Download Click---//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify CLick--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		// -- Back Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send111111 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send111111.click();
//		Thread.sleep(2000);
//		Send111111.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Reset Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --ETL- Admin click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Profile setup select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send2 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send2.click();
//		Thread.sleep(2000);
//		Send2.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- Select Box--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/div[1]/input[1]"))
//				.click();
//		// -- Approve Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'done')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 44, dataProvider = "getUserNameList")
//	@TestDescription("User can able to modify dashboard widgets but should not able to edit datas in it	User can able to change the Widgets.")
//	public void ETL_PS_043(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_043";
//		String notes = "User can able to modify dashboard widgets but should not able to edit datas in it	User can able to change the Widgets.";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- User group Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- User profile click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Menu name select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Value send keys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- AplyCLick--/
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement PilotConsole = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		PilotConsole.click();
//		Thread.sleep(5000);
//		// -- Modify Untick--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Modify CLick--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(8000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_043.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_043 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_043 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
////--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
////-- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
////-- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Widget Close--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/i[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'EOD Error/Terminated')]")).click();
//		Thread.sleep(5000);
//		// -- CLose --//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/i[1]"))
//				.click();
//		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Errored Feeds')]")).click();
//		Thread.sleep(2000);
//		// -- Widget menu--//
//		driver.findElement(By.xpath("//i[contains(text(),'more_horiz')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//		Thread.sleep(2000);
//		WebElement Widget = driver.findElement(By.xpath("//div[contains(text(),'Widgets saved Successfully')]"));
//		String WidgetText = Widget.getText();
//		System.out.println(WidgetText);
//		Assert.assertEquals(WidgetText, "Widgets saved Successfully",
//				"Record status does not match 'Widgets saved Successfully'");
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 45, dataProvider = "getUserNameList")
//	@TestDescription("The file upload should get uploaded successful even restriction is applied for Upload in Connector Screen.	User can able to Upload the Static file.")
//	public void ETL_PS_044(String loginName, String loginPwd) throws InterruptedException, AWTException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_044";
//		String notes = "The file upload should get uploaded successful even restriction is applied for Upload in Connector Screen.	User can able to Upload the Static file.";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- User group Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- User profile click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Menu name select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Value send keys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- AplyCLick--/
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement CONNECTOR = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		CONNECTOR.click();
//		Thread.sleep(5000);
//		// -- Uploaduntick--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		Thread.sleep(1000);
//		// -- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(8000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_044.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_044 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_044 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		LoginPage.loginUsername("System");
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
////		// -- FIlter click--//
////		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
////		Thread.sleep(2000);
////		// -- COlumn click--//
////		driver.findElement(By.xpath(
////				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
////				.click();
////		Thread.sleep(2000);
////		// -- COlumn select--//
////		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
////		// -- Value sendkeys--//
////		driver.findElement(By.xpath(
////				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
////				.sendKeys("");
////		// -- Apply click--//
////		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(5000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Connector click--//
//		Profile.Connector();
//		Thread.sleep(5000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// --Semi Structure select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Semi");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(5000);
//		WebElement elementToHoverMC = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Actions actionsClickC = new Actions(driver);
//		actionsClickC.moveToElement(elementToHoverMC).perform();
//		WebElement Connector = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[2]/a[2]/i[1]"));
//		Connector.click();
//		Thread.sleep(2000);
//		// -- Add file click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/i[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Add file upload--//
//		driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/div[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		Robot robot = new Robot();
//
//		robot.delay(1000);
//		StringSelection stringSelection = new StringSelection(FilePath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.delay(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		// -- Delimeter sendkeys--//
//		driver.findElement(
//				By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"))
//				.sendKeys(",");
//		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
//		WebElement Success = driver.findElement(By.xpath("//div[contains(text(),'File Upload Success')]"));
//		String Upload = Success.getText();
//		System.out.println(Upload);
//		Assert.assertEquals(Upload, "File Upload Success", "Record status does not match 'File Upload Success'");
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Save click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 46, dataProvider = "getUserNameList")
//	@TestDescription("User cant able to Verify and Upload in console screen	,Since there is no Opearion for Verify & Upload console screen no changes will takes place")
//	public void ETL_PS_045(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_045";
//		String notes = "User cant able to Verify and Upload in console screen	,Since there is no Opearion for Verify & Upload console screen no changes will takes place";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- User group Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- User profile click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Menu name select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Value send keys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(PROFILE);
//		// -- AplyCLick--/
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement PilotConsole = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		PilotConsole.click();
//		Thread.sleep(5000);
//		// --verify Untick--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		Thread.sleep(1000);
//		// -- Upload untick--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(8000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Profile_setup1.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(2000);
//		// -- Session ID CLick--//
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_045.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_045 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_045 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//
//	@Test(priority = 47, dataProvider = "getUserNameList")
//	@TestDescription("User cant able to Upload &  Download in connector script  screen	,Since there is no Opearion for Upload & Download connector script  screen no changes will takes place")
//	public void ETL_PS_047(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_047";
//		String notes = "User cant able to Upload &  Download in connector script  screen	,Since there is no Opearion for Upload & Download connector script  screen no changes will takes place";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_SCRIPT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(4000);
//		// -- Upload Untick--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// --Download untick--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(4000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_047.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_047 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_047 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(4000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector click--//
//		Profile.ConnectorScript();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		// -- Column click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/a[2]/i[1]"));
//		Connector1.click();
//		Thread.sleep(5000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_047_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_047 Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_047 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 48, dataProvider = "getUserNameList")
//	@TestDescription("User cant able to Upload &  Download in connector query  screen	Since there is no Opearion for Upload & Download connector query  screen no changes will takes place")
//	public void ETL_PS_048(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_048";
//		String notes = "User cant able to Upload &  Download in connector query  screen	Since there is no Opearion for Upload & Download connector query  screen no changes will takes place";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR_QUERY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Upload & Download restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_048.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_048 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_048 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(3000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Pilot console click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Connector Query click--//
//		Profile.ConnectorQuery();
//		Thread.sleep(2000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_048_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_048_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_048_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 49, dataProvider = "getUserNameList")
//	@TestDescription("User cant able to Upload &  Download in category  screen	,Since there is no Opearion for Upload & Download category  screen no changes will takes place")
//	public void ETL_PS_049(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_049";
//		String notes = "User cant able to Upload &  Download in category  screen	,Since there is no Opearion for Upload & Download category  screen no changes will takes place";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		// -- Upload & Download restriction--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_049.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_049 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_049 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.Category();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Connector1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_049_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_049_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_049_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 50, dataProvider = "getUserNameList")
//	@TestDescription("User cant able to Upload &  Download in Feed configuration	,Since there is no Opearion for Upload & Download feed configuration  screen no changes will takes place")
//	public void ETL_PS_050(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_050";
//		String notes = "User cant able to Upload &  Download in Feed configuration	,Since there is no Opearion for Upload & Download feed configuration  screen no changes will takes place";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(FEED_CONFIGURATION);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Upload & Download restrict--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
//				.click();
//		// -- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_050.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_050 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_050 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(4000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Profile Setup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send1 = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_query1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(6000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		Profile.FeedConfiguration();
//		Thread.sleep(3000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		// -- Value sendkeys---//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Add");
//		// -- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_050_Console.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_050_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_050_Console Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 51, dataProvider = "getUserNameList")
//	@TestDescription("1.User should able to share when modify is enabled Shared Connector/Category shoule have only read access for that particular user	Share function process successfully with read access.")
//	public void ETL_PS_051(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_051";
//		String notes = "1.User should able to share when modify is enabled 2. Shared Connector/Category shoule have only read access for that particular user	Share function process successfully with read access.";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CONNECTOR);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_051P.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_051P Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_051P Failed to save screenshot: " + e.getMessage());
//		}
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ETL COnnector click--//
//		Profile.Connector();
//		Thread.sleep(5000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// --- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
//		// -- Value send keys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("SEMI_KCB");
//		// -- Apply click-//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'Semi Structured Data')]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector = driver.findElement(By.xpath("//i[contains(text(),'share')]"));
//		Connector.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_051.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_051 Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_051 Failed to save screenshot: " + e.getMessage());
//		}
//		Thread.sleep(5000);
//		// -- Cancel click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
//		Thread.sleep(3000);
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("001SAR");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- ETL COnnector click--//
//		Profile.Connector();
//		Thread.sleep(5000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// --- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
//		// -- Value send keys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("SEMI_KCB");
//		// -- Apply click-//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement DataProfiler = driver.findElement(By.xpath("//span[contains(text(),'SEMI_KCB')]"));
//		String proftext = DataProfiler.getText();
//		System.out.println(proftext);
//		Assert.assertEquals(proftext, "SEMI_KCB", "Record status does not match 'SEMI_KCB'");
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 52, dataProvider = "getUserNameList")
//	@TestDescription("1.User should able to share when modify is enabled 2. Shared Connector/Category shoule have only write access for that particular user.	Share function process successfully with write access.")
//	public void ETL_PS_052(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "ProfileSetup";
//		String testCaseId = "ETL_PS_052";
//		String notes = "1.User should able to share when modify is enabled 2. Shared Connector/Category shoule have only write access for that particular user.	Share function process successfully with write access.";
//		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
//		LoginPage.loginUsername(loginName);
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- ProfileSetup click--//
//		Profile.ProfileSetup();
//		Thread.sleep(3000);
//		// -- User group dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		// --User profile click--//
//		WebElement Send = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		// --User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- FIlter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// -- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// --Criteria CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(CATEGORY);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_052P.png";
//		// -- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_052P Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_052P Failed to save screenshot: " + e.getMessage());
//		}
//		// --User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Category click--//
//		Profile.Category();
//		Thread.sleep(5000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// - Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
//		// -- Criteria click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value send keys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("VAT_CATEGORY_1");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'VAT_CATEGORY_1')]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement CategoryShare = driver.findElement(By.xpath("//i[contains(text(),'share')]"));
//		CategoryShare.click();
//		Thread.sleep(3000);
//		// -- Folder click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-share[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_PS_052.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_052 Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_052 Failed to save screenshot: " + e.getMessage());
//		}
//		// -- CLose--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-share[1]/div[1]/a[1]/i[1]")).click();
//		Thread.sleep(2000);
//		// -- User profile click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		// -- Logout click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
//				.click();
//		Thread.sleep(4000);
//		LoginPage.loginUsername("001SAR");
//		LoginPage.loginPassword(loginPwd);
//		LoginPage.LoginClick();
//		Thread.sleep(5000);
//		// -- Category click--//
//		Profile.Category();
//		Thread.sleep(5000);
//		// -- Filter click--//
//		ETL_General.FILTER();
//		Thread.sleep(2000);
//		ETL_General.FilterColumnclick();
//		Thread.sleep(2000);
//		// - Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
//		// -- Criteria click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value send keys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("VAT_CATEGORY_1");
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement Share = driver.findElement(By.xpath("//span[contains(text(),'VAT_CATEGORY_1')]"));
//		String ShareText = Share.getText();
//		System.out.println(ShareText);
//		Assert.assertEquals(ShareText, "VAT_CATEGORY_1", "Record Name does not match 'VAT_CATEGORY_1'");
//	}

	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		return new Object[][] { { "RA", "Vision@123" }, };
	}
}
