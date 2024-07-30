package visionETL.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ETL_ProfileSetup {
	WebDriver driver;
	String PROFILE = "Pilot";
	String CONNECTOR = "Connector Config";
	String CONNECTOR_SCRIPT = "Connector Script";
	String CONNECTOR_QUERY = "Connector Query";
	String CATEGORY = "ETL Category";
	String FEED_CONFIGURATION = "ETL Feed Configuration";

	@Parameters("ApplicationURL")
	@BeforeMethod
	public void BrowserOpening(String applicationURL) throws InterruptedException {
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

//	@Test(priority = 1, dataProvider = "getUserNameList")
//	public void ETL_PS_001(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(PROFILE);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_001.png";
//				//-- save the screenshot --//
//				File destinationFile = new File(Location);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//					System.out.println(" ETL_PS_001 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_001 Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		//-- Select All Button in Operation--///
//		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]")).click();
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_001_Console001.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_001_Console001 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_001_Console001 Failed to save screenshot: " + e.getMessage());
//				}	
//		
//	}
//	@Test(priority = 2, dataProvider = "getUserNameList")
//	public void ETL_PS_002(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(PROFILE);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		//-- Add restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_002.png";
//				//-- save the screenshot --//
//				File destinationFile = new File(Location);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//					System.out.println(" ETL_PS_002 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_002 Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(5000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- COlumn click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				//-- Value sendkeys--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("");
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		//-- Select All Button in Operation--///
//		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]")).click();
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_002_Console002.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_002_Console002 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_002_Console002 Failed to save screenshot: " + e.getMessage());
//				}	
//		
//	}
//	@Test(priority = 3, dataProvider = "getUserNameList")
//	public void ETL_PS_003(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(PROFILE);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		//-- Modify restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_003.png";
//				//-- save the screenshot --//
//				File destinationFile = new File(Location);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//					System.out.println(" ETL_PS_003 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_003 Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(5000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- COlumn click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				//-- Value sendkeys--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("");
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		//-- Select All Button in Operation--///
//		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]")).click();
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_003_Console003.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_003_Console003 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_003_Console003 Failed to save screenshot: " + e.getMessage());
//				}	
//		
//	}
//	@Test(priority = 4, dataProvider = "getUserNameList")
//	public void ETL_PS_004(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(PROFILE);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		//-- Delete restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_004.png";
//				//-- save the screenshot --//
//				File destinationFile = new File(Location);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//					System.out.println(" ETL_PS_004 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_004 Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(5000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- COlumn click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				//-- Value sendkeys--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("");
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		//-- Select All Button in Operation--///
//		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]")).click();
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_004_Console004.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_004_Console004 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_004_Console004 Failed to save screenshot: " + e.getMessage());
//				}	
//		
//	}
//	@Test(priority = 5, dataProvider = "getUserNameList")
//	public void ETL_PS_005(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(PROFILE);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		//-- Download restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_005.png";
//				//-- save the screenshot --//
//				File destinationFile = new File(Location);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//					System.out.println(" ETL_PS_005 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_005 Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(5000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- COlumn click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				//-- Value sendkeys--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("");
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		//--Success Click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverLogs = driver.findElement(By.xpath("//span[contains(text(),'Finished')]"));
//		Actions actionsClickLogs = new Actions(driver);
//		actionsClickLogs.moveToElement(elementToHoverLogs).perform();
//		WebElement Logs = driver.findElement(By.xpath("//span[contains(text(),'Finished')]"));
//		Logs.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_005_Console005.png";
//		//-- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_005_Console005 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_005_Console005 Failed to save screenshot: " + e.getMessage());
//		}	
//		
//	}
//	@Test(priority = 6, dataProvider = "getUserNameList")
//	public void ETL_PS_006(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(PROFILE);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Profile_setup.click();
//		Thread.sleep(2000);
//		//-- All Restrict only View --//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_006.png";
//				//-- save the screenshot --//
//				File destinationFile = new File(Location);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//					System.out.println(" ETL_PS_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_006 Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(5000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- COlumn click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				//-- Value sendkeys--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("");
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		//--Success Click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]")).click();
//		Thread.sleep(3000);
//		//-- Select All __//
//		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]")).click();
//		WebElement elementToHoverLogs = driver.findElement(By.xpath("//span[contains(text(),'Finished')]"));
//		Actions actionsClickLogs = new Actions(driver);
//		actionsClickLogs.moveToElement(elementToHoverLogs).perform();
//		WebElement Logs = driver.findElement(By.xpath("//span[contains(text(),'Finished')]"));
//		Logs.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_006_Console006.png";
//		//-- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_006_Console006 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_006_Console006 Failed to save screenshot: " + e.getMessage());
//		}	
//		
//	}
//	@Test(priority = 7, dataProvider = "getUserNameList")
//	public void ETL_PS_007(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
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
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_007.png";
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
//		// -- CMS Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//				Thread.sleep(2000);
//				// --User profile click--//
//				WebElement Send1 = driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("MIS");
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				Thread.sleep(2000);
//				// -- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				// -- COlumn click--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//						.click();
//				Thread.sleep(2000);
//				// -- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				// -- Value sendkeys--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//						.sendKeys("");
//				// -- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("001SAR");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_007_Console007.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_007_Console007 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_007_Console007 Failed to save screenshot: " + e.getMessage());
//				}	
//	}
//
//	@Test(priority = 8, dataProvider = "getUserNameList")
//	public void ETL_PS_008(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_008.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_008 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_008 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//--Connector click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//-- conector dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//		Thread.sleep(2000);
//		//-- Connector select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_008_Console.png";
//		//-- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" ETL_PS_008_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_008_Console Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//	}
//	@Test(priority = 9, dataProvider = "getUserNameList")
//	public void ETL_PS_009(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Add restriction--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_009.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_009 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_009 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(2000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_009_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_009_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_009_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 10, dataProvider = "getUserNameList")
//	public void ETL_PS_010(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Modify restriction--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_010.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_010 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(2000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_010_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_010_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_010_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 11, dataProvider = "getUserNameList")
//	public void ETL_PS_011(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Delete restriction--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_011.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_011 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_011 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(2000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_011_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_011_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_011_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 12, dataProvider = "getUserNameList")
//	public void ETL_PS_012	(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Verify restriction--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_012.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_012 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_012 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(2000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_012_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_012_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_012_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 13, dataProvider = "getUserNameList")
//	public void ETL_PS_013	(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Only view --//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(5000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_013.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_013 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_013 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send1.click();
//		Thread.sleep(2000);
//		Send1.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//		Connector_config1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(7000);
//		//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(2000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_013_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_013_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_013_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 14, dataProvider = "getUserNameList")
//	public void ETL_PS_014(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
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
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_014.png";
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
//		// -- CMS Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//				Thread.sleep(2000);
//				// --User profile click--//
//				WebElement Send1 = driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("MIS");
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				Thread.sleep(2000);
//				// -- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				// -- COlumn click--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//						.click();
//				Thread.sleep(2000);
//				// -- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//				// -- Value sendkeys--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//						.sendKeys("");
//				// -- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("001SAR");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_014_Console014.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_014_Console014 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_014_Console014 Failed to save screenshot: " + e.getMessage());
//				}	
//	}
//	@Test(priority = 15, dataProvider = "getUserNameList")
//	public void ETL_PS_015(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_SCRIPT);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_015.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_015 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_015 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//--Connector click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//-- conector dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//		Thread.sleep(2000);
//		//-- Connector Script select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_015_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 16, dataProvider = "getUserNameList")
//	public void ETL_PS_016(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_SCRIPT);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Add restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_016.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_016 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_016 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_config1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Script select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_016_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_016_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_016_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 17, dataProvider = "getUserNameList")
//	public void ETL_PS_017(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_SCRIPT);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Modify restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_017.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_017 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_017 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_config1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Script select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_017_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_017_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_017_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 18, dataProvider = "getUserNameList")
//	public void ETL_PS_018(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_SCRIPT);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Delete restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_018.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_018 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_018 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_config1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Script select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_018_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_018_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_018_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 19, dataProvider = "getUserNameList")
//	public void ETL_PS_019(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_SCRIPT);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Verify restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_019.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_019 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_019 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_config1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Script select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_019_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_019_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_019_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 20, dataProvider = "getUserNameList")
//	public void ETL_PS_020(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_SCRIPT);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Only View restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_020.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_020 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_020 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_config1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_config1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Script select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_020_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_020_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_020_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//		
//	}
//	@Test(priority = 21, dataProvider = "getUserNameList")
//	public void ETL_PS_021(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
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
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_021.png";
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
//		// -- CMS Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//				Thread.sleep(2000);
//				// --User profile click--//
//				WebElement Send1 = driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("MIS");
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				Thread.sleep(2000);
//				// -- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				// -- COlumn click--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//						.click();
//				Thread.sleep(2000);
//				// -- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//				// -- Value sendkeys--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//						.sendKeys("");
//				// -- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("001SAR");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_021_Console021.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_021_Console021 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_021_Console021 Failed to save screenshot: " + e.getMessage());
//				}	
//	}
//	@Test(priority = 22, dataProvider = "getUserNameList")
//	public void ETL_PS_022(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_QUERY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_022.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_022 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_022 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//--Connector click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//-- conector dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//		Thread.sleep(2000);
//		//-- Connector Query select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_022_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 23, dataProvider = "getUserNameList")
//	public void ETL_PS_023(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_QUERY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Add restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_023.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_023 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_023 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Query select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_023_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_023_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_023_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 24, dataProvider = "getUserNameList")
//	public void ETL_PS_024(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_QUERY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Modify restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_024.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_024 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_024 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Query select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_024_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_024_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_024_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	
//	@Test(priority = 25, dataProvider = "getUserNameList")
//	public void ETL_PS_025(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_QUERY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Delete restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_025.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_025 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_025 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Query select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_025_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_025_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_025_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 26, dataProvider = "getUserNameList")
//	public void ETL_PS_026(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_QUERY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Verify restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_026.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_026 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_026 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Query select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_026_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_026_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_026_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 27, dataProvider = "getUserNameList")
//	public void ETL_PS_027(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_QUERY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Only View restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_027.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_027 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_027 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				//--Connector click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//-- conector dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//-- Connector Query select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_027_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_027_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_027_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 28, dataProvider = "getUserNameList")
//	public void ETL_PS_028(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
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
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_028.png";
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
//		// -- CMS Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//				Thread.sleep(2000);
//				// --User profile click--//
//				WebElement Send1 = driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("MIS");
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				Thread.sleep(2000);
//				// -- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				// -- COlumn click--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//						.click();
//				Thread.sleep(2000);
//				// -- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//				// -- Value sendkeys--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//						.sendKeys("");
//				// -- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("001SAR");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//////				//--Connector click--//
//////			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
//////				Thread.sleep(3000);
//////				//-- conector dropdown click--//
//////				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//////				Thread.sleep(2000);
//////				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_028_Console028.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_028_Console028 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_028_Console028 Failed to save screenshot: " + e.getMessage());
//				}	
//	}
//	@Test(priority = 29, dataProvider = "getUserNameList")
//	public void ETL_PS_029(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CATEGORY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_029.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_029 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_029 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		driver.findElement(By.xpath("//p[contains(text(),'ETL Category')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//		Connector1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_029_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 30, dataProvider = "getUserNameList")
//	public void ETL_PS_030(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CATEGORY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Add restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_030.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_030 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_030 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//p[contains(text(),'ETL Category')]")).click();
//				Thread.sleep(3000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_030_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_030_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_030_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 31, dataProvider = "getUserNameList")
//	public void ETL_PS_031(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CATEGORY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Modify restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_031.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_031 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_031 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//p[contains(text(),'ETL Category')]")).click();
//				Thread.sleep(3000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_031_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_031_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_031_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 32, dataProvider = "getUserNameList")
//	public void ETL_PS_032(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CATEGORY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Delete restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_032.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_032 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_032 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//p[contains(text(),'ETL Category')]")).click();
//				Thread.sleep(3000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_032_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_032_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_032_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 33, dataProvider = "getUserNameList")
//	public void ETL_PS_033(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CATEGORY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Verify restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_033.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_033 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_033 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//p[contains(text(),'ETL Category')]")).click();
//				Thread.sleep(3000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_033_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_033_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_033_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 34, dataProvider = "getUserNameList")
//	public void ETL_PS_034(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CATEGORY);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_query.click();
//		Thread.sleep(2000);
//		//-- Only view restriction--//	
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(3000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_034.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_034 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_034 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("System");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//p[contains(text(),'ETL Category')]")).click();
//				Thread.sleep(3000);
//				//-- Filter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				//-- Column click--//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- Record indicator select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//				//-- Value sendkeys---//
//				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//				//-- Apply Click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//				Actions actionsClick11 = new Actions(driver);
//				actionsClick11.moveToElement(elementToHoverM11).perform();
//				WebElement Connector1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
//				Connector1.click();
//				Thread.sleep(2000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_034_Console.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_034_Console Screenshot saved to: " + destinationFile1.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_034_Console Failed to save screenshot: " + e.getMessage());
//				}	
//				Thread.sleep(2000);
//	}
//	@Test(priority = 35, dataProvider = "getUserNameList")
//	public void ETL_PS_035(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
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
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_035.png";
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
//		// -- CMS Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//				Thread.sleep(2000);
//				// --User profile click--//
//				WebElement Send1 = driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("MIS");
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				Thread.sleep(2000);
//				// -- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				// -- COlumn click--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//						.click();
//				Thread.sleep(2000);
//				// -- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//				// -- Value sendkeys--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//						.sendKeys("");
//				// -- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(5000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("001SAR");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_035_Console0.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_035_Console035 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_035_Console035 Failed to save screenshot: " + e.getMessage());
//				}	
//	}
//	@Test(priority = 36, dataProvider = "getUserNameList")
//	public void ETL_PS_036(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(FEED_CONFIGURATION);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_036.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_036 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_036 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		driver.findElement(By.xpath("//p[contains(text(),'ETL Feed Configuration')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverM1).perform();
//		WebElement Feed1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_036_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 37, dataProvider = "getUserNameList")
//	public void ETL_PS_037(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(FEED_CONFIGURATION);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Add restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_037.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_037 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_037 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(4000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//		Thread.sleep(3000);
//		//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
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
//		driver.findElement(By.xpath("//p[contains(text(),'ETL Feed Configuration')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_037_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 38, dataProvider = "getUserNameList")
//	public void ETL_PS_038(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(FEED_CONFIGURATION);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Modify restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_038.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_038 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_038 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(4000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//		Thread.sleep(3000);
//		//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
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
//		driver.findElement(By.xpath("//p[contains(text(),'ETL Feed Configuration')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_038_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 39, dataProvider = "getUserNameList")
//	public void ETL_PS_039(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(FEED_CONFIGURATION);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Delete restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_039.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_039 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_039 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(4000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//		Thread.sleep(3000);
//		//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
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
//		driver.findElement(By.xpath("//p[contains(text(),'ETL Feed Configuration')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_039_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 40, dataProvider = "getUserNameList")
//	public void ETL_PS_040(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(FEED_CONFIGURATION);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Verify  restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_040.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_040 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_040 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(4000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//		Thread.sleep(3000);
//		//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
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
//		driver.findElement(By.xpath("//p[contains(text(),'ETL Feed Configuration')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_040_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 41, dataProvider = "getUserNameList")
//	public void ETL_PS_041(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Pilot console click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//		Thread.sleep(2000);
//		//--ETL- Admin click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Profile setup select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//--  User group dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- System Adminstrator Select --//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		//--User profile click--//					
//		WebElement Send = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Send.click();
//		Thread.sleep(2000);
//		Send.sendKeys("Mana");
//		Thread.sleep(3000);
//		//--User profile select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- COlumn click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- COlumn select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//--Criteria CLick--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(FEED_CONFIGURATION);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Connector_config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//		Connector_config.click();
//		Thread.sleep(2000);
//		//-- Only View  restrict--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]")).click();
//		//-- Modify Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_041.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_PS_041 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_PS_041 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(4000);
//		//--User profile Logut Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(3000);
//		//-- Logout click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
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
//		//-- Pilot console click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")).click();
//				Thread.sleep(2000);
//				//--ETL- Admin click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(2000);
//				//--Profile setup select--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				Thread.sleep(3000);
//				//--  User group dropdown click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//				Thread.sleep(2000);
//				//-- System Adminstrator Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//				Thread.sleep(2000);
//				//--User profile click--//					
//				WebElement Send1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("Mana");
//				Thread.sleep(3000);
//				//--User profile select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//				//-- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				//-- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Connector_query1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Connector_query1.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(6000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(3000);
//		Thread.sleep(3000);
//		//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(3000);
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
//		driver.findElement(By.xpath("//p[contains(text(),'ETL Feed Configuration')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record indicator select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		//-- Value sendkeys---//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM11 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
//		Actions actionsClick11 = new Actions(driver);
//		actionsClick11.moveToElement(elementToHoverM11).perform();
//		WebElement Feed1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]"));
//		Feed1.click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_041_Console.png";
//		//-- save the screenshot --//
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
//	@Test(priority = 42, dataProvider = "getUserNameList")
//	public void ETL_PS_042(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
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
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_042.png";
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
//		// -- CMS Select --//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//				Thread.sleep(2000);
//				// --User profile click--//
//				WebElement Send1 = driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//				Send1.click();
//				Thread.sleep(2000);
//				Send1.sendKeys("MIS");
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//				Thread.sleep(2000);
//				// -- FIlter click--//
//				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//				Thread.sleep(2000);
//				// -- COlumn click--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//						.click();
//				Thread.sleep(2000);
//				// -- COlumn select--//
//				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//				// -- Value sendkeys--//
//				driver.findElement(By.xpath(
//						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//						.sendKeys("");
//				// -- Apply click--//
//				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//				Thread.sleep(3000);
//				Thread.sleep(3000);
//				WebElement elementToHoverM1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
//				Actions actionsClick1 = new Actions(driver);
//				actionsClick1.moveToElement(elementToHoverM1).perform();
//				WebElement Profile_setup1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
//				Profile_setup1.click();
//				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//				Thread.sleep(7000);
//				//--User profile Logut Click--//
//				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//				Thread.sleep(2000);
//				//-- Logout click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//						.sendKeys("001SAR");
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//						.sendKeys("Vision@123");
//				driver.findElement(By
//						.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//						.click();
//				Thread.sleep(5000);
//				 //-- Take screenshot and save it to a file--//
//				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\Profile_setup\\ETL_PS_042_Console042.png";
//				//-- save the screenshot --//
//				File destinationFile1 = new File(Location1);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//					System.out.println(" ETL_PS_042_Console042 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("ETL_PS_042_Console042 Failed to save screenshot: " + e.getMessage());
//				}	
//	}
	@Test(priority = 8, dataProvider = "getUserNameList")
	public void BackToNormal_Profile_setup(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Pilot console click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// --ETL- Admin click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Profile setup select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		// -- User group dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- System Adminstrator Select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		// --User profile click--//
		WebElement Send = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
		Send.click();
		Thread.sleep(2000);
		Send.sendKeys("Mana");
		Thread.sleep(3000);
		// --User profile select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		// -- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		// -- COlumn click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- COlumn select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(PROFILE);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Profile_setup = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Profile_setup.click();
		Thread.sleep(2000);
		// --Add click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
				.click();
		// -- Modify Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
				.click();
		// --Delete Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
				.click();
		// -- Verify Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		// -- Upload click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		// -- Download Click---//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		// -- Modify CLick--//
		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
		Thread.sleep(5000);
		// -- Back Click--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		// -- User group dropdown click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(2000);
				// -- System Adminstrator Select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				Thread.sleep(2000);
				// --User profile click--//
				WebElement Send1 = driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
				Send1.click();
				Thread.sleep(2000);
				Send1.sendKeys("Mana");
				Thread.sleep(3000);
				// --User profile select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
				// -- FIlter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				Thread.sleep(2000);
				//-- Column Click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				//-- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				//-- Value clear--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR);
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(2000);
				WebElement elementToHoverM1 = driver.findElement(By.xpath(
						"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
				Actions actionsClick1 = new Actions(driver);
				actionsClick1.moveToElement(elementToHoverM1).perform();
				WebElement Connector_Config = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
				Connector_Config.click();
				Thread.sleep(2000);
				// --Add click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
						.click();
				// -- Modify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
						.click();
				// --Delete Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
						.click();
				// -- Verify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Upload click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Download Click---//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Modify CLick--//
				driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
				Thread.sleep(5000);
				// -- Back Click--//
				driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
				// -- User group dropdown click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(2000);
				// -- System Adminstrator Select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				Thread.sleep(2000);
				// --User profile click--//
				WebElement Send11 = driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
				Send11.click();
				Thread.sleep(2000);
				Send11.sendKeys("Mana");
				Thread.sleep(3000);
				// --User profile select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
				// -- FIlter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				Thread.sleep(2000);
				//-- Column Click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				//-- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				//-- Value clear--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_SCRIPT);
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(2000);
				WebElement elementToHoverM11 = driver.findElement(By.xpath(
						"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
				Actions actionsClick11 = new Actions(driver);
				actionsClick11.moveToElement(elementToHoverM11).perform();
				WebElement Connector_Script = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
				Connector_Script.click();
				Thread.sleep(2000);
				// --Add click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
						.click();
				// -- Modify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
						.click();
				// --Delete Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
						.click();
				// -- Verify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Upload click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Download Click---//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Modify CLick--//
				driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
				Thread.sleep(5000);
				// -- Back Click--//
				driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
				// -- User group dropdown click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(2000);
				// -- System Adminstrator Select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				Thread.sleep(2000);
				// --User profile click--//
				WebElement Send111 = driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
				Send111.click();
				Thread.sleep(2000);
				Send111.sendKeys("Mana");
				Thread.sleep(3000);
				// --User profile select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
				// -- FIlter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				Thread.sleep(2000);
				//-- Column Click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				//-- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				//-- Value clear--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CONNECTOR_QUERY);
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(2000);
				WebElement elementToHoverM111 = driver.findElement(By.xpath(
						"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
				Actions actionsClick111 = new Actions(driver);
				actionsClick111.moveToElement(elementToHoverM111).perform();
				WebElement Connector_Query = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
				Connector_Query.click();
				Thread.sleep(2000);
				// --Add click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
						.click();
				// -- Modify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
						.click();
				// --Delete Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
						.click();
				// -- Verify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Upload click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Download Click---//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Modify CLick--//
				driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
				Thread.sleep(5000);
				// -- Back Click--//
				driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
				// -- User group dropdown click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(2000);
				// -- System Adminstrator Select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				Thread.sleep(2000);
				// --User profile click--//
				WebElement Send1111 = driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
				Send1111.click();
				Thread.sleep(2000);
				Send1111.sendKeys("Mana");
				Thread.sleep(3000);
				// --User profile select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
				// -- FIlter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				Thread.sleep(2000);
				//-- Column Click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				//-- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				//-- Value clear--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(CATEGORY);
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(2000);
				WebElement elementToHoverM1111 = driver.findElement(By.xpath(
						"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
				Actions actionsClick1111 = new Actions(driver);
				actionsClick1111.moveToElement(elementToHoverM1111).perform();
				WebElement Category = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
				Category.click();
				Thread.sleep(2000);
				// --Add click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
						.click();
				// -- Modify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
						.click();
				// --Delete Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
						.click();
				// -- Verify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Upload click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Download Click---//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Modify CLick--//
				driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
				Thread.sleep(5000);
				// -- Back Click--//
				driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
				// -- User group dropdown click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(2000);
				// -- System Adminstrator Select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				Thread.sleep(2000);
				// --User profile click--//
				WebElement Send11111 = driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
				Send11111.click();
				Thread.sleep(2000);
				Send11111.sendKeys("Mana");
				Thread.sleep(3000);
				// --User profile select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
				// -- FIlter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				Thread.sleep(2000);
				//-- Value clear--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(FEED_CONFIGURATION);
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(2000);
				WebElement elementToHoverM11111 = driver.findElement(By.xpath(
						"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
				Actions actionsClick11111 = new Actions(driver);
				actionsClick11111.moveToElement(elementToHoverM11111).perform();
				WebElement FeedConfig = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
				FeedConfig.click();
				Thread.sleep(2000);
				// --Add click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]"))
						.click();
				// -- Modify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"))
						.click();
				// --Delete Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]"))
						.click();
				// -- Verify Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Upload click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Download Click---//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]/span[1]/span[1]"))
						.click();
				// -- Modify CLick--//
				driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
				Thread.sleep(5000);
				// -- Back Click--//
				driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
				// -- User group dropdown click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(2000);
				// -- System Adminstrator Select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				Thread.sleep(2000);
				// --User profile click--//
				WebElement Send111111 = driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
				Send111111.click();
				Thread.sleep(2000);
				Send111111.sendKeys("Mana");
				Thread.sleep(3000);
				// --User profile select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
				// -- FIlter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				Thread.sleep(2000);
				//-- Reset Click--//
				driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
				Thread.sleep(2000);
				//--User profile Logut Click--//
				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
				Thread.sleep(2000);
				//-- Logout click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
						.sendKeys("System");
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
						.sendKeys("Vision@123");
				Thread.sleep(5000);
				// -- Pilot console click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]"))
						.click();
				Thread.sleep(2000);
				// --ETL- Admin click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(2000);
				// --Profile setup select--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(3000);
				// -- User group dropdown click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(2000);
				// -- System Adminstrator Select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				Thread.sleep(2000);
				// --User profile click--//
				WebElement Send2 = driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
				Send2.click();
				Thread.sleep(2000);
				Send2.sendKeys("Mana");
				Thread.sleep(3000);
				// --User profile select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
				//-- Select Box--//
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-profile-setup[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/div[1]/input[1]")).click();
				//-- Approve Click--//
				driver.findElement(By.xpath("//i[contains(text(),'done')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
				Thread.sleep(2000);	
	}

	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
