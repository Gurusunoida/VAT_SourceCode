package visionDQ.Test;

import java.io.File;
import java.io.IOException;

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

public class DQHome {
	WebDriver driver;

	@Parameters("ApplicationURL")
	@BeforeMethod
	public void BrowserOpening(String applicationURL) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test(priority = 1, dataProvider = "getUserNameList")
	public void DQ_CE_001(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Home Scroll
		Actions actionsTarget = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]"));
		actionsTarget.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[24]"));
		actionsTarget.scrollToElement(Target);
		actionsTarget.perform();
		Target.click();
		Thread.sleep(3000);
	}

	@Test(priority = 2, dataProvider = "getUserNameList")
	public void DQ_CE_004(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// Schedular click
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		Thread.sleep(300);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]/option[1]"))
				.click();
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(3000);
	}

	@Test(priority = 3, dataProvider = "getUserNameList")
	public void DQ_CE_005(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// Console Home screen record
		driver.findElement(By.xpath("//span[contains(text(),'VAT_MAR')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-checkbox[1]/input[1]"))
				.click();
		Thread.sleep(3000);
		// Forward button
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 4, dataProvider = "getUserNameList")
	public void DQ_CE_006(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Schedular Clisk
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		Thread.sleep(300);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		// --Schedular Expand
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[1]/div[2]/a[6]/span[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/virtual-scroller[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/virtual-scroller[1]"))
				.click();
		Thread.sleep(3000);
		// --Schedular scroll
		Actions actionsTarget = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/virtual-scroller[1]"));
		actionsTarget.moveToElement(elementTarget);
		Thread.sleep(3000);
		WebElement Target = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/virtual-scroller[1]"));// --Time																																															// path
		actionsTarget.scrollToElement(Target);
		actionsTarget.perform();
		actionsTarget.clickAndHold(Target).pause(2000).release().build().perform();
		Target.click();
		Thread.sleep(5000);
	}

	@Test(priority = 5, dataProvider = "getUserNameList")
	public void DQ_CE_007(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Schedular Click
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		Thread.sleep(300);
		// --Schedular screen
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		// --Rows per page
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]/option[1]"))
				.click();
		Select select = new Select(driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
		select.selectByIndex(0);
		Thread.sleep(1000);
		// --Schedular Expand
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[1]/div[2]/a[6]/span[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		// --Select Check Box
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
		Thread.sleep(3000);// --
	}

	@Test(priority = 6, dataProvider = "getUserNameList")
	public void DQ_CE_008(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Schedular Click
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		// --Schedular screen
		Thread.sleep(300);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Yet to Start - Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --In progress
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Completed
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Errored
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Terminated
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[1]"))
				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 7, dataProvider = "getUserNameList")
	public void DQ_CE_012(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Clicking Edit in profiler
		Thread.sleep(3000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//td[contains(text(),'Account_Officers')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Connector = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]"));
		Connector.click();
		Thread.sleep(2000);
		// --Return Back
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(3000);
		// --Profiler print
		WebElement DataProfiler = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]"));
		String proftext = DataProfiler.getText();
		System.out.println(proftext);
	}

	@Test(priority = 8, dataProvider = "getUserNameList")
	public void DQ_CE_013(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// project
		driver.findElement(By.xpath("//span[contains(text(),'MULTIPLE_CONNECTION')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[6]/td[6]/div[1]/div[1]/a[1]/i[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-profiler-tab[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]"))
				.click();
		Thread.sleep(3000);
//		driver.findElement(By
//				.xpath(""))
//				.click();
//		Thread.sleep(5000);
		// to code......

	}
	@Test(priority = 9, dataProvider = "getUserNameList")
	public void DQ_CE_015(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Schedular click
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		// --schedular screen
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// -- Location for screenshot--//
		String Location = "D:\\WorkSpace\\VisionAutoTest\\test-output\\Screenshot\\DQ_CE_015";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" DQ_CE_015 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("DQ_CE_015 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(priority = 10, dataProvider = "getUserNameList")
	public void DQ_CE_016(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Yet to start status
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// -- Location for screenshot--//
		String Location = "D:\\WorkSpace\\VisionAutoTest\\test-output\\Screenshot\\DQ_CE_016";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" DQ_CE_016 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("DQ_CE_016 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(priority = 11, dataProvider = "getUserNameList")
	public void DQ_CE_017(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Click Add Project
		driver.findElement(By.xpath("//span[contains(text(),'Add Project')]")).click();
		Thread.sleep(3000);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// -- Location for screenshot--//
		String Location = "D:\\WorkSpace\\VisionAutoTest\\test-output\\Screenshot\\DQ_CE_017";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" DQ_CE_017 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("DQ_CE_017 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(priority = 12, dataProvider = "getUserNameList")
	public void DQ_CE_018(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		WebElement DataProfiler=driver.findElement(By.xpath("// div[contains(text(),'- Successful')]"));
		String dataprof = DataProfiler.getText();
		System.out.println(dataprof);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// -- Location for screenshot--//
		String Location = "D:\\WorkSpace\\VisionAutoTest\\test-output\\Screenshot\\DQ_CE_018";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" DQ_CE_018 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("DQ_CE_018 Failed to save screenshot: " + e.getMessage());
		}	
	}
	@Test(priority = 13, dataProvider = "getUserNameList")
	public void DQ_CE_019(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// -- Location for screenshot--//
		String Location = "D:\\WorkSpace\\VisionAutoTest\\test-output\\Screenshot\\DQ_CE_019";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" DQ_CE_019 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("DQ_CE_019 Failed to save screenshot: " + e.getMessage());
		}
	}
	@Test(priority = 14, dataProvider = "getUserNameList")
	public void DQ_CE_020(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Add Click
		driver.findElement(By.xpath("//span[contains(text(),'Add Project')]")).click();
		Thread.sleep(1000);
		//--Rerurn to home 
		driver.findElement(By.xpath("//i[contains(text(),'home')]")).click();
		Thread.sleep(1000);
		//--Project edit
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(1000);
		//--Rerurn to home 
		driver.findElement(By.xpath("//i[contains(text(),'home')]")).click();
		Thread.sleep(3000);
		//--Schedular click
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]/*[1]")).click();
		Thread.sleep(200);
		//--schedular page
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(200);
		//--Return to home
		driver.findElement(By.xpath("//i[contains(text(),'home')]")).click();
		Thread.sleep(3000);
		//--Three vertical dots - home
		driver.findElement(By.xpath("//i[@id='viewList']")).click();
		Thread.sleep(3000);
		//--Extractor click
		driver.findElement(By.xpath("//p[contains(text(),'Data Extractor')]")).click();
		Thread.sleep(500);
		//--Return to home
		driver.findElement(By.xpath("//i[contains(text(),'home')]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 15, dataProvider = "getUserNameList")    //-------dependendy
	public void DQ_CE_021(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
	}
	@Test(priority = 16, dataProvider = "getUserNameList")   
	public void DQ_CE_022(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Cliscking Add project 
		driver.findElement(By.xpath("//span[contains(text(),'Add Project')]")).click();
		Thread.sleep(3000);
		//--Connection Drop down
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 17, dataProvider = "getUserNameList")   
		public void DQ_CE_023(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--VAT_SEL_TESTING click
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		Thread.sleep(3000);
		//--Edit click
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(3000);
		//--edit the table 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-checkbox[1]/input[1]")).click();
		Thread.sleep(3000);
		//--Modify click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 18, dataProvider = "getUserNameList")
	public void DQ_CE_024(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Vat_sel... click 
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		Thread.sleep(3000);
		//--Report click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/span[1]/span[2]/*[1]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 19, dataProvider = "getUserNameList")
	public void DQ_CE_025(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Schedular click
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		// --schedular screen
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
//		//--Cron status 
//		driver.findElement(By.xpath("")).click();
//		Thread.sleep(3000);
	}
	@Test(priority = 20, dataProvider = "getUserNameList")
	public void DQ_CE_026(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// --Schedular click
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		// --schedular screen
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		//--Cron status 
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 21, dataProvider = "getUserNameList")
	public void DQ_CE_027(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Vat_sel... click 
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		Thread.sleep(1000);
		//--Data Monitor
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[2]/span[1]")).click();
		Thread.sleep(1000);
		//--Data Cleanser
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[3]/span[1]")).click();
		Thread.sleep(1000);
		//--Data Profiler
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 22, dataProvider = "getUserNameList")
	public void DQ_CE_028(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//span[contains(text(),'VAT_SEL_TESTING')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[contains(text(),'edit')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-checkbox[1]/input[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//i[contains(text(),'forward')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[2]/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[3]/span[1]"))
				.click();
		Thread.sleep(2000);
	}
	@Test(priority = 23, dataProvider = "getUserNameList")
	public void DQ_CE_029(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Add project 
		driver.findElement(By.xpath(
				"//span[contains(text(),'Add Project')]"))
				.click();
		Thread.sleep(3000);
		//edit click 
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]"))
				.sendKeys("VAT_TESTING");
		Thread.sleep(200);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(1000);
		//--CLEAR click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//button[contains(text(),'Yes')]"))
				.click();
		Thread.sleep(2000);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //-- save the screenshot --//    
		String Location = "D:\\WorkSpace\\VisionAutoTest\\test-output\\Screenshot\\DQ_CE_029.png";
        File destinationFile = new File(Location);
        // Move the screenshot file to the specified destination
        try {
            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
            System.out.println(" DQ_CE_029 Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("DQ_CE_029 Failed to save screenshot: " + e.getMessage());
        }
	}
	@Test(priority = 24, dataProvider = "getUserNameList")
	public void DQ_CE_030(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Schedular click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]/*[1]")).click();
		Thread.sleep(1000);
		//--schedular page
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		//--Expand click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[1]/div[2]/a[6]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		//--Expand compress 
		driver.findElement(By.xpath("//i[contains(text(),'close_fullscreen')]")).click();
		Thread.sleep(1000);
		//--Scheduler Details Expand
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-smart-table[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		//--Expand compress 
		driver.findElement(By.xpath("//i[contains(text(),'close_fullscreen')]")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 25, dataProvider = "getUserNameList")
	public void DQ_CE_031(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		 driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Schedular click
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]/*[1]")).click();
		Thread.sleep(1000);
		//--schedular page
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		//scroll down
		Actions actionsTarget = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/virtual-scroller[1]"));
		actionsTarget.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/virtual-scroller[1]/div[2]/table[1]/tbody[1]/tr[6]/td[1]/input[1]"));
		actionsTarget.scrollToElement(Target);
		actionsTarget.perform();
		Target.click();
		Thread.sleep(3000);
	     File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     //-- save the screenshot --//    
		String Location = "D:\\WorkSpace\\VisionAutoTest\\test-output\\Screenshot\\DQ_CE_029.png";
	     File destinationFile = new File(Location);
	     // Move the screenshot file to the specified destination
      try {
          org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
          System.out.println(" DQ_CE_029 Screenshot saved to: " + destinationFile.getAbsolutePath());
      } catch (IOException e) {
          System.out.println("DQ_CE_029 Failed to save screenshot: " + e.getMessage());
      }	
	}
	@Test(priority = 26, dataProvider = "getUserNameList")
	public void DQ_CE_032(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Schedular click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]/*[1]")).click();
		Thread.sleep(1000);
		//--schedular page
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		//--Yet to start click
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//--In progress click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		//-- Completed click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]")).click();
		Thread.sleep(2000);
		//--Errored click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]")).click();
		Thread.sleep(2000);
		//--Terinated 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[1]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 27, dataProvider = "getUserNameList")
	public void DQ_CE_033(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Schedular click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]/*[1]")).click();
		Thread.sleep(1000);
		//--schedular page
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		//--click add
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		//--project name
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(1000);
		//-- project click 
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		Thread.sleep(1000);
		//--Connector id
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(1000);
		//-- connector id click
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SE_TST')]")).click();
		Thread.sleep(1000);
		//-- profile
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(1000);
		//--profile click
		driver.findElement(By.xpath("//span[contains(text(),'Data Monitor')]")).click();
		Thread.sleep(1000);
		//-- Frequency 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(3000);
		//-- frequency click
		driver.findElement(By.xpath("//span[contains(text(),'One Time')]")).click();
		Thread.sleep(3000);
		//--start date click
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		//-- choose start date
		driver.findElement(By.xpath("//body/div[3]/div[1]/dp-day-time-calendar[1]/dp-day-calendar[1]/div[1]/div[1]/div[3]/button[3]")).click();
		Thread.sleep(3000);
		//-- run status 
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/label[1]/input[1]")).click();
		Thread.sleep(3000);
		//-- save click
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-new-adf-scheduler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		//-- 
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);       //   ------------------Code is in error state-----------------//

}
	@Test(priority = 28, dataProvider = "getUserNameList")
	public void DQ_CE_035(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//--Schedular click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]/*[1]")).click();
		Thread.sleep(1000);
		//--schedular page
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		//--home click
		driver.findElement(By.xpath("//i[contains(text(),'home')]")).click();
		Thread.sleep(3000); 
		//--vertical dots
		driver.findElement(By.xpath("//i[@id='viewList']")).click();
		Thread.sleep(1000); 
		//--Schedular click 
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]")).click();
		Thread.sleep(1000);
		//--schedular page
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[2]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(3000);
	     File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     //-- save the screenshot --//    
		String Location = "D:\\WorkSpace\\VisionAutoTest\\test-output\\Screenshot\\DQ_CE_029.png";
	     File destinationFile = new File(Location);
	     // Move the screenshot file to the specified destination
     try {
         org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
         System.out.println(" DQ_CE_034 Screenshot saved to: " + destinationFile.getAbsolutePath());
     } catch (IOException e) {
         System.out.println("DQ_CE_034 Failed to save screenshot: " + e.getMessage());
     }
		
	}
	@Test(priority = 29, dataProvider = "getUserNameList")
	public void DQ_CE_036(String loginName, String loginPwd) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);

		
	}
	
	
	
	
	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];
		loginDetails[0][0] = "bb.satyaprakash";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
