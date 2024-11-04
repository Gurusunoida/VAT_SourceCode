package Vision_RA.Test;

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



public class RA_BusinessLineConfig extends BaseClass {
	String VAT = "VAT";
	String Approved = "Approved";
	String Businessline_ID = "VAT_Auto";
	String Businessline_DESC = "VAT_Business";
	
	private Login LoginPage;
	 @BeforeMethod
	    public void setUpLogin() {
	        LoginPage = new Login(driver); 
	    }
	 
	 private POM_RA Businessline;
	 @BeforeMethod
	    public void Businessline() {
		 Businessline =new POM_RA(driver);
	 }
	 
	 private POM_RA TranslineConfig;
	 @BeforeMethod
	    public void TranslineClick() {
		 TranslineConfig = new POM_RA(driver);
	 }	

	@Test(dataProvider = "dataProvider1", priority = 1)
	@TestDescription("Proper data has to be feeded in alpha numerical number")
	public void VAT_BUS_DC_001(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_001";
        String notes = "Proper data has to be feeded in alpha numerical number";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
        Thread.sleep(7000);
        // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(7000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		//-- Criteria select--//
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		//--Edit CLick--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		// -- Business Line Config  click--//
		Businessline.Businessline();
		// -- Business Line config Business line ID max 10 character--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Businessline_ID);
		Thread.sleep(5000);
	}

	@Test(dataProvider = "dataProvider1", priority = 2)
	@TestDescription("Proper screen for feeding the data Description has to be populated")
	public void VAT_BUS_DC_002(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_002";
        String notes = "Proper screen for feeding the data Description has to be populated";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				//-- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(4000);
		// -- Business Line Config in Add--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(3000);
		// -- Business Line config Business line ID max 10 character--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Businessline_ID);
		Thread.sleep(5000);
		// -- Business line Description
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(Businessline_DESC);
		Thread.sleep(4000);
	}

	@Test(dataProvider = "dataProvider1", priority = 3)
	@TestDescription("Proper screen for feeding the data Businessline Type has to be populated")
	public void VAT_BUS_DC_003(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_003";
        String notes = "Proper screen for feeding the data Businessline Type has to be populated";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				//-- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(4000);
		// -- Business Line Config  click--//
				Businessline.Businessline();
		Thread.sleep(3000);
		// -- Business Line config Business line ID max 10 character--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Businessline_ID);
		Thread.sleep(5000);
		// -- Business line Description
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(Businessline_DESC);
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "dataProvider1", priority = 4)
	@TestDescription("Proper drop down of Income/ expenses prompt")
	public void VAT_BUS_DC_004(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_004";
        String notes = "Proper drop down of Income/ expenses prompt";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				//-- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(4000);
		// -- Business Line Config  click--//
				Businessline.Businessline();
		Thread.sleep(3000);
		// -- Business Line config Business line ID max 10 character--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Businessline_ID);
		Thread.sleep(5000);
		// -- Business line Description
		driver.findElement(By.xpath(
		"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
		.sendKeys(Businessline_DESC);
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(5000);
	}

	@Test(dataProvider = "dataProvider1", priority = 5)
	@TestDescription("Proper drop down of Posting type prompt")
	public void VAT_BUS_DC_005(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_005";
        String notes = "Proper drop down of Posting type prompt";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				//-- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		// -- Business Line Config  click--//
				Businessline.Businessline();
		// -- Business Line config Business line ID max 10 character--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Businessline_ID);
		Thread.sleep(5000);
		// -- Business line Description
		driver.findElement(By.xpath(
		"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
		.sendKeys(Businessline_DESC);
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(5000);
		// -- Service Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --- Service Dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --- Service Dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "dataProvider1", priority = 6)
	@TestDescription("Proper drop down of Match rule ")
	public void VAT_BUS_DC_006(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_006";
        String notes = "Proper drop down of Match rule ";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				//-- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		// -- Business Line Config  click--//
				Businessline.Businessline();
		// -- Business Line config Business line ID max 10 character--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Businessline_ID);
		Thread.sleep(5000);
		// -- Business line Description
		driver.findElement(By.xpath(
		"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
		.sendKeys(Businessline_DESC);
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(5000);
		// -- Service Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --- Service Dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --- Service Dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		// -- Service Descriptipon select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(4000);
		// -- Currency Dropdown---//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Currency Select--//
		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
		Thread.sleep(4000);
	}
	@Test(dataProvider = "dataProvider1", priority = 7)
	@TestDescription("Proper drop down of Gl code & GL description ")
	public void VAT_BUS_DC_009(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_009";
        String notes = "Proper drop down of Gl code & GL description ";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				//-- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		// -- Business Line Config  click--//
				Businessline.Businessline();
		// -- Business Line config Business line ID max 10 character--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Businessline_ID);
		Thread.sleep(5000);
		// -- Business line Description
		driver.findElement(By.xpath(
		"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
		.sendKeys(Businessline_DESC);
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(5000);
		// -- Service Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --- Service Dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --- Service Dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(4000);
		// -- Currency Dropdown---//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Currency Select--//
		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
		Thread.sleep(5000);
		// -- GL Code Popup--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"))
				.click();
		Thread.sleep(4000);
		// -- GL Code Select--//
		driver.findElement(By.xpath(
				"//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span[1]/span[2]/i[1]")).click();
		// -- GL Code Popup--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"))
				.click();
		Thread.sleep(4000);
		// -- GL Code Select--//
		driver.findElement(By.xpath("//td[contains(text(),'01017')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span[1]/span[2]/i[1]")).click();
		Thread.sleep(4000);
	}

	@Test(dataProvider = "dataProvider1", priority = 8)
	@TestDescription("Proper drop down of data for selection has to be populated")
	public void VAT_BUS_DC_008(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_008";
        String notes = "Proper drop down of data for selection has to be populated";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				//-- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(4000);
		// -- Business Line Config  click--//
				Businessline.Businessline();
		// -- Business Line config Business line ID max 10 character--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Businessline_ID);
		Thread.sleep(5000);
// -- Business line Description
driver.findElement(By.xpath(
		"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
		.sendKeys(Businessline_DESC);
Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Business Line Type dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Business line type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(4000);
		// -- Income/Expense Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Income/Expense Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(5000);
		// -- Service Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --- Service Dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Type Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --- Service Dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(4000);
		// -- Service Descriptipon Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		// -- Service Descriptipon select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		// -- Currency Dropdown---//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Currency Select--//
		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
		Thread.sleep(4000);
		// -- GL Code Popup--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		Thread.sleep(4000);
		// -- GL Code Select--//
		driver.findElement(By.xpath(
				"//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span[1]/span[2]/i[1]")).click();
		Thread.sleep(4000);
		// -- GL Code Popup--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		Thread.sleep(4000);
		// -- GL Code Select--//
		driver.findElement(By.xpath("//td[contains(text(),'01017')]")).click();
		Thread.sleep(4000);
		// -- Account Number popup--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]")).click();
		Thread.sleep(4000);
		// --Account Select--//
		driver.findElement(By.xpath("//td[contains(text(),'All Accounts')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[1]/span[2]/i[1]")).click();
		Thread.sleep(4000);
		// -- Account Number popup--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]")).click();
		Thread.sleep(4000);
		// --Account Select--//
		driver.findElement(By.xpath("//td[contains(text(),'01110011')]")).click();
		Thread.sleep(5000);
		// -- Recon Rule Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Recon Rule')]")).click();
		Thread.sleep(4000);
		// -- Rule ID Drop down--//
		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// -- Rule ID Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(4000);
		//--Recon type click--//
		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//--Recon select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(4000);
		// -- Recod Method Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// -- Recod Method Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")).sendKeys("15");
		Thread.sleep(4000);
	}

	@Test(dataProvider = "dataProvider1", priority = 9)
	@TestDescription("There should be a alert message do you want to move to next screen")
	public void VAT_BUS_DC_010(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_010";
        String notes = "There should be a alert message do you want to move to next screen";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(4000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				//-- Criteria click--/
						driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
						//-- Criteria select--//
						driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
						.click();
		Thread.sleep(4000);
		// -- Business Line Config  click--//
				Businessline.Businessline();
		Thread.sleep(4000);
		// -- Add In Business Line configuration--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]"))
				.click();
		Thread.sleep(7000);
	}

	@Test(dataProvider = "dataProvider1", priority = 10)
	@TestDescription("In the recon rule the priority should be changed , use to be editable or dragable  ")
	public void VAT_BUS_DC_013(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_013";
        String notes = "In the recon rule the priority should be changed , use to be editable or dragable  ";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- COlumn click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		//-- COlumn select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT / VAT')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement BusinessEdit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		BusinessEdit.click();
		Thread.sleep(4000);
		// -- Business Line Config in Add--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		WebElement elementToHoverRe = driver.findElement(By.xpath("//span[contains(text(),'Recon Rule')]"));
		Actions actionsClickRe1 = new Actions(driver);
		actionsClickRe1.moveToElement(elementToHoverRe).perform();
		WebElement Edit = driver.findElement(By.xpath("//span[contains(text(),'Recon Rule')]"));
		Edit.click();
		Thread.sleep(4000);
		WebElement Recon = driver.findElement(By.xpath(
				"//tbody/tr[1]/td[1]/input[1]"));
		Recon.click();
		Recon.sendKeys("1");
		Recon.clear();
		Recon.sendKeys("2");
		Thread.sleep(5000);
	}

	@Test(dataProvider = "dataProvider1", priority = 11)
	@TestDescription("Popup sholud display that invalid Businessline Description")
	public void VAT_BUS_DC_014(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_014";
        String notes = "Popup sholud display that invalid Businessline Description";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// column dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT");
		// -- Apply button--/
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement TranslineEdit = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"));
		TranslineEdit.click();
		// -- Business Line Config  click--//
				Businessline.Businessline();
		Thread.sleep(4000);
		// -- Business line des--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
				.clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys("<>");
		// -- save button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(5000);
		WebElement BusinessLine = driver.findElement(By.xpath("//p[contains(text(),'- Failed - Invalid ')]"));
		String proftext = BusinessLine.getText();
		System.out.println(proftext);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_BUS_DC_014.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" VAT_BUS_DC_014 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("VAT_BUS_DC_014 Failed to save screenshot: " + e.getMessage());
		}
	}

	@Test(dataProvider = "dataProvider1", priority = 12)
	@TestDescription("The modified data should be approved")
	public void VAT_BUS_DC_012(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_012";
        String notes = "The modified data should be approved";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Filter column click--//
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//span[contains(text(),'Business Line Record Indicator')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(4000);
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Modify");
		//-- Add filter --//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//--Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST2905");
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'test122')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement BusConfig = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/i[1]"));
		BusConfig.click();
		Thread.sleep(2000);
		//-- Modify click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(8000);
		//--user profile click--//
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		Thread.sleep(2000);
		//-- Logout click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("System");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
				Thread.sleep(4000);
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				Thread.sleep(2000);
				//-- Column click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Filter column click--//
				Actions actions1 = new Actions(driver);
				WebElement elementTarget1 = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
				actions1.moveToElement(elementTarget1);
				WebElement Target1 = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]"));
				actions1.scrollToElement(Target1);
				actions1.perform();
				Target1.click();
				Thread.sleep(4000);
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys("TEST2905");
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(3000);
				WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'test122')]"));
				Actions actionsClick1 = new Actions(driver);
				actionsClick1.moveToElement(elementToHoverM1).perform();
				WebElement BusConfig1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[4]/i[1]"));
				BusConfig1.click();
				Thread.sleep(2000);
				// -- Yes CLick--//
				driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
				Thread.sleep(5000);
				WebElement elementToHoverM11 = driver.findElement(By.xpath("//span[contains(text(),'test122')]"));
				Actions actionsClick11 = new Actions(driver);
				actionsClick11.moveToElement(elementToHoverM11).perform();
				WebElement BusConfig11 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/i[1]"));
				BusConfig11.click();
				Thread.sleep(2000);
				//-- Modify click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
				Thread.sleep(2000);
	}
	@Test(dataProvider = "dataProvider2", priority = 13)
	@TestDescription("The drop down should be aligned properly ")
	public void VAT_BUS_DC_015(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_015";
        String notes = "The drop down should be aligned properly ";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Filter column click--//
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(4000);
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST2905");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'test122')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement BusConfig = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/i[1]"));
		BusConfig.click();
		Thread.sleep(2000);
		//-- Currency click--//
		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
	}
	@Test(dataProvider = "dataProvider2", priority = 14)
	@TestDescription("Proper dropdown should be poped and to be selected")
	public void VAT_BUS_DC_016(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_016";
        String notes = "Proper dropdown should be poped and to be selected";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Filter column click--//
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(4000);
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST2905");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'test122')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement BusConfig = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/i[1]"));
		BusConfig.click();
		Thread.sleep(2000);
		//-- Currency click--//
		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Add row--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]")).click();
		//-- Service type click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- all select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		//-- Service description click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select  --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		//-- currency click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Currency select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- GL code click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'01017')]")).click();
		//-- Account no click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[6]/input[1]")).click();
		Thread.sleep(2000);
		//-- account no select--//
		driver.findElement(By.xpath("//td[contains(text(),'01490024')]")).click();
		Thread.sleep(2000);
	}
	@Test(dataProvider = "dataProvider2", priority = 15)
	@TestDescription("While adding many details all the records should be added")
	public void VAT_BUS_DC_017(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_017";
		String notes = "While adding many details all the records should be added";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		// -- Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Filter column click--//
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver
				.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(4000);
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("TEST2905");
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'test122')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement BusConfig = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/i[1]"));
		BusConfig.click();
		Thread.sleep(2000);
		// -- Currency click--//
		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Add row--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]"))
				.click();
		// -- Service type click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- all select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		// -- Service description click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		// -- currency click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Currency select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// -- GL code click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'01017')]")).click();
		// -- Account no click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[6]/input[1]")).click();
		Thread.sleep(2000);
		// -- account no select--//
		driver.findElement(By.xpath("//td[contains(text(),'01490024')]")).click();
		Thread.sleep(2000);
		// -- Add row--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]"))
				.click();
		// -- Service type click--//
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// --Service desc--//
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// -- Currency click--//
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// -- GL code--//
		driver.findElement(By.xpath("//tbody/tr[3]/td[4]/input[1]")).click();
		Thread.sleep(2000);
		// -- Select --//
		driver.findElement(By.xpath("//td[contains(text(),'ALL')]")).click();
		// -- Account no click--//
		driver.findElement(By.xpath("//tbody/tr[3]/td[6]/input[1]")).click();
		Thread.sleep(2000);
		// -- account no select--//
		driver.findElement(By.xpath("//td[contains(text(),'ALL')]")).click();
		// -- Add row--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]"))
						.click();
				// -- Service type click--//
				driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// --Service desc--//
				driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Currency click--//
				driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- GL code--//
				driver.findElement(By.xpath("//tbody/tr[4]/td[4]/input[1]")).click();
				Thread.sleep(2000);
				// -- Select --//
				driver.findElement(By.xpath("//td[contains(text(),'01083')]")).click();
				// -- Account no click--//
				driver.findElement(By.xpath("//tbody/tr[4]/td[6]/input[1]")).click();
				Thread.sleep(2000);
				// -- account no select--//
				driver.findElement(By.xpath("//td[contains(text(),'02550017')]")).click();
				// -- Add row--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]"))
						.click();
				// -- Service type click--//
				driver.findElement(By.xpath("//tbody/tr[5]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// --Service desc--//
				driver.findElement(By.xpath("//tbody/tr[5]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Currency click--//
				driver.findElement(By.xpath("//tbody/tr[5]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- GL code--//
				driver.findElement(By.xpath("//tbody/tr[5]/td[4]/input[1]")).click();
				Thread.sleep(2000);
				// -- Select --//
				driver.findElement(By.xpath("//td[contains(text(),'01085')]")).click();
				// -- Account no click--//
				driver.findElement(By.xpath("//tbody/tr[5]/td[6]/input[1]")).click();
				Thread.sleep(2000);
				// -- account no select--//
				driver.findElement(By.xpath("//td[contains(text(),'03730014')]")).click();
				Thread.sleep(2000);
				// -- Add row--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]"))
						.click();
				Thread.sleep(3000);
				WebElement elementToHoverM1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				Actions actionsClick1 = new Actions(driver);
				actionsClick1.moveToElement(elementToHoverM1).perform();
				WebElement Connector = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				Connector.click();
				Thread.sleep(2000);
	}
	@Test(dataProvider = "dataProvider2", priority = 16)
	@TestDescription("Combination already found should display in any one line of the record")
	public void VAT_BUS_DC_020(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_020";
		String notes = "Combination already found should display in any one line of the record";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		// -- Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Filter column click--//
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver
				.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(4000);
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("TEST2905");
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'test122')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement BusConfig = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/i[1]"));
		BusConfig.click();
		Thread.sleep(2000);
		// -- Add row--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]"))
				.click();
		// -- Service type click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- all select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		// -- Service description click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		// -- currency click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// -- Currency select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// -- GL code click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'01017')]")).click();
		// -- Account no click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[6]/input[1]")).click();
		Thread.sleep(2000);
		// -- account no select--//
		driver.findElement(By.xpath("//td[contains(text(),'01490024')]")).click();
		Thread.sleep(2000);
		// -- Add row--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]"))
						.click();
				// -- Service type click--//
				driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- all select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
				// -- Service description click--//
				driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
				// -- currency click--//
				driver.findElement(By.xpath("//tbody/tr[3]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				// -- Currency select --//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- GL code click--//
				driver.findElement(By.xpath("//tbody/tr[3]/td[4]/input[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[contains(text(),'01017')]")).click();
				// -- Account no click--//
				driver.findElement(By.xpath("//tbody/tr[3]/td[6]/input[1]")).click();
				Thread.sleep(2000);
				// -- account no select--//
				driver.findElement(By.xpath("//td[contains(text(),'01490024')]")).click();
				Thread.sleep(2000);
				File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// -- save the screenshot --//
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\Businessline\\VAT_BUS_DC_020.png";
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_BUS_DC_020 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_BUS_DC_020 Failed to save screenshot: " + e.getMessage());
				}
		
	}
	@Test(dataProvider = "dataProvider1", priority = 17)
	@TestDescription("The record details should be displayed what the changes made in the record (Maker , Verifier, Date Creation ,Date Modified, record indicator) while verifying Review")
	public void VAT_BUS_DC_021(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "VAT_BUS_DC_021";
		String notes = "The record details should be displayed what the changes made in the record (Maker , Verifier, Date Creation ,Date Modified, record indicator) while verifying Review";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(4000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		// -- Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Filter column click--//
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver
				.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(4000);
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("TEST2905");
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'test122')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement BusConfig = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[6]/i[1]"));
		BusConfig.click();
		Thread.sleep(5000);
	}
	@Test(dataProvider = "dataProvider1", priority = 18)
	@TestDescription("The priority is Editable But it should not Allow Duplicate priority")
	public void VAT_BUS_DC_019(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLineConfig";
		String testCaseId = "BUS_DC_019";
        String notes = "The priority is Editable But it should not Allow Duplicate priority";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// column dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT");
		// -- Apply button--/
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement TranslineEdit = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"));
		TranslineEdit.click();
		Thread.sleep(5000);
		// -- Business line config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// --Recon rule Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Recon Rule')]")).click();
		Thread.sleep(2000);
		// -- Rule priority--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).sendKeys("3");
		Thread.sleep(3000);
	}
	
	@Test(dataProvider = "dataProvider1", priority = 19)
	@TestDescription("Proper drop down of Income/ expenses prompt")
	public void VAT_BUS_DC_007(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLineConfig";
		String testCaseId = "BUS_DC_007";
        String notes = "Proper drop down of Income/ expenses prompt";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				//-- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(5000);
		// -- Business Line Config in Add--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(3000);
		//-- Income expense type click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(3000);
		//-- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Fee & Comission')]")).click();
		Thread.sleep(1000);
		//-- Income expense type click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(3000);
		//-- ANother select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(3000);
	}
	

	@DataProvider(name = "dataProvider1")
	public Object[][] dataProvider1() {
		return new Object[][] { { "RA", "Vision@123" }, };
	}

	@DataProvider(name = "dataProvider2")
	public Object[][] dataProvider2() {
		return new Object[][] { { "System", "Vision@123" }, };
	}
}
