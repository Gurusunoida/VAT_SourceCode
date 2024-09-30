package visionRA.Test;

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

public class RA_FeesPriority extends BaseClass {
	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		return new Object[][] { { "RA", "Vision@123" }, };
	}

	String VAT = "VAT1604";

	private Login LoginPage;

	@BeforeMethod
	public void setUpLogin() {
		LoginPage = new Login(driver);
	}

//	@Test(dataProvider = "loginCredentials", priority = 1)
//	@TestDescription("Verify Records  ,By default First record should be displayed in Screen")
//	public void FES_PRI_005(String username, String password) throws InterruptedException {
//		String ScreenName = "FeesPriority";
//		String testCaseId = "FES_PRI_005";
//		String notes = "Verify Records	By default First record should be displayed in Screen" ;
//	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
//	    LoginPage.loginUsername(username);
//        LoginPage.loginPassword(password);
//        LoginPage.LoginClick();
//		Thread.sleep(7000);
//		// -- Master Configuration tab Click--//
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//						.click();
//				Thread.sleep(4000);
//				// -- Master Config Dropdown Click--//
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//						.click();
//				Thread.sleep(4000);
//		//--Fees priority click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[8]/a[1]/span[1]")).click();
//		Thread.sleep(5000);
//		//-- Business line ID Click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-priority[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
//		//--Screenshot--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\FES_PRI_005.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" FES_PRI_005 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("FES_PRI_005 Failed to save screenshot: " + e.getMessage());
//		}
//		
//		
//	}
//	@Test(dataProvider = "loginCredentials", priority = 2)
//	@TestDescription("If there is no Country, LE book, Businessline ID  inline trigger should appear	Inline trigger appears")
//	public void FES_PRI_006(String username, String password) throws InterruptedException {
//		String ScreenName = "FeesPriority";
//		String testCaseId = "FES_PRI_006";
//		Login LoginPage = new Login(driver);
//		LoginPage.loginUsername(username);
//        LoginPage.loginPassword(password);
//        LoginPage.LoginClick();
//		Thread.sleep(7000);
//		// -- Master Configuration tab Click--//
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//						.click();
//				Thread.sleep(4000);
//				// -- Master Config Dropdown Click--//
//				driver.findElement(By.xpath(
//						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//						.click();
//				Thread.sleep(4000);
//		//--Fees priority click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[8]/a[1]/span[1]")).click();
//		Thread.sleep(5000);
//		//-- Country close--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-priority[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Run Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
//		Thread.sleep(2000);
//		WebElement Error = driver.findElement(By.xpath("//div[contains(text(),'Please Select Business Line Id')]"));
//		String Text = Error.getText();
//		System.out.println(Text);
//		String notes = "If there is no Country, LE book, Businessline ID  inline trigger should appear	Inline trigger appears" + Text ;
//	    ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);	
//		//--Screenshot--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\FES_PRI_006.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" FES_PRI_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("FES_PRI_006 Failed to save screenshot: " + e.getMessage());
//		}	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 3)
//	@TestDescription("If Detail priority doesnt contains any Configuration for Fee attribute column it has to consider Alias name from Default priority.")
//	public void FES_PRI_004(String username, String password) throws InterruptedException {
//		String ScreenName = "FeesPriority";
//		String testCaseId = "FES_PRI_004";
//		Login LoginPage = new Login(driver);
//		LoginPage.loginUsername(username);
//		LoginPage.loginPassword(password);
//		LoginPage.LoginClick();
//		Thread.sleep(7000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Fees Priority--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[8]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Default priority click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Default Priority')]")).click();
//		Thread.sleep(5000);
//		// -- Add click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM = driver.findElement(By
//				.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		Thread.sleep(7000);
//		Actions actions = new Actions(driver);
//		WebElement elementTarget = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-priority[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-form-array-table[1]/form[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
//		actions.moveToElement(elementTarget);
//		WebElement Target = driver.findElement(By.xpath("//tbody/tr[17]/td[10]/div[1]/div[1]/input[1]"));
//		actions.scrollToElement(Target);
//		actions.perform();
//		Target.click();
//		String DefaultText = Target.getText();
//		System.out.println(DefaultText);
//		driver.findElement(By.xpath("//i[@id='viewList']")).click();
//		Thread.sleep(2000);
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --- TransLine Config--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Edit Button in Manin screen of Trans Line--//
//		// -- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		// -- Filter column click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Filter Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		// -- Criteria click--/
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		// -- Criteria select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
//		// -- Value sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys(VAT);
//		// -- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(5000);
//		// -- Edit click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
//				.click();
//		Thread.sleep(8000);
//		// -- Business Line Config click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
//		Thread.sleep(5000);
//		// -- Add row--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]"))
//				.click();
//		Thread.sleep(5000);// -- Fees Config Button Click--//
//		WebElement Text = driver.findElement(By.xpath("//label[contains(text(),'FEES8')]"));
//		String FEES = Text.getText();
//		System.out.println(FEES);
//		String notes = "" + Text;
//		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
//		if (DefaultText.equals(FEES)) {
//			System.out.println("Both texts are equal.");
//		} else {
//			System.out.println("Texts are not equal.");
//		}
//	}
}
