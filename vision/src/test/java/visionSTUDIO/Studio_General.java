package visionSTUDIO;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class Studio_General {
	WebDriver driver;
	String FilterValue = "KE";

	@Parameters("ApplicationURL")
	@BeforeMethod
	public void setUp(String applicationURL) throws InterruptedException {
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

	@Test(dataProvider = "loginCredentials", priority = 5)
	public void REP_DC_008(String username, String password) throws InterruptedException {
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
		// -- Report suite click--//
		driver.findElement(By.xpath("//p[contains(text(),'Report Suite')]")).click();
		Thread.sleep(2000);
		// -- Ra Reports click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Operational report click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(1000);
		// --SOC group wise Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		// -- Drill down click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Settings Click--//
		driver.findElement(By.xpath("//span[contains(text(),'settings')]")).click();
		Thread.sleep(2000);
		// -- Apply Grouping--//
		// -- View All Untick--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Code Tick--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[8]/div[1]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		// -- Description click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Submit Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		// -- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\Studio_General.png";
		// -- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" Studio_General Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("Studio_General Failed to save screenshot: " + e.getMessage());
		}
		// -- Report suite click--//
		driver.findElement(By.xpath("//p[contains(text(),'Report Suite')]")).click();
		Thread.sleep(2000);
		// -- Variance report click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/app-report-slide[1]/div[1]/div[1]/div[3]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[11]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Settings Click--//
		driver.findElement(By.xpath("//span[contains(text(),'settings')]")).click();
		Thread.sleep(2000);
		// -- Apply Grouping--//
		// -- View All Untick--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Code Tick--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[8]/div[1]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		// -- Description click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-reports[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dynamic-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Submit Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		// -- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\Studio_General_001.png";
		// -- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" Studio_General Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("Studio_General Failed to save screenshot: " + e.getMessage());
		}
	}

	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
