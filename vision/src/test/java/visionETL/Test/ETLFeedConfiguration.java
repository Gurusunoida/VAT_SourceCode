package visionETL.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ETLFeedConfiguration extends BaseClass {
	String ValueKey = "vatMJ";
	String TEST_SOURCE_SETUP = "TEST_source_setup";
	String ValueKey1 = "VAT_NormalDataTransformation";
	String TEST_MATERIALIZED_SETUP = "TEST_MATERIALIZED_SETUP";

//	@Parameters("ApplicationURL")
//	@BeforeMethod
//	public void BrowserOpening(String applicationURL) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(applicationURL);
//		driver.manage().window().maximize();
//	}
//
//	@AfterMethod
//	public void closeDriver() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}
	 @DataProvider(name = "getUserNameList")
	    public Object[][] getUserNameList() {
	        return new Object[][] {
	            {"RA", "Vision@123"},
	        };
	    }
	@Test(priority = 1, dataProvider = "getUserNameList")
	 @TestDescription("The Filter function should Filter the Successful record ")
	public void ETL_FC_013(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_013";
        String notes = "The Filter function should Filter the Successful record";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		//-- Filter Click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(3000);
		//--Column dropdown Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		//-- Cloumn dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[8]")).click();
		Thread.sleep(3000);
		//-- Value Send Keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Successful");
		Thread.sleep(3000);
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 2, dataProvider = "getUserNameList")
	 @TestDescription("The Filter function Should show the Filtered value")
	public void ETL_FC_014(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_014";
        String notes = "The Filter function Should show the Filtered value";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		//--Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(3000);
		//-- Column dropdown Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		//--Column dropdown select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
		Thread.sleep(3000);
		//-- Value Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Published");
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
	}

	@Test(priority = 3, dataProvider = "getUserNameList")
	 @TestDescription("if the character is above 10 the alert appers ")
	public void ETL_FC__015(String loginName, String loginPwd) throws InterruptedException {
		String Feed_name = "TEST_ASDFGHJ";
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_015";
        String notes = "if the character is above 10 the alert appers ";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("add")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys(Feed_name);
		Thread.sleep(5000);
	}

	@Test(priority = 4, dataProvider = "getUserNameList")
	 @TestDescription("The entered feed  should disappear while returning") 
	public void ETL_FC_016(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_016";
        String notes = "The entered feed  should disappear while returning";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("add")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT0204");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]"))
				.sendKeys("VAT0204");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Previous')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 5, dataProvider = "getUserNameList")
	 @TestDescription("It should display that the \\\"Field is mandatory\\\"")
	public void ETL_FC_017(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_017";
        String notes = "It should display that the \"Field is mandatory\"";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("add")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT0204");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
	}

		@Test(priority = 6, dataProvider = "getUserNameList")
		 @TestDescription("The entered record should be saved")
		public void ETL_FC_018(String loginName, String loginPwd) throws InterruptedException {
			String ScreenName = "FeedConfiguration";
			String testCaseId = "ETL_FC_018";
	        String notes = "The entered record should be saved";
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
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
					.click();
			Thread.sleep(3000);
			//-- Filter click--//
			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			//-- Column Click--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- column select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
			//-- Value sendkeys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_01");
			//-- Apply --//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
			//-- Element to Hover--//
			WebElement elementToHoverM = driver.findElement(By.xpath(
					"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/span[1]"));
			Actions actionsClick = new Actions(driver);
			actionsClick.moveToElement(elementToHoverM).perform();
			//-- Particular Feed Click--//
			WebElement Edit = driver.findElement(By.xpath(
					"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[1]/i[1]"));
			Edit.click();
			Thread.sleep(3000);
			//-- Feed Name edit--//
			WebElement FeedName = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"));
			FeedName.clear();
			FeedName.sendKeys("Vat_01");
			//--Apply Button--//
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[2]/button[1]")).click();
			Thread.sleep(3000);
			//--Popup for clearing relevant tab--//
			driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
			Thread.sleep(3000);
			//-- Forward button click--//
			driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
			Thread.sleep(3000);
			//-- Filter click--//
			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			//-- Apply --//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
			//-- Element to Hover--//
			WebElement elementToHoverReject = driver.findElement(By.xpath(
					"//span[@title='AE01884670']"));
			Actions actionsRClick = new Actions(driver);
			actionsRClick.moveToElement(elementToHoverReject).perform();
			//-- Particular Feed Click--//
			WebElement Reject = driver.findElement(By.xpath(
					"//i[contains(text(),'do_not_disturb_alt')]"));
			Reject.click();
			driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
			Thread.sleep(2000);
			
			
		}
	@Test(priority = 7, dataProvider = "getUserNameList")
	 @TestDescription("Display 10 records in one page")
	public void ETL_FC_019(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_019";
        String notes = " Display 10 records in one page";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]"))
				.click();
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(3000);
		select.selectByIndex(1);
		Thread.sleep(3000);
	}
	@Test(priority = 8, dataProvider = "getUserNameList", enabled = false)
	 @TestDescription("Maximize Button should work and can view the record in maximize page") 
	public void ETL_FC_020(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_020";
        String notes = "Maximize Button should work and can view the record in maximize page";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
	}
	@Test(priority = 9, dataProvider = "getUserNameList")
	 @TestDescription("The filter function should performs correctly while the conditions like contains,  begins, equal and end")
	public void ETL_FC_023(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_023";
        String notes = "The filter function should performs correctly while the conditions like contains,  begins, equal and end";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(1000);//--filter drop down
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
		Thread.sleep(1000);//--Filter Click
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Work In Progress");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);//--Filter Click
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Work");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(1000);//--Filter Click
		driver.findElement(By.xpath("//span[contains(text(),'Begins With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(1000);//--Filter Click
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("progress");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Ends With...')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);//-FILTER CLICK
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Delete");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		Thread.sleep(1000);//--Equal 
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 10, dataProvider = "getUserNameList")
	 @TestDescription("Popup should display that Invalid Description")
	public void ETL_FC_024(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_024";
        String notes = "Popup should display that Invalid Description";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- COuntry Dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();// -- COuntry
																											// Dropdown
																											// Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- Le Book Dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();// -- Le
																												// Book
																												// Dropdown
																												// Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();// -- Auto Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT!@<>");
		Thread.sleep(2000);// -- Feed Name Sendkeys--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// --Feed Category Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();// --Feed
																											// Category
																											// Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]"))
				.sendKeys("VAT!@<>");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 11, dataProvider = "getUserNameList")
	 @TestDescription("The Transformation should be in Fullscreen mode and if we want to Navigate to other page (Connector Page, Category) Click and move")
	public void ETL_FC_025(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_025";
        String notes = "The Transformation should be in Fullscreen mode and if we want to Navigate to other page (Connector Page, Category) Click and move";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Cloumn Dropdown click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		// -- column dropdown select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		// -- Value send keys ( Tranformation)--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("TEST0104");
		// -- Apply button click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement ConnectorEdit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		ConnectorEdit.click();
		Thread.sleep(2000);
		// -- Transformation click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[4]/span[1]"))
				.click();
		Thread.sleep(3000);
		// -- Transformation Maximize Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/*[1]"))
				.click();
		Thread.sleep(2000);
		// -- Forward Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/a[1]/i[1]"))
				.click();
		Thread.sleep(8000);
	}
	@Test(priority = 13, dataProvider = "getUserNameList", enabled = false)///------ Not Required Max is Removed---////
	public void ETL_FC_022(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_022";
        String notes = "";
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen_exit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen_exit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'fullscreen_exit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 12, dataProvider = "getUserNameList")
	 @TestDescription("The users feed ID should get saved .")
	public void ETL_FC_009(String loginName, String loginPwd) throws InterruptedException {
		String FeedID = "VAT00001";
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_009";
        String notes = "The users feed ID should get saved .";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//Add new Record//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(FeedID);
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT_ETLFeedName");// -- Feed Name--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Feed Category Click--//
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]"));
		actions.moveToElement(element);
		Thread.sleep(5000);
		WebElement categoryID = driver
				.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[34]/span[1]"));
		actions.scrollToElement(categoryID);
		actions.perform();
		Thread.sleep(5000);// -- Feed Category ID Select--//
		categoryID.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]"))
				.sendKeys("VAT_ETL");// -- Description
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();// -- Apply--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//--- Criteria click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		//-- Criteria select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(FeedID);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement Text = driver.findElement(By.xpath("//span[contains(text(),'VAT00001')]"));
		String expectedText = Text.getText();
		Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        scanner.close();
        // Compare the entered text with the expected text
        if (expectedText.equals(enteredText)) {
            System.out.println("Text matches: " + expectedText);
        } else {
            System.out.println("Text does not match!");
            System.out.println("Expected text: " + expectedText);
            System.out.println("Entered text: " + enteredText);
        }
	}
	@Test(priority = 14, dataProvider = "getUserNameList")
	 @TestDescription("Inline Trigger should appear that mandatory field is required")
	public void ETL_FC_033(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_033";
        String notes = "Inline Trigger should appear that mandatory field is required";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column Click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_01");
		Thread.sleep(2000);
		//-- Apply --//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//span[@title='VAT_01']"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeedEdit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		FeedEdit.click();
		Thread.sleep(2000);
		//-- Scheduler click--//
		driver.findElement(By.xpath("//span[contains(text(),'Scheduler')]")).click();
		Thread.sleep(3000);
		//--Process Date type dropdown click--//
		driver.findElement(By.xpath("//ng-select[@formcontrolname='processDateType']//span[@title='Clear all']")).click();
		//-- save click--//
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(4000);
		//-- Forward button click--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column Click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_01");
//		//-- Apply --//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		//-- Element to Hover--//
//		WebElement elementToHoverReject = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/span[1]"));
//		Actions actionsRClick = new Actions(driver);
//		actionsRClick.moveToElement(elementToHoverReject).perform();
//		//-- Particular Feed Click--//
//		WebElement Reject = driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[3]/i[1]"));
//		Reject.click();
//		Thread.sleep(2000);
	}
	@Test(priority = 15, dataProvider = "getUserNameList")
	 @TestDescription("Inline trigger has to be performed in all the feeds  in the screen")
	public void ETL_FC_034(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_034";
        String notes = "Inline trigger has to be performed in all the feeds  in the screen";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column Click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_01");
//		//-- Add filter click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Record Indicator click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		//--- Value send keys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
		Thread.sleep(2000);
		//-- Apply --//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//span[@title='VAT_01']"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeedEdit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		FeedEdit.click();
		Thread.sleep(2000);
		//-- Scheduler click--//
		driver.findElement(By.xpath("//span[contains(text(),'Scheduler')]")).click();
		Thread.sleep(2000);
		//--- Clear business --//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		//-- Scheduler desc--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]")).clear();
		Thread.sleep(2000);
		//-- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 16, dataProvider = "getUserNameList")
	 @TestDescription("No trigger has to be applied  while using / symbol")
	public void ETL_FC_035(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_035";
        String notes = "No trigger has to be applied  while using / symbol";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Add--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT0204//");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]"))
				.sendKeys("///VAT0204///");
		//-- Apply Button click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 17, dataProvider = "getUserNameList")
	 @TestDescription("Required detail filter need to be added")
	public void ETL_FC_036(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_036";
        String notes = "Required detail filter need to be added";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column Click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//--Criteria--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Criteria select--//
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_38");
		//-- Apply --//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//span[contains(text(),'Successful')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeedEdit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[1]/i[1]"));
		FeedEdit.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Materialized View Setup')]")).click();
		Thread.sleep(2000);
		//-- Settings button in Materialized view--//
		WebElement elementToHoverMaterialized = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		Actions settings = new Actions(driver);
		settings.moveToElement(elementToHoverMaterialized).perform();
		WebElement settingsClick = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/i[1]"));
		settingsClick.click();
		Thread.sleep(2000);
		//-- Filter Criteria click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
		//-- Value send keys --//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/input[1]")).sendKeys("VAT<>!@");
		Thread.sleep(3000);
	}
	@Test(priority = 18, dataProvider = "getUserNameList")
	 @TestDescription("Click on Edit in Approved Records and click on Modify the Record will move to Modify pending then Publish the Record")
	public void ETL_FC_037(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_037";
        String notes = "Click on Edit in Approved Records and click on Modify the Record will move to Modify pending then Publish the Record";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				//-- Column Click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				//-- column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
				//--Criteria--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				//-- Criteria select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
				//-- Value sendkeys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_32");
				//-- Apply --//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(2000);
				// -- Element to Hover(For Edit)
				WebElement elementToHoverM = driver.findElement(By.xpath(
						"//span[contains(text(),'Successful')]"));
				Actions actionsClick = new Actions(driver);
				actionsClick.moveToElement(elementToHoverM).perform();
				WebElement FeedEdit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
				FeedEdit.click();
		Thread.sleep(2000);
		//-- Apply button click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		//-- Popup for relevant tabs--//
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		//--- publish button--//
		driver.findElement(By.xpath("//span[contains(text(),'publish')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(8000);	
		//-- Reject click--//
		driver.findElement(By.xpath("//span[contains(text(),'do_not_disturb_alt')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 19, dataProvider = "getUserNameList")
	 @TestDescription("The Target Table Column should be displayed")
	public void ETL_FC_038(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_038";
        String notes = "The Target Table Column should be displayed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- COlumn click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_30");
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//span[contains(text(),'Successful')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeedEdit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		FeedEdit.click();
		Thread.sleep(2000);
		//-- Loader Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Loader')]")).click();
		Thread.sleep(2000);
		//-- Target table click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(3000);
		//-- Close button --//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(2000);
		//-- Clear Button--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Target connector click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		//-- Target connector select--//
		driver.findElement(By.xpath("//span[contains(text(),'101_ORACLE')]")).click();
		//-- Target table click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(3000);	
	}
	@Test(priority = 20, dataProvider = "getUserNameList")
	 @TestDescription("Publish of Record should takes place")
	public void ETL_FC_030(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_030";
        String notes = "Publish of Record should takes place";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(ValueKey);
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeedEdit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[1]/i[1]"));
		FeedEdit.click();
		Thread.sleep(2000);
		//-- Apply button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		//-- Publish Click--//
		driver.findElement(By.xpath("//span[contains(text(),'publish')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 21, dataProvider = "getUserNameList")
	 @TestDescription("Trigger should popup that Invalid Description")
	public void ETL_FC_031(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_031";
        String notes = "Trigger should popup that Invalid Description";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- COlumn click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(ValueKey);
		//-- Add row--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
		//-- COlumn click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");		
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeedEdit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[1]/i[1]"));
		FeedEdit.click();
		Thread.sleep(2000);
		//-- Description Sendkeys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]")).sendKeys("<>*&");
		//-- Apply button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
	}
	@Test(priority = 22, dataProvider = "getUserNameList")
	 @TestDescription("Help icon should elaborate")
	public void ETL_FC_029(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_029";
        String notes = "Help icon should elaborate";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("AE01275472");		
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeedEdit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[1]/i[1]"));
		FeedEdit.click();
		Thread.sleep(2000);
		//-- Transformation click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[4]/span[1]")).click();
		Thread.sleep(2000);
		//-- Transformation list click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[3]/ul[1]/li[1]/*[1]")).click();
		//-- User profile click--//
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //-- Location for screenshot--//
        String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\FeedConfiguration\\ETL_FC_029.png";
        //-- save the screenshot --//
        File destinationFile = new File(Location);
        // Move the screenshot file to the specified destination
        try {
            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
            System.out.println(" ETL_FC_029 Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException Message) {
            System.out.println("ETL_FC_029 Failed to save screenshot: " + Message.getMessage());
        }	
	}
	@Test(priority = 23, dataProvider = "getUserNameList")
	 @TestDescription("Data has to be processed correctly")
	public void ETL_FC_028(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_028";
        String notes = "Data has to be processed correctly";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("AE01275472");		
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Element to Hover(For Edit)
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeedEdit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[1]/i[1]"));
		FeedEdit.click();
		Thread.sleep(2000);
		//-- Transformation click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[4]/span[1]")).click();
		Thread.sleep(2000);
		//-- Transformation list click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[3]/ul[1]/li[1]/*[1]")).click();
		//-- Active transformation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Active Transformation')]")).click();
		WebElement ElementtoDrag = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[4]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[5]/div[5]/div[1]/div[2]"));
				WebElement ElementtoDrop = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[1]/div[2]/*[1]"));
				Actions actionsDragDrop = new Actions(driver);
				Thread.sleep(2000);
				actionsDragDrop.clickAndHold(ElementtoDrag).moveToElement(ElementtoDrop).release().build().perform();
				Thread.sleep(2000);
			    }
	@Test(priority = 24, dataProvider = "getUserNameList")
	@TestDescription("Ensure the content is clear and easily understandable for users.")
	public void ETL_FC_001(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_001";
        String notes = "Ensure the content is clear and easily understandable for users.";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- COlumn click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(ValueKey1);
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement element_to_hover_edit = driver.findElement(By.xpath("//span[contains(text(),'VAT_NormalDataTransformation')]"));
		Actions actions_edit = new Actions(driver);
		actions_edit.moveToElement(element_to_hover_edit).perform();
		WebElement Edit_click = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit_click.click();
		Thread.sleep(2000);
		//-- Transformation click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[4]/span[1]")).click();
		Thread.sleep(3000);
		//-- Transformation list--//
		WebElement TransformationList = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[3]/ul[1]/li[1]/*[1]"));
		Actions actions_TransformationList = new Actions(driver);
		actions_TransformationList.moveToElement(TransformationList).perform();
		Thread.sleep(3000);
	}
	@Test(priority = 25, dataProvider = "getUserNameList")
	@TestDescription("The info bar should be clear readable ")
	public void ETL_FC_002(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_002";
        String notes = "The info bar should be clear readable ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- COlumn click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(ValueKey1);
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement element_to_hover_edit = driver.findElement(By.xpath("//span[contains(text(),'VAT_NormalDataTransformation')]"));
		Actions actions_edit = new Actions(driver);
		actions_edit.moveToElement(element_to_hover_edit).perform();
		WebElement Edit_click = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit_click.click();
		Thread.sleep(2000);
		//-- Transformation click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[4]/span[1]")).click();
		Thread.sleep(3000);
		WebElement hover = driver.findElement(By.xpath("//span[@id='transFormationText_write']"));
		Actions actions_hover = new Actions(driver);
		actions_hover.moveToElement(hover).perform();
		Thread.sleep(2000);
	}
	@Test(priority = 26, dataProvider = "getUserNameList")//////------ Pending Scroll not interactable---------------///////////
	@TestDescription("The alignment needs to be clear for the user.")
	public void ETL_FC_003(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_003";
        String notes = "The alignment needs to be clear for the user.";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
//		// -- Feed configuration dropdown click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		// -- Feed configuration dropdown select--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- COlumn click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(ValueKey1);
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement element_to_hover_edit = driver.findElement(By.xpath("//span[contains(text(),'VAT_NormalDataTransformation')]"));
		Actions actions_edit = new Actions(driver);
		actions_edit.moveToElement(element_to_hover_edit).perform();
		WebElement Edit_click = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit_click.click();
		Thread.sleep(2000);
		//-- Transformation click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[4]/span[1]")).click();
		Thread.sleep(3000);
		//--Expand click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]")).click();
		//-- Data viewer click--//
		driver.findElement(By.xpath("//a[contains(text(),'Data Viewer')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[2]/div[2]/div[1]/div[1]/virtual-scroller[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Click = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-trans-formation-setup[1]/div[1]/div[2]/div[2]/div[1]/div[1]/virtual-scroller[1]"));
		 for (int i = 0; i < 10; i++) {
			 Click.click(); 
	        }
		 Thread.sleep(4000);
	}
	@Test(priority = 27, dataProvider = "getUserNameList")
	@TestDescription("The delete function should be processed correctly")
	public void ETL_FC_012(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_012";
        String notes = "The delete function should be processed correctly";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		//value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Approved");
		//-- Add symbol in filter--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("MJ");
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement element_to_hover_edit = driver.findElement(By.xpath("//span[contains(text(),'MJTEST')]"));
		Actions actions_edit = new Actions(driver);
		actions_edit.moveToElement(element_to_hover_edit).perform();
		WebElement Edit_click = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit_click.click();
		Thread.sleep(2000);
		//-- Delete Click--//
		driver.findElement(By.xpath("//span[contains(text(),'delete')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		//-- Source setup click--//
		driver.findElement(By.xpath("//span[contains(text(),'Source Setup')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'delete')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		//-- Materialised setup--//
		driver.findElement(By.xpath("//span[contains(text(),'Materialized View Setup')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'delete')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		//-- Loader click--//
		driver.findElement(By.xpath("//span[contains(text(),'Loader')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'delete')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
		//-- Scheduler click--//
		driver.findElement(By.xpath("//span[contains(text(),'Scheduler')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'delete')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 28, dataProvider = "getUserNameList")
	@TestDescription("The Table connection should be unlinked")
	public void ETL_FC_026(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_026";
        String notes = "The Table connection should be unlinked";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		//value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Approved");
		//-- Add symbol in filter--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("MJ");
		//-- Apply Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement element_to_hover_edit = driver.findElement(By.xpath("//span[contains(text(),'MJTEST')]"));
		Actions actions_edit = new Actions(driver);
		actions_edit.moveToElement(element_to_hover_edit).perform();
		WebElement Edit_click = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit_click.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Loader')]")).click();
		Thread.sleep(2000);
		WebElement Doubleclick = driver.findElement(By.cssSelector("#move-up"));
		Actions actions = new Actions(driver);
		actions.doubleClick(Doubleclick).perform();
		Thread.sleep(4000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\FeedConfiguration\\ETL_FC_026.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ETL_FC_026 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_FC_026 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(priority = 29, dataProvider = "getUserNameList")//-- Fail--//
	@TestDescription("Create a Record without saving click back Button, Popup should display ")
	public void ETL_FC_041(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_041";
        String notes = "Create a Record without saving click back Button, Popup should display ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Country Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		//-- Country Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Le book click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		//-- Le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
		Thread.sleep(2000);
		//-- Backk buttton--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(4000);
		//-- Popup yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();	
	}
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority = 30, dataProvider = "getUserNameList")
	@TestDescription("Create a Record and Add Connector( Source Setup), then click on Clear")
	public void ETL_FC_042(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_042";
        String notes = "Create a Record and Add Connector( Source Setup), then click on Clear";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Country Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		//-- Country Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Le book click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		//-- Le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
		Thread.sleep(2000);
		//-- Feed name send Keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys(TEST_SOURCE_SETUP);
		//-- Feed category click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Category select--//
		driver.findElement(By.xpath("//span[contains(text(),'860 - SERVICE_TEST_860')]")).click();
		//-- Description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]")).sendKeys(TEST_SOURCE_SETUP);
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		//-- Source setup click--//
		driver.findElement(By.xpath("//span[contains(text(),'Source Setup')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".sourceSetup > span")).click();
		// -- Add connector search--//
		driver.findElement(By.name("connecterSearch")).click();
		Thread.sleep(2000);
		// -- Connector click--//
		Actions actionsTarget = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-source-setup-form[1]/div[1]/div[1]/div[3]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actionsTarget.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.cssSelector(".connecterSearchList:nth-child(8)"));
		actionsTarget.scrollToElement(Target);
		actionsTarget.perform();
		Target.click();
		Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 //-- After connector click--//
        driver.findElement(By.xpath("//button[contains(text(),'Clear')]")).click();
     // -- Add connector search--//
     		driver.findElement(By.name("connecterSearch")).click();
     		Thread.sleep(2000);
     		WebElement Clear = driver.findElement(By.cssSelector(".connecterSearchList:nth-child(8)"));
     		Clear.click();
     		WebElement Compare = driver.findElement(By.xpath("//span[contains(text(),'DEMO_ETL')]"));
     		String Text = Compare.getText();
     		 System.out.println(Text);
     		String expectedText = "DB_LINK_TEST1";
     		 // Compare the entered text with the expected text
             if (expectedText.equals(Text)) {
                 System.out.println("Text matches: " + expectedText);
             } else {
                 System.out.println("Text does not match!");
                 System.out.println("Expected text: " + expectedText);
                 System.out.println("Entered text: " + Text);
             }
        
	}
	@Test(priority = 31, dataProvider = "getUserNameList")
	@TestDescription("Drag and drop of column should takes place")
	public void ETL_FC_043(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_043";
        String notes = "Drag and drop of column should takes place";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- Add Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		// -- Country Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Country Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		// -- Le book click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		// -- Le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
		Thread.sleep(2000);
		// -- Feed name send Keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys(TEST_MATERIALIZED_SETUP);
		// -- Feed category click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Category select--//
		driver.findElement(By.xpath("//span[contains(text(),'860 - SERVICE_TEST_860')]")).click();
		// -- Description send keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]"))
				.sendKeys(TEST_MATERIALIZED_SETUP);
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Source setup click--//
		driver.findElement(By.xpath("//span[contains(text(),'Source Setup')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".sourceSetup > span")).click();
		// -- Add connector search--//
		driver.findElement(By.name("connecterSearch")).click();
		Thread.sleep(2000);
		// -- Connector click--//
		Actions actionsTarget = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-source-setup-form[1]/div[1]/div[1]/div[3]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actionsTarget.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.cssSelector(".connecterSearchList:nth-child(8)"));
		actionsTarget.scrollToElement(Target);
		actionsTarget.perform();
		Target.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'DB_LINK_TEST1')]")).click();
		Thread.sleep(3000);
		// --Filter send keys, Search click--//
		driver.findElement(By.xpath("//input[@id='filter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Error_codes");
		driver.findElement(By.xpath("//i[contains(text(),'search')]")).click();
		Thread.sleep(3000);
		//-- Error Codes click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-checkbox[1]/input[1]")).click();
		Thread.sleep(3000);
		//--Apply in source setup--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[3]/button[1]")).click();
		Thread.sleep(3000);
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		// -- Materialized click--//
		driver.findElement(By.xpath("//span[contains(text(),'Materialized View Setup')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'ERROR_CODES')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Materialized = driver.findElement(By.xpath("//span[contains(text(),'ERROR_CODES')]"));
		Materialized.click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\FeedConfiguration\\ETL_FC_043.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ETL_FC_043 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ETL_FC_043 Failed to save screenshot: " + e.getMessage());
				}	
	}
	@Test(priority = 32, dataProvider = "getUserNameList")//-- Fail--//
	@TestDescription("When add is clicked the feed approval should not show ")
	public void ETL_FC_044(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_044";
        String notes = "When add is clicked the feed approval should not show ";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select Feedname--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//--Criteria click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		//-- Criteria select Equals--//
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_01");
		//-- Apply --//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Vat_01')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Feed_edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Feed_edit.click();
		Thread.sleep(2000);
		//-- Viewlist Click--//
		driver.findElement(By.xpath("//i[@id='viewList']")).click();
		//--Feed configuration click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[2]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Add row click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\FeedConfiguration\\ETL_FC_044.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" ETL_FC_044 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("ETL_FC_044 Failed to save screenshot: " + e.getMessage());
				}	
	}
	@Test(priority = 33, dataProvider = "getUserNameList")  //---Fail Testcases After fix it will get pass--//	
	@TestDescription("While click on back filtered results should be displayed")
	public void ETL_FC_046(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_046";
        String notes = "While click on back filtered results should be displayed";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select Feedname--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//--Criteria click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		//-- Criteria select Equals--//
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_01");
		//-- Apply --//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT_01')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Feed_edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Feed_edit.click();
		Thread.sleep(2000);
		//-- Nav Back--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Apply --//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		Feed_edit.click();
	}
	@Test(priority = 34, dataProvider = "getUserNameList") 
	@TestDescription("Create a Feed and mouse hover onn record indicator")
	public void ETL_FC_049(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_049";
        String notes = "Create a Feed and mouse hover onn record indicator";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Feed_Config_recordindicator = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[4]/i[1]"));
		actionsClick.moveToElement(Feed_Config_recordindicator).perform();
		Thread.sleep(3000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\FeedConfiguration\\ETL_FC_049.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ETL_FC_049 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_FC_049 Failed to save screenshot: " + e.getMessage());
		}	
	}
	@Test(priority = 35, dataProvider = "getUserNameList") 
	@TestDescription("If the Start date is set as Today's date and saved, It cant be edited further")
	public void ETL_FC_050(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "FeedConfiguration";
		String testCaseId = "ETL_FC_050";
        String notes = "If the Start date is set as Today's date and saved, It cant be edited further";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- FIlter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VATmj");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'vatMJ')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		Thread.sleep(2000);
		WebElement FeedClick = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		FeedClick.click();
		Thread.sleep(2000);
		//-- Scheduler click--//
		driver.findElement(By.xpath("//span[contains(text(),'Scheduler')]")).click();
		Thread.sleep(3000);
		//-- End date click--///
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		//-- Select--//
		driver.findElement(By.xpath("//div[contains(text(),'23')]")).click();
		Thread.sleep(2000);
		//-- SAve click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/div[1]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\FeedConfiguration\\ETL_FC_050.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ETL_FC_050 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_FC_050 Failed to save screenshot: " + e.getMessage());
		}	
	}
}
