package visionRA.Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.Login;
import Package_PageObject.POM_General;
import Package_PageObject.POM_RA;
import Package_PageObject.POM_RA_VarianceFlagging;

public class RA_VarianceFlaggingMultiUser extends BaseClass{
		
	String DESC = "VAT_Multi";
	String DESC1 = "VAT_Multi1";

	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		return new Object[][] { { "RA", "Vision@123" }, };
	}
	
	private Login LoginPage;
	private POM_General RA_General;
	private POM_RA RA_Variance;
	private POM_RA_VarianceFlagging VarianceNew;
	
	
	@BeforeMethod
	public void Setup() {
		LoginPage = new Login(driver);
		RA_General = new POM_General(driver);
		RA_Variance = new  POM_RA(driver);
		VarianceNew = new POM_RA_VarianceFlagging(driver);
	}
	
	

//	@BeforeMethod
//	public void setUpLogin() {
//		LoginPage = new Login(driver);
//	}
//	@BeforeMethod
//	public void RA() {
//		RA_General = new POM_General(driver);
//	}
//	@BeforeMethod
//	public void VarianceFlagging() {
//		RA_Variance = new  POM_RA(driver);
//	}
//	@BeforeMethod
//	public void Variance() {
//		VarianceNew = new POM_RA_VarianceFlagging(driver);
//	}
	
	@Test(dataProvider = "loginCredentials", priority = 1)
	@TestDescription("System should display the detail about the already flagged records and which another user has flagged it. System should have an option to uncheck the errored (Already flagged) records at the same time.")
	public void FG_CF_049(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_049";
        String notes = "System should display the detail about the already flagged records and which another user has flagged it. System should have an option to uncheck the errored (Already flagged) records at the same time.";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		RA_Variance.VarianceFlagging();
		Thread.sleep(5000);
		//-- Add click--//
		RA_General.ADD();
		Thread.sleep(2000);
		//-- Description Send keys--//
		VarianceNew.Description(DESC);
		VarianceNew.Edit();
		Thread.sleep(5000);
		// -- Date from select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(2000);
		// -- Year click--//
		driver.findElement(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")).click();
		// --2024 click--//
		driver.findElement(By.xpath("//tbody/tr[6]/td[4]/div[1]")).click();
		// -- FEB click--///
		driver.findElement(By.xpath("//div[contains(text(),'FEB')]")).click();
		// -- select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		// -- To Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(2000);
		// --- 1st date--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		// -- Query Click--//
		VarianceNew.Query();
		Thread.sleep(5000);
		VarianceNew.ChevronRight();
		VarianceNew.ChevronRight();
		VarianceNew.ChevronRight();
		VarianceNew.ChevronRight();
		VarianceNew.ChevronRight();
		
		
	}
	@Test(dataProvider = "loginCredentials", priority = 1)
	@TestDescription("OtherUser-System should display the detail about the already flagged records and which another user has flagged it. System should have an option to uncheck the errored (Already flagged) records at the same time.")
	public void FG_CF_049_1(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_049";
        String notes = "System should display the detail about the already flagged records and which another user has flagged it. System should have an option to uncheck the errored (Already flagged) records at the same time.";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		RA_Variance.VarianceFlagging();
		Thread.sleep(5000);
		//-- Add click--//
		RA_General.ADD();
		Thread.sleep(2000);
		//-- Description Send keys--//
		VarianceNew.Description(DESC);
		VarianceNew.Edit();
		Thread.sleep(5000);
		// -- Date from select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(2000);
		// -- Year click--//
		driver.findElement(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")).click();
		// --2024 click--//
		driver.findElement(By.xpath("//tbody/tr[6]/td[4]/div[1]")).click();
		// -- FEB click--///
		driver.findElement(By.xpath("//div[contains(text(),'FEB')]")).click();
		// -- select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		// -- To Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(2000);
		// --- 1st date--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		// -- Query Click--//
		VarianceNew.Query();
		Thread.sleep(5000);
		VarianceNew.ChevronRight();
		VarianceNew.ChevronRight();
		VarianceNew.ChevronRight();
		VarianceNew.ChevronRight();
		VarianceNew.ChevronRight();
		
		
	}
}
