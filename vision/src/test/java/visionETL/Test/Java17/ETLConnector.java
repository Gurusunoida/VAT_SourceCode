package visionETL.Test.Java17;						//Prerequisite--- VAT1504, VATFLOW16 both in approved State,Connector_SendKeys- Change --//

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Package_PageObject.POM_General;
import Package_PageObject.Login;
import Package_PageObject.POM_ETL;
import Package_PageObject.POM_ETLConnectorQuery_J17;
import Package_PageObject.POM_ETLConnectorScript_J17;
import Package_PageObject.POM_ETLConnector_J17;

public class ETLConnector extends BaseClass{
	
	
	String Script= "VAT32";
	String Connector_SendKeys = "VAT_Auto_test32";
	String IP = "10.16.1.38";
	String port_int = "52866";
	String FilePath = ("D:\\Guru prasad documents\\sel.tz.reconfile.csv");
	String Connector_ID = "VAT_Flow";
	 private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
		ExtentTest currentTest = test.get();

		private Login LoginPage;
		private POM_ETLConnector_J17 Connector_J17;
		private POM_ETLConnectorQuery_J17 ConnectorQuery_J17;
		private POM_ETLConnectorScript_J17 ConnectorScript_J17;
		private POM_General ETL_General;
		private POM_ETL ETLConnector;
		 @BeforeMethod
		    public void setUpLogin() {
		        LoginPage = new Login(driver); 
		        Connector_J17 = new POM_ETLConnector_J17(driver);
		        ETL_General = new POM_General(driver);
		        ETLConnector = new POM_ETL(driver);
		        ConnectorQuery_J17 = new POM_ETLConnectorQuery_J17(driver);
		        ConnectorScript_J17 = new POM_ETLConnectorScript_J17(driver);
		    }

	 @DataProvider(name = "getUserNameList")
	    public Object[][] getUserNameList() {
	        return new Object[][] {
	            {"RA", "Vision@123"},
	        };
	    }
	 
	  private void takeScreenshot(String testName) throws IOException {
	        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String location = "test-output/Screenshot/ETL/" + testName + ".png";
	        File destinationFile = new File(location);
	        try {
	            FileUtils.copyFile(screenshotFile, destinationFile);
	            System.out.println(testName + " Screenshot saved to: " + destinationFile.getAbsolutePath());
	        } catch (IOException e) {
	            System.out.println(testName + " Failed to save screenshot: " + e.getMessage());
	        }
	    }
	
	@Parameters("ApplicationURL")
	@Test(priority = 1, dataProvider = "getUserNameList")
	 @TestDescription(" Page navigation issue observed in the ETL connector Script")
	public void ETL_CC_001(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Script";
		String testCaseId = "ETL_CC_001";
        String notes = "Page_nation Issue";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorScript();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]"))
				.click();
		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByIndex(2);
		
	}

	@Test(priority = 2, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
	@TestDescription("")																	//////// Removed)------////////
	public void ETL_CC_002(String loginName, String loginPwd) throws InterruptedException {
		LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByIndex(2);
		throw new SkipException("Skip");
	}

	@Test(priority = 3, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
																			//////// Removed)------////////
	public void ETL_CC_003(String loginName, String loginPwd) throws InterruptedException {
		LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("file_copy")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(5000);
		throw new SkipException("Skip");
	}

	@Test(priority = 4, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
																			//////// Removed)------////////
	public void ETL_CC_004(String loginName, String loginPwd) throws InterruptedException {
		LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("visibility")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[3]/i[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[4]/i[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[3]"))
				.click();
		throw new SkipException("Skip");
	}

	@Test(priority = 5, dataProvider = "getUserNameList")
	@TestDescription(" Semi Structure data Popup for Navback")
	public void ETL_CC_005(String loginName, String loginPwd) throws InterruptedException, IOException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_005";
        String notes = "Semi Structure data Popup";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		Thread.sleep(5000);
		ETL_General.FILTER();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Semi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHover = driver.findElement(By.xpath(
				"//span[contains(text(),'VAT_SEMI')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		WebElement edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		edit.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.clear();
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys("FINCON VAT");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(2000);
		// -- Take screenshot and save it to a file--//
		takeScreenshot("ETL_CC_005");
		Thread.sleep(4000);
		WebElement Popup = driver.findElement(By.xpath("//p[contains(text(),'Do you want to leave the page without saving the c')]"));
		String PopupMSG = Popup.getText();
		System.out.println(PopupMSG);
		 Assert.assertEquals(PopupMSG, "Do you want to leave the page without saving the changes ?", "PopUp does not match 'Do you want to leave the page without saving the changes ?'");
		 Thread.sleep(2000);
	}

	@Test(priority = 6, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
																			//////// Removed)------////////
	public void ETL_CC_006(String loginName, String loginPwd) throws InterruptedException {
		LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("file_copy")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(5000);
		throw new SkipException("Skip");
	}

	@Test(priority = 7, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
																			//////// Removed)------////////
	public void ETL_CC_007(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_007";
        String notes = "";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("share")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("fullscreen_exit")).click();
		Thread.sleep(2000);
		throw new SkipException("Skip");
	}

	@Test(priority = 8, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
																			//////// Removed)------////////
	public void ETL_CC_008(String loginName, String loginPwd) throws InterruptedException {
		LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);// --LOGIN CLICK
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000); // --NAVIGATES TO SINGLE CLICK
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);// --NAVIGATES TO CONNECTOR
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("file_copy")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("file_copy")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(3000);
		throw new SkipException("Skip");
	}

	@Test(priority = 9, dataProvider = "getUserNameList")
	@TestDescription(" The updated record should get saved- Connector Script")
	public void ETL_CC_009(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Script";
		String testCaseId = "ETL_CC_009";
        String notes = "The updated record should be get saved ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorScript();
		Thread.sleep(5000);
		ETL_General.ADD();
		Thread.sleep(5000);
		// -- Country Click--//
		ConnectorScript_J17.ConnectorScriptCountryClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(2000);
		// -- Country Select--//
		ConnectorScript_J17.ConnectorScriptCountrySelectAE();
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		Thread.sleep(2000);
		// -- Le Book click--//
		ConnectorScript_J17.ConnectorScriptLebookClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(2000);
		// -- LE book Select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(3000);
		//--Connector ID Click--//
		ConnectorScript_J17.ConnectorScriptConnectorIDClick(Connector_ID);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'VAT_FLOW - VAT_FLOW')]")).click();
		Thread.sleep(3000);
		//-- ScriptID Sendkeys--//
		ConnectorScript_J17.ConnectorScriptScriptIDSendkeys(Connector_SendKeys);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
//				.sendKeys(Connector_SendKeys);
		Thread.sleep(2000);
		// --Script Type--//
		ConnectorScript_J17.ConnectorScriptScriptTypeclick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Pre Script (Before ETL Process)')]")).click();
		Thread.sleep(3000);
		//--Execution type--//
		ConnectorScript_J17.ConnectorScriptExecutiontypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'SQL Script')]")).click();
		Thread.sleep(3000);
		//-- Script Desc--//
		ConnectorScript_J17.ConnectorScriptDescSendkeys(Connector_SendKeys);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"))
//				.sendKeys(Connector_SendKeys);
		Thread.sleep(1000);
		//--Script --//
		ConnectorScript_J17.ScriptSendkeys("Select * from VAT_02");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/textarea[1]"))
//				.sendKeys("Select * from VAT_02");
		Thread.sleep(2000);
		//-- Save Click--//
		ConnectorScript_J17.ConnectorScriptSaveClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(3000);
	}

//	@Test(priority = 10, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
//																			//////// Removed)------////////
//	public void ETL_CC_010(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "Connector";
//		String testCaseId = "ETL_CC_010";
//        String notes = "";
//        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
//        LoginPage.loginUsername(loginName);
//        LoginPage.loginPassword(loginPwd);
//        LoginPage.LoginClick();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(2000);// --ETLConnector
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(5000);// --Next page Arrow
//		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(
//				"body.sidebar-mini.body-background:nth-child(2) app-main-container.ng-star-inserted:nth-child(3) div.wrapper.ng-star-inserted div.main-panel.ps-container.content-area_bound:nth-child(3) div.content-area:nth-child(2) app-connector.ng-tns-c296-5.ng-star-inserted:nth-child(2) div.card-body.material-table.p-0.ng-tns-c296-5 div.row.m-0.ng-tns-c296-5 div.col-sm-12.col-md-12.col-lg-12.col-xl-12.h-100.p-0.ng-tns-c296-5 div.material-table.dashboard-bg-white.b-radius-12.h-100.m-0.ng-tns-c296-5 app-smart-table.ng-tns-c285-6.ng-tns-c296-5.ng-star-inserted div.table-responsive.ng-tns-c285-6 perfect-scrollbar.ng-tns-c285-6.ng-star-inserted div.ps.ps--active-y div.ps-content table.inlineEditTable tbody.ng-tns-c285-6.ng-star-inserted:nth-child(2) tr.ng-tns-c285-6.ng-star-inserted:nth-child(3) td.ng-tns-c285-6.ng-star-inserted:nth-child(7) div.tr-edit-icons.row.a1.ng-tns-c285-6.ng-star-inserted a.modal-trigger.waves-effect.btn-flat.nopadding.pr-2.ng-tns-c285-6.ng-star-inserted:nth-child(3) > i.material-icons.ng-tns-c285-6"))
//				.click();
//		Thread.sleep(2000);
//		throw new SkipException("Skip");
//	}
//
	@Test(priority = 11, dataProvider = "getUserNameList")
	@TestDescription(" Selecting records should properly selected by clicking ")
	public void ETL_CC_011(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_011";
        String notes = "Selecting records should properly selected by clicking ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		Thread.sleep(3000);// --Drop down of Connector
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);// --initial stage Select all function
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]"))
				.click();
		Thread.sleep(2000);// --page set to 10
		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 12, dataProvider = "getUserNameList")
	@TestDescription(" Selecting records should properly selected by clicking- Connector Script ")
	public void ETL_CC_012(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Script";
		String testCaseId = "ETL_CC_012";
        String notes = "Selecting records should properly selected by clicking ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// --Drop down of Connector script
		ETLConnector.ConnectorScript();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);// --initial stage Select all function
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]"))
				.click();
		Thread.sleep(2000);// --page set to 10
		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 13, dataProvider = "getUserNameList")
	@TestDescription("Selecting records should properly selected by clicking - Connector Query")
	public void ETL_CC_013(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Query";
		String testCaseId = "ETL_CC_013";
        String notes = "Selecting records should properly selected by clicking ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// --Drop down of Connector Query
		ETLConnector.ConnectorQuery();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);// --initial stage Select all function
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]"))
				.click();
		Thread.sleep(2000);// --page set to 10
		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 14, dataProvider = "getUserNameList")
	@TestDescription(" The empty manditary feeds are highlighted and says to be added ")
	public void ETL_CC_014(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_014";
        String notes = "The empty manditary feeds are highlighted and says to be added ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// --  Connector--//
		ETLConnector.Connector();
		Thread.sleep(3000);
		// --Add in Connector
		ETL_General.ADD();
		Thread.sleep(3000);
		// --Country Dropdown--//
		Connector_J17.CountryClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --Select Country--//
		Connector_J17.CountrySelectConnectorAE();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(3000);
		// --LE Book Dropdown--//
		Connector_J17.LEBookClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --Select LE Book--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(3000);
		// --Connector ID Send Keys--//
		Connector_J17.ConnectorIDSkeys(Connector_SendKeys);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys(Connector_SendKeys);
		Thread.sleep(1000);
		// -- Description Send Keys--//
		Connector_J17.ConnectorDescSkeys(Connector_SendKeys);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys(Connector_SendKeys);
		Thread.sleep(1000);
		// --End Point Type Dropdown--//
		Connector_J17.EndPointClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --End Point type Select--//
		Connector_J17.EndPointSelect();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(3000);
		// --Connector Type Dropdown--//
		Connector_J17.ConnectorTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --Select Connector type
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(3000);
		// --DB Type Dropdown--//
		Connector_J17.DBTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --Select DB Type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// -- Test Connection--//
		Connector_J17.TestConnectionClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 15, dataProvider = "getUserNameList")
	@TestDescription(" Popup Should display that wrong DB is entered")
	public void ETL_CC_015(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_015";
        String notes = "Popup Should display that wrong DB is entered";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		Thread.sleep(3000);// --Drop down of Connector
		ETL_General.ADD();
		Thread.sleep(3000);// --Add in Connector
		// --Country Dropdown--//
		Connector_J17.CountryClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --Select Country
		Connector_J17.CountrySelectConnectorAE();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(1000);
		Connector_J17.LEBookClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(1000);// --LE Book Dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(1000);// --Select LE Book
		// --Connector ID Send Keys
		Connector_J17.ConnectorIDSkeys(Connector_SendKeys);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys(Connector_SendKeys);
		Thread.sleep(1000);
		// -- Description Send Keys
		Connector_J17.ConnectorDescSkeys(Connector_SendKeys);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys(Connector_SendKeys);
		Thread.sleep(1000);
		// --End Point Type Dropdown--//
		Connector_J17.EndPointClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --End Point type Select--//
		Connector_J17.EndPointSelect();
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
		Thread.sleep(1000);
		// --Connector Type Dropdown--//
		Connector_J17.ConnectorTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --Select Connector type ( Structure)--//
		Connector_J17.ConnectorTypeStructureSlect();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		// --DB Type Dropdown--//
		Connector_J17.DBTypeClick();
		Thread.sleep(3000);
		// --Select DB Type--//		
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Connector_J17.DBmsSQLSelect();
		Thread.sleep(2000);
		// ---Select DB IP--//
		Connector_J17.IPSkeys("10.16.1.106");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
//				.sendKeys("10.16.1.106");
		Thread.sleep(2000);
		// --Select DB Port--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
//				.sendKeys("1521");
		Connector_J17.PortSkeys("1521");
		Thread.sleep(2000);
		// -- DB USer--//
		Connector_J17.UserSkeys("VISION_RA");
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[4]/input[1]"))
//				.sendKeys("VISION_RA");
		// --DB Password--//
		Connector_J17.PWDsKeys("Vision@123");
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/input[1]"))
//				.sendKeys("Vision@123");
		// --DB Name--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/input[1]"))
				.sendKeys("Connector");
		// -- Test Connection--//
		Connector_J17.TestConnectionClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
		Thread.sleep(5000);
	}

	@Test(priority = 16, dataProvider = "getUserNameList")
	@TestDescription("Popup is displaying to enter the SERVICE_NAME in CONNECT_DATA")
	public void ETL_CC_016(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_016";
        String notes = "Popup is displaying to enter the SERVICE_NAME in CONNECT_DATA";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// --Drop down of Connector--//
		ETLConnector.Connector();
		Thread.sleep(3000);
		ETL_General.ADD();
		Thread.sleep(3000);// --Add in Connector
		// --Country Dropdown--//
		Connector_J17.CountryClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --Select Country--//
		Connector_J17.CountrySelectConnectorAE();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(3000);
		Connector_J17.LEBookClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);// --LE Book Dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(3000);// --Select LE Book
		// --Connector ID Send Keys--//
		Connector_J17.ConnectorIDSkeys("Connector_SendKeys");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("Connector_SendKeys");
		Thread.sleep(1000);
		// -- Description Send Keys--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Connector_SendKeys");
		Connector_J17.ConnectorDescSkeys("Connector_SendKeys");
		Thread.sleep(1000);
		// --End Point Type Dropdown--//
		Connector_J17.EndPointClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --End Point type Select--//
		Connector_J17.EndPointSelect();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(3000);
		// --Connector Type Dropdown
		Connector_J17.ConnectorTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// --Select Connector type--//
		Connector_J17.ConnectorTypeStructureSlect();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		// --DB Type Dropdown--//
		Connector_J17.DBTypeClick();
		Thread.sleep(3000);		
		// --Select DB Type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		Connector_J17.IPSkeys("10.16.1.106");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
//				.sendKeys("10.16.1.106");// ---Select DB IP--//
		Thread.sleep(2000);
		Connector_J17.PortSkeys("1521");
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
//				.sendKeys("1521");// --Select DB Port--//
		Thread.sleep(2000);
		// -- DB USer--//
		Connector_J17.UserSkeys("VISION_RA");
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[4]/input[1]"))
//				.sendKeys("VISION_RA");
		// --DB Password--//
		Connector_J17.PWDsKeys("Vision@123");
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/input[1]"))
//				.sendKeys("Vision@123");
		// -- Test Connection--//
		Connector_J17.TestConnectionClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
		Thread.sleep(5000);
	}

	@Test(priority = 17, dataProvider = "getUserNameList")
	@TestDescription("The filter function should performs correctly while the conditions like contains,  begins, equal and end") 
	public void ETL_CC_017(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_017";
        String notes = "The filter function should performs correctly while the conditions like contains,  begins, equal and end";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		//--Connector--//
		ETLConnector.Connector();
		Thread.sleep(3000);
		ETL_General.FILTER();
		Thread.sleep(1000);
		ETL_General.FilterColumnclick();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(3000);// --Filter Click	
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
		Thread.sleep(1000);// --Record Indicator
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("App");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath("//span[contains(text(),'Begins With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("ing");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Ends With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);// -FILTER CLICK
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Delete");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		Thread.sleep(1000);// --Equal
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 18, dataProvider = "getUserNameList")
	@TestDescription("The filter function should performs correctly while the conditions like contains,  begins, equal and end- Connector Script")
	public void ETL_CC_018(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Script";
		String testCaseId = "ETL_CC_018";
        String notes = "The filter function should performs correctly while the conditions like contains,  begins, equal and end";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorScript();
		Thread.sleep(3000);// --Drop down of Connector
		ETL_General.FILTER();
		Thread.sleep(1000);
		ETL_General.FilterColumnclick();
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(3000);// --Filter Click
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
		Thread.sleep(1000);// --Record Indicator
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("App");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath("//span[contains(text(),'Begins With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("ing");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Ends With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);// -FILTER CLICK
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Delete");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		Thread.sleep(1000);// --Equal
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 19, dataProvider = "getUserNameList")
	@TestDescription("The filter function should performs correctly while the conditions like contains,  begins, equal and end- Connector Query")
	public void ETL_CC_019(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Query";
		String testCaseId = "ETL_CC_019";
        String notes = "The filter function should performs correctly while the conditions like contains,  begins, equal and end";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorQuery();
		Thread.sleep(3000);// --Drop down of Connector
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);
		ETL_General.FilterColumnclick();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(3000);// --Filter Click
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		Thread.sleep(1000);// --Record Indicator
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("App");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath("//span[contains(text(),'Begins With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);// --Filter Click
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("ing");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Ends With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);// -FILTER CLICK
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Delete");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		Thread.sleep(1000);// --Equal
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 20, dataProvider = "getUserNameList")
	@TestDescription(" Special Characters are not Allowed")
	public void ETL_CC_020(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_020";
        String notes = "Special Characters are not Allowed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		//--Connector--//
		ETLConnector.Connector();
		Thread.sleep(3000);
		ETL_General.ADD();
		Thread.sleep(3000);
		// --choose country--//
		Connector_J17.CountryClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(1000);
		// --Country click--//
		Connector_J17.CountrySelectConnectorAE();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(1000);
		// --LE book click---//
		Connector_J17.LEBookClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(1000);
		// --id click and enter
		Connector_J17.ConnectorIDSkeys("Vatvul26");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("Vatvul26");
		Thread.sleep(1000);
		//-- Desc--//
		Connector_J17.ConnectorDescSkeys("Vat26!@<>");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Vat26!@<>");
		Thread.sleep(1000);
		// --End point Click--//
		Connector_J17.EndPointClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(1000);
		// --Choose end point--//
		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
		Thread.sleep(1000);
		// --Connector type--//
		Connector_J17.ConnectorTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(1000);// --Choose connector type
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Connector_J17.DBTypeClick();
		Thread.sleep(1000);// --Date base connect
		driver.findElement(By.xpath("//span[contains(text(),'MSSQL')]")).click();
		Thread.sleep(1000);// --DB
		Connector_J17.IPSkeys("10.16.1.38");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
//				.sendKeys("10.16.1.38");
		Thread.sleep(1000);// --DB IP
		Connector_J17.PortSkeys("52866");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
//				.sendKeys("52866");
		Thread.sleep(1000);// --DB port
		Connector_J17.UserSkeys("Vision");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[4]/input[1]"))
//				.sendKeys("Vision");
		Thread.sleep(1000);// --Db name
		Connector_J17.PWDsKeys("Vision_RA");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/input[1]"))
//				.sendKeys("Vision_RA");
		Thread.sleep(1000);// --Db password
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/input[1]"))
				.sendKeys("VISION_RA");
		Thread.sleep(1000);// --
		// --Test Connection--//
		Connector_J17.TestConnectionClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
		Thread.sleep(2000);
		// -- Save--//
		Connector_J17.SaveClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
//				.click();
		Thread.sleep(3000);
		}

//	@Test(priority = 21, dataProvider = "getUserNameList")
//	@TestDescription(" The Filter function should Filter the Successful record")
//	public void ETL_CC_021(String loginName, String loginPwd) throws InterruptedException {
//		String ScreenName = "Connector";
//		String testCaseId = "ETL_CC_021";
//        String notes = "The Filter function should Filter the Successful record";
//        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
//        LoginPage.loginUsername(loginName);
//        LoginPage.loginPassword(loginPwd);
//        LoginPage.LoginClick();
//		Thread.sleep(5000);
//		//-- Connector--//
//		ETLConnector.Connector();
//		Thread.sleep(3000);
//		ETL_General.FILTER();
//		Thread.sleep(3000);// -- Filter Click--//
//		ETL_General.FilterColumnclick();
////		driver.findElement(By.xpath(
////				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
////				.click();// -- Filter Colum Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Act");
//		Thread.sleep(1000);// -- Filter Value Send Keys--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(5000);// -- Apply Button--//
//		
//	}

	@Test(priority = 22, dataProvider = "getUserNameList")
	@TestDescription("Create a new Connector by giving Db details and press back without giving test connection popup appears that form is not saved ")
	public void ETL_CC_022(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_022";
        String notes = "Create a new Connector by giving Db details and press back without giving test connection popup appears that form is not saved ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		//-- Connector--//
		ETLConnector.Connector();
		Thread.sleep(3000);
		ETL_General.ADD();
		Thread.sleep(3000);
		// --choose country--//
		Connector_J17.CountryClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(1000);
		// --Country click--//
		Connector_J17.CountrySelectConnectorAE();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(1000);
		// --- Le Book--///
		Connector_J17.LEBookClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(1000);
		// --LE book select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(1000);
		//-- ID send keys--//
		Connector_J17.ConnectorIDSkeys("Vatvul26");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("Vatvul26");
		Thread.sleep(1000);
		//-- Desc--//
		Connector_J17.ConnectorDescSkeys("Vat26!@<>");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Vat26!@<>");// -- Id Send Keys--//
		Thread.sleep(1000);
		// --End point Click--//
		Connector_J17.EndPointClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(1000);
		// --Choose end point
		Connector_J17.EndPointSelect();
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
		Thread.sleep(1000);
		// --Connector type--//
		Connector_J17.ConnectorTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
		Thread.sleep(1000);
		// --Choose connector type--//
		Connector_J17.ConnectorTypeStructureSlect();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(1000);
		// --DB type--//
		Connector_J17.DBTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(1000);
		// --DB--//
		Connector_J17.DBmsSQLSelect();
//		driver.findElement(By.xpath("//span[contains(text(),'MSSQL')]")).click();
		Thread.sleep(1000);
		// --DB IP--//
		Connector_J17.IPSkeys("10.16.1.38");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
//				.sendKeys("10.16.1.38");
		Thread.sleep(1000);
		// --DB port--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
//				.sendKeys("52866");
		Connector_J17.PortSkeys("52866");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(1000);// -- Back Buttton In Connector--//
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(3000);// -- Popup For Back--//
	}

	@Test(priority = 23, dataProvider = "getUserNameList")
	@TestDescription(" Special Characters are not allowed- Connector Script")
	public void ETL_CC_026(String loginName, String loginPwd) throws InterruptedException, IOException {
		String ScreenName = "Connector Script";
		String testCaseId = "ETL_CC_026";
        String notes = "Special Characters are not allowed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorScript();
		Thread.sleep(3000);// --Drop down of Connector
		ETL_General.ADD();
		Thread.sleep(2000);// -- Add--//
		// -- Country Dropdown--//
		ConnectorScript_J17.ConnectorScriptCountryClick();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Country Dropdown Select--//
		ConnectorScript_J17.ConnectorScriptCountrySelectAE();
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		Thread.sleep(2000);
		// -- LE Book Dropdown--//
		ConnectorScript_J17.ConnectorScriptLebookClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- LE Book Dropdown Select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(2000);
		// -- Connector ID Dropdown--//
		ConnectorScript_J17.ConnectorScriptConnectorIDClick("VAT_ETL");
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);					
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'VAT_ETL - VAT_ETL4')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- Script ID Sendkeys--//
		ConnectorScript_J17.ConnectorScriptScriptIDSendkeys(Script);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
//				.sendKeys(Script);
		Thread.sleep(2000);
		ConnectorScript_J17.ConnectorScriptScriptTypeclick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);// -- Script Type Dropdown--//
		//-- Script type Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Pre Script (Before ETL Process)')]")).click();
		// -- Execution Type Dropdown---//
		ConnectorScript_J17.ConnectorScriptExecutiontypeClick();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Execution Type Dropdown Select---//
		driver.findElement(By.xpath("//span[contains(text(),'SQL Script')]")).click();	
		ConnectorScript_J17.ConnectorScriptDescSendkeys("VAT!@<>");
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"))
//				.sendKeys("VAT!@<>");// --Script Description --//
		// --Script--//
		ConnectorScript_J17.ScriptSendkeys("VTA!2<>");
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/textarea[1]"))
//				.sendKeys("VTA!2<>");
		// -- Save--//
		ConnectorScript_J17.ConnectorScriptSaveClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
		Thread.sleep(3000);
		// -- Take screenshot and save it to a file--//
				takeScreenshot("ETL_CC_026");
				driver.findElement(By.xpath("//p[contains(text(),'- Failed - PreparedStateme')]")).click();
	}

	@Test(priority = 24, dataProvider = "getUserNameList")
	@TestDescription(" Special Characters are not allowed- Connector Query")
	public void ETL_CC_027(String loginName, String loginPwd) throws InterruptedException, IOException {
		String ScreenName = "Connector Query";
		String testCaseId = "ETL_CC_027";
        String notes = "Special Characters are not allowed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorQuery();
		Thread.sleep(3000);// --Drop down of Connector Query
		ETL_General.ADD();// -- Add--//
		Thread.sleep(2000);
		// -- Country Dropdown--//
		ConnectorQuery_J17.CountryClickQuery();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		ConnectorQuery_J17.CountrySelectQueryAE();
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();// -- Country
//																											// Dropdown
//																											// Select--//
		// - Le Book Dropdown--//
		ConnectorQuery_J17.LeBookClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();// - Le
																												// Book
																												// Dropdown
																												// Select--//
		// -- Connector ID Dropdown--//
		ConnectorQuery_J17.ConnectorIDClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]"))
//				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();// --
																													// Connector
																													// ID
																													// Dropdown
		// -- Querry ID Send Keys--//																											// Select--//
		ConnectorQuery_J17.QueryIDSendkeys("VATTSpecialCharacter");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
//				.sendKeys("VATTyy");
		// -- Description Send Keys--//
		ConnectorQuery_J17.QueryDescSendkeys("VAR!#<>");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
//				.sendKeys("VAR!#<>");
		// -- Type Dropdown--//
		ConnectorQuery_J17.TypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Type Dropdown Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Report Queries')]")).click();
		// -- Querry Send Keys--//
		ConnectorQuery_J17.QuerySendKeys("Select * from Vision_users");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"))
//				.sendKeys("Select * from Vision_users");
		// -- Validate--//
		ConnectorQuery_J17.ValidateClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
		Thread.sleep(2000);
		// -- Save--//
		ConnectorQuery_J17.SaveClick();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
//				.click();
		Thread.sleep(3000);
		// -- Take screenshot and save it to a file--//
		takeScreenshot("ETL_CC_027");
		driver.findElement(By.xpath("//p[contains(text(),'- Failed - PreparedStateme')]")).click();
		}

	@Test(priority = 25, dataProvider = "getUserNameList")
	@TestDescription(" Edited Record Saved successfully")
	public void ETL_CC_028(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_028";
        String notes = "Edited Record Saved successfully";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		ETL_General.FILTER();
		ETL_General.FilterColumnclick();
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_KENYA");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);// --Drop down of Connector
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//span[contains(text(),'VAT_KENYA')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Connector = driver.findElement(By.xpath(
				"//i[contains(text(),'mode_edit')]"));
		Connector.click();// -- Edit --//
		Thread.sleep(2000);	
		WebElement Description = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"));
		Description.clear();// -- Description Clear--//
		Description.sendKeys("VAT2702");
		WebElement IP = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
		IP.sendKeys(Keys.SPACE);
		IP.sendKeys(Keys.SPACE);
		//-- Test Connection--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		// -- Modify Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(2000);
		WebElement Success = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Text = Success.getText();
		System.out.println(Text);
		 Assert.assertEquals(Text, "ETL Connector - Modify - Successful", "Record status does not match 'ETL Connector - Modify - Successful'");
		 Thread.sleep(5000);
		 //-- Reject Click--//
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[4]")).click();
	}

	@Test(priority = 26, dataProvider = "getUserNameList")
	@TestDescription("Edited Record Saved successfully- Connector Script")
	public void ETL_CC_029(String loginName, String loginPwd) throws InterruptedException, IOException {
		String ScreenName = "Connector Script";
		String testCaseId = "ETL_CC_029";
        String notes = "Edited Record Saved successfully";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorScript();
		Thread.sleep(3000);// --Drop down of Connector
		ETL_General.FILTER();
		ETL_General.FilterColumnclick();
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT1504");
		//- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement ConnectorScript = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/a[2]/i[1]"));
		ConnectorScript.click();// -- Edit --//
		Thread.sleep(2000);
		WebElement ScriptDes = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"));
		ScriptDes.clear();
		ScriptDes.sendKeys("VAT27");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		WebElement Success = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Text = Success.getText();
		System.out.println(Text);
		 Assert.assertEquals(Text, "ETL Connectors Script List - Modify - Successful", "Record status does not match 'ETL Connectors Script List - Modify - Successful'");
		// -- Take screenshot and save it to a file--//
			takeScreenshot("ETL_CC_029");
	}

	@Test(priority = 27, dataProvider = "getUserNameList")
	@TestDescription(" Edited Record Saved successfully- Connector Query")
	public void ETL_CC_030(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Query";
		String testCaseId = "ETL_CC_030";
        String notes = "Edited Record Saved successfully";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorQuery();
		Thread.sleep(3000);// --Drop down of Connector Query
		//--Filter--//
		ETL_General.FILTER();
		ETL_General.FilterColumnclick();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(7000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement ConnectorQuery = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[2]/a[2]/i[1]"));
		ConnectorQuery.click();// -- Edit --//
		Thread.sleep(7000);
		WebElement QueryDes = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
		QueryDes.clear();
		QueryDes.sendKeys("VAT27");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(4000);
		WebElement Success = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Text = Success.getText();
		System.out.println(Text);
		 Assert.assertEquals(Text, "ETL Mq Table - Modify - Successful", "Record status does not match 'ETL Mq Table - Modify - Successful'");
	
	}

	@Test(priority = 28, dataProvider = "getUserNameList")
	@TestDescription("Click on Filter in ETL Connector and Filter the Country( Put Random Keys)")
	public void ETL_CC_034(String loginName, String loginPwd) throws InterruptedException, IOException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_034";
        String notes = "Click on Filter in ETL Connector and Filter the Country( Put Random Keys)";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(10000);
		ETLConnector.Connector();
		Thread.sleep(2000);
		// -- Filter click in Connector--//
		ETL_General.FILTER();
		Thread.sleep(2000);
		// -- Filter column dropdown click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		// --Value sendkeys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("United");
		// -- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		// -- Filter click in Connector--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// --Value sendkeys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("abcd");
		// -- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		// -- Take screenshot and save it to a file--//
				takeScreenshot("ETL_CC_034");
	}

	@Test(priority = 29, dataProvider = "getUserNameList")
	@TestDescription(" After Changing the query Validation should be done- Connector Query")
	public void ETL_CC_031(String loginName, String loginPwd) throws InterruptedException, IOException {
		String ScreenName = "Connector Query";
		String testCaseId = "ETL_CC_031";
        String notes = "After Changing the query Validation should be done";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorQuery();
		Thread.sleep(2000);
		//-- Filter click--//
		ETL_General.FILTER();
		Thread.sleep(2000);
		ETL_General.FilterColumnclick();
//		//-- Column click-//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Criteria select--//
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_FLOW16");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement QueryEdit = driver.findElement(By.xpath(
				"//i[contains(text(),'mode_edit')]"));
		QueryEdit.click();
		Thread.sleep(5000);
		WebElement SelectQuery = driver.findElement(By.xpath(	
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"));
		SelectQuery.click();
		Thread.sleep(2000);
		SelectQuery.clear();
		SelectQuery.sendKeys("Select * from Vat_02");
		Thread.sleep(2000);
		// Validate Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(3000);
		// --Modify Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(3000);
		SelectQuery.click();
		Thread.sleep(2000);
		SelectQuery.clear();
		SelectQuery.sendKeys("Select * from Vat_error_codes");
		Thread.sleep(2000);
		// -- Take screenshot and save it to a file--//
		takeScreenshot("ETL_CC_031");
		// Validate Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(3000);
	}

	@Test(priority = 30, dataProvider = "getUserNameList")
	@TestDescription(" Popup should display that the Field is Mandatory( As Description is Mandatory Field)- Connector Script")
	public void ETL_CC_032(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Script";
		String testCaseId = "ETL_CC_032";
        String notes = "Popup should display that the Field is Mandatory( As Description is Mandatory Field)";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorScript();
		Thread.sleep(3000);// --Drop down of Connector
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement ConnectorScript = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/a[2]/i[1]"));
		ConnectorScript.click();// -- Edit --//
		Thread.sleep(2000);
		// driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]")).clear();
		WebElement ScriptDes = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"));
		ScriptDes.clear();
		Thread.sleep(2000);
		ScriptDes.click();
		ScriptDes.sendKeys(Keys.BACK_SPACE);
		ScriptDes.sendKeys(Keys.BACK_SPACE);
		ScriptDes.sendKeys(Keys.BACK_SPACE);
		ScriptDes.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
		//-Save--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(2000);
//		WebElement Man = driver.findElement(By.xpath("//div[contains(text(),'* Field is mandatory')]"));
//		String Mandatory = Man.getText();
//		System.out.println(Mandatory);
//		 Assert.assertEquals(Mandatory, " Field is mandatory", " Field is mandatory'");
	}

	@Test(priority = 31, dataProvider = "getUserNameList")
	@TestDescription(" The modify key should be disabled until the validate is selected- Connector Query")
	public void ETL_CC_023(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Query";
		String testCaseId = "ETL_CC_023";
        String notes = "The modify key should be disabled untile the validate is selected";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Dropdown Select to Connector Query--//
		ETLConnector.ConnectorQuery();
		Thread.sleep(3000);
		// -- Query Edit Click--//
		WebElement elementToHoverQuery = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverQuery).perform();
		WebElement QueryEdit = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[2]/a[2]/i[1]"));
		QueryEdit.click();
		Thread.sleep(2000);
		WebElement Query = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"));
		Query.clear();
		Query.sendKeys("Select * from VAT_error_codes");
		Thread.sleep(4000);
		// -- Take screenshot and save it to a file--//
		try {
			takeScreenshot("ETL_CC_023");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 32, dataProvider = "getUserNameList")
	@TestDescription("The all \\\"db\\\" should be in capital form like \\\"DB\\\"")
	public void ETL_CC_024(String loginName, String loginPwd) throws InterruptedException  {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_024";
        String notes = "The all \"db\" should be in capital form like \"DB\"";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		Thread.sleep(2000);
		// -- Add Connector--//
		ETL_General.ADD();
		Thread.sleep(1000);
		// --Country click
		Connector_J17.CountryClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Country Select--//
		Connector_J17.CountrySelectConnectorAE();
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le book dropdown--//
		Connector_J17.LEBookClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Le book select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		// -- Connector ID sendkeys--//
		Connector_J17.ConnectorIDSkeys("VAT_ETL_001");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("VAT_ETL_001");
		// -- Description sendkeys--//
		Connector_J17.ConnectorDescSkeys("VAT_ETL_001");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("VAT_ETL_001");
		// -- End point type click--//
		Connector_J17.EndPointClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- End point type select--//
		Connector_J17.EndPointSelect();
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
		// -- Connector type click--//
		Connector_J17.ConnectorTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Connector select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// -- DB Type click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		// -- DB Type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(2000);
		// -- IP Send keys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
				.click();
		// -- Take screenshot and save it to a file--//
				try {
					takeScreenshot("ETL_CC_024");
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

	@Test(priority = 33, dataProvider = "getUserNameList")
	@TestDescription("The Space Between the line and entered text should be same in all fields")
	public void ETL_CC_025(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_025";
        String notes = "The Space Between the line and entered text should be same in all fields";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		Thread.sleep(2000);
		// -- Add Connector--//
		ETL_General.ADD();
		Thread.sleep(1000);
		// --Country click--//
		Connector_J17.CountryClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Country Select--//
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le book dropdown--//
		Connector_J17.LEBookClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Le book select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		// -- Connector ID sendkeys--//
		Connector_J17.ConnectorIDSkeys("VAT_ETL_001");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("VAT_ETL_001");
		// -- Description sendkeys--//
		Connector_J17.ConnectorDescSkeys("VAT_ETL_001");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("VAT_ETL_001");
		// -- End point type click--//
		Connector_J17.EndPointClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- End point type select--//
		Connector_J17.EndPointSelect();
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
		// -- Connector type click--//
		Connector_J17.ConnectorTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Connector select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// -- DB Type click--//
		Connector_J17.DBTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		// -- DB Type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(2000);
		// -- IP Send keys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
				.click();
		Thread.sleep(2000);
		// -- Take screenshot and save it to a file--//
		try {
			takeScreenshot("ETL_CC_025");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 34, dataProvider = "getUserNameList")
	@TestDescription("Decription is mandatory")
	public void ETL_CC_033(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_033";
        String notes = "Decription is mandatory";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorQuery();
		Thread.sleep(2000);
		// -- Add Query--//
		ETL_General.ADD();
		Thread.sleep(2000);
		try {
			takeScreenshot("ETL_CC_033");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 35, dataProvider = "getUserNameList")
	@TestDescription("Description - After click on Reject previous state of record should be displayed")
	public void ETL_CC_035(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_035";
        String notes = "After click on Reject previous state of record should be displayed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		Thread.sleep(2000);
		// -- Filter click in Connector--//
		ETL_General.FILTER();
		Thread.sleep(2000);
		ETL_General.FilterColumnclick();
//		// -- Filter column dropdown click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		// --Value sendkeys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT_FLOW16");
		// --Add Filter--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		// -- Filter column dropdown click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
		// --Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("App");
		// -- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		// -- Edit CLick--//
		WebElement elementToHoverConnector = driver.findElement(By.xpath("//span[contains(text(),'VAT_FLOW1604')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverConnector).perform();
		WebElement Connector = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Connector.click();
		Thread.sleep(2000);
		// -- Test Connection Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		// -- Modify Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(5000);
		// -- Reject Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[4]"))
				.click();
		// -- Yes CLick--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(3000);
		
	}

	@Test(priority = 36, dataProvider = "getUserNameList")
	@TestDescription("Description - After click on Reject previous state of record should be displayed- Connector Query")
	public void ETL_CC_036(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Query";
		String testCaseId = "ETL_CC_036";
        String notes = "After click on Reject previous state of record should be displayed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorQuery();
		Thread.sleep(2000);
		// -- Filter click in Connector Query--//
		ETL_General.FILTER();
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		ETL_General.FilterColumnclick();
//		// -- Filter column dropdown click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		// --Value sendkeys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT_FLOW16");
		// -- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHover).perform();
		WebElement Query = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[2]/a[2]/i[1]"));
		Query.click();
		Thread.sleep(2000);
		// -- Query Clear--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"))
				.clear();
		// -- Query sendkeys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"))
				.sendKeys("Select * from VAT_02");
		// -- Validate Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		// -- Modify Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(2000);
		// -- Reject CLick--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[4]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		try {
			takeScreenshot("ETL_CC_036");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 37, dataProvider = "getUserNameList")
	@TestDescription("Description - Modified record should be changed , if we further modify Testconnection should be enabled")
	public void ETL_CC_037(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_037";
        String notes = "Modified record should be changed , if we further modify Testconnection should be enabled";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		Thread.sleep(2000);
		// -- Filter click--//
		ETL_General.FILTER();
		Thread.sleep(2000);
		ETL_General.FilterColumnclick();
//		// -- Column click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Approved");
		Thread.sleep(2000);
		// -- Add filter button--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		// -- Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT1504");
		// -- Apply buutton--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementtoHover_VAT = driver.findElement(By.xpath("//span[contains(text(),'VAT1504')]"));
		Actions actionsEdit = new Actions(driver);
		actionsEdit.moveToElement(elementtoHover_VAT).perform();
		WebElement EditClick = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		EditClick.click();
		// -- Connector Description--//
		WebElement Desc = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"));
		Desc.clear();
		Desc.sendKeys("VAT");
		WebElement IP = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
		IP.sendKeys(Keys.SPACE);
		IP.sendKeys(Keys.SPACE);
		// -- Test Connection click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		// -- Modify Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(2000);
		Desc.sendKeys("VAT1");
		IP.sendKeys(Keys.SPACE);
		IP.sendKeys(Keys.SPACE);
		// -- Test Connection click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		// -- Modify Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(2000);
		try {
			takeScreenshot("ETL_CC_037");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 38, dataProvider = "getUserNameList")
	@TestDescription("Description - Semi Structure Connector- Records should be added successfully")
	public void ETL_CC_038(String loginName, String loginPwd) throws InterruptedException, AWTException {
		String ScreenName = "Connector";
		String testCaseId = "ETL_CC_038";
        String notes = "Semi Structure Connector- Records should be added succesfully";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.Connector();
		Thread.sleep(3000);
		// -- Add--//
		ETL_General.ADD();
		// --Country click
		Connector_J17.CountryClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Country Select--//
		Connector_J17.CountrySelectConnectorAE();
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le book dropdown--//
		Connector_J17.LEBookClickConnector();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Le book select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		// -- Connector ID sendkeys--//
		Connector_J17.ConnectorIDSkeys("VAT_SEMI_Upload");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("VAT_SEMI_Upload");
		// -- Description sendkeys--//
		Connector_J17.ConnectorDescSkeys("VAT_SEMI_Upload");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("VAT_SEMI_Upload");
		// -- End point type click--//
		Connector_J17.EndPointClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- End point type select--//
		Connector_J17.EndPointSelect();
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
		// -- Connector type click--//
		Connector_J17.ConnectorTypeClick();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(2000);
		// -- Connector select--//
		driver.findElement(By.xpath("//span[contains(text(),'Semi Structured Data')]")).click();
		Thread.sleep(5000);
		// -- Add in Semi structure data--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/i[1]"))
				.click();
		// -- FIle upload--//
		WebElement Upload = driver.findElement(By.xpath("//span[contains(text(),'file_upload')]"));
		Upload.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.delay(1000);
		StringSelection stringSelection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		// -- Delimeter sendkeys--//
		driver.findElement(
				By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(",");
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		Thread.sleep(2000);
//		//-- Add in File planner--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]")).click();
//		//-- File ID click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'VA_1')]")).click();
//		//-- View name click--//
//		WebElement ViewName = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"));
//		ViewName.click();
//		ViewName.sendKeys("FILE");
		Thread.sleep(2000);
		// -- Save click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(3000);
	}
		@Test(priority = 39, dataProvider = "getUserNameList")
		@TestDescription("proper trigger details should be displayed")
		public void ETL_CC_042(String loginName, String loginPwd) throws InterruptedException {
			String ScreenName = "Connector";
			String testCaseId = "ETL_CC_042";
	        String notes = "proper trigger details should be displayed	";
	        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
	        LoginPage.loginUsername(loginName);
	        LoginPage.loginPassword(loginPwd);
	        LoginPage.LoginClick();
			Thread.sleep(5000);
			ETLConnector.Connector();
			Thread.sleep(2000);
			//-- Add click--//
			ETL_General.ADD();
			Thread.sleep(2000);
			//-- Country CLick--//
			Connector_J17.CountryClickConnector();
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- Select--//
			driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
			//-- LE- Book click--//
			Connector_J17.LEBookClickConnector();
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- Select--//
			driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
			//-- Connector ID Send Keys--//
			Connector_J17.ConnectorIDSkeys("Connector_SendKeys");
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys(Connector_SendKeys);
			//--Description send keys--//
			Connector_J17.ConnectorDescSkeys(Connector_SendKeys);
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys(Connector_SendKeys);
			//-- end point type click--//
			Connector_J17.EndPointClick();
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- Select--//
			driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
			//-- Connector Type click--//
			Connector_J17.ConnectorTypeClick();
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- Select--//
			driver.findElement(By.xpath("//span[contains(text(),'Semi Structured Data')]")).click();
			//-- Add click--//
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/i[1]")).click();
			Thread.sleep(2000);
			//-- Static file oFF--//
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/label[1]/span[1]")).click();
			//-- FTP CLick--//
			driver.findElement(By.xpath("//a[contains(text(),'FTP')]")).click();
			//-- Host Name send keys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10.16.1.101");
			//-- Port Send keys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("20");
			//-- Username Send keys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("vision123");
			//-- Password send keys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("Vision123");
			//-- Windows send keys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/input[1]")).sendKeys("U");
			//-- Location--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/input[1]")).sendKeys("/home/vision/app/File_upload_Test/sel.tz.reconfile.csv");
			//-- SFTP--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[7]/input[1]")).sendKeys("SFTP");
			//-- Upload click--//
			driver.findElement(By.xpath("//button[contains(text(),'Upload')]")).click();
			Thread.sleep(2000);
			try {
				takeScreenshot("ETL_CC_042");
			} catch (IOException e) {
				e.printStackTrace();
			}
			WebElement Error = driver.findElement(By.xpath("//p[contains(text(),'Problem in gaining connection for this connection ')]"));
			String ErrorText = Error.getText();
			System.out.println(ErrorText);
			Assert.assertEquals(ErrorText, "Problem in gaining connection for this connection details", "Error 'Problem in gaining connection for this connection details'");
			Thread.sleep(2000);
		}
		@Test(priority = 40, dataProvider = "getUserNameList")
		@TestDescription("Test connection should be done and then when we click on save new copy should be saved")
		public void ETL_CC_043(String loginName, String loginPwd) throws InterruptedException {
			String ScreenName = "Connector";
			String testCaseId = "ETL_CC_043";
	        String notes = "Test connection should be done and then when we click on save new copy should be saved";
	        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
	        LoginPage.loginUsername(loginName);
	        LoginPage.loginPassword(loginPwd);
	        LoginPage.LoginClick();
			Thread.sleep(5000);
			ETLConnector.Connector();
			Thread.sleep(2000);
			// -- Filter click--//
			ETL_General.FILTER();
			Thread.sleep(2000);
			ETL_General.FilterColumnclick();
//			// -- Column click--//
//			driver.findElement(By.xpath(
//					"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//					.click();
			Thread.sleep(2000);
			// -- Column Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
			// -- Value send keys--//
			driver.findElement(By.xpath(
					"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
					.sendKeys("SSH");
			Thread.sleep(2000);
			//--- Apply CLick--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(3000);
			WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]"));
			Actions actionsClick = new Actions(driver);
			actionsClick.moveToElement(elementToHoverM).perform();
			WebElement Connector = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[2]/a[1]/i[1]"));
			Connector.click();
			Thread.sleep(2000);
			try {
				takeScreenshot("ETL_CC_043");
			} catch (IOException e) {
				e.printStackTrace();
			}
			currentTest.log(Status.FAIL,notes);
			
		}
	 @Test(priority = 41, dataProvider = "getUserNameList")
		@TestDescription("Column meta data should accept more than 20 columns in File")
		public void ETL_CC_049(String loginName, String loginPwd) throws InterruptedException {
			String ScreenName = "Connector";
			String testCaseId = "ETL_CC_049";
	        String notes = "Column meta data should accept more than 20 columns in File";
	        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
	        LoginPage.loginUsername(loginName);
	        LoginPage.loginPassword(loginPwd);
	        LoginPage.LoginClick();
			Thread.sleep(5000);
			ETLConnector.Connector();
			Thread.sleep(2000);
//			// -- Filter click--//
//			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			ETL_General.FILTER();
			Thread.sleep(2000);
			ETL_General.FilterColumnclick();
//			// -- Column click--//
//			driver.findElement(By.xpath(
//					"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//					.click();
			Thread.sleep(2000);
			// -- Column Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
			// -- Value send keys--//
			driver.findElement(By.xpath(
					"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
					.sendKeys("VAT_SEMI");
			Thread.sleep(2000);
			//--- Apply CLick--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(3000);
			WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Semi Structured Data')]"));
			Actions actionsClick = new Actions(driver);
			actionsClick.moveToElement(elementToHoverM).perform();
			WebElement Connector = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
			Connector.click();
			Thread.sleep(2000);
			//-- View list click--//
			driver.findElement(By.xpath("//i[contains(text(),'view_list')]")).click();
			Thread.sleep(2000);
			Actions actions = new Actions(driver);
			WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
			actions.moveToElement(elementTarget);
			WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'70')]"));
			actions.scrollToElement(Target);
			actions.perform();
			Target.click();
			try {
				takeScreenshot("ETL_CC_049");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	 }
	 @Test(priority = 42, dataProvider = "getUserNameList")
		@TestDescription("Inline Trigger is appearing somewhere ( Alignment issue)-Connector Query")
		public void ETL_CC_047(String loginName, String loginPwd) throws InterruptedException {
			String ScreenName = "Connector Query";
			String testCaseId = "ETL_CC_047";
	        String notes = "Inline Trigger is appearing somewhere ( Alignment issue)";
	        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
	        LoginPage.loginUsername(loginName);
	        LoginPage.loginPassword(loginPwd);
	        LoginPage.LoginClick();
			Thread.sleep(5000);
			ETLConnector.ConnectorQuery();
			Thread.sleep(2000);
			ETL_General.FILTER();
			ETL_General.FilterColumnclick();
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
			//-- Criteria click--//
			driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT");
			Thread.sleep(2000);
			//-- Apply click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
			WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT')]"));
			Actions actionsClick = new Actions(driver);
			actionsClick.moveToElement(elementToHoverM).perform();
			WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
			Edit.click();
			Thread.sleep(2000);
			//-- Length send keys--//
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")).sendKeys("55555555");
			try {
				takeScreenshot("ETL_CC_047");
			} catch (IOException e) {
				e.printStackTrace();
			}
			Thread.sleep(5000);
			
			
	 }
	 
}
