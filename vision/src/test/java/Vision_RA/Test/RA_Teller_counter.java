package Vision_RA.Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.Login;
import Package_PageObject.POM_RA;

public class RA_Teller_counter extends BaseClass {

	String Teller_filter_app = "Approved";
	String Teller_filter_add = "Add";

	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		return new Object[][] { { "RA", "Vision@123" }, };
	}

	private Login LoginPage;
	private POM_RA TellerCounter;

	@BeforeMethod
	public void setUpLogin() {
		LoginPage = new Login(driver);
		TellerCounter = new POM_RA(driver);
	}

	@Test(dataProvider = "loginCredentials", priority = 1)
	@TestDescription("Data has to be deleted with a confirmation.")
	public void TEL_DC_001(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_001";
		String notes = "Data has to be deleted with a confirmation.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Teller_filter_app);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		//-- Check box tick--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
		//-- Delete button click-//
		driver.findElement(By.xpath("//i[contains(text(),'delete')]")).click();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TEL_DC_001.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" TEL_DC_001 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("TEL_DC_001 Failed to save screenshot: " + e.getMessage());
		}
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 2)
	@TestDescription("Teller bucket is editable.")
	public void TEL_DC_003(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_003";
		String notes = "Teller bucket is editable.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		//-- COuntry click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- le book click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- customer id click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("100017");
		//-- Manifier search click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(2000);
		//-- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'100017')]")).click();
		//-- Teller bucket dropdown click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Teller bucket dropdown select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//date select--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-teller-counter-array-table[1]/div[1]/div[1]/div[1]/div[1]/app-form-array-table[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
		//-- save click--//
		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
		Thread.sleep(2000);
		//-- Teller bucket dropdown click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Teller bucket dropdown select--//
		driver.findElement(By.xpath("//span[contains(text(),'NOR2 - 20')]")).click();
		//-- save click--//
		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
		Thread.sleep(3000);
	}
	@Test(dataProvider = "loginCredentials", priority = 3)
	@TestDescription("Click on approved record and change the status from active to any other status and Click on save( except delete status).")
	public void TEL_DC_004(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_004";
		String notes = "Click on approved record and change the status from active to any other status and Click on save( except delete status).";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Teller_filter_app);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		//-- status click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		//-- satatus select--//
		driver.findElement(By.xpath("//span[contains(text(),'Old')]")).click();
		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
		Thread.sleep(3000);	
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TEL_DC_004.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" TEL_DC_004 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("TEL_DC_004 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 4)
	@TestDescription("The status should not be changed( As Add pending record status should always be in active).")
	public void TEL_DC_005(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_005";
		String notes = "The status should not be changed( As Add pending record status should always be in active).";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Teller_filter_add);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		//-- status click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		//-- satatus select--//
		driver.findElement(By.xpath("//span[contains(text(),'Inactive')]")).click();
		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
		Thread.sleep(3000);	
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TEL_DC_005.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" TEL_DC_005 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("TEL_DC_005 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 5)
	@TestDescription("If  inner loop is configured trriger should appear ")
	public void TEL_DC_006(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_006";
		String notes = "If  inner loop is configured trriger should appear ";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		//-- COuntry click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- le book click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- customer id click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
		//-- Teller bucket dropdown click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Teller bucket dropdown select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//date select--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-teller-counter-array-table[1]/div[1]/div[1]/div[1]/div[1]/app-form-array-table[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		//-- COuntry click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- le book click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- customer id click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
		//-- Teller bucket dropdown click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Teller bucket dropdown select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//date select--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-teller-counter-array-table[1]/div[1]/div[1]/div[1]/div[1]/app-form-array-table[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
		//-- save click--//
		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TEL_DC_006.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" TEL_DC_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("TEL_DC_006 Failed to save screenshot: " + e.getMessage());
	}	
		
	}
	@Test(dataProvider = "loginCredentials", priority = 6)
	@TestDescription("Teller bucket can be edited ")
	public void TEL_DC_007(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_007";
		String notes = "Teller bucket can be edited ";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		//-- COuntry click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- le book click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- customer id click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TEL_DC_007.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" TEL_DC_007 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("TEL_DC_007 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 7)
	@TestDescription("Data has to be properly alligned")
	public void TEL_DC_008(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_008";
		String notes = "Data has to be properly alligned";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		//-- Save click--//
		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
		Thread.sleep(1000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TellerCounter\\TEL_DC_008.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" TEL_DC_008 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("TEL_DC_008 Failed to save screenshot: " + e.getMessage());
		}	
	}
	@Test(dataProvider = "loginCredentials", priority = 8)
	@TestDescription("Data has to be successfully saved if it fullfill all the condition")
	public void TEL_DC_009(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_009";
		String notes = "Data has to be successfully saved if it fullfill all the condition";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		//-- COuntry click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- le book click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- customer id click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TEL_DC_009.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" TEL_DC_009 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("TEL_DC_009 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 9)
	@TestDescription("Selected data under magnifier query has to be shown in the screen")
	public void TEL_DC_010(String username, String password) throws InterruptedException {
		String ScreenName = "Teller Conter";
		String testCaseId = "TEL_DC_010";
		String notes = "Selected data under magnifier query has to be shown in the screen";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
		TellerCounter.TellerCounter();
		Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		//-- Status Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		//--  Inactive click--//
		driver.findElement(By.xpath("//span[contains(text(),'Inactive')]")).click();
		//-- Save click--//
		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TEL_DC_010.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" TEL_DC_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("TEL_DC_010 Failed to save screenshot: " + e.getMessage());
		}
	}
////	@Test(dataProvider = "loginCredentials", priority = 10)
////	public void TEL_DC_011(String username, String password) throws InterruptedException {
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
////				.sendKeys(username);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
////				.sendKeys(password);
////		Thread.sleep(2000);
////		driver.findElement(By
////				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
////				.click();
////		Thread.sleep(5000);
////		// -- Master Configuration tab Click--//
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
////				.click();
////		Thread.sleep(2000);
////		// -- MAster Config Dropdown Click--//
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
////				.click();
////		Thread.sleep(2000);
////		//-- Teller counter click--//
////		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
////		Thread.sleep(2000);
////		//-- Add click--//
////		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
////		//-- Add click--//
////		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
////		//-- COuntry click--//
////		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
////		Thread.sleep(2000);
////		//-- Country select--//
////		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
////		//-- le book click--//
////		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
////		Thread.sleep(2000);
////		//--le book select--//
////		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
////		//-- customer id click--//
////		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
////		Thread.sleep(2000);
////		//-- Page nation click--//
////		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[3]/span[2]/ul[1]/li[2]/button[1]/i[1]")).click();
////		//-- Page nation click--//
////		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[3]/span[2]/ul[1]/li[2]/button[1]/i[1]")).click();
////		//-- Page nation click--//
////		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[3]/span[2]/ul[1]/li[2]/button[1]/i[1]")).click();	
////		//-- customer id select--//
////		driver.findElement(By.xpath("//td[contains(text(),'100046')]")).click();
////		Thread.sleep(2000);
////		//-- Date Select --//
////		
////	}
//	
//	    
//	@Test(dataProvider = "loginCredentials",priority = 1)
//	@TestDescription("")
//	public void Date_Selection(String username, String password) throws InterruptedException {
//	    String ScreenName = "Teller Counter";
//	    String testCaseId = "";
//	    String notes = "";
//	    ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
//	    // Login steps
//	    LoginPage.loginUsername(username);
//	    LoginPage.loginPassword(password);
//	    LoginPage.LoginClick();
//	    Thread.sleep(5000);
//	    // Wait for Teller Counter page to load
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    TellerCounter.TellerCounter();
//	    Thread.sleep(5000);
//	    // Open the date picker
//	    WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/app-root/app-main-container/div/div[2]/div/app-teller-counter-array-table/div/div/div/div/app-form-array-table/form/perfect-scrollbar/div/div/table/tbody/tr/td[14]/div/div/div/div/app-custom-date-picker/app-regular-datepicker/mat-form-field/div/div/div/input")));
//	    dateInput.click();
//	    Thread.sleep(2000);
//	    // Hardcode the year (2024)
//	    String year = "2024";  // Change this as needed
//	    String month = "NOV";  // Change this as needed
//	    String day = "11";     // Change this as needed
//	    Thread.sleep(2000);
//	    // Select the year
//	    WebElement yearSelector = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")));
//	    yearSelector.click();
//	    Thread.sleep(2000);
//	    // Select the specific year dynamically
//	    WebElement yearElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), '" + year + "')]")));
//	    yearElement.click();
//	    Thread.sleep(2000);
//	    // Select the specific month dynamically
//	    WebElement monthElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), '" + month + "')]")));
//	    monthElement.click();
//	    Thread.sleep(2000);
//	    // Select the specific day dynamically
//	    WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), '" + day + "')]")));
//	    dayElement.click();
//	    Thread.sleep(2000);
//	    // Optionally, verify the selected date (optional verification)
//	    WebElement selectedDate = driver.findElement(By.xpath("//html/body/app-root/app-main-container/div/div[2]/div/app-teller-counter-array-table/div/div/div/div/app-form-array-table/form/perfect-scrollbar/div/div/table/tbody/tr/td[14]/div/div/div/div/app-custom-date-picker/app-regular-datepicker/mat-form-field/div/div/div/input"));
//	    System.out.println("Selected Date: " + selectedDate.getAttribute("value"));
//	    // Optional delay for UI updates
//	    Thread.sleep(2000);
//	}


}
