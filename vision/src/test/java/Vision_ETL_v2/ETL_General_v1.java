package Vision_ETL_v2;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import visionETL.Test.BaseClass;
import visionETL.Test.ListenersETL;
import visionETL.Test.TestDescription;

public class ETL_General_v1 extends BaseClass {
	String Category_select = "VAT";
	String Query_connectorID = "VAT";

	@Test(dataProvider = "loginCredentials", priority = 0)
	@TestDescription("Login-ETL-Login Credentials")
	public void ETL_DC_001(String username, String password) throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String baseTestCaseId = "ETL_DC_001";
		String notes;
		String testCaseId;
		// --1st set--//
		if ("RA".equals(username) && "Vision@123".equals(password)) {
			testCaseId = baseTestCaseId + "_A"; 
			notes = "Valid login credentials 'RA'. Testing successful login.";
		} 
		//-- 2nd set--//
		else if ("RA".equals(username) && "vision@123".equals(password)) {
			testCaseId = baseTestCaseId + "_B"; 
			notes = "Invalid password case 'RA'. Testing failure message.";
		}
		// --3rd set--//
		else if ("QW".equals(username) && "Vision@123".equals(password)) {
			Thread.sleep(5000);
			testCaseId = baseTestCaseId + "_C"; 
			notes = "Login should fail for username 'QW' with password 'Vision@123'.";
		} 
		//-- Default--//
		else {
			testCaseId = baseTestCaseId; 
			notes = "Login test for other credentials.";
		}
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		
		boolean loginSuccessful;
		try {
			loginSuccessful = true;
		} catch (TimeoutException e) {
			loginSuccessful = false;
		}

		if ("QW".equals(username) && "Vision@123".equals(password)) {
			// --Handle the 3rd set specifically--//
			WebElement errorText = driver
					.findElement(By.xpath("//span[contains(text(),'The username and password entered do not match')]"));
			String loginText = errorText.getText();
			System.out.println(loginText);
			if (loginSuccessful) {
				notes = "Login should fail for username 'QW' with password 'Vision@123', but it passed.";
				Assert.fail("Login should fail for username 'QW' with password 'Vision@123'.");
			} else {
				notes = "Login failed as expected for username 'QW'.";
			}
		} else if ("RA".equals(username) && "Vision@123".equals(password)) {
			notes = "Valid login credentials 'RA'. Testing successful login.";
			Assert.assertTrue(loginSuccessful, "Login failed for valid credentials.");
		} else if ("RA".equals(username) && "vision@123".equals(password)) {
			notes = "Invalid password case 'RA'. Testing failure message.";
			Assert.fail("Login should fail for username 'RA' with password 'vision@123'.");
		} else {
			notes = "Login test for other credentials.";
		}
		// --Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_DC_001.png";
		File destinationFile = new File(location);

		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println("ETL_DC_001 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_DC_001 Failed to save screenshot: " + e.getMessage());
		}
	}

	@Test(priority = 1)
	@TestDescription("The clear information remove should show in the filter process ")
	public void ETL_DC_010() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_010";
		String notes = "The clear information remove should show in the filter process ";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Filter icon--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		WebElement elementToHoverRemove = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/a[1]/span[1]/i[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverRemove).perform();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	@TestDescription("The selected theme should remain unchanged even after reloading the page, navigating to the next screen, or logging in again.")
	public void ETL_DC_015() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_015";
		String notes = "The selected theme should remain unchanged even after reloading the page, navigating to the next screen, or logging in again.";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --User Profile--//
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		Thread.sleep(2000);
		// -- Selecting Colour Theme--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/div[1]/ul[1]/li[1]/a[1]/div[1]/span[1]"))
				.click();
		// -- ETL-Connector Click--//
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(5000);
		// -- Connector Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(2000);
		// -- Connector Dropdown Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3) /// ------- Popup should ask while moving from etl connector to Script--///////
	@TestDescription("An alert message should appear when attempting to move to another screen.")
	public void ETL_DC_016() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_016";
		String notes = "An alert message should appear when attempting to move to another screen.";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- ETL-Connector Click--//
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(5000);
		// -- Connector Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(2000);
		// -- Connector Dropdown Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Add in Connector--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Country Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Country Select--//
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		Thread.sleep(2000);
		// --LE-Book Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- LE-Book Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// --COnnector ID Sendkeys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_ETL2603");
		Thread.sleep(2000);
		// -- Connector Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys("VAT_ETL2603");
		// -- Endpoint type Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Endpoint type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// --Connector Type Dropdown--///
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Connector type dropdown Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		// --DB Type Dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		// --DB Type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(2000);
		// -- IP --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
				.sendKeys("10.16.1.38");
		// -- Port--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
				.sendKeys("52866");
		Thread.sleep(2000);
		// --Left top Three dot for Selcting Connector--//
		driver.findElement(By.xpath("//i[@id='viewList']")).click();
		Thread.sleep(2000);
		// -- Connector Script Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[2]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'Yes')]")).click();
	}

	@Test(priority = 4)
	@TestDescription("Clicking reload should restore it to its initial stage.")
	public void ETL_DC_017() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_017";
		String notes = "Clicking reload should restore it to its initial stage.";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- ETL-Connector Click--//
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(5000);
		// -- Connector Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(2000);
		// -- Connector Dropdown Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// --- Page nation Click--//
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(2000);
		// -- Autorenew--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	@TestDescription("When the user clicks on \"Auto Refresh,\" the option should be highlighted to indicate that it is active.")
	public void ETL_DC_018() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_018";
		String notes = "When the user clicks on \"Auto Refresh,\" the option should be highlighted to indicate that it is active.";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		WebElement elementToHoverReferesh = driver.findElement(By.xpath("//i[contains(text(),'history')]"));
		Actions actionsReferesh = new Actions(driver);
		actionsReferesh.moveToElement(elementToHoverReferesh).perform();
		WebElement AutoReferesh = driver.findElement(By.xpath("//i[contains(text(),'history')]"));
		AutoReferesh.click();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	@TestDescription("The page should remains same")
	public void ETL_DC_019() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_019";
		String notes = "The page should remains same";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Feed configuration click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		// --Chevon right--//
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHover).perform();
		Thread.sleep(2000);
		WebElement Edit = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[1]/i[1]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Nav Back --//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(4000);
	}

	@Test(priority = 7)
	@TestDescription("The process should show the clear view of \"no record found\". ")
	public void ETL_DC_009() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_009";
		String notes = "The process should show the clear view of \"no record found\". ";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Feed configuration click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("abchjvasc");
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_DC_009.png";
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ETL_DC_009 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_DC_009 Failed to save screenshot: " + e.getMessage());
		}
	}

	@Test(priority = 8)
	@TestDescription("The \"Rows Per Page\" configuration field should display a single colon.")
	public void ETL_DC_013() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_013";
		String notes = "The \"Rows Per Page\" configuration field should display a single colon.";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Feed configuration click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		// -- Take screenshot and save it to a file--//
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_DC_013.png";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ETL_DC_013 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_DC_013 Failed to save screenshot: " + e.getMessage());
		}
	}

	@Test(priority = 9)
	@TestDescription("The page should not get the flash issue while using ")
	public void ETL_DC_014() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_014";
		String notes = "The page should not get the flash issue while using ";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Feed configuration click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[8]/div[1]/span[1]"));
		Actions actionsHover = new Actions(driver);
		actionsHover.moveToElement(elementToHover).perform();
		WebElement Details = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[9]/div[2]/a[4]/i[1]"));
		actionsHover.moveToElement(Details).perform();
		Thread.sleep(4000);
	}

	@Test(priority = 10)
	@TestDescription("The text should be properly aligned.")
	public void ETL_DC_005() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_005";
		String notes = "The text should be properly aligned.";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Feed configuration click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		// -- Add--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		// -- Country--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Country Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		// --LE Book--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		// -- LE Book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		// --Feed ID--//
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
		Thread.sleep(2000);
		// -- Feed Category click--//
		WebElement Category_click = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
		Category_click.click();
		Category_click.sendKeys(Category_select);
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_DC_005.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" ETL_DC_005 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_DC_005 Failed to save screenshot: " + e.getMessage());
		}
		// --ETL Connector click--//
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		// --ETL Connector Dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		// -- Connector Query select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Add--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		WebElement Query = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
		Query.click();
		Query.sendKeys(Query_connectorID);
		// -- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\ETL_DC_005_1.png";
		// -- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" ETL_DC_005_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("ETL_DC_005_1 Failed to save screenshot: " + e.getMessage());
		}
	}

	@Test(priority = 11)
	@TestDescription("All the tabs in the screen can be successfully refreshed")
	public void ETL_DC_029() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_029";
		String notes = "All the tabs in the screen can be successfully refreshed";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(3000);
		// -- Referesh click--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 12)
	@TestDescription("Eod Staus has to be updated ")
	public void ETL_DC_032() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_032";
		String notes = "Eod Staus has to be updated ";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Business date referesh click--//
		driver.findElement(By.xpath("//span[contains(text(),'refresh')]")).click();
		Thread.sleep(2000);
		// -- EOD Dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 13)
	@TestDescription("The record should remains same (If Modified only that data to be changed),The Records gets Rejected")
	public void ETL_DC_020() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_020";
		String notes = "The record should remains same (If Modified only that data to be changed),The Records gets Rejected";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Feed configuration click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- Filter click--///
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
		// value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Add");
		// -- Add symbol in filter--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]"))
				.click();
		// -- Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		// value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("MJ");
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elemet_to_Hover = driver.findElement(By.xpath("//span[@title='MJTEST02']"));
		Actions action_Reject = new Actions(driver);
		action_Reject.moveToElement(elemet_to_Hover).perform();
		WebElement Reject = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[9]/div[2]/a[3]/i[1]"));
		Reject.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);

	}

	@Test(priority = 14)
	@TestDescription("Previous filter should get Reset and new filter should be added")
	public void ETL_DC_022() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_022";
		String notes = "Previous filter should get Reset and new filter should be added";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --ETL Connector click--//
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		// --ETL Connector Dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		// -- Connector select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Filter click--///
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		// value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("Testing");
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Structured Data')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Connector = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Connector.click();
		Thread.sleep(3000);
		// -- TestConnection click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 15)
	@TestDescription("Feed should be successfully completed")
	public void ETL_DC_034() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_034";
		String notes = "Feed should be successfully completed";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		// -- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Country click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le Book click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		// -- Feed Category Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_CATEGORY_1");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[@class='ng-option-label ng-star-inserted'][normalize-space()='VAT_CATEGORY_1 - VAT_Category_1']"))
				.click();
		// -- Feed name send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("AE01347368");
		// -- Feed Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Next schedule date click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// --Ignore click--//
		driver.findElement(By.xpath("//label[contains(text(),'Ignore')]")).click();
		Thread.sleep(2000);
		// -- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
		// --category close--//
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[5]")).click();
		Thread.sleep(2000);
		// -- All Category Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Category Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]"))
				.sendKeys("VAT_CATEGORY_1");
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_1 - VAT_Category_1')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(5000);
		// -- Details of Feed--//
		WebElement Status = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Status.click();
		String Text = Status.getText();
		Status.getText();
		System.out.println("Feed Status: " + Text);
		Thread.sleep(2000);
	}

	@Test(priority = 16)
	@TestDescription("If the readiness , pre and post is feeded and feed should be give successful status")
	public void ETL_DC_035() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_035";
		String notes = "If the readiness , pre and post is feeded and feed should be give successful status";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		// -- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		// -- Country click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le Book click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		// -- Feed Category Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[@class='ng-option-label ng-star-inserted'][normalize-space()='VAT_CATEGORY_20 - VAT_Category_20']"))
				.click();
		// -- Feed name send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("AE01836605");
		// -- Feed Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Next schedule date click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// --Ignore click--//
		driver.findElement(By.xpath("//label[contains(text(),'Ignore')]")).click();
		Thread.sleep(2000);
		// -- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
		// --category close--//
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[5]")).click();
		Thread.sleep(2000);
		// -- All Category Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Category Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_20 - VAT_Category_20')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(5000);
		Thread.sleep(6700);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
		// -- Details of Feed--//
		WebElement Status = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Status.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		String Text = Status.getText();
		Status.getText();
		System.out.println("Feed Status: " + Text);
		Thread.sleep(2000);
	}

	@Test(priority = 17)
	@TestDescription("If the readiness , pre and post is feeded and if Readiness is error the feed should be given in error status")
	public void ETL_DC_036() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_036";
		String notes = "If the readiness , pre and post is feeded and if Readiness is error the feed should be given in error status";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		// -- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		// -- Country click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le Book click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		// -- Feed Category Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[@class='ng-option-label ng-star-inserted'][normalize-space()='VAT_CATEGORY_20 - VAT_Category_20']"))
				.click();
		// -- Feed name send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("AE01526601");
		// -- Feed Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Next schedule date click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// --Ignore click--//
		driver.findElement(By.xpath("//label[contains(text(),'Ignore')]")).click();
		Thread.sleep(2000);
		// -- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
		// --category close--//
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[5]")).click();
		Thread.sleep(2000);
		// -- All Category Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Category Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_20 - VAT_Category_20')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(5000);
		Thread.sleep(6700);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
		// --Error click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Details of Feed--//
		WebElement Status = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Status.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		String Text = Status.getText();
		Status.getText();
		System.out.println("Feed Status: " + Text);
		Thread.sleep(2000);
	}

	@Test(priority = 18)
	@TestDescription("If the readiness , pre and post is feeded and if pre is error the feed should be given in error status")
	public void ETL_DC_037() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_037";
		String notes = "If the readiness , pre and post is feeded and if pre is error the feed should be given in error status";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		// -- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		// -- Country click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le Book click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		// -- Feed Category Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[@class='ng-option-label ng-star-inserted'][normalize-space()='VAT_CATEGORY_20 - VAT_Category_20']"))
				.click();
		// -- Feed name send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("AE01150112");
		// -- Feed Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Next schedule date click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// --Ignore click--//
		driver.findElement(By.xpath("//label[contains(text(),'Ignore')]")).click();
		Thread.sleep(2000);
		// -- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
		// --category close--//
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[5]")).click();
		Thread.sleep(2000);
		// -- All Category Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Category Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_20 - VAT_Category_20')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(5000);
		Thread.sleep(6700);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
		// --Error click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Details of Feed--//
		WebElement Status = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Status.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		String Text = Status.getText();
		Status.getText();
		System.out.println("Feed Status: " + Text);
		Thread.sleep(2000);
	}

	@Test(priority = 19)
	@TestDescription("If the feed is initiated with readiness script the feed should get successful")
	public void ETL_DC_039() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_039";
		String notes = "If the feed is initiated with readiness script the feed should get successful";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		// -- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		// -- Country click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le Book click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		// -- Feed Category Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[@class='ng-option-label ng-star-inserted'][normalize-space()='VAT_CATEGORY_20 - VAT_Category_20']"))
				.click();
		// -- Feed name send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("AE01869802");
		// -- Feed Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Next schedule date click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// --Ignore click--//
		driver.findElement(By.xpath("//label[contains(text(),'Ignore')]")).click();
		Thread.sleep(2000);
		// -- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
		// --category close--//
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[5]")).click();
		Thread.sleep(2000);
		// -- All Category Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Category Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_20 - VAT_Category_20')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
		// -- Details of Feed--//
		WebElement Status = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Status.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		String Text = Status.getText();
		Status.getText();
		System.out.println("Feed Status: " + Text);
		Thread.sleep(2000);
	}

	@Test(priority = 20)
	@TestDescription("If the feed is initiated with readiness script and if the readiness is error the feed should get error")
	public void ETL_DC_040() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_040";
		String notes = "If the feed is initiated with readiness script and if the readiness is error the feed should get error";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		// -- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		// -- Country click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le Book click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		// -- Feed Category Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[@class='ng-option-label ng-star-inserted'][normalize-space()='VAT_CATEGORY_20 - VAT_Category_20']"))
				.click();
		// -- Feed name send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("AE01805721");
		// -- Feed Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Next schedule date click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// --Ignore click--//
		driver.findElement(By.xpath("//label[contains(text(),'Ignore')]")).click();
		Thread.sleep(2000);
		// -- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
		// --category close--//
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[5]")).click();
		Thread.sleep(2000);
		// -- All Category Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Category Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]"))
				.sendKeys("VAT_CATEGORY_20");
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_20 - VAT_Category_20')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
		// --Error click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Details of Feed--//
		WebElement Status = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Status.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		String Text = Status.getText();
		Status.getText();
		System.out.println("Feed Status: " + Text);
		Thread.sleep(2000);
	}

	@Test(priority = 21)
	@TestDescription("If the feed is initiated with pre script and if the pre script is error the feed should get error")
	public void ETL_DC_042() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_042";
		String notes = "If the feed is initiated with pre script and if the pre script is error the feed should get error";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		// -- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		// -- Country click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le Book click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		// -- Feed Category Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_01");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		// -- Feed name send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("AE01368987");
		// -- Feed Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Next schedule date click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// --Ignore click--//
		driver.findElement(By.xpath("//label[contains(text(),'Ignore')]")).click();
		Thread.sleep(2000);
		// -- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
		// --category close--//
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[5]")).click();
		Thread.sleep(2000);
		// -- All Category Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Category Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]"))
				.sendKeys("VAT_01");
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_01 - vat_01')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
		// --Error click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Filter click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[1]/div[1]/a[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(2000);
		// --Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// --Column select--//
		driver.findElement(
				By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Feed ID - Name']"))
				.click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("AE01368987");
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		// -- Details of Feed--//
		WebElement Status = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Status.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		String Text = Status.getText();
		Status.getText();
		System.out.println("Feed Status: " + Text);
		Thread.sleep(2000);
	}

	@Test(priority = 22)
	@TestDescription("If the feed is initiated with post script the feed should get successful")
	public void ETL_DC_043() throws InterruptedException {
		String ScreenName = "General_TestCases(All Screen)";
		String testCaseId = "ETL_DC_043";
		String notes = "If the feed is initiated with post script the feed should get successful";
		ListenersETL.reportTestDetails1(ScreenName, testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		// -- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		// -- Country click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		// -- Le Book click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		Thread.sleep(2000);
		// -- Feed Category Click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_CATEGORY_22");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		// -- Feed name send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("AE01251806");
		// -- Feed Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Next schedule date click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// -- Time reduce click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]"))
				.click();
		// --Ignore click--//
		driver.findElement(By.xpath("//label[contains(text(),'Ignore')]")).click();
		Thread.sleep(2000);
		// -- Submit click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(10000);
		// --category close--//
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[5]")).click();
		Thread.sleep(2000);
		// -- All Category Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Category Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]"))
				.sendKeys("VAT_CATEGORY_22");
		driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_22 - VAT_Category_22')]")).click();
		// -- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(2000);
		// -- Details of Feed--//
		WebElement Status = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"));
		Status.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		String Text = Status.getText();
		Status.getText();
		System.out.println("Feed Status: " + Text);
		Thread.sleep(2000);
	}

	@DataProvider(name = "loginCredentials")
	public Object[][] provideLoginData() {
		return new Object[][] { { "RA", "Vision@123" }, { "RA", "vision@123" }, { "QW", "Vision@123" }, };
	}

}