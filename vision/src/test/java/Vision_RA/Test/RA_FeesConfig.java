package Vision_RA.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.Login;
import Package_PageObject.POM_RA;

public class RA_FeesConfig extends BaseClass {
	
	String VAT = "VAT1604";
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

	@Test(dataProvider = "loginCredentials", priority = 1)
	@TestDescription("Proper data has to be feeded in Effective number")
	public void VAT_FEE_DC_001(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_001";
        String notes = "Proper data has to be feeded in Effective number";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(7000);
		Thread.sleep(5000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();// -- Effective Date Btton click--//
		driver.findElement(By.xpath(
				"//body/div[2]/div[1]/dp-day-time-calendar[1]/dp-day-calendar[1]/div[1]/div[1]/div[3]/button[2]"))
				.click();// -- Effective date Select--//
		Thread.sleep(8000);
	}

	@Test(dataProvider = "loginCredentials", priority = 2)
	@TestDescription("Proper data has to be feeded in fee type and fee basis")
	public void VAT_FEE_DC_002(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_002";
        String notes = "Proper data has to be feeded in fee type and fee basis";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Flat')]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Slab')]"))
				.click();
		Thread.sleep(5000);
	}

	@Test(dataProvider = "loginCredentials", priority = 2)
	@TestDescription("Proper data has to be feeded in fee type and fee basis")
	public void VAT_FEE_DC_002_01(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_002_01";
        String notes = "Proper data has to be feeded in fee type and fee basis";
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
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(5000);
				//-- Add in Fees --//
				driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
				Thread.sleep(5000);
		// --- Fees BAsis dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Per Unit')]"))
				.click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Unit x Sub Count')]")).click();
		Thread.sleep(5000);
	}

	@Test(dataProvider = "loginCredentials", priority = 3)
	@TestDescription("Proper data has to be feeded in Tier/range type")
	public void VAT_FEE_DC_003(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_003";
        String notes = "Proper data has to be feeded in Tier/range type";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Tenor based on days past (Business_Date-Start Date')]"))
				.click();
		Thread.sleep(5000);
	}
	
	@Test(dataProvider = "loginCredentials", priority = 4)
	@TestDescription("Proper drop all the prompt has to be populated ")
	public void VAT_FEE_DC_004(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_004";
        String notes = "Proper drop all the prompt has to be populated ";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(5000);
		// -- Channel type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// --- Channel type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
		// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'ATM Transactions')]"))
				.click();
		// --buusiness vertical dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- business vertical select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// --customer id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();
		Thread.sleep(5000);
		// -- contract id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- contract id select--//
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();
		Thread.sleep(5000);
		// --product type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[8]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[30]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- posting currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// -- posting currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(5000);
		// -- currency conversion type --//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- currency converssiont select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Buy Rate')]"))
				.click();
		Thread.sleep(5000);
		 // -- look up amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- look up amount type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Actual Amt')]")).click();
		Thread.sleep(5000);
		// -- percentage amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- percentage amount type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		// -- round of basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- round of basis dropdown select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(5000);
	}

	@Test(dataProvider = "loginCredentials", priority = 5)
	@TestDescription("Only numbers has to be accepted")
	public void VAT_FEE_DC_005(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_005";
        String notes = "Only numbers has to be accepted";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(4000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		// -- add button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]"))
				.click();
		// -- Channel type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// --- Channel type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
		// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'ATM Transactions')]"))
				.click();
		// --buusiness vertical dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- business vertical select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// --customer id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();
		Thread.sleep(5000);
		// -- contract id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- contract id select--//
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();
		Thread.sleep(5000);
		// -- transaction currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[30]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		// -- posting currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// -- posting currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(5000);
		// -- currency conversion type --//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- currency converssiont select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Buy Rate')]"))
				.click();
		Thread.sleep(5000);
		 // -- look up amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- look up amount type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Actual Amt')]")).click();
		Thread.sleep(5000);
		// -- percentage amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- percentage amount type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(5000);
		// -- round of basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- round of basis dropdown select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("0.00");// -- min fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(5000);
	}

	@Test(dataProvider = "loginCredentials", priority = 6)
	@TestDescription("Only numbers has to be accepted")
	public void VAT_FEE_DC_006(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_006";
        String notes = "Only numbers has to be accepted";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		// -- add button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]"))
				.click();
		// -- Channel type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// --- Channel type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
		// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'ATM Transactions')]"))
				.click();
		// --buusiness vertical dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- business vertical select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// --customer id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();
		Thread.sleep(5000);
		// -- contract id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- contract id select--//
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();
		Thread.sleep(5000);
		// -- transaction currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[30]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		// -- posting currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// -- posting currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(5000);
		// -- currency conversion type --//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- currency converssiont select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Buy Rate')]"))
				.click();
		Thread.sleep(5000);
		 // -- look up amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- look up amount type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Actual Amt')]")).click();
		Thread.sleep(5000);
		// -- percentage amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- percentage amount type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(5000);
		// -- round of basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- round of basis dropdown select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("0.00");// -- min fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(element);
		WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		actions.scrollToElement(FromAmount);
		actions.perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();// -- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");// ---From Account Sendkeys--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();// -- To Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("3456789");// ---To Account Sendkeys--//
		Thread.sleep(8000);
	}

	@Test(dataProvider = "loginCredentials", priority = 7)
	@TestDescription("Data has to properly feeded in the respective field, addition of data is to be possible and scrol down of data is to be posssible")
	public void VAT_FEE_DC_007(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_007";
        String notes = "Data has to properly feeded in the respective field, addition of data is to be possible and scrol down of data is to be posssible";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		// -- add button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]"))
				.click();
		// -- Channel type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// --- Channel type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
		// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'ATM Transactions')]"))
				.click();
		// --buusiness vertical dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- business vertical select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// --customer id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();
		Thread.sleep(5000);
		// -- contract id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- contract id select--//
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();
		Thread.sleep(5000);
		// -- transaction currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[30]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		// -- posting currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// -- posting currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(5000);
		// -- currency conversion type --//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- currency converssiont select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Buy Rate')]"))
				.click();
		Thread.sleep(5000);
		 // -- look up amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- look up amount type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Actual Amt')]")).click();
		Thread.sleep(5000);
		// -- percentage amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- percentage amount type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(5000);
		// -- round of basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- round of basis dropdown select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("0.00");// -- min fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(element);
		WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		actions.scrollToElement(FromAmount);
		actions.perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();// -- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");// ---From Account Sendkeys--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();// -- To Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("3456789");// ---To Account Sendkeys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("25");
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]/div[1]"))
				.click();
		Actions actions11 = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions11.moveToElement(element1);
		WebElement FromAmount1 = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		actions.scrollToElement(FromAmount1);
		actions.perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).clear();// -- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("3456789");// ---From Account Sendkeys--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();// -- To Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("4567890");// ---To Account Sendkeys--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).sendKeys("50");
		Thread.sleep(7000);
	}
	
	@Test(dataProvider = "loginCredentials", priority = 8) // -- Unable to Proceed further to amount is clearing--//
	@TestDescription("Once you enter any data In Fee amount/percentage column  and click on to apply data has to be saved")
	public void VAT_FEE_DC_013(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_013";
        String notes = "Once you enter any data In Fee amount/percentage column  and click on to apply data has to be saved";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Unit x Sub Count')]")).click();
		Thread.sleep(5000);
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(element);
		WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		actions.scrollToElement(FromAmount);
		actions.perform();
		// -- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
		// ---From Account Sendkeys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();
		// -- To Amount--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("1000000");
		Thread.sleep(4000);
		// --Fee Basis dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Fee Basis dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(7000);
		// -- To Amount--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("100000");
		Thread.sleep(8000);
		// --Fee amount / Percentage--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("25");
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 9)
	@TestDescription("Data should be deleted once the pop up popute and click on to yes button")
	public void VAT_FEE_DC_022(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_022";
        String notes = "Data should be deleted once the pop up popute and click on to yes button";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
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
					.sendKeys(VAT);
			// -- Apply click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(5000);
			//-- Edit click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
			Thread.sleep(5000);
			// -- Business Line Config click--//
			driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]")).click();
	Thread.sleep(5000);
	// -- Fees Config Button Click--//
	driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
	Thread.sleep(5000);
	WebElement elementToHoverM = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]"));
	Actions actionsClick = new Actions(driver);
	actionsClick.moveToElement(elementToHoverM).perform();	
	WebElement FeesDeleteClick = driver.findElement(By.xpath("//tbody/tr[2]/td[6]/div[1]/a[2]/i[1]"));
	FeesDeleteClick.click();
	Thread.sleep(5000);
	 //-- Take screenshot and save it to a file--//
	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_FEE_DC_022.png";
	//-- save the screenshot --//
	File destinationFile = new File(Location);
	// Move the screenshot file to the specified destination
	try {
		org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
		System.out.println(" VAT_FEE_DC_022 Screenshot saved to: " + destinationFile.getAbsolutePath());
	} catch (IOException e) {
		System.out.println("VAT_FEE_DC_022 Failed to save screenshot: " + e.getMessage());
	}
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(3000);
	}

	@Test(dataProvider = "loginCredentials", priority = 10,enabled = false)
	@TestDescription("Data has to be modified")
	public void VAT_FEE_DC_015(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_015";
        String notes = "Data has to be modified";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Fee Type dropdown--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]"))
				.click();// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);// --Fee Basis dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Unit x Sub Count')]")).click();// --Fee Basis dropdown
																							// Select--//
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();// -- Add Row--//
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement scroll = driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(scroll);
		WebElement Target = driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Target.sendKeys("25");
		Thread.sleep(8000);
		throw new SkipException("Skip");
	}

	@Test(dataProvider = "loginCredentials", priority = 11,enabled = false)
	@TestDescription("There should be a pop up message indicating that Do you want to change ")
	public void VAT_FEE_DC_016(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_016";
        String notes = "There should be a pop up message indicating that Do you want to change ";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(7000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[5]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeesConfig = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/a[1]/i[1]"));
		FeesConfig.click();
		Thread.sleep(5000);// -- Edit Buttom--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("12");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("15");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("20");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(5000);
		throw new SkipException("Skip");
	}

	@Test(dataProvider = "loginCredentials", priority = 12)
	@TestDescription("Filtered Record should get Reset and all the Records to be Displayed")
	public void VAT_FEE_DC_028(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_028";
        String notes = "Filtered Record should get Reset and all the Records to be Displayed";
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
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(8000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(5000);
		// -- add Row button--//
		driver.findElement(By.xpath(	
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		// apply button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FeesConfig\\VAT_FEE_DC_028.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" VAT_FEE_DC_028 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("VAT_FEE_DC_028 Failed to save screenshot: " + e.getMessage());
		}
	}

	@Test(dataProvider = "loginCredentials", priority = 13)
	@TestDescription("Click on Filter and add the Required Actions then Click Reset Button then Add new Fees Configuration and give Apply,	New Fees Config should be Added")
	public void VAT_FEE_DC_029(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_029";
        String notes = "Click on Filter and add the Required Actions then Click Reset Button then Add new Fees Configuration and give Apply,	New Fees Config should be Added";
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
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fee Type dropdown--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Fee Type dropdown Select--//
				driver.findElement(By.xpath(
						"//span[contains(text(),'Range')]"))
						.click();
				Thread.sleep(5000);
				// -- Tier Range type drop down--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Tier Range type drop down Select--//
				driver.findElement(By.xpath(
						"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
						.click();
				//-- Fee basis click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee basis Select--//
				driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
				Thread.sleep(5000);
				//-- All Click--//
				driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
				Thread.sleep(5000);
				//-- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
				// -- add Row button--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]"))
						.click();
				Thread.sleep(5000);
				// apply button--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();		
				Thread.sleep(5000);
	}
	@Test(dataProvider = "loginCredentials", priority = 14)
	@TestDescription("Click on Fees Config and click on Filter Reste Button and enter the Fees type as Flat and Fee Basis as Percentage and click on Add row and enter the Fee Config Details and give apply,	Fees Config details should be added Successfully")
	public void VAT_FEE_DC_032(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_0032";
        String notes = "Click on Fees Config and click on Filter Reste Button and enter the Fees type as Flat and Fee Basis as Percentage and click on Add row and enter the Fee Config Details and give apply,	Fees Config details should be added Successfully";
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
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(5000);
				//-- Fee type  (flat)--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Fee Type dropdown Select--//
				driver.findElement(By.xpath(
						"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
						.click();
				//-- Fee basis click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee basis Select--//
				driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
				Thread.sleep(5000);		
	}
	@Test(dataProvider = "loginCredentials", priority = 15)
	@TestDescription("Popup should ask to Change or Inline Trigger should display that amount is lesser")
	public void VAT_FEE_DC_034(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_0034";
        String notes = "Popup should ask to Change or Inline Trigger should display that amount is lesser";
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
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fee Type dropdown--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Fee Type dropdown Select--//
				driver.findElement(By.xpath(
						"//span[contains(text(),'Range')]"))
						.click();
				Thread.sleep(5000);
				// -- Tier Range type drop down--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Tier Range type drop down Select--//
				driver.findElement(By.xpath(
						"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
						.click();
				//-- Fee basis click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee basis Select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
				Thread.sleep(5000);
				// -- add Row button--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]"))
						.click();
				Thread.sleep(5000);
				Actions actions = new Actions(driver);
				WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions.moveToElement(elementTarget);
				WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
				actions.scrollToElement(Target);
				actions.perform();
				Target.click();
				Target.clear();
				Target.sendKeys("9999999999999999");
				// apply button--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();		
				Thread.sleep(5000);	
				 //-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_FEE_DC_034.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_FEE_DC_034 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_FEE_DC_034 Failed to save screenshot: " + e.getMessage());
				}
	}
	@Test(dataProvider = "loginCredentials", priority = 16)
	@TestDescription("When moving to other fees, Clicked details of Pricing should be displayed")
	public void VAT_FEE_DC_045(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_0045";
        String notes = "When moving to other fees, Clicked details of Pricing should be displayed";
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
								.sendKeys("ENPLPL0029");
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(8000);
				//-- Another Fees click--//
				driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).click();
				Thread.sleep(5000);
				//-- Preferential click--//
				driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
				//-- Another Fees click--//
				driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).click();
				Thread.sleep(5000);
				//-- ALL Click--//
				driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
				Thread.sleep(8000);		
	}
	@Test(dataProvider = "loginCredentials", priority = 17)
	@TestDescription("Data has to be defferentiated between standard or perferential as per the pricing column in the screen")
	public void VAT_FEE_DC_037(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_0037";
        String notes = "Data has to be defferentiated between standard or perferential as per the pricing column in the screen";
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
								.sendKeys("BUS_TEST");
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(8000);
				//-- Add CLick--//
				driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
				Thread.sleep(5000);
				//-- Fee type dropdown--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee type flat select--//
				driver.findElement(By.xpath("//span[contains(text(),'Flat')]")).click();
				//-- Fee basis dropdown--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee basis select Percentage---//
				driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
				//-- Standard click--//
				driver.findElement(By.xpath("//span[contains(text(),'Standard')]")).click();
				Thread.sleep(5000);
				//-- Add row click--//
				driver.findElement(By.xpath("//div[@class='addRow']")).click();
				Thread.sleep(5000);
				Actions actions = new Actions(driver);
				WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions.moveToElement(elementTarget);
				WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
				actions.scrollToElement(Target);
				actions.perform();
				Target.click();
				//-- Fee amount/percentage send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
				//-- Apply Click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Modify click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
				Thread.sleep(4000);
				//-- Preferential click--//
				driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
				Thread.sleep(5000);
				//-- Add row click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/i[1]")).click();
				Thread.sleep(5000);
				//-- Channel type click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Channel type select-- Mobile banking--//
				driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
				Actions actions1 = new Actions(driver);
				WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions1.moveToElement(elementTarget1);
				WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
				actions1.scrollToElement(Target1);
				actions1.perform();
				Target1.click();
				//-- Fee amount/percentage send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Modify click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
				Thread.sleep(5000);
				//-- All click--//
				driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
				Thread.sleep(5000);
				//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FeesConfig\\VAT_FEE_DC_037.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_FEE_DC_037 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_FEE_DC_037 Failed to save screenshot: " + e.getMessage());
				}			
	}
	@Test(dataProvider = "loginCredentials", priority = 18)
	@TestDescription("Once u enter into fee config screen and edit Modify pending data and select pricing column as standard or preferential	,The edited data should process correctly")
	public void VAT_FEE_DC_039(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_039";
        String notes = "Once u enter into fee config screen and edit Modify pending data and select pricing column as standard or preferential	,The edited data should process correctly";
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
								.sendKeys("ENPLPL0029");
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(8000);
				//-- Standard add row--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]")).click();
				Actions actions = new Actions(driver);
				WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions.moveToElement(elementTarget);
				WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
				actions.scrollToElement(Target);
				actions.perform();
				Target.click();
				//-- Fee amount/percentage send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Modify click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
				Thread.sleep(8000);
				//-- Preferential click--//
				driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
				Thread.sleep(5000);
				//-- Add row--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
				Thread.sleep(5000);
				//-- Channel type click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Channel type select-- Mobile banking--//
				driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
				Actions actions1 = new Actions(driver);
				WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions1.moveToElement(elementTarget1);
				WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
				actions1.scrollToElement(Target1);
				actions1.perform();
				Target1.click();
				//-- Fee amount/percentage send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- All click--//
				driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
				Thread.sleep(5000);
				//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FeesConfig\\VAT_FEE_DC_039.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_FEE_DC_039 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_FEE_DC_039 Failed to save screenshot: " + e.getMessage());
				}	
				Thread.sleep(5000);
	}
	@Test(dataProvider = "loginCredentials", priority = 19)
	@TestDescription("Data has to flow from fee type to Fee amount or percenge on the tier")
	public void VAT_FEE_DC_008(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_008";
        String notes = "Data has to flow from fee type to Fee amount or percenge on the tier";
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
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(8000);
				//-- Add row --//
				driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
				Thread.sleep(1000);
				//-- Fee type click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(8000);
				driver.findElement(By.xpath("//span[contains(text(),'Slab')]")).click();
				Thread.sleep(1000);
				//-- Fee type click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(8000);
				driver.findElement(By.xpath("//span[contains(text(),'Range')]")).click();
				Thread.sleep(5000);
	}
	@Test(dataProvider = "loginCredentials", priority = 20)
	@TestDescription("1.Data in To amount is changed .next column From amount column as to change according to Previous TO amount")
	public void VAT_FEE_DC_012(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_012";
        String notes = "1.Data in To amount is changed .next column From amount column as to change according to Previous TO amount";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- select--//
		driver.findElement(By.xpath("//span[contains(text(),'Slab')]")).click();
		Thread.sleep(2000);
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select --//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/i[1]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Target.clear();
		Target.sendKeys("1100");
		//-- Fee amount percentage click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("5");
		//-- Add row click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]/div[1]/i[1]")).click();
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 21)
	@TestDescription("1. Once you enter 2 or more data in in fee config and click on to save button")
	public void VAT_FEE_DC_014(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_014";
        String notes = "1. Once you enter 2 or more data in in fee config and click on to save button";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- select--//
		driver.findElement(By.xpath("//span[contains(text(),'Slab')]")).click();
		Thread.sleep(2000);
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select --//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		//--- Preferential click--//
		driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
		Thread.sleep(2000);
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/i[1]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Target.clear();
		Target.sendKeys("1100");
		//-- Fee amount percentage click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("5");
		//-- Add row click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]/div[1]/i[1]")).click();
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		Thread.sleep(2000);
		//-- Fee amount percentage click--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[5]/input[1]")).sendKeys("5");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(2000);
		//-- Channel type click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- ATM click--//
		driver.findElement(By.xpath("//span[contains(text(),'ATM Transactions')]")).click();
		Actions actions11 = new Actions(driver);
		WebElement elementTarget11 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions11.moveToElement(elementTarget11);
		WebElement Target11 = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]"));
		actions11.scrollToElement(Target11);
		actions11.perform();
		Target11.click();
		//-- Fee amount percentage click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("10");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		//-- Save click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(3000);	
	}
	@Test(dataProvider = "loginCredentials", priority = 22)
	@TestDescription("There shoud be data in Currency conversion type")
	public void VAT_FEE_DC_017(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_017";
        String notes = "There shoud be data in Currency conversion type";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);// -- Fees Config Button Click--//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//-- All Click--//
		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//th[contains(text(),'Round Off Basis Decimal')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(3000);
	}
	@Test(dataProvider = "loginCredentials", priority = 23)
	@TestDescription("After Click on Add row automatically the Value in Fee amount/percentage Should be set as 0")
	public void VAT_FEE_DC_030(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_030";
        String notes = "After Click on Add row automatically the Value in Fee amount/percentage Should be set as 0";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);// -- Fees Config Button Click--//
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Fee type click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Flat Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Percentage select--//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_FEE_DC_030.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" VAT_FEE_DC_030 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("VAT_FEE_DC_030 Failed to save screenshot: " + e.getMessage());
		}	
		
	}
	@Test(dataProvider = "loginCredentials", priority = 24)
	@TestDescription("Inline Trigger should appear in From Amount (From amount is Greater than To Amount)")
	public void VAT_FEE_DC_026(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_026";
        String notes = "Inline Trigger should appear in From Amount (From amount is Greater than To Amount)";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);// -- Fees Config Button Click--//
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Fee type click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Range select--//
		driver.findElement(By.xpath("//span[contains(text(),'Range')]")).click();
		//-- Fee Basis CLick---//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Percentage slect--//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		Thread.sleep(2000);
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement TargetFromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		actions.scrollToElement(TargetFromAmount);
		actions.perform();
		TargetFromAmount.click();
		TargetFromAmount.sendKeys("99999999");
		WebElement ToAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]"));
		ToAmount.click();
		ToAmount.clear();
		ToAmount.sendKeys("123");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement TargetFromAmount1 = driver.findElement(By.xpath("//div[contains(text(),'* To Amount must be greater than From Amount')]"));
		actions1.scrollToElement(TargetFromAmount1);
		actions1.perform();
		TargetFromAmount1.click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_FEE_DC_026.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_FEE_DC_026 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_FEE_DC_026 Failed to save screenshot: " + e.getMessage());
				}
				Thread.sleep(3000);
	}
	@Test(dataProvider = "loginCredentials", priority = 25)
	@TestDescription("Save Popup should show Before going to Filter( in Modify Pending Records)")
	public void VAT_FEE_DC_027(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_027";
        String notes = "Save Popup should show Before going to Filter( in Modify Pending Records)";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(7000);// -- Fees Config Button Click--//
		//-- Add row--//					
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Target.sendKeys("1");
		//-- Apply Click---//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_FEE_DC_027.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" VAT_FEE_DC_027 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("VAT_FEE_DC_027 Failed to save screenshot: " + e.getMessage());
		}	
	}
	@Test(dataProvider = "loginCredentials", priority = 26)
	@TestDescription("Modification should takes place twice with added details")
	public void VAT_FEE_DC_040(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_040";
        String notes = "Modification should takes place twice with added details";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);// -- Fees Config Button Click--//
		//-- Add row--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Target.sendKeys("1");
		//-- Apply Click---//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		//--Modify CLick--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeesConfig = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
		FeesConfig.click();
		Thread.sleep(2000);
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		//-- Modify click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 27)
	@TestDescription("Select TDR days in tier / range	Data has to be present in Fee configuration details under Fee amount/ Percentage")
	public void VAT_FEE_DC_019(String username, String password) throws InterruptedException {
		String ScreenName = "Fees Configuration";
		String testCaseId = "VAT_FEE_DC_019";
        String notes = "Select TDR days in tier / range	Data has to be present in Fee configuration details under Fee amount/ Percentage";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		 // --- TransLine Config--//
     	TranslineConfig.Transline();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
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
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(8000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);// -- Fees Config Button Click--//
		//-- Add row--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Fee type click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Fee type select (Range)--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(3000);
		//--Tier range select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Tier /Range type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Tenor based on days past (Business_Date-Start Date')]")).click();
		Thread.sleep(2000);
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Fee basis select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		Thread.sleep(2000);
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		//--Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		//-- Save click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);	
	}
		@Test(dataProvider = "loginCredentials", priority = 28)
		@TestDescription("The Inline trigger should be appeared while creating same combination in fees")
		public void VAT_FEE_DC_042(String username, String password) throws InterruptedException {
			String ScreenName = "Fees Configuration";
			String testCaseId = "VAT_FEE_DC_042";
	        LoginPage.loginUsername(username);
	        LoginPage.loginPassword(password);
	        LoginPage.LoginClick();
			Thread.sleep(7000);
			 // --- TransLine Config--//
	     	TranslineConfig.Transline();
			Thread.sleep(5000);
			// -- Edit Button in Manin screen of Trans Line--//
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
					.sendKeys(VAT);
			// -- Apply click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(5000);
			//-- Edit click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
			Thread.sleep(8000);
			// -- Business Line Config click--//
			driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
			Thread.sleep(5000);// -- Fees Config Button Click--//
			//-- Add row--//
			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
			Thread.sleep(2000);
			//-- Feetype click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Flat')]")).click();
			Thread.sleep(2000);
			//-- Fee basis click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- Fee basis select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
			//-- Add row--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
			Actions actions = new Actions(driver);
			WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
			actions.moveToElement(elementTarget);
			WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
			actions.scrollToElement(Target);
			actions.perform();
			//-- Fee amount/percentage--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("10");
			//-- Time clear--//
			 WebElement Time = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
			Time.clear();
			Time.sendKeys("11-Sep-2024 15:33:53");
			Thread.sleep(4000);
			//-- Apply click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
			Actions actions11 = new Actions(driver);
			WebElement elementTarget11 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
			actions11.moveToElement(elementTarget11);
			WebElement Target11 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"));
			actions11.scrollToElement(Target11);
			actions11.perform();
			Thread.sleep(4000);
			String notes = "The Inline trigger should be appeared while creating same combination in fees";
	        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	      //-- Take screenshot and save it to a file--//
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_FEE_DC_042.png";
			//-- save the screenshot --//
			File destinationFile = new File(Location);
			// Move the screenshot file to the specified destination
			try {
				org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
				System.out.println(" VAT_FEE_DC_042 Screenshot saved to: " + destinationFile.getAbsolutePath());
			} catch (IOException e) {
				System.out.println("VAT_FEE_DC_042 Failed to save screenshot: " + e.getMessage());
			}
			Thread.sleep(2000);
		}
	
	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
