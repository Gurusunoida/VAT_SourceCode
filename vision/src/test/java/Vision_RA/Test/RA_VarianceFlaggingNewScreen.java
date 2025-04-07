package Vision_RA.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Package_PageObject.Login;
import Package_PageObject.POM_General;
import Package_PageObject.POM_RA;

public class RA_VarianceFlaggingNewScreen extends BaseClass {

	private Login LoginPage;
	private POM_General RA_General;
	private POM_RA RA_Variance;


	
	@BeforeMethod
	public void Setup() {
		LoginPage = new Login(driver);
		RA_General = new POM_General(driver);
		RA_Variance = new  POM_RA(driver);
	}
	
	
	@Test(dataProvider = "loginCredentials", priority = 1)
	@TestDescription("Buttons should be displayed (Edit,View,Delete). Delete function is newly added.")
	public void FG_CF_036(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_036";
        String notes = "Buttons should be displayed (Edit,View,Delete). Delete function is newly added.";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
//		RA_Variance.VarianceFlagging();
		Thread.sleep(4000);
		//-- Filter click--//
		RA_General.FILTER();
		Thread.sleep(2000);
		//-- Column click--//
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST_30_07");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Variance = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		Variance.click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_036.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_036 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_036 Failed to save screenshot: " + e.getMessage());
		}		
	}
	@Test(dataProvider = "loginCredentials", priority = 2)
	@TestDescription("Verifier can view, approve or reject the record and the process flows successfully.")
	public void FG_CF_037(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_037";
        String notes = "Verifier can view, approve or reject the record and the process flows successfully.";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername("MJ");
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		//-- Filter click--//
		RA_General.FILTER();
		Thread.sleep(2000);
		//-- Column click--//
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);				
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);			
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[10]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		//-- Value sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Submitted");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Variance = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		Variance.click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_037.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_037 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_037 Failed to save screenshot: " + e.getMessage());
		}		
	}
	@Test(dataProvider = "loginCredentials", priority = 3)
	@TestDescription("Comment box appears comments should be passed for \"Approve\" or \"Reject\"")
	public void FG_CF_038(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_038";
        String notes = "Comment box appears comments should be passed for \"Approve\" or \"Reject\"";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername("MJ");
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		//-- Filter click--//
		RA_General.FILTER();
		Thread.sleep(2000);
		//-- Column click--//
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[10]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		//-- Value click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Submitted");
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Variance = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[3]/i[1]"));
		Variance.click();
		Thread.sleep(2000);
		WebElement Comment = driver.findElement(By.xpath("//div[contains(text(),'Are you sure, you want to approve the record?')]"));
		String CommentBox = Comment.getText();
		System.out.println(CommentBox);
		Thread.sleep(2000);
		//-- Commentbox sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[1]/form[1]/textarea[1]")).sendKeys("Approve/Reject Comment Box");
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 4)
	@TestDescription("Maker can able to \"Edit, View, Delete\" and comment passed by verifier can be viewed by Maker")
	public void FG_CF_039(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_039";
        String notes = "Maker can able to \"Edit, View, Delete\" and comment passed by verifier can be viewed by Maker";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		//-- Filter click--//
		RA_General.FILTER();
		Thread.sleep(2000);
		//-- Column click--//
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		//-- Column select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("VAT_Auto_Reject");
		//-- Apply CLick--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT_Auto_Reject')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement VarianceCommentClick = driver.findElement(By.xpath("//i[contains(text(),'comment')]"));
		VarianceCommentClick.click();
		Thread.sleep(2000);
		//-- Comment close--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'VAT_Auto_Reject')]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		WebElement VarianceEditClick1 = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		VarianceEditClick1.click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_039.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" FG_CF_039 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_039 Failed to save screenshot: " + e.getMessage());
				}
	}
	@Test(dataProvider = "loginCredentials", priority = 5)
	@TestDescription("Click on authorised record in variance flag and in variance detail click on audit detail and verify the header details.	When there is more characters in id , the details properly displayed while hovering cursor on it.")
	public void FG_CF_041(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_041";
        String notes = "Click on authorised record in variance flag and in variance detail click on audit detail and verify the header details.	When there is more characters in id , the details properly displayed while hovering cursor on it.";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		//-- Filter click--//
		RA_General.FILTER();
		Thread.sleep(2000);
		//-- Column click--//
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		//-- Column select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Vat_VarianceFlagging01");
		//-- Apply CLick--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Vat_VarianceFlagging01')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Variance = driver.findElement(By.xpath("//i[contains(text(),'visibility')]"));
		Variance.click();
		Thread.sleep(2000);
		//-- Audit details click--//
		driver.findElement(By.xpath("//span[contains(text(),'content_paste_search')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'ENSLPS0029 - NCBA_ENBD_Test1')]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_041.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_041 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_041 Failed to save screenshot: " + e.getMessage());
		}
		
	}
	@Test(dataProvider = "loginCredentials", priority = 6)
	@TestDescription("There is no language function in user setup")
	public void FG_CF_042(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_041";
        String notes = "There is no language function in user setup";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		//-- user profile click--//
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_042.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_042 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_042 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 7)
	@TestDescription("Once you select Exception type has Recovered the Amount Lcy and Fcy column will freez")
	public void FG_CF_043(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_043";
        String notes = "Once you select Exception type has Recovered the Amount Lcy and Fcy column will freez";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		//-- Filter click--//
		RA_General.FILTER();
		Thread.sleep(2000);
		//-- Column click--//
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		//-- Column select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST_30_07");
		//-- Apply CLick--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'TEST_30_07')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Variance = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Variance.click();
		Thread.sleep(2000);
		//-- Variance flagging click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Date from select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Year click--//
		driver.findElement(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")).click();
		//--2024 click--//
		driver.findElement(By.xpath("//tbody/tr[6]/td[4]/div[1]")).click();
		//-- FEB click--///
		driver.findElement(By.xpath("//div[contains(text(),'FEB')]")).click();
		//-- select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		//-- To Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//--- 1st date--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		//-- Exception type click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[10]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[10]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'RCVR - Recovered')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//tbody/tr[1]/td[19]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_043.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_043 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_043 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 8)
	@TestDescription("Once you select partial recovery we cannot select total amount it it should be less than exception amount")
	public void FG_CF_044(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_044";
        String notes = "Once you select partial recovery we cannot select total amount it it should be less than exception amount";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		//-- Filter click--//
		RA_General.FILTER();
		Thread.sleep(2000);
		//-- Column click--//
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		//-- Column select --//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST_30_07");
		//-- Apply CLick--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'TEST_30_07')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Variance = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Variance.click();
		Thread.sleep(2000);
		//-- Variance flagging click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Date from select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Year click--//
		driver.findElement(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")).click();
		//--2024 click--//
		driver.findElement(By.xpath("//tbody/tr[6]/td[4]/div[1]")).click();
		//-- FEB click--///
		driver.findElement(By.xpath("//div[contains(text(),'FEB')]")).click();
		//-- select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		//-- To Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//--- 1st date--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		//-- Exception type click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[10]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[10]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'PR - Partial Recovery')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//tbody/tr[1]/td[19]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Thread.sleep(2000);
		//-- Amount LCY CLick--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[17]/input[1]")).sendKeys("500");
		//-- Save click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_044.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_044 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_044 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 9)
	@TestDescription("Once you select Lien we can select amount equal and less than equal to the exception amount .")
	public void FG_CF_046(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_046";
        String notes = "Once you select Lien we can select amount equal and less than equal to the exception amount .";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.ADD();
		//--Description Send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("VAT_Lien");
		//-- Variance flagging click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Date from select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Year click--//
		driver.findElement(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")).click();
		//--2024 click--//
		driver.findElement(By.xpath("//tbody/tr[6]/td[4]/div[1]")).click();
		//-- FEB click--///
		driver.findElement(By.xpath("//div[contains(text(),'FEB')]")).click();
		//-- select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		//-- To Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//--- 1st date--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		//-- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		//-- Next page click--//
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(2000);
		//-- Check box tick--//
		driver.findElement(By.xpath("//tbody/tr[5]/td[1]/input[1]")).click();
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//tbody/tr[1]/td[19]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Thread.sleep(2000);
		//--- Type click--//
		driver.findElement(By.xpath("//tbody/tr[5]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Lien')]")).click();
		WebElement Lien = driver.findElement(By.xpath("//tbody/tr[5]/td[12]"));
		String Title = Lien.getAttribute("title");
		System.out.println(Title);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[5]/td[17]/input[1]")).sendKeys("8001");
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_046_1.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_046_1 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_046_1 Failed to save screenshot: " + e.getMessage());
		}
		//-- Save--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[5]/td[17]/input[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[5]/td[17]/input[1]")).sendKeys(Title);
		//-- Take screenshot and save it to a file--//
				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_046_2.png";
				//-- save the screenshot --//
				File destinationFile1 = new File(Location1);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
					System.out.println(" FG_CF_046_2 Screenshot saved to: " + destinationFile1.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_046_2 Failed to save screenshot: " + e.getMessage());
				}
				Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 10)
	@TestDescription("Once we select exception type has Waiver it is configured has Any so we can enter any amount which can be lesser than or greater than exception amount")
	public void FG_CF_048(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_048";
        String notes = "Once we select exception type has Waiver it is configured has Any so we can enter any amount which can be lesser than or greater than exception amount";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
//	OLD	driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		RA_General.ADD();
		//--Description Send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("VAT_Lien");
		//-- Variance flagging click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
		Thread.sleep(4000);
		//-- Date from select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Year click--//
		driver.findElement(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")).click();
		//--2024 click--//
		driver.findElement(By.xpath("//tbody/tr[6]/td[4]/div[1]")).click();
		//-- FEB click--///
		driver.findElement(By.xpath("//div[contains(text(),'FEB')]")).click();
		//-- select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		//-- To Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//--- 1st date--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		//-- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		//-- Next page click--//
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(2000);
		//-- Check boox tick--//
		driver.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[4]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(5000);
		//-- Type click--//
		driver.findElement(By.xpath("//tbody/tr[4]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//span[contains(text(),'Waiver-2')]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		WebElement Lien = driver.findElement(By.xpath("//tbody/tr[4]/td[12]"));
		String Title = Lien.getAttribute("title").replaceAll(",", "");
		System.out.println(Title);
		Thread.sleep(2000);
		double Tiltle_Value = Double.parseDouble(Title);
		String Given = "13000";
		double Given_Value = Double.parseDouble(Given);
		
		if( Given_Value > Tiltle_Value ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( Given_Value < Tiltle_Value ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		driver.findElement(By.xpath("//tbody/tr[4]/td[17]/input[1]")).sendKeys(Given);
		driver.findElement(By.xpath("//tbody/tr[4]/td[16]/input[1]")).sendKeys("1");
		//-- Save click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		//-- Yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement Success = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Text = Success.getText();
		System.out.println(Text);
		Assert.assertEquals(Text, "Variance Flagging - Add - Successful");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'close')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(3000);
		//-- Delete Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(3000);
	}
	@Test(dataProvider = "loginCredentials", priority = 11)
	@TestDescription("Until User click on to Submit button Approver should not able to Approve and Reject")
	public void FG_CF_050(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_050";
        String notes = "Until User click on to Submit button Approver should not able to Approve and Reject";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername("System");
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST_30_07");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'TEST_30_07')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Variance = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Variance.click();
		Thread.sleep(4000);	
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_050.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_050 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_050 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 12)
	@TestDescription("1.Maker will only have Edit , View and Delete option 2.Approver or verifier will only have view option 3.So Data cannot be deleted and edited at the same time")
	public void FG_CF_051(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_051";
        String notes = "1.Maker will only have Edit , View and Delete option 2.Approver or verifier will only have view option 3.So Data cannot be deleted and edited at the same time";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("002799");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'002799')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_051.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_051 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_051 Failed to save screenshot: " + e.getMessage());
		}
		RA_General.UserProfile();
		Thread.sleep(3000);
		//-- Logout Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]")).click();
		Thread.sleep(3000);
		LoginPage.loginUsername("System");
	     LoginPage.loginPassword(password);
	     LoginPage.LoginClick();
	     Thread.sleep(5000);
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
			// --- Variance flagging click --//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
					.click();
			Thread.sleep(4000);
			RA_General.FILTER();
			RA_General.FilterColumnclick();
			//-- Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
			//-- Value send keys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("002799");
			//-- Apply Click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
			WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'002799')]"));
			Actions actionsClick1 = new Actions(driver);
			actionsClick1.moveToElement(elementToHoverM1).perform();
			Thread.sleep(2000);
			//-- Take screenshot and save it to a file--//
			File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_051_1.png";
			//-- save the screenshot --//
			File destinationFile1 = new File(Location1);
			// Move the screenshot file to the specified destination
			try {
				org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
				System.out.println(" FG_CF_051_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
			} catch (IOException e) {
				System.out.println("FG_CF_051_1 Failed to save screenshot: " + e.getMessage());
			}
		
	}
	@Test(dataProvider = "loginCredentials", priority = 13)
	@TestDescription("If one user creates a record another user will not have access to do any action")
	public void FG_CF_052(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_052";
        String notes = "If one user creates a record another user will not have access to do any action";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("002799");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'002799')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		Thread.sleep(2000);
		WebElement elementToHoverM1 = driver.findElement(By.xpath("//i[contains(text(),'info')]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverM1).perform();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_052.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_052 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_052 Failed to save screenshot: " + e.getMessage());
		}
		RA_General.UserProfile();
		Thread.sleep(3000);
		//-- Logout Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]")).click();
		Thread.sleep(3000);
		LoginPage.loginUsername("System");
	     LoginPage.loginPassword(password);
	     LoginPage.LoginClick();
	     Thread.sleep(5000);
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
			// --- Variance flagging click --//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
					.click();
			Thread.sleep(4000);
			RA_General.FILTER();
			RA_General.FilterColumnclick();
			//-- Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
			//-- Value send keys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("002799");
			//-- Apply Click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
			WebElement elementToHoverM11 = driver.findElement(By.xpath("//span[contains(text(),'002799')]"));
			Actions actionsClick11 = new Actions(driver);
			actionsClick11.moveToElement(elementToHoverM11).perform();
			Thread.sleep(2000);
			WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
			Edit.click();
			Thread.sleep(2000);
			//-- Take screenshot and save it to a file--//
			File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_052_1.png";
			//-- save the screenshot --//
			File destinationFile1 = new File(Location1);
			// Move the screenshot file to the specified destination
			try {
				org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
				System.out.println(" FG_CF_052_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
			} catch (IOException e) {
				System.out.println("FG_CF_052_1 Failed to save screenshot: " + e.getMessage());
			}
		
	}
	@Test(dataProvider = "loginCredentials", priority = 14)
	@TestDescription("If posting currency is AED Amount FCY column will be frezeed, If posting currency is other than AED LCY column will get freezed")
	public void FG_CF_053(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_053";
        String notes = "If posting currency is AED Amount FCY column will be frezeed, If posting currency is other than AED LCY column will get freezed";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST_30_07");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'TEST_30_07')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		//-- Variance Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Date from select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Year click--//
		driver.findElement(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")).click();
		//--2024 click--//
		driver.findElement(By.xpath("//tbody/tr[6]/td[4]/div[1]")).click();
		//-- FEB click--///
		driver.findElement(By.xpath("//div[contains(text(),'FEB')]")).click();
		//-- select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		//-- To Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//--- 1st date--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		//--Posting ccy Dropdown--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[12]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("//div[contains(text(),'AED')]")).click();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_053.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_053 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_053 Failed to save screenshot: " + e.getMessage());
		}
		//-- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		 //-- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_053_1.png";
		//-- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" FG_CF_053_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_053_1 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Show Filter')]")).click();
		Thread.sleep(5000);
		//--Posting ccy Dropdown--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[12]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
				Thread.sleep(2000);
				//-- Select--//
				driver.findElement(By.xpath("//div[contains(text(),'AED')]")).click();
				Thread.sleep(2000);
				Actions actions1 = new Actions(driver);
				WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[12]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
				actions1.moveToElement(elementTarget1);
				WebElement Target1 = driver.findElement(By.xpath("//div[contains(text(),'USD')]"));
				actions1.scrollToElement(Target1);
				actions1.perform();
				Target1.click();
				//-- Take screenshot and save it to a file--//
				File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_053_2.png";
				//-- save the screenshot --//
				File destinationFile11 = new File(Location11);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
					System.out.println(" FG_CF_053_2 Screenshot saved to: " + destinationFile11.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_053_2 Failed to save screenshot: " + e.getMessage());
				}
				//-- Query Click--//
				driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
				Thread.sleep(5000);
				Actions actions11 = new Actions(driver);
				WebElement elementTarget11 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
				actions11.moveToElement(elementTarget11);
				WebElement Target11 = driver.findElement(By.xpath("//tbody/tr[1]/td[19]/div[1]/input[1]"));
				actions11.scrollToElement(Target11);
				actions11.perform();
				 //-- Take screenshot and save it to a file--//
				File screenshotFile111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location111 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_053_3.png";
				//-- save the screenshot --//
				File destinationFile111 = new File(Location111);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile111, destinationFile111);
					System.out.println(" FG_CF_053_3 Screenshot saved to: " + destinationFile111.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_053_3 Failed to save screenshot: " + e.getMessage());
				}
				Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 15)
	@TestDescription("New column TXN CCY is added in the screen, New column Posting CCY is added in the screen")
	public void FG_CF_055(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_055";
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST_30_07");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'TEST_30_07')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(5000);
		//-- Variance Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_055.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_055 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_055 Failed to save screenshot: " + e.getMessage());
		}
		WebElement DataLabel = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]"));
		String TXNCCY = DataLabel.getAttribute("data-label");
		System.out.println(TXNCCY);
		String actual1 = TXNCCY;
		String expected1 = "Txn Currency";
		Assert.assertEquals(actual1, expected1);
		WebElement DataLabel1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[12]/ng-multiselect-dropdown[1]"));
		String PostingCCY = DataLabel1.getAttribute("data-label");
		System.out.println(PostingCCY);
		String actual2 = PostingCCY;
		String expected2 = "Posting Currency";
		Assert.assertEquals(actual2, expected2);
		Thread.sleep(5000);
		 String notes = "New column TXN CCY is added in the screen , New column Posting CCY is added in the screen " + TXNCCY + "," + PostingCCY ;
	     ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);   
	}
	@Test(dataProvider = "loginCredentials", priority = 16)
	@TestDescription("New column CCY Rates is added in the screen which flows from the backend table")
	public void FG_CF_057(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_057";
		LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("TEST_30_07");
		//-- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'TEST_30_07')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		//-- Variance Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Date from select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Year click--//
		driver.findElement(By.xpath("//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")).click();
		//--2024 click--//
		driver.findElement(By.xpath("//tbody/tr[6]/td[4]/div[1]")).click();
		//-- FEB click--///
		driver.findElement(By.xpath("//div[contains(text(),'FEB')]")).click();
		//-- select--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		Thread.sleep(2000);
		//-- To Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//--- 1st date--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		//-- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_057.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_057 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_057 Failed to save screenshot: " + e.getMessage());
		}
		WebElement CCYRATES = driver.findElement(By.xpath("//body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[7]"));
		String tCCYRATES = CCYRATES.getText();
		System.out.println(tCCYRATES);
		Thread.sleep(2000);
		 String notes = "New column CCY Rates is added in the screen which flows from the backend table" + "," +tCCYRATES ;
	     ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);       
	}
	@Test(dataProvider = "loginCredentials", priority = 17)/////////////------------------Need to change for Different Posting Currency---------- all datas removed------///////
	@TestDescription("Flagging - 1.If in the particular sheet it contain only Same posting currency -Apply all funtionlity will work 2.If in a particular sheet multiple currency is present - Error message will be thrown")
	public void FG_CF_058(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_058";
		String notes = "Flagging - 1.If in the particular sheet it contain only Same posting currency -Apply all funtionlity will work 2.If in a particular sheet multiple currency is present - Error message will be thrown";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.ADD();
		//-- Description Send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("VAT_Flagging");
		Thread.sleep(4000);
		//-- Save click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		//-- Back Click--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT_Flagging");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT_Flagging')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		// -- Next page--//
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(2000);
		// -- Type dropdown click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// -- Select --//
		driver.findElement(By.xpath("//span[contains(text(),'Lien')]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[16]/input[1]")).sendKeys("1");
		// -- Amount LCY Send keys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[17]/input[1]")).sendKeys("5");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//body/ngb-modal-window[1][contains(@class, 'd-block exceptionPopup')]//span[text()='more_vertz']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		// -- Apply All click--//
		driver.findElement(By.xpath("//span[contains(text(),'Apply All')]")).click();
		Thread.sleep(2000);
		// -- Yes CLick--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		// -- Save Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		// -- Yes Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Success = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Text = Success.getText();
		System.out.println(Text);
		Assert.assertEquals(Text,"Variance Flagging - Add - Successful");
		//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_058.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" FG_CF_058 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_058 Failed to save screenshot: " + e.getMessage());
				}
//		// -- SHow filter click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Show Filter')]")).click();
//		Thread.sleep(5000);
//		// --TXN CCY dropdown CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --AED CLick--//
//		driver.findElement(By.xpath("//div[contains(text(),'AED')]")).click();
//		Actions actions11 = new Actions(driver);
//		WebElement elementTarget11 = driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
//		actions11.moveToElement(elementTarget11);
//		WebElement Target11 = driver.findElement(By.xpath("//div[contains(text(),'EUR')]"));
//		actions11.scrollToElement(Target11);
//		actions11.perform();
//		Target11.click();
//		// -- Query CLick--//
//		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement modalElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/div[1]")));
//		modalElement.click(); 
//		Thread.sleep(5000);
//		WebElement Next = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/div[1]/span[2]/ul[1]/li[2]/button[1]/i[1]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Next);
//		WebElement Next1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/div[1]/span[2]/ul[1]/li[2]/button[1]/i[1]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Next1);
//		// -- Next page--//
//		Thread.sleep(5000);
//		Actions actions2 = new Actions(driver);
//		WebElement elementTarget2 = driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
//		actions2.moveToElement(elementTarget2);
//		WebElement Target2 = driver.findElement(By.xpath("//body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[19]/div[1]/input[1]"));
//		actions2.scrollToElement(Target2);
//		actions2.perform();
//		Thread.sleep(3000);
//		// -- Type dropdownn CLick--//
//		driver.findElement(By.xpath("//body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		// -- Recovered CLick--//							
//		WebElement Lien = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Lien);
//		Thread.sleep(3000);
//		Thread.sleep(5000);
//		WebElement element1 = driver.findElement(By.xpath("//body/ngb-modal-window[1][contains(@class, 'd-block exceptionPopup')]//span[text()='more_vertz']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////		//-- Tree dot--//
////		driver.findElement(By.xpath("//span[contains(text(),'more_vertz')]")).click();
//		Thread.sleep(2000);
//		// -- Apply All click--//
//		driver.findElement(By.xpath("//body/div[5]/div[1]/ul[1]/li[1]/div[1]/span[1]")).click();
//		// -- Yes Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(2000);
//		WebElement Error = driver
//				.findElement(By.xpath("//div[contains(text(),'Apply/Apply All work only with same Posting Curren')]"));
//		String ErrorText = Error.getText();
//		System.out.println(ErrorText);
//		 Assert.assertEquals(ErrorText, "Apply/Apply All work only with same Posting Currency");
//		//-- Take screenshot and save it to a file--//
//			File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_058_1.png";
//			//-- save the screenshot --//
//			File destinationFile1 = new File(Location1);
//			// Move the screenshot file to the specified destination
//			try {
//				org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//				System.out.println(" FG_CF_058_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
//			} catch (IOException e) {
//				System.out.println("FG_CF_058_1 Failed to save screenshot: " + e.getMessage());
//			}
		 Thread.sleep(10000);
		 //-- CLose Click--//
		 driver.findElement(By.xpath("//i[contains(text(),'close')]")).click();
		 //-- Yes Click--//
		 driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		 Thread.sleep(5000);
		 //-- Delete click--//
		 driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		 Thread.sleep(2000);
		 
	}
	@Test(dataProvider = "loginCredentials", priority = 18)
	@TestDescription("Pop up should be appeared with information that only remarks will be applied.")
	public void FG_CF_065(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_065";
		String notes = "Pop up should be appeared with information that only remarks will be applied.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VATDeFlagging");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VATDeFlagging')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
//		//driver.findElement(By.xpath("//ngb-modal-window//div[contains(@class, 'd-block') and contains(@class, 'exceptionPopup') and contains(@class, 'fade') and contains(@class, 'modal')]//span[contains(@class, 'material-icons') and contains(text(), 'more_vert')]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement moreVertIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'exceptionPopup')]//span[text()='more_vert']")));
//		moreVertIcon.click();
		WebElement moreVertIcon = driver.findElement(By.xpath("//body/ngb-modal-window[1][contains(@class, 'd-block exceptionPopup')]//span[text()='more_vertz']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", moreVertIcon);
//		driver.findElement(By.xpath("//div[contains(@class, 'exceptionPopup')]//span[text()='more_vert']")).click();
		Thread.sleep(2000);
		//-- Apply all--//
		driver.findElement(By.xpath("//body/div[4]/div[1]/ul[1]/li[1]/div[1]/span[1]")).click();
		//--- Yes Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_065.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_065 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_065 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(dataProvider = "loginCredentials", priority = 19)/////////////------------------Need to change for Different Posting Currency---------- all datas removed------///////
	@TestDescription("Re_Flagging - 1.If in the particular sheet it contain only Same posting currency -Apply all funtionlity will work 2.If in a particular sheet multiple currency is present - Error message will be thrown")
	public void FG_CF_059(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_059";
		String notes = "Re_Flagging - 1.If in the particular sheet it contain only Same posting currency -Apply all funtionlity will work 2.If in a particular sheet multiple currency is present - Error message will be thrown";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.ADD();
		// -- Description Send keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys("VAT_Re_Flagging");
		Thread.sleep(4000);
		//-- Category CLick--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Re-Flagging')]")).click();
		Thread.sleep(2000);
		// -- Save click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		// -- Back Click--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("VAT_Re_Flagging");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'VAT_Re_Flagging')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		WebElement LCY = driver.findElement(By.xpath("//tbody/tr[1]/td[17]/input[1]"));
		LCY.click();
		LCY.sendKeys("1");
		Thread.sleep(5000);
		 try {
			    WebElement moreVertzIcon = driver.findElement(By.xpath(
			        "//tbody/tr[1]/td[20]/div[1]/div[1]/a[1]/span[1]"));
			    moreVertzIcon.click();  // Normal click
			} catch (Exception e) {
			    // Fallback to JavaScript click if normal click is intercepted
			    WebElement moreVertzIcon = driver.findElement(By.xpath(
			        "//tbody/tr[1]/td[20]/div[1]/div[1]/a[1]/span[1]"));
			    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", moreVertzIcon);
			}
		Thread.sleep(2000);
		// --- Apply all--//
		driver.findElement(By.xpath("//span[contains(text(),'Apply All')]")).click();
		// -- Yes Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		// --- Over flagged yes click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		// -- Save click--//
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Success = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Text = Success.getText();
		System.out.println(Text);
		Assert.assertEquals(Text, "Variance Flagging - Add - Successful");
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_059.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_059 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_059 Failed to save screenshot: " + e.getMessage());
		}
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1][contains(@class, 'd-block exceptionPopup')]//i[contains(text(),'chevron_right')]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1][contains(@class, 'd-block exceptionPopup')]//i[contains(text(),'chevron_right')]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1][contains(@class, 'd-block exceptionPopup')]//i[contains(text(),'chevron_right')]"))
//				.click();
//		Thread.sleep(5000);
//		Actions actions11 = new Actions(driver);
//		WebElement elementTarget1 = driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
//		actions11.moveToElement(elementTarget1);
//		WebElement Target1 = driver.findElement(By.xpath("//body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[19]/div[1]/input[1]"));
//		actions11.scrollToElement(Target1);
//		actions11.perform();
//		Thread.sleep(4000);
//		WebElement LCY1 = driver.findElement(By.xpath("//body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[17]/input[1]"));
//		LCY1.click();
//		LCY1.sendKeys("1");
//		Thread.sleep(4000);
//		 try {
//			    WebElement moreVertzIcon = driver.findElement(By.xpath(
//			        "//body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[20]/div[1]/div[1]/a[1]/span[1]"));
//			    moreVertzIcon.click();  // Normal click
//			} catch (Exception e) {
//			    WebElement moreVertzIcon = driver.findElement(By.xpath(
//			        "//body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[20]/div[1]/div[1]/a[1]/span[1]"));
//			    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", moreVertzIcon);
//			}
//		// --- Apply all--//
//		driver.findElement(By.xpath("//body/div[5]/div[1]/ul[1]/li[1]/div[1]/span[1]")).click();
//		// -- Yes Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(2000);
//		WebElement Error = driver
//				.findElement(By.xpath("//div[contains(text(),'Apply/Apply All work only with same Posting Curren')]"));
//		String ErrorText = Error.getText();
//		System.out.println(ErrorText);
//		Assert.assertEquals(ErrorText, "Apply/Apply All work only with same Posting Currency");
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_059_1.png";
//		// -- save the screenshot --//
//		File destinationFile1 = new File(Location1);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
//			System.out.println(" FG_CF_059_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("FG_CF_059_1 Failed to save screenshot: " + e.getMessage());
//		}
		Thread.sleep(10000);
		// -- CLose Click--//
		driver.findElement(By.xpath("//i[contains(text(),'close')]")).click();
		// -- Yes Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		// -- Delete click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);

	}
	@Test(dataProvider = "loginCredentials", priority = 20)
	@TestDescription("FLAG-If we select Exceptional type has Recovered the Full amount which belong to the respective seq will be has be captured .")
	public void FG_CF_063(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_063";
		String notes = "FLAG-If we select Exceptional type has Recovered the Full amount which belong to the respective seq will be has be captured .";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria dropdown click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("FLAG");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'FLAG')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[4]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(2000);
		// -- Type dropdown click--//
		driver.findElement(By.xpath("//tbody/tr[4]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_063.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_063 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_063 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 21)
	@TestDescription("REFLAG-If we select Exceptional type has Recovered the Full amount which belong to the respective seq will be has be captured .")
	public void FG_CF_064(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_064";
		String notes = "REFLAG-If we select Exceptional type has Recovered the Full amount which belong to the respective seq will be has be captured .";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria dropdown click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("REFLAG");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'REFLAG')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(2000);
		//--Type dropdown click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_064.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_064 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_064 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		
		
	}
	@Test(dataProvider = "loginCredentials", priority = 22)
	@TestDescription("LIEN-If the leakage count is 5 the expected count should not exceed 5, but it can be lesser or equal to 5.")
	public void FG_CF_068(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_068";
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria dropdown click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("FLAG");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'FLAG')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		Thread.sleep(2000);
		//-- TXN CCY dropdown--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(2000);
		//-- Search send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys("USD");
		//-- CLick--//
		driver.findElement(By.xpath("//div[contains(text(),'USD')]")).click();
		// -- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(5000);
		WebElement Count = driver.findElement(By.xpath("//tbody/tr[1]/td[11]"));
		String Num = Count.getAttribute("title");
		System.out.println(Num);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[4]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(2000);
		//-- Type dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Lien')]")).click();	
		String Given = "5";
		String Actual = Num;
		String Greater = "100";
		double Number = Double.parseDouble(Num);
		double Given_Value = Double.parseDouble(Given);
		double ActualNum = Double.parseDouble(Actual);
		double GreaterNum =  Double.parseDouble(Greater);
		//-- Count send keys--//
		WebElement ECount = driver.findElement(By.xpath("//tbody/tr[1]/td[16]/input[1]"));
		ECount.sendKeys(Given);
		Thread.sleep(2000);
		if( Given_Value > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( Given_Value < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_068.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_068 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_068 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		ECount.clear();
		ECount.sendKeys(Actual);
		if( ActualNum > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( ActualNum < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_068_1.png";
				//-- save the screenshot --//
				File destinationFile1 = new File(Location1);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
					System.out.println(" FG_CF_068_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_068_1 Failed to save screenshot: " + e.getMessage());
				}
		ECount.clear();
		Thread.sleep(2000);
		ECount.sendKeys(Greater);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		if( GreaterNum > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( GreaterNum < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
		File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_068_2.png";
		//-- save the screenshot --//
		File destinationFile11 = new File(Location11);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
			System.out.println(" FG_CF_068_2 Screenshot saved to: " + destinationFile11.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_068_2 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		WebElement actual = driver.findElement(By.xpath("//div[contains(text(),'* Should be lesser than Leakage count')]"));
		String Text = actual.getText();
		System.out.println(Text);
		String notes = "LIEN-If the leakage count is 5 the expected count should not exceed 5, but it can be lesser or equal to 5." + Text;
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 23)
	@TestDescription("PartialRecovery-If the leakage count is 9 the expected count should not exceed 9, but it can be lesser or equal to 9.")
	public void FG_CF_069(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_069";
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria dropdown click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("FLAG");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'FLAG')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		Thread.sleep(2000);
		//-- TXN CCY dropdown--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(2000);
		//-- Search send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys("USD");
		//-- CLick--//
		driver.findElement(By.xpath("//div[contains(text(),'USD')]")).click();
		// -- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(5000);
		WebElement Count = driver.findElement(By.xpath("//tbody/tr[1]/td[11]"));
		String Num = Count.getAttribute("title");
		System.out.println(Num);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[4]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(2000);
		//-- Type dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		String Given = "5";
		String Actual = Num;
		String Greater = "100";
		double Number = Double.parseDouble(Num);
		double Given_Value = Double.parseDouble(Given);
		double ActualNum = Double.parseDouble(Actual);
		double GreaterNum =  Double.parseDouble(Greater);
		//-- Count send keys--//
		WebElement ECount = driver.findElement(By.xpath("//tbody/tr[1]/td[16]/input[1]"));
		ECount.sendKeys(Given);
		Thread.sleep(2000);
		if( Given_Value > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( Given_Value < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_069.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_069 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_069 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		ECount.clear();
		ECount.sendKeys(Actual);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		if( ActualNum > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( ActualNum < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_069_1.png";
				//-- save the screenshot --//
				File destinationFile1 = new File(Location1);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
					System.out.println(" FG_CF_069_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_069_1 Failed to save screenshot: " + e.getMessage());
				}
		ECount.clear();
		Thread.sleep(2000);
		ECount.sendKeys(Greater);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		if( GreaterNum > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( GreaterNum < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
		File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_069_2.png";
		//-- save the screenshot --//
		File destinationFile11 = new File(Location11);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
			System.out.println(" FG_CF_069_2 Screenshot saved to: " + destinationFile11.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_069_2 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		WebElement actual = driver.findElement(By.xpath("//div[contains(text(),'* Should be lesser than Leakage count')]"));
		String Text = actual.getText();
		System.out.println(Text);
		String notes = "PartialRecovery-If the leakage count is 9 the expected count should not exceed 9, but it can be lesser or equal to 9." + Text;
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 24)
	@TestDescription("REFLAG_Technical Issue-If the leakage count is 5 the expected count should not exceed 5, but it can be lesser or equal to 5.")
	public void FG_CF_070(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_070";
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria dropdown click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("REFLAG");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'REflag')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		Thread.sleep(2000);
		//-- TXN CCY dropdown--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(2000);
		//-- Search send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys("USD");
		//-- CLick--//
		driver.findElement(By.xpath("//div[contains(text(),'USD')]")).click();
		// -- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		WebElement Count = driver.findElement(By.xpath("//tbody/tr[1]/td[11]"));
		String Num = Count.getAttribute("title");
		System.out.println(Num);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[4]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(2000);
//		//-- Type dropdown--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		Actions actions1 = new Actions(driver);
//		WebElement elementTarget1 = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
//		actions1.moveToElement(elementTarget1);
//		WebElement Target1 = driver.findElement(By.xpath("//span[contains(text(),'Technical Issue')]"));
//		actions1.scrollToElement(Target1);
//		actions1.perform();
//		Target1.click();
		String Given = "5";
		String Actual = Num;
		String Greater = "100";
		double Number = Double.parseDouble(Num);
		double Given_Value = Double.parseDouble(Given);
		double ActualNum = Double.parseDouble(Actual);
		double GreaterNum =  Double.parseDouble(Greater);
		//-- Count send keys--//
		WebElement ECount = driver.findElement(By.xpath("//tbody/tr[1]/td[16]/input[1]"));
		ECount.sendKeys(Given);
		Thread.sleep(2000);
		if( Given_Value > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( Given_Value < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_070.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_070 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_070 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		ECount.clear();
		ECount.sendKeys(Actual);
		if( ActualNum > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( ActualNum < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_070_1.png";
				//-- save the screenshot --//
				File destinationFile1 = new File(Location1);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
					System.out.println(" FG_CF_070_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_070_1 Failed to save screenshot: " + e.getMessage());
				}
		ECount.clear();
		Thread.sleep(2000);
		ECount.sendKeys(Greater);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		if( GreaterNum > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( GreaterNum < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
		File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_070_2.png";
		//-- save the screenshot --//
		File destinationFile11 = new File(Location11);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
			System.out.println(" FG_CF_070_2 Screenshot saved to: " + destinationFile11.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_070_2 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		WebElement actual = driver.findElement(By.xpath("//div[contains(text(),'* Should be lesser than Leakage count')]"));
		String Text = actual.getText();
		System.out.println(Text);
		String notes = "REFLAG_Technical Issue-If the leakage count is 5 the expected count should not exceed 5, but it can be lesser or equal to 5." + Text;
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 25)
	@TestDescription("REFLAG_WIP-PartialRecovery-If the leakage count is 9 the expected count should not exceed 9, but it can be lesser or equal to 9.")
	public void FG_CF_071(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_071";
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria dropdown click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("REFLAG");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'REflag')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		Thread.sleep(2000);
		//-- TXN CCY dropdown--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(2000);
		//-- Search send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[11]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys("EUR");
		//-- CLick--//
		driver.findElement(By.xpath("//div[contains(text(),'EUR')]")).click();
		// -- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		Thread.sleep(5000);
		WebElement Count = driver.findElement(By.xpath("//tbody/tr[1]/td[11]"));
		String Num = Count.getAttribute("title");
		System.out.println(Num);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[4]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(2000);
		//-- Type dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//span[contains(text(),'Recovery WIP')]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		String Given = "5";
		String Actual = Num;
		String Greater = "100";
		double Number = Double.parseDouble(Num);
		double Given_Value = Double.parseDouble(Given);
		double ActualNum = Double.parseDouble(Actual);
		double GreaterNum =  Double.parseDouble(Greater);
		//-- Count send keys--//
		WebElement ECount = driver.findElement(By.xpath("//tbody/tr[1]/td[16]/input[1]"));
		ECount.sendKeys(Given);
		Thread.sleep(2000);
		if( Given_Value > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( Given_Value < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_071.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FG_CF_071 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_071 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		ECount.clear();
		ECount.sendKeys(Actual);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		if( ActualNum > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( ActualNum < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_071_1.png";
				//-- save the screenshot --//
				File destinationFile1 = new File(Location1);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
					System.out.println(" FG_CF_071_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_071_1 Failed to save screenshot: " + e.getMessage());
				}
		ECount.clear();
		Thread.sleep(2000);
		ECount.sendKeys(Greater);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		if( GreaterNum > Number ) {
			String TEXTG = "The Number is Greater";
			System.out.println(TEXTG);
		}
		else if( GreaterNum < Number ) {
			String TEXTL = "The Number is Lesser";
			System.out.println(TEXTL);
		}
		else{
			System.out.println("The Number is  Equal");
		}
		//-- Take screenshot and save it to a file--//
		File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_071_2.png";
		//-- save the screenshot --//
		File destinationFile11 = new File(Location11);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
			System.out.println(" FG_CF_071_2 Screenshot saved to: " + destinationFile11.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_071_2 Failed to save screenshot: " + e.getMessage());
		}
		Thread.sleep(2000);
		WebElement actual = driver.findElement(By.xpath("//div[contains(text(),'* Should be lesser than Leakage count')]"));
		String Text = actual.getText();
		System.out.println(Text);
		String notes = "REFLAG_WIP-PartialRecovery-If the leakage count is 9 the expected count should not exceed 9, but it can be lesser or equal to 9." + Text;
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 25)
	@TestDescription("REFLAG-If the leakage count is 0 , automatically the exception count should become 0.")
	public void FG_CF_074(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_074";
		String notes = "REFLAG-If the leakage count is 0 , automatically the exception count should become 0.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria dropdown click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("REFLAG");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'REflag')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		Thread.sleep(2000);
		// -- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[4]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(2000);
		//-- Take screenshot and save it to a file--//
		File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_074.png";
		//-- save the screenshot --//
		File destinationFile11 = new File(Location11);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
			System.out.println(" FG_CF_074 Screenshot saved to: " + destinationFile11.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FG_CF_074 Failed to save screenshot: " + e.getMessage());
		}
		
	}
	@Test(dataProvider = "loginCredentials", priority = 26)
	@TestDescription("FLAG-If the leakage count is 0 , automatically the exception count should become 0.")
	public void FG_CF_075(String username, String password) throws InterruptedException {
		String ScreenName = "Variance Flagging";
		String testCaseId = "FG_CF_075";
		String notes = "FLAG-If the leakage count is 0 , automatically the exception count should become 0.";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
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
		// --- Variance flagging click --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		//-- Criteria dropdown click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value send keys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("FLAG");
		// -- Apply Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'FLAG')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
		Edit.click();
		Thread.sleep(2000);
		// -- Variance Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
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
		Thread.sleep(2000);
		// -- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/perfect-scrollbar[1]/div[1]/div[2]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[4]/td[19]/div[1]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		//-- Take screenshot and save it to a file--//
				File screenshotFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location11 = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FG_CF_075.png";
				//-- save the screenshot --//
				File destinationFile11 = new File(Location11);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile11, destinationFile11);
					System.out.println(" FG_CF_075 Screenshot saved to: " + destinationFile11.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("FG_CF_075 Failed to save screenshot: " + e.getMessage());
				}		
	}
	
	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		return new Object[][] { { "RA", "Vision@123" }, };
	}
}