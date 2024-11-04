package Vision_RA.Test;

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

public class RA_ReconConfiguration extends BaseClass{
	@DataProvider(name = "loginCredentials")
    public Object[][] getUserNameList() {
        return new Object[][] {
            {"RA", "Vision@123"},
        };
    }
	
	private Login LoginPage;
	 @BeforeMethod
	    public void setUpLogin() {
	        LoginPage = new Login(driver); 
	    }
	
	@Test(dataProvider = "loginCredentials", priority = 1)
	@TestDescription("By default First Rule ID should be displayed auomatically.")
	public void RA_RC_001(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_001";
		String notes = "By default First Rule ID should be displayed auomatically." ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_001.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_001 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_001 Failed to save screenshot: " + e.getMessage());
		}
		
	}
	@Test(dataProvider = "loginCredentials", priority = 2)
	@TestDescription("If the Rule ID is Configured the Section criteria will be displayed according to the configuration")
	public void RA_RC_002(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_002";
		String notes = "If the Rule ID is Configured the Section criteria will be displayed according to the configuration" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'K - CONSOLIDATED GL CUSTOMER_ID RULE')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(5000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_002.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_002 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_002 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 3)
	@TestDescription("If there is no configuration done it will ony show the Alias name")
	public void RA_RC_003(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_003";
		String notes = "If there is no configuration done it will ony show the Alias name" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'VATDONTUSE - VAT_DONT_USE')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(5000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_003.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_003 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_003 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 4)
	@TestDescription("Pop up should display the Table required to run for Recon Engine.")
	public void RA_RC_006(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_006";
		String notes = "Pop up should display the Table required to run for Recon Engine." ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'VATDONTUSE - VAT_DONT_USE')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Add table click--//
		driver.findElement(By.xpath("//span[contains(text(),'Add Table')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_006.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_006 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 5)
	@TestDescription("The Configured Tables should display in Left panel")
	public void RA_RC_007(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_007";
		String notes = "The Configured Tables should display in Left panel" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[28]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Add table click--//
		driver.findElement(By.xpath("//span[contains(text(),'Add Table')]")).click();
		Thread.sleep(2000);
		//-- Table select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		//-- Table 2 Select--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
		//--Table 3 Select--//
		driver.findElement(By.xpath("//tbody/tr[10]/td[1]/input[1]")).click();
		//-- Add click--//
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_007.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_007 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_007 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 6)
	@TestDescription("If the Column is changed to Expresssion Table name and Aggregation should be Freezed")
	public void RA_RC_008(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_008";
		String notes = "If the Rule ID is Configured the Seection criteria will be displayed according to the configuration" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'K - CONSOLIDATED GL CUSTOMER_ID RULE')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- C to E--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/span[1]/span[1]")).click();
		//-- C to E--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_008.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_008 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_008 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 7)
	@TestDescription("Text field should Open and should allow to enter free text")
	public void RA_RC_009(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_009";
		String notes = "Text field should Open and should allow to enter free text" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'K - CONSOLIDATED GL CUSTOMER_ID RULE')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- C to E--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/span[1]/span[1]")).click();
		//-- Column name send keys--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/span[1]/input[1]")).sendKeys("LE_BOOK");
		Thread.sleep(2000);
		//-- C to E--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[1]/span[1]")).click();
		//-- Column name send keys--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/span[1]/input[1]")).sendKeys("Businee_Date");
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_009.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_009 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_009 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 8)
	@TestDescription("1.If there is one Table Relationship should not visible 2.If there is More than one table Relationship should be visible.")
	public void RA_RC_010(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_010";
		String notes = "1.If there is one Table Relationship should not visible 2.If there is More than one table Relationship should be visible." ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'VATDONTUSE - VAT_DONT_USE')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Add table--.//
		driver.findElement(By.xpath("//span[contains(text(),'Add Table')]")).click();
		Thread.sleep(2000);
		//--click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		//--Add click--//
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_010.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_010 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		//-- Add table--.//
		driver.findElement(By.xpath("//span[contains(text(),'Add Table')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
		Thread.sleep(2000);
		//--Add click--//
				driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
				Thread.sleep(2000);
		//--Yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);	
	}
	@Test(dataProvider = "loginCredentials", priority = 9)
	@TestDescription("By default all the Columns in the Table will be Joined")
	public void RA_RC_011(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_011";
		String notes = "By default all the Columns in the Table will be Joined" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[30]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Relationship click--//
		driver.findElement(By.xpath("//span[contains(text(),'Relationship')]")).click();
		Thread.sleep(2000);
		//--LHS table dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//--RHS table click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_011.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_011 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_011 Failed to save screenshot: " + e.getMessage());
		}
		
	}
	@Test(dataProvider = "loginCredentials", priority = 10)
	@TestDescription("Text field should Open and should allow to enter free text")
	public void RA_RC_012(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_012";
		String notes = "Text field should Open and should allow to enter free text" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[30]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Relationship click--//
		driver.findElement(By.xpath("//span[contains(text(),'Relationship')]")).click();
		Thread.sleep(2000);
		//--LHS table dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//--RHS table click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Relationship = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/a[1]/i[1]"));
		Relationship.click();
		WebElement Clear = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[1]/input[1]"));
		Clear.click();
		Clear.clear();
		Clear.sendKeys("COUNTRY_TYPE");
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_012.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_012 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_012 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 11)
	@TestDescription("If the Rule ID filter is alredy configured it should be displayed, new filter can be added if required")
	public void RA_RC_013(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_013";
		String notes = "If the Rule ID filter is alredy configured it should be displayed, new filter can be added if required" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[20]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_013.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_013 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_013 Failed to save screenshot: " + e.getMessage());
		}
     }

	@Test(dataProvider = "loginCredentials", priority = 12)
	@TestDescription("Text field should Open and should allow to enter free text")
	public void RA_RC_014(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_014";
		String notes = "Text field should Open and should allow to enter free text" ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(2000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[20]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Add filter click--//
		driver.findElement(By.xpath("//span[contains(text(),'Add Filter')]")).click();
		//-- Edit CLick--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/a[1]/i[1]")).click();
		WebElement Clear = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]"));
		Clear.click();
		Clear.clear();
		Clear.sendKeys("TEST");
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_RC_014.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_RC_014 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_RC_014 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 13)
	@TestDescription("Popup should display for save")
	public void RA_RC_015(String username, String password) throws InterruptedException {
		String ScreenName = "Recon Configuration";
		String testCaseId = "RA_RC_015";
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- User click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(1000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(1000);
		//-- recon config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Rule ID dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/form[1]/span[1]/span[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'TEST - Testing')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(1000);
		//-- Add Table click--//
		driver.findElement(By.xpath("//span[contains(text(),'Add Table')]")).click();
		Thread.sleep(3000);
		//--- Table click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[10]/td[1]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[11]/td[1]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[13]/td[1]/input[1]")).click();
		Thread.sleep(1000);
		//-- Add click--//
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(4000);
		//-- Child table click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
		Thread.sleep(1000);
		WebElement ElementtoDragCountry = driver.findElement(By.xpath("//span[contains(text(),'COUNTRY')]"));
		WebElement ElementtoDropCountry = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		Actions actionsDragDrop = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDrop.clickAndHold(ElementtoDragCountry).moveToElement(ElementtoDropCountry).release().build().perform();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'LE_BOOK')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement LE_Book = driver.findElement(By.xpath("//span[contains(text(),'LE_BOOK')]"));
		LE_Book.click();
		Thread.sleep(1000);
		WebElement ElementtoDragLE_Book = driver.findElement(By.xpath("//span[contains(text(),'LE_BOOK')]"));
		WebElement ElementtoDropLE_Book = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		Actions actionsDragDropLE_Book = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropLE_Book.clickAndHold(ElementtoDragLE_Book).moveToElement(ElementtoDropLE_Book).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_DATE')]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		WebElement JournalDate = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_DATE')]"));
		JournalDate.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalDate = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_DATE')]"));
		WebElement ElementtoDropJournalDate = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		Actions actionsDragDropJournalDate = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalDate.clickAndHold(ElementtoDragJournalDate).moveToElement(ElementtoDropJournalDate).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverM11 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[6]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Actions actionsClick11 = new Actions(driver);
		actionsClick11.moveToElement(elementToHoverM11).perform();
		WebElement JournalID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[6]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		JournalID.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[6]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		WebElement ElementtoDropJournalID = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
		Actions actionsDragDropJournalID = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalID.clickAndHold(ElementtoDragJournalID).moveToElement(ElementtoDropJournalID).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverM111 = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_ID_SRL')]"));
		Actions actionsClick111 = new Actions(driver);
		actionsClick111.moveToElement(elementToHoverM111).perform();
		WebElement JournalID_SRL = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_ID_SRL')]"));
		JournalID_SRL.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalID_SRL = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_ID_SRL')]"));
		WebElement ElementtoDropJournalID_SRL = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
		Actions actionsDragDropJournalID_SRL = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalID_SRL.clickAndHold(ElementtoDragJournalID_SRL).moveToElement(ElementtoDropJournalID_SRL).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverM1111 = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_TYPE')]"));
		Actions actionsClick1111 = new Actions(driver);
		actionsClick1111.moveToElement(elementToHoverM1111).perform();
		WebElement JournalID_TYPE = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_TYPE')]"));
		JournalID_TYPE.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalID_TYPE = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_TYPE')]"));
		WebElement ElementtoDropJournalID_TYPE = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]"));
		Actions actionsDragDropJournalID_TYPE = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalID_TYPE.clickAndHold(ElementtoDragJournalID_TYPE).moveToElement(ElementtoDropJournalID_TYPE).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverM11111 = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_SUB_TYPE')]"));
		Actions actionsClick11111 = new Actions(driver);
		actionsClick11111.moveToElement(elementToHoverM11111).perform();
		WebElement JournalID_SUBTYPE = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_SUB_TYPE')]"));
		JournalID_SUBTYPE.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalID_SUBTYPE = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_SUB_TYPE')]"));
		WebElement ElementtoDropJournalID_SUBTYPE = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[2]/input[1]"));
		Actions actionsDragDropJournalID_SUBTYPE = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalID_SUBTYPE.clickAndHold(ElementtoDragJournalID_SUBTYPE).moveToElement(ElementtoDropJournalID_SUBTYPE).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverM111111 = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_PART_TYPE')]"));
		Actions actionsClick111111 = new Actions(driver);
		actionsClick111111.moveToElement(elementToHoverM111111).perform();
		WebElement JournalID_PARTTYPE = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_PART_TYPE')]"));
		JournalID_PARTTYPE.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalID_PARTTYPE = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_PART_TYPE')]"));
		WebElement ElementtoDropJournalID_PARTTYPE = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[2]/input[1]"));
		Actions actionsDragDropJournalID_PARTTYPE = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalID_PARTTYPE.clickAndHold(ElementtoDragJournalID_PARTTYPE).moveToElement(ElementtoDropJournalID_PARTTYPE).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMRemarks = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_REMARKS')]"));
		Actions actionsClickRemarks = new Actions(driver);
		actionsClickRemarks.moveToElement(elementToHoverMRemarks).perform();
		WebElement JournalRemarks = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_REMARKS')]"));
		JournalRemarks.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalRemarks = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_REMARKS')]"));
		WebElement ElementtoDropJournalRemarks = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[2]/input[1]"));
		Actions actionsDragDropJournalRemarks = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalRemarks.clickAndHold(ElementtoDragJournalRemarks).moveToElement(ElementtoDropJournalRemarks).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMBranch = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_BRANCH')]"));
		Actions actionsClickBranch = new Actions(driver);
		actionsClickBranch.moveToElement(elementToHoverMBranch).perform();
		WebElement JournalBranch = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_BRANCH')]"));
		JournalBranch.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalBranch = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_BRANCH')]"));
		WebElement ElementtoDropJournalBranch = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[10]/td[2]/input[1]"));
		Actions actionsDragDropJournalBranch = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalBranch.clickAndHold(ElementtoDragJournalBranch).moveToElement(ElementtoDropJournalBranch).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMGL_Code = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_GL_CODE')]"));
		Actions actionsClickGL_Code = new Actions(driver);
		actionsClickGL_Code.moveToElement(elementToHoverMGL_Code).perform();
		WebElement JournalGL_Code = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_GL_CODE')]"));
		JournalGL_Code.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalGL_Code = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_GL_CODE')]"));
		WebElement ElementtoDropJournalGL_Code = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[11]/td[2]/input[1]"));
		Actions actionsDragDropJournalGL_Code = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalGL_Code.clickAndHold(ElementtoDragJournalGL_Code).moveToElement(ElementtoDropJournalGL_Code).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMBACID = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_BACID_NO')]"));
		Actions actionsClickBACID = new Actions(driver);
		actionsClickBACID.moveToElement(elementToHoverMBACID).perform();
		WebElement JournalBACID = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_BACID_NO')]"));
		JournalBACID.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalBACID = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_BACID_NO')]"));
		WebElement ElementtoDropJournalBACID = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[12]/td[2]/input[1]"));
		Actions actionsDragDropJournalBACID = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalBACID.clickAndHold(ElementtoDragJournalBACID).moveToElement(ElementtoDropJournalBACID).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMCCY = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_CCY')]"));
		Actions actionsClickCCY = new Actions(driver);
		actionsClickCCY.moveToElement(elementToHoverMCCY).perform();
		WebElement JournalCCY = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_CCY')]"));
		JournalCCY.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalCCY = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_CCY')]"));
		WebElement ElementtoDropJournalCCY = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[13]/td[2]/input[1]"));
		Actions actionsDragDropJournalCCY = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalCCY.clickAndHold(ElementtoDragJournalCCY).moveToElement(ElementtoDropJournalCCY).release().build().perform();
		Thread.sleep(4000);
		WebElement elementToHoverMAMOUNT = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[16]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Actions actionsClickAMOUNT = new Actions(driver);
		actionsClickAMOUNT.moveToElement(elementToHoverMAMOUNT).perform();
		WebElement JournalAMOUNT = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[16]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		JournalAMOUNT.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalAMOUNT = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[16]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		WebElement ElementtoDropJournalAMOUNT = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[14]/td[2]/input[1]"));
		Actions actionsDragDropJournalAMOUNT = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalAMOUNT.clickAndHold(ElementtoDragJournalAMOUNT).moveToElement(ElementtoDropJournalAMOUNT).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMAMOUNT_LCY = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_AMT_LCY')]"));
		Actions actionsClickAMOUNT_LCY = new Actions(driver);
		actionsClickAMOUNT_LCY.moveToElement(elementToHoverMAMOUNT_LCY).perform();
		WebElement JournalAMOUNT_LCY = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_AMT_LCY')]"));
		JournalAMOUNT_LCY.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalAMOUNT_LCY = driver.findElement(By.xpath("//span[contains(text(),'JOURNAL_AMT_LCY')]"));
		WebElement ElementtoDropJournalAMOUNT_LCY = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[15]/td[2]/input[1]"));
		Actions actionsDragDropJournalAMOUNT_LCY = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalAMOUNT_LCY.clickAndHold(ElementtoDragJournalAMOUNT_LCY).moveToElement(ElementtoDropJournalAMOUNT_LCY).release().build().perform();
		Thread.sleep(1000);
		Actions actionsSCROLL = new Actions(driver);
		WebElement elementTargetSCROLL = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]"));
		actions.moveToElement(elementTargetSCROLL);
		WebElement TargetSCROLL = driver.findElement(By.xpath("//span[contains(text(),'RA_STG_FEED_DLY_SERVICE_FEES')]"));
		actionsSCROLL.scrollToElement(TargetSCROLL);
		actionsSCROLL.perform();
		TargetSCROLL.click();
		//-- Table Untick--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]")).click();
		Thread.sleep(1000);
		WebElement elementToHoverMTRN_TYPE = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_TYPE')]"));
		Actions actionsClickTRN_TYPE = new Actions(driver);
		actionsClickTRN_TYPE.moveToElement(elementToHoverMTRN_TYPE).perform();
		WebElement JournalTRN_TYPE = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_TYPE')]"));
		JournalTRN_TYPE.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalTRN_TYPE = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_TYPE')]"));
		WebElement ElementtoDropJournalTRN_TYPE = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[16]/td[2]/input[1]"));
		Actions actionsDragDropJournalTRN_TYPE = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalTRN_TYPE.clickAndHold(ElementtoDragJournalTRN_TYPE).moveToElement(ElementtoDropJournalTRN_TYPE).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMTRN_ID = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_ID')]"));
		Actions actionsClickTRN_ID = new Actions(driver);
		actionsClickTRN_ID.moveToElement(elementToHoverMTRN_ID).perform();
		WebElement JournalTRN_ID = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_ID')]"));
		JournalTRN_ID.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalTRN_ID = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_ID')]"));
		WebElement ElementtoDropJournalTRN_ID = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[17]/td[2]/input[1]"));
		Actions actionsDragDropJournalTRN_ID = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalTRN_ID.clickAndHold(ElementtoDragJournalTRN_ID).moveToElement(ElementtoDropJournalTRN_ID).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMTRN_REF = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_ID')]"));
		Actions actionsClickTRN_REF = new Actions(driver);
		actionsClickTRN_REF.moveToElement(elementToHoverMTRN_REF).perform();
		WebElement JournalTRN_REF = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_ID')]"));
		JournalTRN_REF.click();
		Thread.sleep(1000);
		WebElement ElementtoDragJournalTRN_REF = driver.findElement(By.xpath("//span[contains(text(),'TRANSACTION_ID')]"));
		WebElement ElementtoDropJournalTRN_REF = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[18]/td[2]/input[1]"));
		Actions actionsDragDropJournalTRN_REF = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropJournalTRN_REF.clickAndHold(ElementtoDragJournalTRN_REF).moveToElement(ElementtoDropJournalTRN_REF).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMCustomerID = driver.findElement(By.xpath("//span[contains(text(),'CUSTOMER_ID')]"));
		Actions actionsClickCustomerID = new Actions(driver);
		actionsClickCustomerID.moveToElement(elementToHoverMCustomerID).perform();
		WebElement CustomerID = driver.findElement(By.xpath("//span[contains(text(),'CUSTOMER_ID')]"));
		CustomerID.click();
		Thread.sleep(1000);
		WebElement ElementtoDragCustomerID = driver.findElement(By.xpath("//span[contains(text(),'CUSTOMER_ID')]"));
		WebElement ElementtoDropCustomerID = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[2]/input[1]"));
		Actions actionsDragDropCustomerID = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropCustomerID.clickAndHold(ElementtoDragCustomerID).moveToElement(ElementtoDropCustomerID).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMContractID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[19]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Actions actionsClickContractID = new Actions(driver);
		actionsClickContractID.moveToElement(elementToHoverMContractID).perform();
		WebElement ContractID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[19]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		ContractID.click();
		Thread.sleep(1000);
		WebElement ElementtoDragContractID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[19]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		WebElement ElementtoDropContractID = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[20]/td[2]/input[1]"));
		Actions actionsDragDropContractID = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropContractID.clickAndHold(ElementtoDragContractID).moveToElement(ElementtoDropContractID).release().build().perform();
		Thread.sleep(1000);
		Actions actionsScroll = new Actions(driver);
		WebElement elementTargetScroll = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]"));
		actionsScroll.moveToElement(elementTargetScroll);
		WebElement TargetScroll = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"));
		actionsScroll.scrollToElement(TargetScroll);
		actionsScroll.perform();
		TargetScroll.click();
		Thread.sleep(1000);
		WebElement elementToHoverMBusiness_date = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Actions actionsClickBusiness_date = new Actions(driver);
		actionsClickBusiness_date.moveToElement(elementToHoverMBusiness_date).perform();
		WebElement Business_date = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Business_date.click();
		Thread.sleep(1000);
		WebElement ElementtoDragBusiness_date = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[3]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		WebElement ElementtoDropBusiness_date = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[21]/td[2]/input[1]"));
		Actions actionsDragDropBusiness_date = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropBusiness_date.clickAndHold(ElementtoDragBusiness_date).moveToElement(ElementtoDropBusiness_date).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMTranslineID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Actions actionsClickTranslineID = new Actions(driver);
		actionsClickTranslineID.moveToElement(elementToHoverMTranslineID).perform();
		WebElement TranslineID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		TranslineID.click();
		Thread.sleep(1000);
		WebElement ElementtoDragTranslineID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[4]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		WebElement ElementtoDropTranslineID = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[23]/td[2]/input[1]"));
		Actions actionsDragDropTranslineID = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropTranslineID.clickAndHold(ElementtoDragTranslineID).moveToElement(ElementtoDropTranslineID).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMTranslineSequence = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Actions actionsClickTranslineSequence = new Actions(driver);
		actionsClickTranslineSequence.moveToElement(elementToHoverMTranslineSequence).perform();
		WebElement TranslineSequence = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		TranslineSequence.click();
		Thread.sleep(1000);
		WebElement ElementtoDragTranslineSequence = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		WebElement ElementtoDropTranslineSequence = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[24]/td[2]/input[1]"));
		Actions actionsDragDropTranslineSequence = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropTranslineSequence.clickAndHold(ElementtoDragTranslineSequence).moveToElement(ElementtoDropTranslineSequence).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMBusinessLineID = driver.findElement(By.xpath("//span[contains(text(),'BUSINESS_LINE_ID')]"));
		Actions actionsClickBusinessLineID = new Actions(driver);
		actionsClickBusinessLineID.moveToElement(elementToHoverMBusinessLineID).perform();
		WebElement BusinessLineID = driver.findElement(By.xpath("//span[contains(text(),'BUSINESS_LINE_ID')]"));
		BusinessLineID.click();
		Thread.sleep(1000);
		WebElement ElementtoDragBusinessLineID = driver.findElement(By.xpath("//span[contains(text(),'BUSINESS_LINE_ID')]"));
		WebElement ElementtoDropBusinessLineID = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[25]/td[2]/input[1]"));
		Actions actionsDragDropBusinessLineID = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropBusinessLineID.clickAndHold(ElementtoDragBusinessLineID).moveToElement(ElementtoDropBusinessLineID).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMRowID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[46]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Actions actionsClickRowID = new Actions(driver);
		actionsClickRowID.moveToElement(elementToHoverMRowID).perform();
		WebElement RowID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[46]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		RowID.click();
		Thread.sleep(1000);
		WebElement ElementtoDragRowID = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[46]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		WebElement ElementtoDropRowID = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[22]/td[2]/input[1]"));
		Actions actionsDragDropRowID = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropRowID.clickAndHold(ElementtoDragRowID).moveToElement(ElementtoDropRowID).release().build().perform();
		Thread.sleep(1000);
		WebElement elementToHoverMRowID1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[46]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		Actions actionsClickRowID1 = new Actions(driver);
		actionsClickRowID1.moveToElement(elementToHoverMRowID1).perform();
		WebElement RowID1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[46]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		RowID1.click();
		Thread.sleep(1000);
		WebElement ElementtoDragRowID1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[46]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"));
		WebElement ElementtoDropRowID1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[26]/td[2]/input[1]"));
		Actions actionsDragDropRowID1 = new Actions(driver);
		Thread.sleep(1000);
		actionsDragDropRowID1.clickAndHold(ElementtoDragRowID1).moveToElement(ElementtoDropRowID1).release().build().perform();
		Thread.sleep(1000);
		//-- Save click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(1000);
		//--yes clik--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(1000);
		WebElement Text = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String SText = Text.getText();
		System.out.println(SText);
		Thread.sleep(1000);
		WebElement Status = driver.findElement(By.xpath("//div[contains(text(),'Active - Add Pending')]"));
		String RecordStatus = Status.getText();
		System.out.println(RecordStatus);
		 if (RecordStatus.equals("Active - Add Pending")) {
	            System.out.println("Both texts are equal.");
	        } else {
	            System.out.println("Texts are not equal.");
	        }
		 Assert.assertEquals(RecordStatus, "Active - Add Pending", "Record status does not match 'Active - Add Pending'");
		 Thread.sleep(3000); 
		 String notes = "Popup should display for save , After adding the record it will be moved to Add pending stage" + RecordStatus;
	        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	}
}
