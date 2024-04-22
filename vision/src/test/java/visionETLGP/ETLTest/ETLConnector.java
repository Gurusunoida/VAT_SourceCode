package visionETLGP.ETLTest;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class ETLConnector {
	WebDriver driver;

	@Parameters("ApplicationURL")
	@BeforeMethod
	public void BrowserOpening(String applicationURL) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
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

//	@Test(priority = 1, dataProvider = "getUserNameList")
//	public void ETL_001(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]"))
//				.click();
//		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
//		Select select = new Select(driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
//		select.selectByIndex(0);
//		Thread.sleep(1000);
//		select.selectByIndex(2);
//	}
//
////	@Test(priority = 2, dataProvider = "getUserNameList")////////-------- Not Required( Button is Removed)------////////
////	public void ETL_CC_002(String loginName, String loginPwd) throws InterruptedException {
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
////				.sendKeys(loginName);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
////				.sendKeys(loginPwd);
////		driver.findElement(By
////				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
////				.click();
////		Thread.sleep(5000);
////		driver.findElement(
////				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
////				.click();
////		Thread.sleep(1000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
////				.click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
////		Thread.sleep(2000);
////		Select select = new Select(driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
////		select.selectByIndex(0);
////		Thread.sleep(1000);
////		select.selectByIndex(2);
////	}
//
////	@Test(priority = 3, dataProvider = "getUserNameList")////////-------- Not Required( Button is Removed)------////////
////	public void ETL_CC_003(String loginName, String loginPwd) throws InterruptedException {
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
////				.sendKeys(loginName);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
////				.sendKeys(loginPwd);
////		driver.findElement(By
////				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
////				.click();
////		Thread.sleep(5000);
////		driver.findElement(
////				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
////				.click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.linkText("file_copy")).click();
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
////		Thread.sleep(5000);
////	}
//
////	@Test(priority = 4, dataProvider = "getUserNameList")////////-------- Not Required( Button is Removed)------////////
////	public void ETL_CC_004(String loginName, String loginPwd) throws InterruptedException {
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
////				.sendKeys(loginName);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
////				.sendKeys(loginPwd);
////		driver.findElement(By
////				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
////				.click();
////		Thread.sleep(5000);
////		driver.findElement(
////				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
////				.click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.linkText("visibility")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[3]/i[1]"))
////				.click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[4]/i[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[3]"))
////				.click();
////	}
//
//@Test(priority=5,dataProvider="getUserNameList" )
//public void ETL_CC_005(String loginName, String loginPwd) throws InterruptedException {
//	driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//	driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//	driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//	driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Semi");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//	Thread.sleep(2000);
//	WebElement elementToHover = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/span[1]"));
//    // Create an instance of Actions class
//    Actions actions = new Actions(driver);
//    // Perform mouse hover action on the element
//    actions.moveToElement(elementToHover).perform();
//    WebElement edit = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
//    edit.click();
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).clear();
//    driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("FINCON VAT");
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//    Thread.sleep(4000);
//}	
////	@Test(priority = 6, dataProvider = "getUserNameList")////////-------- Not Required( Button is Removed)------////////
////	public void ETL_CC_006(String loginName, String loginPwd) throws InterruptedException {
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
////				.sendKeys(loginName);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
////				.sendKeys(loginPwd);
////		driver.findElement(By
////				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
////				.click();
////		Thread.sleep(5000);
////		driver.findElement(
////				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
////				.click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.linkText("file_copy")).click();
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
////		Thread.sleep(5000);
////	}
//
////	@Test(priority = 7, dataProvider = "getUserNameList") ////////-------- Not Required( Button is Removed)------////////
////	public void ETL_CC_007(String loginName, String loginPwd) throws InterruptedException {
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
////				.sendKeys(loginName);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
////				.sendKeys(loginPwd);
////		driver.findElement(By
////				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
////				.click();
////		Thread.sleep(5000);
////		driver.findElement(
////				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
////				.click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.linkText("share")).click();
////		Thread.sleep(1000);
////		driver.findElement(By.linkText("fullscreen_exit")).click();
////		Thread.sleep(3000);
////	}
//
////	@Test(priority = 8, dataProvider = "getUserNameList")////////-------- Not Required( Button is Removed)------////////
////	public void ETL_CC_008(String loginName, String loginPwd) throws InterruptedException {
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
////				.sendKeys(loginName);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
////				.sendKeys(loginPwd);
////		driver.findElement(By
////				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
////				.click();
////		Thread.sleep(5000);// --LOGIN CLICK
////		driver.findElement(
////				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
////				.click();
////		Thread.sleep(2000); // --NAVIGATES TO SINGLE CLICK
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
////				.click();
////		Thread.sleep(3000);// --NAVIGATES TO CONNECTOR
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
////				.click();
////		Thread.sleep(3000);
////		driver.findElement(By.linkText("file_copy")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
////		Thread.sleep(4000);
////		driver.findElement(By.linkText("file_copy")).click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
////		Thread.sleep(3000);
////	}
//
//	@Test(priority = 9, dataProvider = "getUserNameList")
//	public void ETL_CC_009(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000); // --NAVIGATES TO SINGLE CLICK
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);// --NAVIGATES TO CONNECTOR
//		driver.findElement(By.linkText("ETL Connector Script")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("add")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'EDPCORE - EDP ETL Connection')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
//				.sendKeys("VAT0204_1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'Pre Script (Before ETL Process)')]")).click();
//		Thread.sleep(3000);// --Script Type--
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"))
//				.sendKeys("VAT0204_1");
//		Thread.sleep(100);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/textarea[1]"))
//				.sendKeys("Select * from VAT_02");
//		Thread.sleep(100);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
//		Thread.sleep(3000);
//	}
//
////	@Test(priority = 10, dataProvider = "getUserNameList")////////-------- Not Required( Button is Removed)------////////
////	public void ETL_CC_010(String loginName, String loginPwd) throws InterruptedException {
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
////				.sendKeys(loginName);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
////				.sendKeys(loginPwd);
////		driver.findElement(By
////				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
////				.click();
////		Thread.sleep(5000);
////		driver.findElement(
////				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
////				.click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
////				.click();
////		Thread.sleep(3000);// --ETLConnector
////		driver.findElement(By.xpath(
////				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
////				.click();
////		Thread.sleep(5000);// --Next page Arrow
////		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.cssSelector(
////				"body.sidebar-mini.body-background:nth-child(2) app-main-container.ng-star-inserted:nth-child(3) div.wrapper.ng-star-inserted div.main-panel.ps-container.content-area_bound:nth-child(3) div.content-area:nth-child(2) app-connector.ng-tns-c296-5.ng-star-inserted:nth-child(2) div.card-body.material-table.p-0.ng-tns-c296-5 div.row.m-0.ng-tns-c296-5 div.col-sm-12.col-md-12.col-lg-12.col-xl-12.h-100.p-0.ng-tns-c296-5 div.material-table.dashboard-bg-white.b-radius-12.h-100.m-0.ng-tns-c296-5 app-smart-table.ng-tns-c285-6.ng-tns-c296-5.ng-star-inserted div.table-responsive.ng-tns-c285-6 perfect-scrollbar.ng-tns-c285-6.ng-star-inserted div.ps.ps--active-y div.ps-content table.inlineEditTable tbody.ng-tns-c285-6.ng-star-inserted:nth-child(2) tr.ng-tns-c285-6.ng-star-inserted:nth-child(3) td.ng-tns-c285-6.ng-star-inserted:nth-child(7) div.tr-edit-icons.row.a1.ng-tns-c285-6.ng-star-inserted a.modal-trigger.waves-effect.btn-flat.nopadding.pr-2.ng-tns-c285-6.ng-star-inserted:nth-child(3) > i.material-icons.ng-tns-c285-6"))
////				.click();
////		Thread.sleep(2000);
////	}
//	@Test(priority=11,dataProvider="getUserNameList" )
//	public void ETL_CC_011(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);//--initial stage Select all function
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")).click();
//		Thread.sleep(2000);//--page set to 10
//		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(priority=12,dataProvider="getUserNameList" )
//	public void ETL_CC_012(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector script
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);//--initial stage Select all function
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")).click();
//		Thread.sleep(2000);//--page set to 10
//		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(priority=13,dataProvider="getUserNameList" )
//	public void ETL_CC_013(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector Query
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);//--initial stage Select all function
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")).click();
//		Thread.sleep(2000);//--page set to 10
//		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(priority=14,dataProvider="getUserNameList" )
//	public void ETL_CC_014(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(3000);//--Add in Connector
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--Country Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(3000);//--Select Country
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--LE Book Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(3000);//--Select LE Book
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("TEST290124");
//		Thread.sleep(1000);//--Connector ID Send Keys
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("DUMMYTEST290124");
//		Thread.sleep(1000);//-- Description Send Keys
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--End Point Type Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(3000);//--End Point type Select
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--Connector Type Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		Thread.sleep(3000);//--Select Connector type
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--DB Type Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(2000);//--Select DB Type
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(2000);//-- Test Connection
//	}
//	@Test(priority=15,dataProvider="getUserNameList" )
//	public void ETL_CC_015(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(3000);//--Add in Connector
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--Country Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(1000);//--Select Country
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(1000);//--LE Book Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(1000);//--Select LE Book
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("TEST290124");
//		Thread.sleep(1000);//--Connector ID Send Keys
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("DUMMYTEST290124");
//		Thread.sleep(1000);//-- Description Send Keys
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--End Point Type Dropdown
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
//		Thread.sleep(1000);//--End Point type Select
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--Connector Type Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(1000);//--Select Connector type
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--DB Type Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(2000);//--Select DB Type
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("10.16.1.106");//---Select DB IP--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys("1521");//--Select DB Port--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[4]/input[1]")).sendKeys("VISION_RA");//-- DB USer--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/input[1]")).sendKeys("Vision@123");//--DB Password--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[6]/input[1]")).sendKeys("Connector");//--DB Name--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(5000);//-- Test Connection
//	}
//	@Test(priority=16,dataProvider="getUserNameList" )
//	public void ETL_CC_016(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(3000);//--Add in Connector
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--Country Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(3000);//--Select Country
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--LE Book Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(3000);//--Select LE Book
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("TEST290124");
//		Thread.sleep(1000);//--Connector ID Send Keys
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("DUMMYTEST290124");
//		Thread.sleep(1000);//-- Description Send Keys
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--End Point Type Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(3000);//--End Point type Select
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--Connector Type Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		Thread.sleep(3000);//--Select Connector type
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(3000);//--DB Type Dropdown
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		Thread.sleep(2000);//--Select DB Type
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("10.16.1.106");//---Select DB IP--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys("1521");//--Select DB Port--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[4]/input[1]")).sendKeys("VISION_RA");//-- DB USer--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/input[1]")).sendKeys("Vision@123");//--DB Password--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(5000);//-- Test Connection
//	}
//	@Test(priority=17,dataProvider="getUserNameList" )
//	public void ETL_CC_017(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]")).click();
//		Thread.sleep(3000);//--Filter Click
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
//		Thread.sleep(1000);//--Record Indicator
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("approved");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//span[contains(text(),'Begins With...')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("ing");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Ends With...')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);//-FILTER CLICK
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Delete");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(1000);//--Equal 
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority=18,dataProvider="getUserNameList" )
//	public void ETL_CC_018(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]")).click();
//		Thread.sleep(3000);//--Filter Click
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		Thread.sleep(1000);//--Record Indicator
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("approved");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//span[contains(text(),'Begins With...')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("ing");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Ends With...')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);//-FILTER CLICK
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Delete");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(1000);//--Equal 
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority=19,dataProvider="getUserNameList" )
//	public void ETL_CC_019(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
//		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(3000);//--ETL Connector click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//		Thread.sleep(3000);//--Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]")).click();
//		Thread.sleep(3000);//--Filter Click
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
//		Thread.sleep(1000);//--Record Indicator
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("approved");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("App");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//span[contains(text(),'Begins With...')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(1000);//--Filter Click
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("ing");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Ends With...')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);//-FILTER CLICK
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Delete");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		Thread.sleep(1000);//--Equal 
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 20, dataProvider = "getUserNameList")
//	public void ETL_CC_020(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(100);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(1000);// --choose country
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(100);// --Country click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
//		Thread.sleep(100);// --LE book click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("Vatvul26");
//		Thread.sleep(1000);// --id click and enter
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Vat26!@<>");
//		Thread.sleep(100);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(100);// --End point Click
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
//		Thread.sleep(100);// --Choose end point
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(100);// --Connector type
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(100);// --Choose connector type
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(100);// --Date base connect
//		driver.findElement(By.xpath("//span[contains(text(),'MSSQL')]")).click();
//		Thread.sleep(1000);// --DB
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
//				.sendKeys("10.16.1.38");
//		Thread.sleep(100);// --DB IP
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
//				.sendKeys("52866");
//		Thread.sleep(1000);// --DB port
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[4]/input[1]"))
//				.sendKeys("Vision");
//		Thread.sleep(100);// --Db name
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/input[1]"))
//				.sendKeys("Vision_RA");
//		Thread.sleep(100);// --Db password
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[6]/input[1]"))
//				.sendKeys("VISION_RA");
//		Thread.sleep(100);// --
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
//		Thread.sleep(2000);// --Test Connection
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
//				.click();
//		Thread.sleep(3000);// -- Save
//	}
//	@Test(priority = 21, dataProvider = "getUserNameList")
//	public void ETL_CC_021(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(1000);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/span[1]/i[1]"))
//				.click();
//		Thread.sleep(1000);// -- Filter Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();// -- Filter Colum Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Act");
//		Thread.sleep(1000);// -- Filter Value Send Keys--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(5000);// -- Apply Button--//
//	}
//
//	@Test(priority = 22, dataProvider = "getUserNameList")
//	public void ETL_CC_022(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(1000);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(1000);// --choose country
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(100);// --Country click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(1000);// --- Le Book--///
//		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
//		Thread.sleep(100);// --LE book click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("Vatvul26");
//		Thread.sleep(1000);// --id click and enter
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Vat26!@<>");// -- Id Send Keys--//
//		Thread.sleep(100);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(100);// --End point Click
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
//		Thread.sleep(100);// --Choose end point
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(100);// --Connector type
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(100);// --Choose connector type
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(100);// --Date base connect
//		driver.findElement(By.xpath("//span[contains(text(),'MSSQL')]")).click();
//		Thread.sleep(1000);// --DB
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
//				.sendKeys("10.16.1.38");
//		Thread.sleep(1000);// --DB IP
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
//				.sendKeys("52866");
//		Thread.sleep(1000);// --DB port
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		Thread.sleep(1000);// -- Back Buttton In Connector--//
//		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
//		Thread.sleep(3000);// -- Popup For Back--//
//	}
//
//	@Test(priority = 23, dataProvider = "getUserNameList")
//	public void ETL_CC_026(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(2000);// -- Add--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();// -- Country Dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();//-- Country Dropdown Select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();//-- LE Book Dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();//-- LE Book Dropdown Select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();//-- Connector ID Dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'101_ORACLE - 101 Oracle DataBase')]")).click();//-- Connector ID Select---//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
//				.sendKeys("VAt");//-- Script ID Sendkeys--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);//-- Script Type Dropdown--//
//		driver.findElement(By.xpath("//span[contains(text(),'Pre Script (Before ETL Process)')]")).click();//-- Script Type Dropdown Select--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();//-- Execution Type Dropdown---//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'SQL Script')]")).click();//-- Execution Type Dropdown Select---//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"))
//				.sendKeys("VAT!@<>");//--Script Description --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/textarea[1]"))
//				.sendKeys("VTA!2<>");//--Script--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();//-- Save--//
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 24, dataProvider = "getUserNameList")
//	public void ETL_CC_027(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector Query
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();//-- Add--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();//-- Country Dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();//-- Country Dropdown Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();//- Le Book Dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();//- Le Book Dropdown Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]"))
//				.click();//-- Connector ID Dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();//-- Connector ID Dropdown Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
//				.sendKeys("VATT");//-- Querry ID Send Keys--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
//				.sendKeys("VAR!#<>");//-- Description Send Keys--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
//				.click();//-- Type Dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Report Queries')]")).click();//-- Type Dropdown Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"))
//				.sendKeys(
//						"Select * from Vision_users");//-- Querry Send Keys--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();//-- Validate--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
//				.click();//-- Save--//
//		Thread.sleep(3000);
//	}
//	@Test(priority =25 , dataProvider = "getUserNameList")
//	public void ETL_CC_028(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(1000);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/span[1]"));
//				Actions actionsClick = new Actions(driver);
//				actionsClick.moveToElement(elementToHoverM).perform();
//				WebElement Connector = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[2]/a[2]/i[1]"));
//				Connector.click();//-- Edit --//
//				Thread.sleep(2000);
//		WebElement Description = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"));
//		Description.clear();//-- Description Clear--//
//		Description.sendKeys("VAT2702");
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
//		Thread.sleep(2000);//-- Modify Button--//
//	}
//	@Test(priority = 26, dataProvider = "getUserNameList")
//	public void ETL_CC_029(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[6]/span[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement ConnectorScript = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[7]/div[2]/a[2]/i[1]"));
//		ConnectorScript.click();//-- Edit --//
//		Thread.sleep(2000);
//		WebElement ScriptDes = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"));
//		ScriptDes.clear();
//		ScriptDes.sendKeys("VAT27");
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(2000);	
//	}
//	@Test(priority = 27, dataProvider = "getUserNameList")
//	public void ETL_CC_030(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector Query
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/span[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement ConnectorQuery = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[2]/a[2]/i[1]"));
//		ConnectorQuery.click();//-- Edit --//
//		Thread.sleep(2000);
//		WebElement QueryDes = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
//		QueryDes.clear();
//		QueryDes.sendKeys("VAT27");
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
//		Thread.sleep(2000);	
//	}
//	@Test(priority = 28, dataProvider = "getUserNameList")
//	public void ETL_CC_034(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --ETL Connector click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);
//		//-- ETL- Connector drop down click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click in Connector--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- Filter column dropdown click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//--Value sendkeys--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("United");
//		//-- Apply Button--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		//-- Filter click in Connector--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//--Value sendkeys--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("abcd");
//		//-- Apply Button--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 29, dataProvider = "getUserNameList")
//	public void ETL_CC_031(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --ETL Connector click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[7]/span[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Query = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[8]/div[2]/a[2]/i[1]"));
//		Query.click();
//		Thread.sleep(2000);
//		WebElement SelectQuery = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"));
//		SelectQuery.click();
//		SelectQuery.clear();
//		SelectQuery.sendKeys("Select * from Vision_users");
//		Thread.sleep(2000);
//		//Validate Button--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(3000);
//		//--Modify Button--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 30, dataProvider = "getUserNameList")
//	public void ETL_CC_032(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);// --ETL Connector click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// --Drop down of Connector
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement ConnectorScript = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/a[2]/i[1]"));
//		ConnectorScript.click();//-- Edit --//
//		Thread.sleep(2000);
//		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]")).clear();
//		WebElement ScriptDes = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"));
//		ScriptDes.clear();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/a[1]/i[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(4000);
//	}
//	@Test(priority = 31, dataProvider = "getUserNameList")
//	public void ETL_CC_023(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --ETL Connector click--//
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --ETL Connector Dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);
//		//-- Dropdown Select to Connector Query--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
//		Thread.sleep(3000);
//		//-- Query Edit Click--//
//		WebElement elementToHoverQuery = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverQuery).perform();
//		WebElement QueryEdit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[2]/a[2]/i[1]"));
//		QueryEdit.click();
//		Thread.sleep(2000);
//		WebElement Query = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"));
//		Query.clear();
//		Query.sendKeys("Select * from VAT_02");
//		Thread.sleep(4000);
//	}
//	@Test(priority = 32, dataProvider = "getUserNameList")
//	public void ETL_CC_024(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --ETL Connector click--//
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --ETL Connector Dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);
//		//-- Connector select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add Connector--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(1000);
//		// --Country click
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
//		//-- Le book dropdown--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Le book select--//
//		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
//		//-- Connector ID sendkeys--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_ETL_001");
//		//-- Description sendkeys--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("VAT_ETL_001");
//		//-- End point type click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- End point type select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
//		//-- Connector type click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Connector select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//-- DB Type click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		//-- DB Type select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
//		Thread.sleep(2000);
//		//-- IP Send keys--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).click();
//		  //-- Take screenshot and save it to a file--//
//        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        //-- save the screenshot --//
//        File destinationFile = new File("ETL_CC_024.png");
//        // Move the screenshot file to the specified destination
//        try {
//            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//            System.out.println(" ETL_CC_024 Screenshot saved to: " + destinationFile.getAbsolutePath());
//        } catch (IOException e) {
//            System.out.println("ETL_CC_024 Failed to save screenshot: " + e.getMessage());
//        }	
//	}
	@Test(priority = 33, dataProvider = "getUserNameList")
	public void ETL_CC_025(String loginName, String loginPwd) throws InterruptedException {
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
		//-- Connector select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Add Connector--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(1000);
		// --Country click
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country Select--//
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		//-- Le book dropdown--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Le book select--//
		driver.findElement(By.xpath("//span[contains(text(),'01 - Emirates NBD Bank PJSC Dubai')]")).click();
		//-- Connector ID sendkeys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_ETL_001");
		//-- Description sendkeys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("VAT_ETL_001");
		//-- End point type click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- End point type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Source & Destination')]")).click();
		//-- Connector type click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Connector select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- DB Type click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		//-- DB Type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(2000);
		//-- IP Send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
	}
	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];
		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}

}
