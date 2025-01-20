package Vision_RA.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.Login;
import Package_PageObject.POM_RA_BusinessLine;
import Package_PageObject.POM_General;
import Package_PageObject.POM_RA;
import Package_PageObject.POM_Transline;

public class RA_MasterConfiguration extends BaseClass {

	String VAT = "VAT";
	String TranslineID= "VAT_Sing1";
	String TranslineDesc = "VAT_SingleApprove1_DESC";
	String BusinessLineID = "VAT_Sing1";
	String BusinessLineDesc = "VAT_SingleApprove1_DESC";
	String TranslineID1= "VAT_Sing2";
	String TranslineDesc1 = "VAT_SingleApprove2_DESC";
	String BusinessLineID1 = "VAT_Sing2";
	String BusinessLineDesc1 = "VAT_SingleApprove2_DESC";
	
	
	private Login LoginPage;
	private POM_RA TranslineConfig;
	private POM_General General;
	private POM_Transline Trans;
	private POM_RA_BusinessLine Bus;

	@BeforeMethod
	public void setUpLogin() {
		LoginPage = new Login(driver);
		TranslineConfig = new POM_RA(driver);
		General = new POM_General(driver);
		Trans = new POM_Transline(driver);
		Bus = new POM_RA_BusinessLine(driver);
	}

	@TestDescription("The display of the alert message would help users understand that the record has been modified.")
	@Test(dataProvider = "loginCredentials", priority = 1)
	public void RA_MC_001(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_001";
		String notes = "The display of the alert message would help users understand that the record has been modified.";
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
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);// -- MAster Config Dropdown Click
//		// -- Transline config Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(5000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[4]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Transline = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[6]/a[1]/i[1]"));
		Transline.click();
		Thread.sleep(2000);
		// -- Description--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys("NEW");
//		Trans.TranslineDesc("NEW");
		Thread.sleep(2000);
		// -- Back Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_001.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_MC_001 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_001 Failed to save screenshot: " + e.getMessage());
		}
	}

	@TestDescription("If the Transline Type is closed, the header line, including Transline Description and Group, should not be cleared.")
	@Test(dataProvider = "loginCredentials", priority = 2)
	public void RA_MC_002(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_002";
		String notes = "If the Transline Type is closed, the header line, including Transline Description and Group, should not be cleared.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		// -- Add Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(2000);
		// --Transline Type Cancel Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
	}

	@TestDescription("If Transline Type is set to 'Product' or 'Service,' headers like Transline Group and Transline Description should remain stable and not change based on the selected type.")
	@Test(dataProvider = "loginCredentials", priority = 3)
	public void RA_MC_003(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_003";
		String notes = "If Transline Type is set to 'Product' or 'Service,' headers like Transline Group and Transline Description should remain stable and not change based on the selected type.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		// -- Add Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(2000);
		// -- Transline Type Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// --Transline Type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// --Transline Type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(3000);
	}

	@TestDescription("The all header names should be in the same colour.")
	@Test(dataProvider = "loginCredentials", priority = 4)
	public void RA_MC_004(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_004";
		String notes = "The all header names should be in the same colour.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		// -- Add Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(2000);
		// -- Transline ID Click--/
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);
		// -- Transline Description Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.click();
		Thread.sleep(2000);
		// -- Transline ID Click--/
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(3000);
	}

	@TestDescription("In Line trigger should pop that data is Duplicate. after changing the Trigger should disappear")
	@Test(dataProvider = "loginCredentials", priority = 5)
	public void RA_MC_013(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_013";
		String notes = "In Line trigger should pop that data is Duplicate. after changing the Trigger should disappear";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		General.FILTER();
//		// - Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		General.FilterColumnclick();
//		// -- Column click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		// --Value Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT");
		// --Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT / VAT123')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement TransLine = driver.findElement(By.xpath(
				"//i[contains(text(),'mode_edit')]"));
		TransLine.click();
		Thread.sleep(2000);
		// -- Add row click--//
		driver.findElement(By.xpath(	
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/div[1]/i[1]"))
				.click();
		// -- loan account--//		
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// -- Product description--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- ALL Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// -- Currency click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA_MC_013.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_MC_013 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_013 Failed to save screenshot: " + e.getMessage());
		}
		// -- Currency click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'ACU')]")).click();
		Thread.sleep(4000);
	}

	@TestDescription("Popup should appear to Save the changes ")
	@Test(dataProvider = "loginCredentials", priority = 6)
	public void RA_MC_012(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_012";
		String notes = "Popup should appear to Save the changes ";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// -- Criteria click--/
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		// -- Criteria select--//
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		// --Edit CLick--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(4000);
		// -- Business line id send keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("TEST");
		Thread.sleep(2000);
		// -- Transline configuration click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]"))
				.click();
		// -- No click--//
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		// -- Move again to Businessline--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(2000);
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_012.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_MC_012 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_012 Failed to save screenshot: " + e.getMessage());
		}
	}

	@TestDescription("Ensure clear access to the dropdown without being hidden by the delete function in aggregation.")
	@Test(dataProvider = "loginCredentials", priority = 7)
	public void RA_MC_005(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_005";
		String notes = "Ensure clear access to the dropdown without being hidden by the delete function in aggregation.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- Ra Admin click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Recom Config click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Recon = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		Recon.click();
		// -- Column CLick--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_005.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_MC_005 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_005 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}

	@TestDescription("Ensure the cursor indicates the clickable nature of the functions in the recon configuration.")
	@Test(dataProvider = "loginCredentials", priority = 8)
	public void RA_MC_007(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_007";
		String notes = "Ensure the cursor indicates the clickable nature of the functions in the recon configuration.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- Ra Admin click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Recom Config click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Relationship click--//
		driver.findElement(By.xpath("//span[contains(text(),'Relationship')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/i[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Relationship = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/i[1]"));
		Thread.sleep(2000);
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_007.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_MC_007 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_007 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@TestDescription("Create a record and approve (Transline , business line and fees)	If the record is in add pending status , after the approval all the transline, business line and fees should get approved.")
	@Test(dataProvider = "loginCredentials", priority = 9)
	public void RA_MC_014(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_014";
		String notes = "Create a record and approve (Transline , business line and fees)	If the record is in add pending status , after the approval all the transline, business line and fees should get approved.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		Trans.TranslineAdd();
		Trans.TranslineID(TranslineID);
		Trans.TranslineDesc(TranslineDesc);
		Thread.sleep(2000);
		Trans.ProductlineType();
		Thread.sleep(2000);
		Trans.ProductSelectAsset();
		Thread.sleep(2000);
		Trans.TranslineGroupProduct();
		Thread.sleep(2000);
		Trans.GroupProductCASA();
		Trans.Businessvertical();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Personal Banking')]")).click();
		//-- Extraction Frequency Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Daily')]")).click();
		//-- GL Product type Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'FDA - Fixed Deposit')]")).click();
		//-- Product Description Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'ALL - All')]")).click();
		//-- Currency Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Currency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Trans.TranslineSave();
		Thread.sleep(7000);
		//-- Business Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(2000);
		Bus.BusinessLineID(BusinessLineID);
		Bus.BusinesslineDesc(BusinessLineDesc);
		Bus.BusinessLineType();
		Thread.sleep(2000);
		Bus.BusinessLineTypeExpense();
		Thread.sleep(2000);
		Bus.IEType();
		Thread.sleep(2000);
		Bus.IESelect();
		Thread.sleep(2000);
		Bus.ServiceTypeclick();
		Thread.sleep(2000);
		Bus.ServiceTypeSelect();
		Bus.ServiceDescClick();
		Thread.sleep(2000);
		Bus.ServideDesSelect();
		Bus.CurrencyClick();
		Thread.sleep(2000);
		Bus.CurrencySelect();
		Bus.GLCode();
		Thread.sleep(2000);
		Bus.GLSelect();
		Bus.AccountClick();
		Thread.sleep(2000);
		Bus.AccountSelect();
		Bus.ReconClick();
		Bus.RulePriority("1");
		Bus.RuleID_Dropdown();
		Thread.sleep(2000);
		Bus.RuleSelect();
		Bus.ReconTypeDropdown();
		Thread.sleep(2000);
		Bus.ReconTypeSelect();
		Bus.ReconMethodDropdown();
		Thread.sleep(2000);
		Bus.ReconMethodSelect();
		Bus.GraceDays("1");	
		Bus.BusinesslineSave();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Fee Type dropdown Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--..//
		driver.findElement(By.xpath("//span[contains(text(),'Flat')]")).click();
		//-- Fee Basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		//-- Fees Add row--/
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Target.sendKeys("5");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Save Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		//-- Back click--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(5000);
		General.Home();
		General.UserProfile();
		Thread.sleep(5000);
		//-- Logout click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]")).click();
		Thread.sleep(5000);
		LoginPage.loginUsername("System");
		LoginPage.loginPassword("Vision@123");
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(7000);
		General.FILTER();
		General.FilterColumnclick();
		//-- Transline ID Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(TranslineID);
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement TranslineApprove = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[4]/i[1]"));
		TranslineApprove.click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_014.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_MC_014 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_014 Failed to save screenshot: " + e.getMessage());
		}
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_014_1.png";
		//-- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" RA_MC_014_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_014_1 Failed to save screenshot: " + e.getMessage());
		}
		
	}
	@TestDescription("Create a record and approve (Transline , business line and fees)	Untick Businessline & Fees ,Only transline should get approved.")
	@Test(dataProvider = "loginCredentials", priority = 9)
	public void RA_MC_015(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_015";
		String notes = "Create a record and approve (Transline , business line and fees)	Untick Businessline & Fees ,Only transline should get approved.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		Trans.TranslineAdd();
		Trans.TranslineID(TranslineID1);
		Trans.TranslineDesc(TranslineDesc1);
		Thread.sleep(2000);
		Trans.ProductlineType();
		Thread.sleep(2000);
		Trans.ProductSelectAsset();
		Thread.sleep(2000);
		Trans.TranslineGroupProduct();
		Thread.sleep(2000);
		Trans.GroupProductCASA();
		Trans.Businessvertical();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Personal Banking')]")).click();
		//-- Extraction Frequency Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Daily')]")).click();
		//-- GL Product type Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'FDA - Fixed Deposit')]")).click();
		//-- Product Description Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'ALL - All')]")).click();
		//-- Currency Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Currency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Trans.TranslineSave();
		Thread.sleep(7000);
		//-- Business Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(2000);
		Bus.BusinessLineID(BusinessLineID1);
		Bus.BusinesslineDesc(BusinessLineDesc1);
		Bus.BusinessLineType();
		Thread.sleep(2000);
		Bus.BusinessLineTypeExpense();
		Thread.sleep(2000);
		Bus.IEType();
		Thread.sleep(2000);
		Bus.IESelect();
		Thread.sleep(2000);
		Bus.ServiceTypeclick();
		Thread.sleep(2000);
		Bus.ServiceTypeSelect();
		Bus.ServiceDescClick();
		Thread.sleep(2000);
		Bus.ServideDesSelect();
		Bus.CurrencyClick();
		Thread.sleep(2000);
		Bus.CurrencySelect();
		Bus.GLCode();
		Thread.sleep(2000);
		Bus.GLSelect();
		Bus.AccountClick();
		Thread.sleep(2000);
		Bus.AccountSelect();
		Bus.ReconClick();
		Bus.RulePriority("1");
		Bus.RuleID_Dropdown();
		Thread.sleep(2000);
		Bus.RuleSelect();
		Bus.ReconTypeDropdown();
		Thread.sleep(2000);
		Bus.ReconTypeSelect();
		Bus.ReconMethodDropdown();
		Thread.sleep(2000);
		Bus.ReconMethodSelect();
		Bus.GraceDays("1");	
		Bus.BusinesslineSave();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Fee Type dropdown Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--..//
		driver.findElement(By.xpath("//span[contains(text(),'Flat')]")).click();
		//-- Fee Basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		//-- Fees Add row--/
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Target.sendKeys("5");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Save Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		//-- Back click--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(10000);
		General.Home();
		General.UserProfile();
		Thread.sleep(5000);
		//-- Logout click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]")).click();
		Thread.sleep(5000);
		LoginPage.loginUsername("System");
		LoginPage.loginPassword("Vision@123");
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(7000);
		General.FILTER();
		General.FilterColumnclick();
		//-- Transline ID Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(TranslineID1);
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement TranslineApprove = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[4]/i[1]"));
		TranslineApprove.click();
		Thread.sleep(2000);
		//-- Businessline Untick--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).click();
		//-- Fees Untick--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_015.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_MC_015 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_015 Failed to save screenshot: " + e.getMessage());
		}
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_015_1.png";
		//-- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" RA_MC_015_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_015_1 Failed to save screenshot: " + e.getMessage());
		}
		
	}
	@TestDescription("Verify delete	Record in (Transline, Businessline and Fees Approved) status should move to Delete pending")
	@Test(dataProvider = "loginCredentials", priority = 10)
	public void RA_MC_016(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_016";
		String notes = "Verify delete	Record in (Transline, Businessline and Fees Approved) status should move to Delete pending";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		General.FILTER();
		General.FilterColumnclick();
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TST_F_001");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
	Thread.sleep(5000);
			WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement TranslineDelete = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[4]/i[1]"));
		TranslineDelete.click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_016.png";
		//-- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" RA_MC_016 Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_016 Failed to save screenshot: " + e.getMessage());
		}
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_016_1.png";
		//-- save the screenshot --//
		File destinationFile11 = new File(Location11);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
			System.out.println(" RA_MC_016_1 Screenshot saved to: " + destinationFile11.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_016_1 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(5000);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		WebElement TranslineReject = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[5]/i[1]"));
		TranslineReject.click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location111 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_016_2.png";
		//-- save the screenshot --//
		File destinationFile111 = new File(Location111);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile111, destinationFile111);
			System.out.println(" RA_MC_016_2 Screenshot saved to: " + destinationFile111.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_016_2 Failed to save screenshot: " + e.getMessage());
		}
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1111 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_016_3.png";
		//-- save the screenshot --//
		File destinationFile1111 = new File(Location1111);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1111, destinationFile1111);
			System.out.println(" RA_MC_016_3 Screenshot saved to: " + destinationFile1111.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_016_3 Failed to save screenshot: " + e.getMessage());
		}
	}
	@TestDescription("Verify delete	Record in (Transline, Businessline and Fees Approved) , Untick Businessline & Fees Only Transline status should move to Delete pending")
	@Test(dataProvider = "loginCredentials", priority = 11)
	public void RA_MC_017(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_017";
		String notes = "Verify delete	Record in (Transline, Businessline and Fees Approved) , Untick Businessline & Fees Only Transline status should move to Delete pending";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Thread.sleep(7000);
		General.FILTER();
		General.FilterColumnclick();
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TST_F_001");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement TranslineDelete = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[4]/i[1]"));
		TranslineDelete.click();
		Thread.sleep(2000);
		//-- Untick Business & Fees--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]")).click();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_017.png";
		//-- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" RA_MC_017 Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_017 Failed to save screenshot: " + e.getMessage());
		}
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_017_1.png";
		//-- save the screenshot --//
		File destinationFile11 = new File(Location11);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
			System.out.println(" RA_MC_017_1 Screenshot saved to: " + destinationFile11.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_017_1 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(5000);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		WebElement TranslineReject = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[5]/i[1]"));
		TranslineReject.click();
		Thread.sleep(2000);
		//-- Untick Business & Fees--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]")).click();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location111 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_017_2.png";
		//-- save the screenshot --//
		File destinationFile111 = new File(Location111);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile111, destinationFile111);
			System.out.println(" RA_MC_017_2 Screenshot saved to: " + destinationFile111.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_017_2 Failed to save screenshot: " + e.getMessage());
		}
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1111 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_017_3.png";
		//-- save the screenshot --//
		File destinationFile1111 = new File(Location1111);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1111, destinationFile1111);
			System.out.println(" RA_MC_017_3 Screenshot saved to: " + destinationFile1111.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_017_3 Failed to save screenshot: " + e.getMessage());
		}
	}
	@TestDescription("Create a record in service line	Data should flow without dependency")
	@Test(dataProvider = "loginCredentials", priority = 12)
	public void RA_MC_020(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_020";
		String notes = "Create a record in service line	Data should flow without dependency";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
		TranslineConfig.Transline();
		Trans.TranslineAdd();
		Trans.TranslineType();
		Trans.TranslineService();
		Trans.TranslineGroupService();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1111 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_020.png";
		//-- save the screenshot --//
		File destinationFile1111 = new File(Location1111);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1111, destinationFile1111);
			System.out.println(" RA_MC_020 Screenshot saved to: " + destinationFile1111.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_MC_020 Failed to save screenshot: " + e.getMessage());
		}
		Trans.Businessvertical();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile11111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location11111 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_020_1.png";
				//-- save the screenshot --//
				File destinationFile11111 = new File(Location11111);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile11111, destinationFile11111);
					System.out.println(" RA_MC_020_1 Screenshot saved to: " + destinationFile11111.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("RA_MC_020_1 Failed to save screenshot: " + e.getMessage());
				}
	}
	
	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
