package Vision_ETL_v1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import visionETL.Test.BaseClass;
import visionETL.Test.ListenersETL;
import visionETL.Test.TestDescription;

public class LandingPage_v1 extends BaseClass{
	 @DataProvider(name = "getUserNameList")
	    public Object[][] getUserNameList() {
	        return new Object[][] {
	            {"vision", "Vision@123"},
	        };
	    }
	@Test(priority = 1, dataProvider = "getUserNameList")
	@TestDescription("Auto Referesh Sholud takes place every '15' Sec ")
	public void ETL_LP_035(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_035";
        String notes = "Auto Referesh Sholud takes place every '15' Sec ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[contains(text(),'history')]")).click();
		Thread.sleep(16000);
	}

	@Test(priority = 2, dataProvider = "getUserNameList")
	@TestDescription("Entered Current process filter should be filtered")
	public void ETL_LP_032(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_032";
        String notes = "Entered Current process filter should be filtered";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Operation")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[1]/div[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Terminate");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3, dataProvider = "getUserNameList")
	@TestDescription("The Exported file should be downloaded 	,It shows an error pop up as No Records Found")
	public void ETL_LP_029(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_029";
        String notes = "The Exported file should be downloaded ,	It shows an error pop up as No Records Found";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Dashboard")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/div[1]/span[1]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'PDF')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 4, dataProvider = "getUserNameList")
	@TestDescription("The start date and end date function to be changed with Time Stamp")
	public void ETL_LP_027(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_027";
        String notes = "The start date and end date function to be changed with Time Stamp";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Dashboard")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'arrow_drop_down')]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'17')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'14')]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 5, dataProvider = "getUserNameList")
	@TestDescription("Log file should be downloaded")
	public void ETL_LP_026(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_026";
        String notes = "Log file should be downloaded";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Operation")).click();
		Thread.sleep(10000);
		WebElement elementToHover = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[12]"));
	    // Create an instance of Actions class
	    Actions actions = new Actions(driver);
	    // Perform mouse hover action on the element
	    actions.moveToElement(elementToHover).perform();
	    WebElement logs = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[14]/div[2]/a[2]/i[1]"));
	    logs.click();
	    Thread.sleep(10000);
	}
	@Test(priority = 6, dataProvider = "getUserNameList")
	@TestDescription("The EOD stats screen should be maximized")
	public void ETL_LP_025(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_025";
        String notes = "The EOD stats screen should be maximized";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 7, dataProvider = "getUserNameList")
	@TestDescription("Display all the details present in Category details")
	public void ETL_LP_022(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_022";
        String notes = "Display all the details present in Category details";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Operation")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[3]/span[1]/i[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[3]/span[1]/i[1]"))
				.click();
		Thread.sleep(2000);
	}
	@Test(priority = 8, dataProvider = "getUserNameList")
	@TestDescription("The corrected processed data is reloaded, providing accurate status information.")
	public void ETL_LP_013(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_013";
        String notes = "The corrected processed data is reloaded, providing accurate status information.";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 9, dataProvider = "getUserNameList")
	@TestDescription("The records should display the total count rather than showing fewer records when the rows per page is set to 50 in the feed details.")
	public void ETL_LP_014(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_014";
        String notes = "The records should display the total count rather than showing fewer records when the rows per page is set to 50 in the feed details.";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Operation")).click();
		Thread.sleep(1000);
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(3000);
		select.selectByIndex(2);
	}
	@Test(priority = 10, dataProvider = "getUserNameList")
	@TestDescription("Clicking \"Reload\" should result in all category details being fully deselected.")
	public void ETL_LP_018(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_018";
        String notes = "Clicking \"Reload\" should result in all category details being fully deselected.";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Operation")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 11, dataProvider = "getUserNameList")
	@TestDescription("Details should be displayed	,The Operation running status displayed correctly")
	public void ETL_LP_020(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_020";
        String notes = "Details should be displayed	,The Operation running status displayed correctly";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Operation")).click();
		Thread.sleep(1000);// --Yet to start
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/span[1]"))
				.click();
		Thread.sleep(1000);// --On Hold
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/span[1]"))
				.click();
		Thread.sleep(1000);// --In progress
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/span[1]"))
				.click();
		Thread.sleep(1000);// --Success
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]/span[1]/*[1]"))
				.click();
		Thread.sleep(1000);// --Errored
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/span[1]"))
				.click();
		Thread.sleep(1000);// --Terminated
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/span[1]"))
				.click();
	    Thread.sleep(1000);
	}
	@Test(priority = 12, dataProvider = "getUserNameList")
	@TestDescription("Should display the new added details")
	public void ETL_LP_021(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_021";
        String notes = "Should display the new added details";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Operation")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
	}
	@Test(priority = 13, dataProvider = "getUserNameList", enabled = false)
	@TestDescription("Sort Option should perform Process Date,Entity,,Feed,Feed Category,current Status")
	public void ETL_LP_036(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_036";
        String notes = "Sort Option should perform Process Date,Entity,,Feed,Feed Category,current Status";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 14, dataProvider = "getUserNameList")
	@TestDescription("The Global Filter should perform the click  operation correctly")
	public void ETL_LP_039(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_039";
        String notes = "The Global Filter should perform the click  operation correctly";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By
					
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
				.click();//--Stakeholder Global filter
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
				.click();//--Category Global filter
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
				.click();//--Feed Global filter
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
				.click();//--Current Process Global filter
		Thread.sleep(1000);
		driver.findElement(By
		.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
		.click();//--Connector Global filter
		Thread.sleep(2000);	
	}
	
	@Test(priority = 15, dataProvider = "getUserNameList")
	@TestDescription("Global filter should Filter the entered Details")
	public void ETL_LP_040(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_040";
        String notes = "Global filter should Filter the entered Details";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
				.click();//--Stakeholder Global filter
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
				.click();//--Category Global filter
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//div[contains(text(),'ENTLTS0009_STG - ENTLTS0009_SOC_STG')]"))
				.click();//--Category Drop down select all (Check box)
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'play_arrow')]"))
				.click();//--Run Function
		Thread.sleep(2000);
	}
	@Test(priority = 16, dataProvider = "getUserNameList")
	@TestDescription("Click Yest To Start, On Hold, InProgress, Success, Errored, Terminated,	Should be clickable and to display the details ")
	public void ETL_LP_041(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_041";
        String notes = "Click Yest To Start, On Hold, InProgress, Success, Errored, Terminated	,Should be clickable and to display the details ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By
				.xpath("//span[contains(text(),'Operation')]"))
				.click();//--Dashboard to Operation
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/span[1]"))
				.click();//--yet to start
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/span[1]"))
				.click();//--On Hold
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/span[1]"))
				.click();//--In Progress
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]/span[1]/*[1]"))
				.click();//--Success
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/span[1]/span[1]/*[1]"))
				.click();//--Errored
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/span[1]"))
				.click();//--Terminated
		Thread.sleep(2000);
	
	}	
	@Test(priority = 17, dataProvider = "getUserNameList")
	@TestDescription("Dropdown should the detail of RA, ETL and STUDIO")
	public void ETL_LP_042(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_042";
        String notes = "Dropdown should the detail of RA, ETL and STUDIO";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
				.click();//--Entity Drop Down
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
				.click();//--Entity Close
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//span[contains(text(),'Operation')]"))
				.click();//--Dashboard to Operation
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
				.click();//--Entity Drop Down
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
				.click();//--Entity Close
		Thread.sleep(2000);
	}
	@Test(priority = 18, dataProvider = "getUserNameList")
	@TestDescription("Should reorder the inbuild data")
	public void ETL_LP_043(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_043";
        String notes = "Should reorder the inbuild data";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
				.click();//--EOD Status
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]/span[1]"))
				.click();//--EOD Status Reset
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
				.click();//--EOD stat 
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]/span[1]"))
				.click();//--EOD stat Reset
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
				.click();//--Table Statistics
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]/span[1]"))
				.click();//--Table Statistics Reset
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
				.click();//--Errored Feeds
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]/span[1]"))
				.click();//--Errored Feeds Reset
		Thread.sleep(2000);	
	}
	@Test(priority = 19, dataProvider = "getUserNameList")//--- When Widget is Changed this testcase will get Failed----//
	@TestDescription("The rearranged widget should be saved")
	public void ETL_LP_044(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_044";
        String notes = "The rearranged widget should be saved";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/i[1]"))
				.click();//--Close widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'add_circle_outline')]"))
				.click();//--Add Widget
		Thread.sleep(10000);
		driver.findElement(By
				.xpath("//span[contains(text(),'EOD Volume Trend')]"))
				.click();//--Choose Widget
		Thread.sleep(10000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/i[1]"))
				.click();//--Close widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'add_circle_outline')]"))
				.click();//--Add Widget
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//span[contains(text(),'EOD Error/Terminated')]"))
				.click();//--Choose Widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//i[contains(text(),'more_horiz')]"))
				.click();//--Three horizontal click to Save(Widget Menu)
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'Save')]"))
				.click();//--Save
		Thread.sleep(10000);
	}
	@Test(priority = 20, dataProvider = "getUserNameList")
	@TestDescription("Click the three vertical dot and click the max function in the drop down for all stats screen	The function should be get maximized ")
	public void ETL_LP_045(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_045";
        String notes = "Click the three vertical dot and click the max function in the drop down for all stats screen	The function should be get maximized ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		//--First Widget for Max screen
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
		Thread.sleep(2000);//--Max Screen End
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		//--Second Widget for Max screen
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
		Thread.sleep(2000);//--Max Screen End
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		//--Third Widget for Max screen
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
		Thread.sleep(2000);//--Max Screen End
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		//--Fourth Widget for Max screen
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
		Thread.sleep(2000);//--Max Screen End
	}
	@Test(priority = 21, dataProvider = "getUserNameList")
	@TestDescription("The reload should return back the widgets what has been closed ")
	public void ETL_LP_046(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_046";
        String notes = "The reload should return back the widgets what has been closed ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(1000);//--First close widget
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(1000);//--Second close widget
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(1000);//--Third close widget
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(1000);//--Fourth close widget
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);//--Reload for Dashboard Widget

	}
	@Test(priority = 22, dataProvider = "getUserNameList")
	@TestDescription("The left menu bar get elaborate ")
	public void ETL_LP_047(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_047";
        String notes = "The left menu bar get elaborate ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@id='viewList']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]/b[1]")).click();
		Thread.sleep(1000);//--Connector Drop Down
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[2]/li[1]/a[1]/span[1]/b[1]")).click();
		Thread.sleep(1000);//-Con, con Script, con query
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]/b[1]")).click();
		Thread.sleep(1000);//--Close Connector
	}
	@Test(priority = 23, dataProvider = "getUserNameList")
	@TestDescription("The chart should be appear what has been selected ")
	public void ETL_LP_048(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_048";
        String notes = "The chart should be appear what has been selected ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		WebElement elementToHover = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
	    // Create an instance of Actions class
	    Actions actions = new Actions(driver);
	    // Perform mouse hover action on the element
	    actions.moveToElement(elementToHover).perform();
	    WebElement threeDot = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
	    threeDot.click();
		Thread.sleep(2000);//-- Three dot Click in Volume Trend--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/div[1]/span[1]")).click();
		Thread.sleep(2000);//--Chart Type Click--//
		driver.findElement(By.xpath("//div[contains(text(),'Stack Column 2D Line')]")).click();//-- Chart Type Select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		Thread.sleep(2000);//-- Three dot Click in Volume Trend--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'In Billions')]")).click();
		Thread.sleep(10000);
	}
	@Test(priority = 24, dataProvider = "getUserNameList")
	@TestDescription("The Changed value in Scaling should be displayed in graph")
	public void ETL_LP_049(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_049";
        String notes = "The Changed value in Scaling should be displayed in graph";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		WebElement elementToHover = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
	    // Create an instance of Actions class
	    Actions actions = new Actions(driver);
	    // Perform mouse hover action on the element
	    actions.moveToElement(elementToHover).perform();
	    WebElement threeDot = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
	    threeDot.click();
		Thread.sleep(2000);//-- Three dot Click in Volume Trend--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/span[1]")).click();//-- Scaling Click--//
		driver.findElement(By.xpath("//div[contains(text(),'In Billions')]")).click();//-- Scaling Select--//
		Thread.sleep(10000);
	}
	@Test(priority = 25, dataProvider = "getUserNameList")
	@TestDescription("If the cursor is placed on top of the user profile in the opened help tab, it should display in a pop-up on top, not hidden behind the help tab.")
	public void ETL_LP_006(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_006";
        String notes = "If the cursor is placed on top of the user profile in the opened help tab, it should display in a pop-up on top, not hidden behind the help tab.";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- Help Icon--//
		driver.findElement(By.xpath("//i[contains(text(),'help')]")).click();
		Thread.sleep(2000);
		WebElement Userprofile = driver.findElement(By.xpath("//i[contains(text(),'person')]"));
		Actions actionsprofile = new Actions(driver);
		actionsprofile.moveToElement(Userprofile).perform();
		Thread.sleep(10000);	
	}
	@Test(priority = 26, dataProvider = "getUserNameList")
	@TestDescription("There is no automatic close , if it is recommended it can be easy while switching.")
	public void ETL_LP_009(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_009";
        String notes = "There is no automatic close , if it is recommended it can be easy while switching.";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- Help Icon--//
		driver.findElement(By.xpath("//i[contains(text(),'help')]")).click();
		Thread.sleep(2000);
		//-- Help Icon Close Button--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/div[1]/div[1]/span[3]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 27, dataProvider = "getUserNameList")
	@TestDescription("Sort function should be freezed like Filter")
	public void ETL_LP_030(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_030";
        String notes = "Sort function should be freezed like Filter";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- Three dot in Volume Trend--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		//-- Sort Button Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/span[1]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 28, dataProvider = "getUserNameList")
	@TestDescription("Widget should be changed acoordingly")
	public void ETL_LP_034(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_034";
        String notes = "Widget should be changed acoordingly";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- Settings Button--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/img[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]")).click();
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'RA Builds')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'more_horiz')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(4000);	
	}
	@Test(priority = 29, dataProvider = "getUserNameList")
	@TestDescription("The function should be clickable and should show the details ")
	public void ETL_LP_037(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_037";
        String notes = "The function should be clickable and should show the details ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(4000);
		//-- Connector Click--//
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(1000);
		//-- Connector Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		//-- Dropdown Slect--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
	}
	@Test(priority = 30, dataProvider = "getUserNameList")
	@TestDescription("The console should show what the dashboard and operation screen appears")
	public void ETL_LP_023(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_023";
        String notes = "The console should show what the dashboard and operation screen appears";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//--Referesh Button--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
		//-- Operation Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(3000);	
	}
	@Test(priority = 30, dataProvider = "getUserNameList")
	@TestDescription("The image of Template count should be same  as the widget count")
	public void ETL_LP_028(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_028";
        String notes = "The image of Template count should be same  as the widget count";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		// -- Settings Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
				.click();
		// -- Templates Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
		Thread.sleep(2000);
		// --- template 1 Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/img[1]"))
				.click();
		Thread.sleep(2000);
		// -- Popup click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(4000);
		// -- Settings Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
				.click();
		// -- Templates Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
		Thread.sleep(2000);
		// --- template 2 Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/img[1]"))
				.click();
		Thread.sleep(2000);
		// -- Settings Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
				.click();
		// -- Templates Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
		Thread.sleep(2000);
		// --- template 3 Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/img[1]"))
				.click();
		Thread.sleep(2000);
		// -- Settings Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
				.click();
		// -- Templates Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
		Thread.sleep(2000);
		// --- template 4 Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/img[1]"))
				.click();
		Thread.sleep(4000);
	}
	@Test(priority = 31, dataProvider = "getUserNameList")
	@TestDescription("The entered filter results should be displayed")
	public void ETL_LP_031(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_031";
        String notes = "The entered filter results should be displayed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		//-- Operation Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(10000);
//		//-- Date picker close button --Process date--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[6]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/span[1]")).click();
//		//-- More Filter arrow click--//
//		driver.findElement(By.xpath("//span[contains(text(),'arrow_drop_down')]")).click();
//		Thread.sleep(2000);
//		//--Select date close click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/span[1]")).click();
//		//-- End date close Click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Run Button--//
//		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
//		Thread.sleep(2000);
		//-- Category close--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]/a[1]")).click();
		//--Category Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Category Select--//
		driver.findElement(By.xpath("//div[contains(text(),'DEV_TEST_01 - dev Test 01 desc')]")).click();
		//-- Run Button--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(10000);
	}
	@Test(priority = 32, dataProvider = "getUserNameList")
	@TestDescription(" A picture can provide information about what the details will be.")
	public void ETL_LP_010(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_010";
        String notes = " A picture can provide information about what the details will be.";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- Help icon click--//
		driver.findElement(By.xpath("//i[contains(text(),'help')]")).click();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\LandingPage\\ETL_LP_010.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ETL_LP_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_LP_010 Failed to save screenshot: " + e.getMessage());
		}	
	}
	@Test(priority = 33, dataProvider = "getUserNameList")
	@TestDescription("The login should be properly function when we press Enter button multiple times")
	public void ETL_LP_050(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_050";
        String notes = "The login should be properly function when we press Enter button multiple times";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		WebElement Login =driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"));
		Thread.sleep(2000);
			Login.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
	}
	@Test(priority = 34, dataProvider = "getUserNameList")
	@TestDescription("Added widgets should be saved accordingly")
	public void ETL_LP_070(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_070";
        String notes = "Added widgets should be saved accordingly";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- 1st dashboard close--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/i[1]")).click();
		//-- Add click--//
		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
		Thread.sleep(2000);
		//-- Dashboard Select --//
		driver.findElement(By.xpath("//div[@class='ps ps--active-y']//div[@class='ps-content']//div//span[contains(text(),'EOD Volume Trend')]")).click();
		//-- Close--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/i[1]")).click();
		//-- Add click--//
		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
		//-- Dashboard select--//
		driver.findElement(By.xpath("//span[normalize-space()='EOD Error/Terminated']")).click();
		//-- Widget Menu click--//
		driver.findElement(By.xpath("//i[contains(text(),'more_horiz')]")).click();
		//-- Save click--//
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		//-- Referesh Click--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
		//-- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 35, dataProvider = "getUserNameList")
	@TestDescription("While initiating feed(Adhoc) instead of Save button Submit should be appeared")
	public void ETL_LP_116(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_116";
        String notes = "While initiating feed(Adhoc) instead of Save button Submit should be appeared";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		//-- Add button--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		WebElement Submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		String Text = Submit.getText();
		System.out.println(Text);
	}
	@Test(priority = 36, dataProvider = "getUserNameList")
	@TestDescription("The Feed should run Successfully")
	public void ETL_LP_063(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_063";
        String notes = "The Feed should run Successfully";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		//-- Add button--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Country click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		//-- LE book click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- LE book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		//-- Feed category Click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_FLOW16");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		//--Time stamp--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).click();
		//-- Time reduce--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/virtual-scroller[1]/div[2]")).click();
		Thread.sleep(2000);
		WebElement Submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		Submit.click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		//-- Category close--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]/a[1]")).click();
		//-- Category click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Category select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys("vat_flow16");
		Thread.sleep(2000);
		//-- Category click--//
		driver.findElement(By.xpath("//div[contains(text(),'VAT_FLOW16 - VAT_FLOW16')]")).click();
		//-- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(3000);
		//-- Success click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]/span[1]/*[1]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Feed = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/span[1]"));
		Feed.click();
		Thread.sleep(2000);
		String Success= Feed.getText();
		System.out.println(Success);
	}
	@Test(priority = 37, dataProvider = "getUserNameList")
	@TestDescription("All the feed should be exicuted succesfully without getting dead lock")
	public void ETL_LP_066(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_066";
        String notes = "All the feed should be exicuted succesfully without getting dead lock";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		//-- Add button--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Country click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		//-- LE book click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- LE book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		//-- Feed category Click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Feed category sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_CATEGORY_10");
		//-- Category select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Select All --//
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/div[1]/label[1]/input[1]")).click();
		//--Time stamp--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).click();
		//-- Time reduce--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/virtual-scroller[1]/div[2]")).click();
		Thread.sleep(2000);
		//-- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
	}
	@Test(priority = 38, dataProvider = "getUserNameList")
	@TestDescription("Run multiple category with bulk feed,	Category should get successful	,Parallel execution process successfully")
	public void ETL_LP_068(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_068";
        String notes = "Run multiple category with bulk feed,	Category should get successful,	Parallel execution process successfully";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(10000);
		//-- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		//-- Add button--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Country click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		//-- LE book click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- LE book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		//-- Feed category Click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Feed category sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_CATEGORY_11");
		//-- Category select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Select All --//
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/div[1]/label[1]/input[1]")).click();
		//--Time stamp--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).click();
		//-- Time reduce--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/virtual-scroller[1]/div[2]")).click();
		Thread.sleep(2000);
		//-- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
	}
	@Test(priority = 39, dataProvider = "getUserNameList")
	@TestDescription("Entity should be proparly aligned (If multiple entity occurs scroll down function should be enabled.)")
	public void ETL_LP_096(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Landing Page";
		String testCaseId = "ETL_LP_096";
        String notes = "Entity should be proparly aligned (If multiple entity occurs scroll down function should be enabled.)";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(6000);
		Thread.sleep(2000);
		//-- Entity dropdown click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]")).click();
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[2]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(3000);
	}
//	@Test(priority = 40, dataProvider = "getUserNameList")//----- Pending----///////
//	public void ETL_LP_033(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(6000);
//		//--Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(2000);
//		//-- Add in console--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(2000);
//		//-- Country click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
//		//-- LE Book click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Le book select--/
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Category click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Category sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_CATEGORY_10");
//		Thread.sleep(2000);
//		//-- Category Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Feed all click--//
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/div[1]/label[1]/input[1]")).click();
//		//--Next schedule date click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).click();
//		//-- Time reduce--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		//-- Submit Button--//
//		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
//		Thread.sleep(10000);
//		//-- Reload Button--//
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		//-- Category Click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]")).click();
//		//--close button--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]/a[1]")).click();
//		//-- Sendkeys--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys("VAT_CATEGORY_1");
//		Actions actions = new Actions(driver);
//		WebElement elementTarget = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
//		actions.moveToElement(elementTarget);
//		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_1 - VAT_Category_1')]"));
//		actions.scrollToElement(Target);
//		actions.perform();
//		Target.click();
//		Thread.sleep(2000);
//		//-- Run click--//
//		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
//		Thread.sleep(3000);
//		//-- Terminate click--//
//		driver.findElement(By.xpath("//i[contains(text(),'do_not_disturb_alt')]")).click();
//		//-- Reload Button--//
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		Thread.sleep(3000);	
//	}
	
}
