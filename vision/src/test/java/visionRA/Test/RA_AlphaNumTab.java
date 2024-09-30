package visionRA.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.Login;

public class RA_AlphaNumTab extends BaseClass{
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
	 
	String AlphaTab = "906";
	String AlphaSubTab = "VAT_Test_906";
	String AlphaTab1 = "1406";
	String AlphaSubTab1 = "VAT_Test_1406";
	String AlphaTabSpecial = "900@<>";
	String AlphaSubTabSpecial = "VAT_Test_81@<>";
	String NumTab = "306";
	String NumSubTab = "VAT_Test_306";
	String NumTabSpecial = "900@<>";
	String NumSubTabSpecial = "VAT_Test_81@<>"; 
	String NumTab1 = "506";
	String NumSubTab1 = "VAT_Test_506";
	String AlphaTabReject = "80";
	String AlphasubReject = "VAT_Reject";
	String NumTabReject = "70";
	String NumSubTabReject = "VAT_Reject";
	String AlphaTabApprove = "163";
	String AlphaSubAprove = "VAT_Approve";
	String NumTabApprove = "403";
	String NumSubTabApprove = "VAT_Approve";
	
	
	@Test(dataProvider = "loginCredentials", priority = 1)
	@TestDescription("Copy- Trigger should appear for Duplicate already")
	public void ALP_TAB_002(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_TAB_002";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(3000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(3000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT_KCB003')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		//-- Copy Click--//
		WebElement AlphaTab = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[2]/a[1]/i[1]"));
		AlphaTab.click();
		Thread.sleep(2000);
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_TAB_002.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ALP_TAB_002 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ALP_TAB_002 Failed to save screenshot: " + e.getMessage());
		}
		driver.findElement(By.xpath("//p[contains(text(),'- Failed - Duplicate key insertio')]")).click();
		WebElement Dup_AlphaTab=driver.findElement(By.xpath("//p[contains(text(),'- Failed - Duplicate key insertio')]"));
		String text = Dup_AlphaTab.getText();
		System.out.println(text);
		String notes = "Copy- Trigger should appear for Duplicate already" + text ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
	}
	@Test(dataProvider = "loginCredentials", priority = 2)
	@TestDescription("After clicking on Delete entire record should move to Delete pending + After click on reject Previous approved status should be updated")
	public void ALP_TAB_004_ALP_TAB_003(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_TAB_004_ALP_TAB_003";	
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(3000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(3000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT_KCB003')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		//-- Delete Click--//
		WebElement AlphaTab = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[2]/a[4]/i[1]"));
		AlphaTab.click();
		Thread.sleep(2000);
		//-- Yes Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_TAB_004_ALP_TAB_003.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ALP_TAB_004 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ALP_TAB_004 Failed to save screenshot: " + e.getMessage());
				}
		WebElement Delete=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String DeleteSuccess = Delete.getText();
		System.out.println(DeleteSuccess);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'VAT_KCB003')]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		//-- Reject Click--//
		WebElement AlphaTab1 = driver.findElement(By.xpath("//i[contains(text(),'do_not_disturb_alt')]"));
		AlphaTab1.click();
		Thread.sleep(2000);
		//-- Yes Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_TAB_004_ALP_TAB_003.png";
		//-- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" ALP_TAB_003 Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ALP_TAB_003 Failed to save screenshot: " + e.getMessage());
		}
		WebElement Reject=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String RejectSuccess = Reject.getText();
		System.out.println(RejectSuccess);
		String notes = "After clicking on Delete entire record should move to Delete pending" + DeleteSuccess + RejectSuccess ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	}
	@Test(dataProvider = "loginCredentials", priority = 3)
	@TestDescription("Only entered record should get clear")
	public void ALP_TAB_006(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_TAB_006";
		String notes = "Only entered record should get clear";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Alpha Tabl send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("2333");
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Test");
	Thread.sleep(2000);		
		//--Alpha Sub tab send keys--//
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(AlphaSubTab);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(AlphaSubTab);
		//-- Cleaar click--//
		driver.findElement(By.xpath("//button[contains(text(),'Clear')]")).click();
		Thread.sleep(2000);
		//-- Yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_TAB_006.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ALP_TAB_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ALP_TAB_006 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 4)
	@TestDescription("Alpha numeric and Undescore should be allowed")
	public void ALP_TAB_007(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_TAB_007";
		String notes = "Alpha numeric and Undescore should be allowed";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Alpha Tabl send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("2333");
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Test");
		Thread.sleep(2000);	
		//--Alpha Sub tab send keys--//
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(AlphaSubTab);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(AlphaSubTab);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_TAB_007.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ALP_TAB_007 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ALP_TAB_007 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 5)
	@TestDescription("While clicking on Referesh screen referesh should takes place")
	public void ALP_TAB_008(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_TAB_008";
		String notes = "While clicking on Referesh screen referesh should takes place";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(3000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(3000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT_KCB003')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		//-- Edit Click--//
		WebElement AlphaTab = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[2]/a[2]/i[1]"));
		AlphaTab.click();
		Thread.sleep(3000);
		//-- Refersh Click--//
		driver.findElement(By.xpath("//i[contains(text(),'refresh')]")).click();
		Thread.sleep(3000);
	}
	@Test(dataProvider = "loginCredentials", priority = 6)
	@TestDescription("Create a record,Alpha tab should accept only numbers")
	public void ALP_TAB_009(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_TAB_009";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Alpha Tabl send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(AlphaTab);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(AlphaTab);
		Thread.sleep(2000);	
		//--Alpha Sub tab send keys--//
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(AlphaSubTab);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(AlphaSubTab);
		Thread.sleep(2000);	
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_TAB_009.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ALP_TAB_009 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ALP_TAB_009 Failed to save screenshot: " + e.getMessage());
				}
		WebElement Success=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String SuccessText = Success.getText();
		System.out.println(SuccessText);
		String notes = "Create a record	,Alpha tab should accept only numbers" + SuccessText;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 7)
	@TestDescription("Only Number should accept in Alpha tab ,if we enter alphanumeric or special character ,Inline trigger should appear.")
	public void ALP_TAB_010(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_TAB_010";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Alpha Tabl send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(AlphaTabSpecial);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(AlphaTabSpecial);
		Thread.sleep(2000);	
		//--Alpha Sub tab send keys--//
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(AlphaSubTabSpecial);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(AlphaSubTabSpecial);
		Thread.sleep(2000);	
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_TAB_010.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ALP_TAB_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ALP_TAB_010 Failed to save screenshot: " + e.getMessage());
				}
		String notes = "Only Number should accept in Alpha tab ,if we enter alphanumeric or special character ,Inline trigger should appear." ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 8)
	@TestDescription("The created record should save successfully")
	public void ALP_TAB_014(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_TAB_014";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Alpha Tabl send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(AlphaTab1);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(AlphaTab1);
		Thread.sleep(2000);	
		//--Alpha Sub tab send keys--//
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(AlphaSubTab1);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(AlphaSubTab1);
		Thread.sleep(2000);	
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_TAB_014.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ALP_TAB_014 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ALP_TAB_014 Failed to save screenshot: " + e.getMessage());
				}
		WebElement Success=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String SuccessText = Success.getText();
		System.out.println(SuccessText);
		String notes = "The created record should save successfully" + SuccessText;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 9)
	@TestDescription("Num tab should accept only numbers	Successfully numbers accepted in Num tab")
	public void ALP_NUM_015(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_NUM_015";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Num tab click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")).click();
		Thread.sleep(3000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Num Tab send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(NumTab);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(NumSubTab);
		Thread.sleep(2000);	
		//--Num Sub tab send keys--//							
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(NumTab);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(NumSubTab);
		Thread.sleep(2000);	
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_NUM_015.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ALP_NUM_015 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ALP_NUM_015 Failed to save screenshot: " + e.getMessage());
				}
		WebElement Success=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String SuccessText = Success.getText();
		System.out.println(SuccessText);
		String notes = "Num tab should accept only numbers	Successfully numbers accepted in Num tab" + SuccessText;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 10)
	@TestDescription("Only Number should accept in Num tab ,if we enter Numnumeric or special character ,Inline trigger should appear.")
	public void ALP_NUM_016(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_NUM_016";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Num tab click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")).click();
		Thread.sleep(3000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Num Tab send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(NumTabSpecial);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(NumSubTabSpecial);
		Thread.sleep(2000);	
		//--Num Sub tab send keys--//							
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(NumTabSpecial);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(NumSubTabSpecial);
		Thread.sleep(2000);	
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_NUM_016.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ALP_NUM_016 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ALP_NUM_016 Failed to save screenshot: " + e.getMessage());
				}
		String notes = "Only Number should accept in Num tab ,if we enter Numnumeric or special character ,Inline trigger should appear." ;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 11)
	@TestDescription("Click on add and create a record and click on save	The created record should save successfully")
	public void ALP_NUM_020(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_NUM_020";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Num tab click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")).click();
		Thread.sleep(3000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Num Tab send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(NumTab1);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(NumSubTab1);
		Thread.sleep(2000);	
		//--Num Sub tab send keys--//							
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(NumTab1);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(NumSubTab1);
		Thread.sleep(2000);	
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_NUM_020.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ALP_NUM_020 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ALP_NUM_020 Failed to save screenshot: " + e.getMessage());
				}
		WebElement Success=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String SuccessText = Success.getText();
		System.out.println(SuccessText);
		String notes = "Click on add and create a record and click on save	The created record should save successfully" + "_" + SuccessText;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 12)
	@TestDescription("Trigger should appear that add pending records status cannot be changed")
	public void ALP_NUM_023(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_NUM_023";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Num tab click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")).click();
		Thread.sleep(3000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("301");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Test_301')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement EditClick = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		EditClick.click();
		Thread.sleep(2000);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		WebElement Status = driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"));
		Status.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Inactive')]")).click();
		Thread.sleep(2000);
		//-- Modify click--//
		driver.findElement(By.xpath("//button[contains(text(),'Modify')]")).click();
		Thread.sleep(2000);
		WebElement Success=driver.findElement(By.xpath("//div[contains(text(),'Addition of only active record is allowed')]"));
		String SuccessText = Success.getText();
		System.out.println(SuccessText);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_NUM_023.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ALP_NUM_023 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ALP_NUM_023 Failed to save screenshot: " + e.getMessage());
		}
		String notes = "Trigger should appear that add pending records status cannot be changed" + "_" + SuccessText;
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 13)
	@TestDescription("After rejection record should be rejected and new record should be added, While adding new record Field is Mandatory should not display")
	public void ALP_NUM_024(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_NUM_024";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Num tab click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")).click();
		Thread.sleep(3000);
		//-- Add Click--//
				driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
				Thread.sleep(3000);
				//-- Num Tab send keys--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("300");
				//-- description send keys--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Test_300");
				Thread.sleep(2000);	
				//--Num Sub tab send keys--//							
				WebElement NumSUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
				NumSUBTAB.click();
				NumSUBTAB.sendKeys("300");
				//-- Description--send keys--//
				driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys("Test_300");
				Thread.sleep(2000);	
				//-- Save Click--//
				driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
				Thread.sleep(7000);
				driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
				Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);	
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);	
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("300");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Test_300')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Reject = driver.findElement(By.xpath("//i[contains(text(),'do_not_disturb_alt')]"));
		Reject.click();
		Thread.sleep(2000);
		//-- Yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(10000);
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_NUM_024.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ALP_NUM_024 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ALP_NUM_024 Failed to save screenshot: " + e.getMessage());
		}
		String notes = "After rejection record should be rejected and new record should be added, While adding new record Field is Mandatory should not display" ;
      ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
      Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 14)
	@TestDescription(" Create a record and click on clear then click on Save, Atleast one row is mandatory popup should display")
	public void ALP_NUM_025(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_NUM_025";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Alpha Tabl send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(AlphaTab);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(AlphaTab);
		Thread.sleep(2000);	
		//--Alpha Sub tab send keys--//
		WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		ALPHASUBTAB.click();
		ALPHASUBTAB.sendKeys(AlphaSubTab);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(AlphaSubTab);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[contains(text(),'Clear')]")).click();
		//--yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		String notes = " Create a record and click on clear then click on Save, Atleast one row is mandatory popup should display" ;
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_NUM_025.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ALP_NUM_025 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ALP_NUM_025 Failed to save screenshot: " + e.getMessage());
		}
		ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 15)
	@TestDescription("Click on Select records and  Bulk Reject, 	All the selected records should be rejected")
	public void ALP_NUM_026(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_NUM_026";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		for(int ALPHA_NUM = 1; ALPHA_NUM<= 4; ALPHA_NUM++) {
			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
			//-- Alpha Tabl send keys--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(AlphaTabReject + ALPHA_NUM);
			//-- description send keys--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(AlphasubReject);
			Thread.sleep(2000);	
			//--Alpha Sub tab send keys--//
			WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
			ALPHASUBTAB.click();
			ALPHASUBTAB.sendKeys(AlphaTabReject + ALPHA_NUM);
			Thread.sleep(2000);
			//-- Description--send keys--//
			driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(AlphasubReject);
			Thread.sleep(2000);	
			//-- Save Click--//
			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
			Thread.sleep(2000);
			//-- Back click--//
			driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
			Thread.sleep(4000);
		}
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- COlumn click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(AlphasubReject);
		Thread.sleep(2000);
		//-- Add filter --//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Pend");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		//-- Select all button--//
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		//-- Reject click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/i[1]")).click();
		//-- Yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_NUM_026.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ALP_NUM_026 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ALP_NUM_026 Failed to save screenshot: " + e.getMessage());
		}
		WebElement Text = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Reject = Text.getText();
		System.out.println(Reject);
		String notes = "Click on Select records and  Bulk Reject ,	All the selected records should be rejected" +  "," + Reject ;
		ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		Thread.sleep(5000);
		//-- Num tab click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")).click();
		for(int NUMTAB = 1; NUMTAB<=3; NUMTAB++) {
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Num Tab send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(NumTabReject+NUMTAB);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(NumSubTabReject);
		Thread.sleep(2000);	
		//--Num Sub tab send keys--//							
		WebElement NumSUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		NumSUBTAB.click();
		NumSUBTAB.sendKeys(NumTabReject+NUMTAB);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(NumSubTabReject);
		Thread.sleep(2000);	
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(5000);
		}
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);	
		//--Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);	
		//-- Column Select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Description sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(NumSubTabReject);
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		//-- Select All--//
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		//-- Reject click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/i[1]")).click();
		//-- Yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		WebElement Text1 = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String NumReject = Text1.getText();
		System.out.println(NumReject);
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 16)
	@TestDescription("Click on Select records and  Bulk Approve	All the selected records should be Approved")
	public void ALP_NUM_027(String username, String password) throws InterruptedException {
		String ScreenName = "Alpha Num Tab";
		String testCaseId = "ALP_NUM_026";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		for(int ALPHA_NUM = 5; ALPHA_NUM<= 6; ALPHA_NUM++) {
			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
			//-- Alpha Tabl send keys--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(AlphaTabApprove + ALPHA_NUM);
			//-- description send keys--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(AlphaSubAprove);
			Thread.sleep(2000);	
			//--Alpha Sub tab send keys--//
			WebElement ALPHASUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
			ALPHASUBTAB.click();
			ALPHASUBTAB.sendKeys(AlphaTabApprove + ALPHA_NUM);
			Thread.sleep(2000);
			//-- Description--send keys--//
			driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(AlphaSubAprove);
			Thread.sleep(2000);	
			//-- Save Click--//
			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
			Thread.sleep(2000);
			//-- Back click--//
			driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
			Thread.sleep(4000);
		}
		Thread.sleep(5000);
		//-- Num tab click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")).click();
		for(int NUMTAB = 5; NUMTAB<=6; NUMTAB++) {
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//-- Num Tab send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(NumTabApprove+NUMTAB);
		//-- description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys(NumSubTabApprove);
		Thread.sleep(2000);	
		//--Num Sub tab send keys--//							
		WebElement NumSUBTAB = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"));
		NumSUBTAB.click();
		NumSUBTAB.sendKeys(NumTabApprove+NUMTAB);
		//-- Description--send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")).sendKeys(NumSubTabApprove);
		Thread.sleep(2000);	
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(5000);
		}
		WebElement Logout = driver.findElement(By.xpath("//i[contains(text(),'person')]"));
		Actions action = new Actions(driver);
		action.moveToElement(Logout).perform();
		WebElement Logout1 = driver.findElement(By.xpath("//i[contains(text(),'person')]"));
		Logout1.click();
		Thread.sleep(2000);	
		//--Logout CLick--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("System");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- RA Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		//-- RA Dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//-- Alpha num tab select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				//-- COlumn click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				//-- Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				//-- Value send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(AlphaSubAprove);
				Thread.sleep(2000);
				//-- Add filter --//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
				//-- Column click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				//-- Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
				//-- Value send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Pend");
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(4000);
				//-- Select all button--//
				driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
				//-- Reject click--//
				driver.findElement(By.xpath("//i[contains(text(),'done')]")).click();
				Thread.sleep(2000);
				//-- Yes click--//
				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
				Thread.sleep(2000);
				//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\ALP_NUM_027.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ALP_NUM_027 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ALP_NUM_027 Failed to save screenshot: " + e.getMessage());
				}
				WebElement Text = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
				String AlphaApprove = Text.getText();
				System.out.println(AlphaApprove);
				String notes = "Click on Select records and  Bulk Approve	All the selected records should be Approved" +  "," + AlphaApprove ;
				ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		Thread.sleep(2000);	
		//-- Num Tab Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")).click();
		Thread.sleep(5000);	
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);	
		//--Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);	
		//-- Column Select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Description sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(NumSubTabApprove);
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		//-- Select All--//
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Reject click--//
		driver.findElement(By.xpath("//i[contains(text(),'done')]")).click();
		//-- Yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		WebElement Text1 = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String NumApprove = Text1.getText();
		System.out.println(NumApprove);
		Thread.sleep(2000);
	}
	
	
	
}
