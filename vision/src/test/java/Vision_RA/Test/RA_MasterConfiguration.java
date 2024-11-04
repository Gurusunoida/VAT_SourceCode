package Vision_RA.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RA_MasterConfiguration extends BaseClass {
	
	String VAT = "VAT";
	
	
	@TestDescription("The display of the alert message would help users understand that the record has been modified.")
	@Test(dataProvider = "loginCredentials", priority = 1)
	public void RA_MC_001(String username, String password) throws InterruptedException {
		String ScreenName = "Master Configuration";
		String testCaseId = "RA_MC_001";
        String notes = "The display of the alert message would help users understand that the record has been modified.";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(2000);// -- MAster Config Dropdown Click
		// -- Transline config Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		// -- Back Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_001.png";
		//-- save the screenshot --//
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
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(2000);// -- MAster Config Dropdown Click
		// -- Transline config Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
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
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(2000);// -- MAster Config Dropdown Click
		// -- Transline config Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
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
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(2000);// -- MAster Config Dropdown Click
		// -- Transline config Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
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
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(2000);// -- MAster Config Dropdown Click
		// -- Transline config Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// - Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		Thread.sleep(2000);
		// -- Column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// --Value Send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT");
		// --Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT / VAT')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement TransLine = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[6]/a[2]/i[1]"));
		TransLine.click();
		Thread.sleep(2000);
		// -- Add row click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/div[1]"))
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
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(2000);// -- MAster Config Dropdown Click
		// -- Transline config Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
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
				//--Edit CLick--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
						.click();
				Thread.sleep(3000);
				// -- Business Line Config  click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(4000);
				//-- Business line id send keys--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("TEST");
				Thread.sleep(2000);
				//-- Transline configuration click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
				//-- No click--//
				driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
				Thread.sleep(2000);
				//-- Move again to Businessline--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(2000);
				 //-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_012.png";
				//-- save the screenshot --//
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
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Ra Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Recom Config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(4000);
		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Recon = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		Recon.click();
		//-- Column CLick--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(2000);	
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_005.png";
		//-- save the screenshot --//
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
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		//-- Ra Admin click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Recom Config click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Relationship click--//
		driver.findElement(By.xpath("//span[contains(text(),'Relationship')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/i[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Relationship = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/i[1]"));
		Thread.sleep(2000);	
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_MC_007.png";
		//-- save the screenshot --//
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
	
	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
