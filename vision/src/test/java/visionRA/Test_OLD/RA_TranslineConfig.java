package visionRA.Test_OLD;

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
import Package_PageObject.POM_RA;



public class RA_TranslineConfig  extends BaseClass{
	
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
	
	 private POM_RA TranslineConfig;
	 @BeforeMethod
	    public void TranslineClick() {
		 TranslineConfig = new POM_RA(driver);
	 }
	 
	String Transline_ID = "VAT_Auto";
	String Transline_ID1 = "VAT_01";///--- Need to Change ----////
	String Transline_DESC= "VAT_Desc";
	String Transline_ID2 = "VAT_04";///--- Need to Change ----////
	String Transline_DESC2= "VAT_Desc4";
	String Transline_DESC1= "VAT_Desc1";
	String Filter_Branchoperation = "Branch Operation";
	String VAT = "VAT";
	String Approved = "Approved";
	String Transline_Invalid_DESC = "VAT!@#<>";
	String Type = "Product";
	String applicationURL = "http://202.83.25.244:8001/";
	String Transline_ID3 = "VAT_Duplicate";
	String Transline_DESC3= "VAT_Desc3";
	String VAT1 = "VAT1604";

	
	@Test(dataProvider = "loginCredentials", priority = 1)
	@TestDescription("Proper Trans line configuration has to be selected with all promt has to be shown in the screen")
	public void VAT_TAS_DC_001(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_001";
        String notes = "Proper Trans line configuration has to be selected with all promt has to be shown in the screen";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- Master Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 2)
	@TestDescription("Proper screen for feeding the data has to be populated")
	public void VAT_TAS_DC_002(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_002";
        String notes = "Proper screen for feeding the data has to be populated";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Transline Config--//
		
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Transline_DESC);
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Trans line Group Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Trans line group Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
		Thread.sleep(4000);
		// --Business Vertical Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Business Vertical Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[6]/div[1]"))
				.click();
		// --extraction frequency dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --extraction frequency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 3)
	@TestDescription("proper dropdown of column,criteria,value & addding of extra  filtration")
	public void VAT_TAS_DC_003(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_003";
	    String notes = "proper dropdown of column,criteria,value & addding of extra  filtration";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Filter--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// --Filter Cloumn Dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		// --Filter Column dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();																								
		Thread.sleep(4000);
		// --Filter Value Sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(Filter_Branchoperation);
		// -- Apply Filter--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 4)
	@TestDescription("refresh the whole screen")
	public void VAT_TAS_DC_004(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_004";
	    String notes = "refresh the whole screen";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Referesh Button--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(7000);
	}

	@Test(dataProvider = "loginCredentials", priority = 5)
	@TestDescription("Proper drop down of country Name")
	public void VAT_TAS_DC_005(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_005";
	    String notes = "Proper drop down of country Name";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Transline Config
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// --Add Country--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000); 
	}

	@Test(dataProvider = "loginCredentials", priority = 6)
	@TestDescription("Proper drop down of Le book")
	public void VAT_TAS_DC_006(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_006";
	    String notes = "Proper drop down of Le book";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);
		// --- Add in Transline Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Add Le Book--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 7)
	@TestDescription("successfully  accepting Alpha Numerical")
	public void VAT_TAS_DC_008(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_008";
	    String notes = "successfully  accepting Alpha Numerical";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);
		// --- Add in Transline Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID);
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 8)
	@TestDescription("Proper drop down of Product line")
	public void VAT_TAS_DC_009(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_009";
	    String notes = "Proper drop down of Product line";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 9)
	@TestDescription("Proper drop down of  Trans line type & group")
	public void VAT_TAS_DC_010(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_010";
	    String notes = "Proper drop down of  Trans line type & group";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Trans line Group Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Trans line group Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
		Thread.sleep(4000);
	}
	@Test(dataProvider = "loginCredentials", priority = 10)
	@TestDescription("Proper drop down of Business vertical")
	public void VAT_TAS_DC_011(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_011";
	    String notes = "Proper drop down of Business vertical";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Trans line Group Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Trans line group Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
		Thread.sleep(4000);
		// --Business Vertical Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Business Vertical Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[6]/div[1]"))
				.click();
		Thread.sleep(4000);
	}
	@Test(dataProvider = "loginCredentials", priority = 11)
	@TestDescription("Successfully requirement is fulfilled")
	public void VAT_TAS_DC_012(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_012";
	    String notes = "Successfully requirement is fulfilled";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(7000);
		// --extraction frequency dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --extraction frequency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
	}
	@Test(dataProvider = "loginCredentials", priority = 12)   
	@TestDescription("Successfully able to select  extraction day")
	public void VAT_TAS_DC_013(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_013";
	    String notes = "Successfully able to select  extraction day";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(7000);
		//--Extraction Day--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(4000);	
	}
	@Test(dataProvider = "loginCredentials", priority = 13)
	@TestDescription("Proper drop down of  product type")
	public void VAT_TAS_DC_015(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_015";
	    String notes = "Proper drop down of  product type";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Transline_DESC);
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Trans line Group Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Trans line group Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
		Thread.sleep(4000);
		// --Business Vertical Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Business Vertical Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[6]/div[1]"))
				.click();
		// --extraction frequency dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --extraction frequency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown Select--///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 14)
	@TestDescription("Proper drop down of  product  Discription")
	public void VAT_TAS_DC_016(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_016";
	    String notes = "Proper drop down of  product  Discription";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Transline_DESC);
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Trans line Group Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Trans line group Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
		Thread.sleep(4000);
		// --Business Vertical Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Business Vertical Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[6]/div[1]"))
				.click();
		// --extraction frequency dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --extraction frequency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		//--Product Type Dropdown--///
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//--Product Type Dropdown Select--///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		//--Product Description Dropdown--///
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//--Product Description Dropdown Select--///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
	}
	@Test(dataProvider = "loginCredentials", priority = 15)
	@TestDescription("Proper drop down of  Currency")
	public void VAT_TAS_DC_017(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_001";
	    String notes = "Proper drop down of  Currency";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Transline_DESC);
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Trans line Group Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Trans line group Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
		Thread.sleep(4000);
		// --Business Vertical Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Business Vertical Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[6]/div[1]"))
				.click();
		// --extraction frequency dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --extraction frequency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown--///
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown Select--///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Product Description Dropdown--///
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Product Description Dropdown Select--///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Currency Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Currency Select--//
		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
		Thread.sleep(4000);
	}
	@Test(dataProvider = "loginCredentials", priority = 16)
	@TestDescription("Data should not be changed when we click on to No in notification button ")
	public void VAT_TAS_DC_019(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_019";
	    String notes = "Data should not be changed when we click on to No in notification button ";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Filter column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT);
		//-- Add Filter click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'Fee Config Record Indicator')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		//-- Value Sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Approved);
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		//--Edit Button--//
		WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"));
		Edit.click();
		Thread.sleep(4000);
		// --extraction frequency dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// --extraction frequency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(4000);	
		//-- Nav to Business Line Configurationm--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(4000);
		//-- Nav Back to trans line config--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
		Thread.sleep(4000);	
	}
	@Test(dataProvider = "loginCredentials", priority = 17)
	@TestDescription("The record count should be correct while filtering ")
	public void VAT_TAS_DC_023(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_023";
	    String notes = "The record count should be correct while filtering ";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click---//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Filter click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]/i[1]"))
				.click();
		// --Filter Column Dropdown--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Column dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		// -- Value Send Keys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("BL");
		Thread.sleep(4000);
		// --Apply Button--//
		driver.findElement(
				By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[3]/button[1]"))
				.click();
		Thread.sleep(4000);
		// --Filter click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]/i[1]"))
				.click();
		// --Filter Column Dropdown--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Column dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		// --Apply Button--//
		driver.findElement(
				By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[3]/button[1]"))
				.click();
		Thread.sleep(4000);
	}
	@Test(dataProvider = "loginCredentials", priority = 18)
	@TestDescription("Popup sholud display that invalid Transline Description")
	public void VAT_TAS_DC_026(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_026";
	    String notes = "Popup sholud display that invalid Transline Description";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Transline_Invalid_DESC);
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Trans line Group Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Trans line group Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
		Thread.sleep(4000);
		// --Business Vertical Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Business Vertical Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[6]/div[1]"))
				.click();
		// --extraction frequency dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --extraction frequency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown Select--///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Product Description Dropdown--///
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Product Description Dropdown Select--///
		driver.findElement(By.xpath("//span[contains(text(),'ALL - All')]")).click();
		Thread.sleep(4000);
		// --Currency Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Currency Select--//
		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
		Thread.sleep(4000);
		//-- Save Button--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_TAS_DC_026.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" VAT_TAS_DC_026 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("VAT_TAS_DC_026 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 19)
	@TestDescription("Validate Alpha Numerical ")
	public void VAT_TAS_DC_007(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_007";
	    String notes = "Validate Alpha Numerical ";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Transline_DESC);
		Thread.sleep(4000);
		//-- save Button--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
	}
	@Test(dataProvider = "loginCredentials", priority = 20)
	@TestDescription("When changing from product to service the alert message should be displayed as service Line Configuration approved successfully ")
	public void VAT_TAS_DC_024(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_024";
	    String notes = "When changing from product to service the alert message should be displayed as service Line Configuration approved successfully ";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID1);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys("Transline_DESC1");
		Thread.sleep(4000);
		//--Transline type dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//--Transline type dropdown select(Service type)--//
		driver.findElement(By.xpath("//span[contains(text(),'Service')]")).click();
		//-- Service line type dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Service line type dropdown Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Asset')]")).click();
		//-- Transline group dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Transline group dropdown select--//
		driver.findElement(By.xpath("//span[contains(text(),'Branch Operations')]")).click();
		//-- Business vertical dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(4000);
		//-- Business vertical dropdown select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[1]/div[1]")).click();
		//-- Extraction frequency--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Extraction frequency select--//
		driver.findElement(By.xpath("//span[contains(text(),'Daily')]")).click();
		//-- Department  dropdown clik--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[5]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Department select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// Channels dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		// Channels dropdown select--//
		driver.findElement(By.xpath("//span[contains(text(),'ALL')]")).click();
		//service dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//--Service dropdown select--//
		driver.findElement(By.xpath("//span[contains(text(),'SBA - Savings Account')]")).click();
		//--service description-//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Service description select--//
		driver.findElement(By.xpath("//span[contains(text(),'06001 - Savings Account')]")).click();
		//-- Currency dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Currency select--//
		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
		//save button click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		WebElement Transline_save_Text=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String proftext = Transline_save_Text.getText();
		Thread.sleep(1000);
		System.out.printf(proftext+"-VAT_TAS_DC_024");
		Thread.sleep(4000);	
	}
	@Test(dataProvider = "loginCredentials", priority = 21)
	@TestDescription("If the changes is applyed the header should show the related type what have mentioned (product / service)")
	public void VAT_TAS_DC_025(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_025";
	    String notes = "If the changes is applyed the header should show the related type what have mentioned (product / service)";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID2);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Transline_DESC2);
		Thread.sleep(4000);
		//-- Product line type--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Product line select--//
		driver.findElement(By.xpath("//span[contains(text(),'Asset')]")).click();
		//-- Transline group dropdown--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Transline group dropdown select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Business line vertical--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(4000);
		//-- Business line vertical select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[1]/div[1]")).click();
		//-- Extraction frequency--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Extraction frequency select--//
		driver.findElement(By.xpath("//span[contains(text(),'Daily')]")).click();
		//-- Producct type dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Producct type dropdown select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Product description--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Product description select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]")).click();
		//-- Currency dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Currency select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//save button--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		WebElement Transline_save_Text=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String proftext = Transline_save_Text.getText();
		System.out.printf("VAT_TAS_DC_025-"+proftext);
		Thread.sleep(4000);	
	}
	@Test(dataProvider = "loginCredentials", priority = 22)
	@TestDescription("Duplicate Key Should Popup")
	public void VAT_TAS_DC_028(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_001";
	    String notes = "Duplicate Key Should Popup";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		//-- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				//-- Filter column click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(4000);
				//-- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				//-- Value sendkeys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT);
				//-- Add Filter click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
				//-- Column click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Actions actions = new Actions(driver);
				WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
				actions.moveToElement(elementTarget);
				WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'Fee Config Record Indicator')]"));
				actions.scrollToElement(Target);
				actions.perform();
				Target.click();
				//-- Value Sendkeys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Approved);
				//-- Add Filter click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
				//-- Column click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				//-- Column select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
				//-- Value sendkeys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Type);
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(4000);
				//--Edit Button--//
				WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT_3_2603 / VAT_3_260324')]"));
				Actions actionsClick = new Actions(driver);
				actionsClick.moveToElement(elementToHoverM).perform();
				WebElement Copy = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[2]/i[1]"));
				Copy.click();
				Thread.sleep(4000);
		//--save Button--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
		WebElement Duplicate=driver.findElement(By.xpath("//p[contains(text(),'- Failed - Duplicate key ')]"));
		String proftext = Duplicate.getText();
		System.out.printf("VAT_TAS_DC_028-"+proftext);
	}
	@Test(dataProvider = "loginCredentials", priority = 23)
	@TestDescription("In Line trigger should pop that data is Duplicate. after changing the Trigger should disappear")
	public void VAT_TAS_DC_029(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_029";
	    String notes = "In Line trigger should pop that data is Duplicate. after changing the Trigger should disappear";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --- Add in Trans line Config--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(4000);
		// -- Trans Line ID send Key--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Transline_ID3);
		Thread.sleep(4000);
		// -- Trans Line Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Transline_DESC3);
		Thread.sleep(4000);
		// ---Product Line DropDown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Product Line Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		// --Trans line Group Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Trans line group Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
		Thread.sleep(4000);
		// --Business Vertical Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --Business Vertical Select--//
		driver.findElement(By.xpath(
				"//div[contains(text(),'Select All')]"))
				.click();
		// --extraction frequency dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// --extraction frequency Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown Select--///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Product description --//
		driver. findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- product description select--//
		driver.findElement(By.xpath("//span[contains(text(),'ALL - All')]")).click();
		Thread.sleep(4000);
		//-- Currency click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- currency select--//
		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
		//-- add row Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/div[1]")).click();
		// --Product Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Product Type Dropdown Select--///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Product description click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Product description select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Currency click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Currency select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(4000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_TAS_DC_029.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" VAT_TAS_DC_029 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("VAT_TAS_DC_029 Failed to save screenshot: " + e.getMessage());
		}	
		//-- Currency click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- Currency select--//
		driver.findElement(By.xpath("//span[contains(text(),'ACU')]")).click();
		Thread.sleep(4000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_TAS_DC_029_1.png";
				//-- save the screenshot --//
				File destinationFile1 = new File(Location1);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
					System.out.println(" VAT_TAS_DC_029_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_TAS_DC_029_1 Failed to save screenshot: " + e.getMessage());
				}	
	}
	@Test(dataProvider = "loginCredentials", priority = 24)
	@TestDescription("Duplicate Key Should Popup")
	public void VAT_TAS_DC_031(String username, String password) throws InterruptedException {
		String ScreenName = "Transline Configuration";
		String testCaseId = "TAS_DC_031";
	    String notes = "Duplicate Key Should Popup";
	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	    LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(7000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//--column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Service");
		//-- Add filter--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]/span[1]"));
		Actions actionsCopy = new Actions(driver);
		actionsCopy.moveToElement(elementToHoverM).perform();
		WebElement Copy = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[2]/i[1]"));
		Copy.click();
		Thread.sleep(4000);
		//-- save click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_TAS_DC_031.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_TAS_DC_031 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_TAS_DC_031 Failed to save screenshot: " + e.getMessage());
				}	
				// Add screenshot to the report
		WebElement Duplicate = driver.findElement(By.xpath("//p[contains(text(),'- Failed - Duplicate key ')]"));
		String Text = Duplicate.getText();
		System.out.println(Text); 
	}
	

	@Test(dataProvider = "loginCredentials", priority = 25)
	@TestDescription("Click on to rate effective date	,New record has be created if we edit last modified  data")
	public void VAT_TAS_DC_021(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_TAS_DC_021";
        String notes = "Click on to rate effective date	,New record has be created if we edit last modified  data";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(7000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
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
				.sendKeys(VAT1);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		//--- Old data click--//
		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(7000);
		Thread.sleep(5000);// -- Fees Config Button Click--//
		//-- All click--//
		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Fees_config = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
		Fees_config.click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		Thread.sleep(5000);
		WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		Thread.sleep(3000);
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(5000);
		//-- Time reduce--//
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='10'])[3]")).click();
		Thread.sleep(2000);
		//-- Fees/percentage send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		//-- Modify click--//		
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(5000);
		//-- prefeerential click--//
		driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
		Thread.sleep(5000);
				//-- All click--//
				driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
				Thread.sleep(3000);
				//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\VAT_TAS_DC_021.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_TAS_DC_021 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_TAS_DC_021 Failed to save screenshot: " + e.getMessage());
				}		
	}
	
	
}
