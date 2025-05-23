package visionETL.Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Package_PageObject.Login;
import Package_PageObject.POM_ETL;
import Package_PageObject.POM_General;

public class ETL_Category extends BaseClass{
	
	String CATEGORY = "VAT_CATAUTO_33";
	String ChannelType = "VATChannel14";
	 private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
		ExtentTest currentTest = test.get();
	
		@DataProvider(name = "getUserNameList")
	    public Object[][] getUserNameList() {
	        return new Object[][] {
	            {"RA", "Vision@123"},
	        };
	    }
		private Login LoginPage;
		private POM_General ETL_General;
		private POM_ETL ETLCategory;
		
		 @BeforeMethod
		    public void setUpLogin() {
		        LoginPage = new Login(driver); 
		        ETL_General = new POM_General(driver);
		        ETLCategory = new POM_ETL(driver);
		    }
		 

	@Test(priority = 1, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
																			//////// Removed)------////////
	public void ETL_CT_001(String loginName, String loginPwd) throws InterruptedException {
		LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLCategory.Category();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(3000);// -- Chevon Right Button--//
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(5000);// -- Chevon Right Button--//
		WebElement elementToHover = driver.findElement(By.xpath("//span[contains(text(),'Approved')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		// -- View Button--//
		WebElement view = driver.findElement(By.xpath("//i[contains(text(),'visibility')]"));
		view.click();
		Thread.sleep(3000);
		// --Back Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]/i[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]/i[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]/i[1]"))
				.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2, dataProvider = "getUserNameList")
	@TestDescription(" Referesh button performs the action")
	public void ETL_CT_002(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_002";
        String notes = "Referesh button performs the action";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		// -- Autoreferesh--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3, dataProvider = "getUserNameList")
	@TestDescription(" Filter Operation Should filter Correctly, Filter tick is verified")
	public void ETL_CT_003(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_003";
        String notes = "Filter Operation Should filter Correctly, Filter tick is verified";
        ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		// -- Filter click--//
		ETL_General.FILTER();
		Thread.sleep(3000);
		ETL_General.FilterColumnclick();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 4, dataProvider = "getUserNameList")
	@TestDescription(" Pop-up should show to fill all the mandatory details")
	public void ETL_CT_004(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_004";
        String notes = "Pop-up should show to fill all the mandatory details";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Category Dropdown
		ETLCategory.Category();	
				Thread.sleep(2000);	
		// --Add Category--//
		ETL_General.ADD();
		Thread.sleep(2000);
		// --Add Drop Down Country-//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// --choose Country--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// --Add LE_BOOK Drop down
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(2000);
		// --Send keys For Category ID
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys(CATEGORY);
		Thread.sleep(2000);
		// -- Save click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 5, dataProvider = "getUserNameList")
	@TestDescription("The Entered details should be save and displayed in records") 
	public void ETL_CT_005(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_005";
        String notes = "The Entered details should be save and displayed in records";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(5000);
		// --Add Category--//
		ETL_General.ADD();
		Thread.sleep(5000);
		// --Add Drop Down Country-//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// --choose Country--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// --Add LE_BOOK Drop down
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(2000);
		// --Send keys For Category ID
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys(CATEGORY);
		Thread.sleep(2000);
		// --Send Keys for description
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys(CATEGORY);
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/app-alert-mechanism[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);// -- Email click
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Completed')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'MAT1 - TEST MATRIX')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 6, dataProvider = "getUserNameList")
	@TestDescription("The viewed page should be same while coming back ")
	public void ETL_CT_006(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_006";
        String notes = "The viewed page should be same while coming back ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		// -- Page nation click--//
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(3000);
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[5]/span[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		WebElement view = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[6]/div[2]/a[3]/i[1]"));
		view.click();
		Thread.sleep(3000);// -- View Button--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 7, dataProvider = "getUserNameList", enabled = false) //////// -------- Not Required( Button is
																			//////// Removed)------////////
	public void ETL_CT_007(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_007";
        String notes = "";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		// Element To Hover//
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/span[1]"));
		// Create an instance of Actions class
		Actions actions = new Actions(driver);
		// Perform mouse hover action on the element
		actions.moveToElement(elementToHover).perform();
		WebElement view = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[2]/a[3]/i[1]"));
		view.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[4]/i[1]"))
				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 8, dataProvider = "getUserNameList")
	@TestDescription("All the records in category should be selected")
	public void ETL_CT_008(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_008";
        String notes = "All the records in category should be selected";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]"))
				.click();
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		select.selectByIndex(2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 9, dataProvider = "getUserNameList")
	@TestDescription(" It should display 10 records in one page")
	public void ETL_CT_009(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_009";
        String notes = "It should display 10 records in one page";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]"))
				.click();
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(3000);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByIndex(2);
		Thread.sleep(3000);
	}

	@Test(priority = 10, dataProvider = "getUserNameList")
	@TestDescription(" The created Record should be rejected by clicking the reject button")
	public void ETL_CT_010(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_010";
        String notes = "The created Record should be rejected by clicking the reject button";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		String Reject_ID = "VAT_Reject";
		LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		ETL_General.ADD();
		Thread.sleep(3000);// --Add Category
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);// --Add Drop Down Country
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);// --choose Country
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// --Add LE_BOOK Drop down
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys(Reject_ID);
		Thread.sleep(2000);// --Send keys For Category ID
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys(Reject_ID);
		Thread.sleep(2000);// --Send Keys for description
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/app-alert-mechanism[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);// -- Email click
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Completed')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'MAT1 - TEST MATRIX')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(4000);// -- After save pop up for next record---//
		// -- Filter click--//
		ETL_General.FILTER();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(Reject_ID);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHover = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		// Create an instance of Actions class
		Actions actions = new Actions(driver);
		// Perform mouse hover action on the element
		actions.moveToElement(elementToHover).perform();
//		WebElement reject = driver.findElement(By.xpath("//i[contains(text(),'do_not_disturb_alt')]"));
//		reject.click();
		driver.findElement(By.xpath("//i[contains(text(),'do_not_disturb_alt')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 11, dataProvider = "getUserNameList")
	@TestDescription(" Entered filter operation Should get reset")
	public void ETL_CT_011(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_011";
        String notes = "Entered filter operation Should get reste";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		// --Filter Icon
		ETL_General.FILTER();
		Thread.sleep(3000);
		ETL_General.FilterColumnclick();
//		// --Dropdown for Country
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// -Select Country--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("United");
		// --Reset Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 12, dataProvider = "getUserNameList")
	@TestDescription(" Pop-up should show to fill all the mandatory details in Column and Value")
	public void ETL_CT_012(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_012";
        String notes = "Pop-up should show to fill all the mandatory details in Column and Value";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		// --Filter Icon--//
		ETL_General.FILTER();
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(3000);
		// --Add Filter--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(3000);
	}

	@Test(priority = 13, dataProvider = "getUserNameList")
	@TestDescription(" Entered filter operation Should get Removed")
	public void ETL_CT_013(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_013";
        String notes = "Entered filter operation Should get Removed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		// --Filter Icon--//
		ETL_General.FILTER();
		Thread.sleep(3000);
		ETL_General.FilterColumnclick();
//		// --Dropdown for Country--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		// -Select Country--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("United");
		Thread.sleep(3000);
		// --Add Filter--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		// -- Remove--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/span[1]/a[1]/span[1]/i[1]"))
				.click();
		// -- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 14, dataProvider = "getUserNameList")
	@TestDescription(" The Record Should be be Cleared ")
	public void ETL_CT_014(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_014";
        String notes = "The Record Should be be Cleared ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(4000);
		ETL_General.ADD();
		Thread.sleep(3000);
		// --Add Drop Down Country--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		// --choose Country--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// --Add LE_BOOK Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Le Book select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(2000);
		// --Send keys For Category ID--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("TestA240124");
		Thread.sleep(2000);
		// --Send Keys for description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("Auto Test");
		Thread.sleep(2000);
		// -- Email click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/app-alert-mechanism[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Events Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// --Events Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Completed')]")).click();
		Thread.sleep(2000);
		// --Alert Matrix Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// --Alert Matrix Select--//
		driver.findElement(By.xpath("//span[contains(text(),'MAT1 - TEST MATRIX')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();// -- Clear Button
		// -- Popup for Clear And press yes
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 15, dataProvider = "getUserNameList")
	@TestDescription(" Pop-up is displaying")
	public void ETL_CT_015(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_015";
        String notes = "Pop-up is displaying";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		ETL_General.ADD();
		Thread.sleep(3000);
		// --Add Drop Down Country--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		// --choose Country--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// --Add LE_BOOK Drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Le Book select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(2000);
		// --Send keys For Category ID--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("Test1406");
		Thread.sleep(2000);
		// --Send Keys for description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("Auto Test");
		Thread.sleep(2000);
		// -- Email click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/app-alert-mechanism[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Events Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// --Events Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Completed')]")).click();
		Thread.sleep(2000);
		// --Alert Matrix Dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		// --Alert Matrix Select--//
		driver.findElement(By.xpath("//span[contains(text(),'MAT1 - TEST MATRIX')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 16, dataProvider = "getUserNameList")
	@TestDescription("Record is Reloading")
	public void ETL_CT_016(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_016";
        String notes = "Record is Reloading";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 17, dataProvider = "getUserNameList")
	@TestDescription(" Every records in all pages should be selected")
	public void ETL_CT_017(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_017";
        String notes = "Every records in all pages should be selected";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
        Thread.sleep(5000);
    	driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
    	Thread.sleep(5000);
    	Select select = new Select(driver.findElement(By.xpath(
    			"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
    	select.selectByIndex(0);
    	driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
    	Thread.sleep(7000);
    	select.selectByIndex(1);
    	driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
    	Thread.sleep(7000);
    	select.selectByIndex(2);
    	driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
    	Thread.sleep(3000);
	}

	@Test(priority = 18, dataProvider = "getUserNameList")
	@TestDescription(" Filter Operation Should filter Correctly")
	public void ETL_CT_018(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_018";
        String notes = "Filter Operation Should filter Correctly";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(2000);
		// --Filter--//
		ETL_General.FILTER();
		Thread.sleep(1000);
		// --Column Dropdown--//
		ETL_General.FilterColumnclick();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(1000);
		// --Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(1000);
		// --Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("United");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(1000);// --Add filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(1000);// --Remove Filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(1000);// --Column Dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(1000);// -- Colum Select LE Book
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("01 - Emirates");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(1000);// --Add filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(1000);// --Remove Filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(1000);// --Column Dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(1000);// -- Select Column Category ID
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("TEST");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(1000);// --Add filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(1000);// --Remove Filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(1000);// --Column Dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();// --Select
																													// status
																													// in
																													// Column--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Active");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		ETL_General.FILTER();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(1000);// --Add filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(1000);// --Remove Filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(1000);// --Column Dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();// --Column
																													// Record
																													// Indicator-----//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Approved");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 19, dataProvider = "getUserNameList")
	@TestDescription("Filter should be performed and reload should takes place (Filter should remain the same result)")
	public void ETL_CT_019(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_019";
        String notes = "Filter should be performed and reload should takes place (Filter should remain the same result)";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(4000);
		ETL_General.FILTER();
		Thread.sleep(1000);// --Add filter
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(1000);// --Column Dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();// --Column
																													// Record
																													// Indicator
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Approved");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 20, dataProvider = "getUserNameList")
	@TestDescription(" Each page record to be reloaded while clicking the Button")
	public void ETL_CT_020(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_020";
        String notes = "Each page record to be reloaded while clicking the Button";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLCategory.Category();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
		select.selectByIndex(1);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
		select.selectByIndex(2);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 21, dataProvider = "getUserNameList")
	@TestDescription(" The filter function should performs correctly while the conditions like contains,  begins, equal and end")
	public void ETL_CT_021(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_021";
        String notes = "The filter function should performs correctly while the conditions like contains,  begins, equal and end";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(4000);
		ETL_General.FILTER();
		Thread.sleep(1000);
		// --Filter Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
				.click();
		Thread.sleep(3000);
		// --Record Indicator--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Active");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// --Filter Click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Act");
		Thread.sleep(2000);
		// --Filter Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Begins With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// --Filter Click--///
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("ive");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Ends With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -FILTER CLICK--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
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
		// --Equal --///
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 22, dataProvider = "getUserNameList")
	@TestDescription(" Edited Record Should be saved")
	public void ETL_CT_022(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_022";
        String notes = "Edited Record Should be saved";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(4000);
		// -- Filter click--//
		ETL_General.FILTER();
		Thread.sleep(3000);
		ETL_General.FilterColumnclick();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT_CAT");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Category = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Category.click();
		Thread.sleep(2000);
		WebElement CATDescription = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
		CATDescription.clear();
		CATDescription.sendKeys("VAT_01");
		Thread.sleep(100);
		// --Modify click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(3000);
	}

	@Test(priority = 23, dataProvider = "getUserNameList")
	@TestDescription(" Page is displayed for adding but channel type is not displaying")
	public void ETL_CT_023(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_023";
        String notes = "Page is displayed for adding but channel type is not displaying";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		ETL_General.ADD();
		Thread.sleep(2000);// --Add Category
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);// --Add Drop Down Country
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);// --choose Country
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// --Add LE_BOOK Drop down
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys(ChannelType);
		Thread.sleep(2000);// --Send keys For Category ID
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys(ChannelType);
		Thread.sleep(2000);// --Send Keys for description
		// -- Save click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(3000);
		//--E-Mail click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/app-alert-mechanism[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]")).click();
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_CT_023.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ETL_CT_023 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_CT_023 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		currentTest.log(Status.FAIL,notes);
	}

	@Test(priority = 24, dataProvider = "getUserNameList")
	@TestDescription(" All the records are displaying ( But Filter is applied)")
	public void ETL_CT_024(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_024";
        String notes = "All the records are displaying ( But Filter is applied)";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		// -- Category Dropdown
		ETLCategory.Category();	
		Thread.sleep(3000);
		// -- Filter click--//
		ETL_General.FILTER();
		Thread.sleep(3000);
		ETL_General.FilterColumnclick();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT_CAT");
		// -- Add filter--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Add");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Category = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Category.click();
		Thread.sleep(2000);
		WebElement CATDescription = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
		CATDescription.clear();
		CATDescription.sendKeys("VAT_011");
		Thread.sleep(100);
		// --Modify click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		// -- Nav Back--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(3000);
	}
}
