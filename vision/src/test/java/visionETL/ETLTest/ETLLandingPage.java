package visionETL.ETLTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class ETLLandingPage {
	WebDriver driver;
	private Object target_locations;

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
//	public void ETL_LP_035(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.xpath("//i[contains(text(),'history')]")).click();
//		Thread.sleep(16000);
//	}
//
//	@Test(priority = 2, dataProvider = "getUserNameList")
//	public void ETL_LP_032(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Operation")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[1]/div[1]/a[1]/span[1]/i[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
//				.sendKeys("Terminate");
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 3, dataProvider = "getUserNameList")
//	public void ETL_LP_029(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Dashboard")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/div[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath("//div[contains(text(),'PDF')]")).click();
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 4, dataProvider = "getUserNameList")
//	public void ETL_LP_027(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Dashboard")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'arrow_drop_down')]")).click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[contains(text(),'17')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[contains(text(),'14')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 5, dataProvider = "getUserNameList")
//	public void ETL_LP_026(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Operation")).click();
//		Thread.sleep(5000);
//		WebElement elementToHover = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[12]"));
//	    // Create an instance of Actions class
//	    Actions actions = new Actions(driver);
//	    // Perform mouse hover action on the element
//	    actions.moveToElement(elementToHover).perform();
//	    WebElement logs = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[14]/div[2]/a[2]/i[1]"));
//	    logs.click();
//	    Thread.sleep(5000);
//	}
//	@Test(priority = 6, dataProvider = "getUserNameList")
//	public void ETL_LP_025(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
//				.click();
//		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(priority = 7, dataProvider = "getUserNameList")
//	public void ETL_LP_022(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Operation")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[3]/span[1]/i[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[3]/span[1]/i[1]"))
//				.click();
//		Thread.sleep(2000);
//	}
//	@Test(priority = 8, dataProvider = "getUserNameList")
//	public void ETL_LP_013(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 9, dataProvider = "getUserNameList")
//	public void ETL_LP_014(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Operation")).click();
//		Thread.sleep(1000);
//		Select select = new Select(driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[2]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
//		select.selectByIndex(0);
//		Thread.sleep(3000);
//		select.selectByIndex(2);
//	}
//	@Test(priority = 10, dataProvider = "getUserNameList")
//	public void ETL_LP_018(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Operation")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(priority = 11, dataProvider = "getUserNameList")
//	public void ETL_LP_020(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Operation")).click();
//		Thread.sleep(1000);// --Yet to start
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/span[1]"))
//				.click();
//		Thread.sleep(1000);// --On Hold
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/span[1]"))
//				.click();
//		Thread.sleep(1000);// --In progress
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/span[1]"))
//				.click();
//		Thread.sleep(1000);// --Success
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(1000);// --Errored
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/span[1]"))
//				.click();
//		Thread.sleep(1000);// --Terminated
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/span[1]"))
//				.click();
//	    Thread.sleep(1000);
//	}
//	@Test(priority = 12, dataProvider = "getUserNameList")
//	public void ETL_LP_021(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.linkText("Operation")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/div[1]/label[1]/input[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
//		Thread.sleep(10000);
//	}
//	@Test(priority = 13, dataProvider = "getUserNameList", enabled = false)
//	public void ETL_LP_036(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Feed Date')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Feed Date')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Feed Date')]")).click();
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 14, dataProvider = "getUserNameList")
//	public void ETL_LP_039(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By
//					
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
//				.click();//--Stakeholder Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
//				.click();//--Category Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
//				.click();//--Feed Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
//				.click();//--Current Process Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//		.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
//		.click();//--Connector Global filter
//		Thread.sleep(2000);	
//	}
//	
//	@Test(priority = 15, dataProvider = "getUserNameList")
//	public void ETL_LP_040(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
//				.click();//--Stakeholder Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]"))
//				.click();//--Category Global filter
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//div[contains(text(),'ENTLTS0009_STG - ENTLTS0009_SOC_STG')]"))
//				.click();//--Category Drop down select all (Check box)
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//span[contains(text(),'play_arrow')]"))
//				.click();//--Run Function
//		Thread.sleep(2000);
//	}
//	@Test(priority = 16, dataProvider = "getUserNameList")
//	public void ETL_LP_041(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By
//				.xpath("//span[contains(text(),'Operation')]"))
//				.click();//--Dashboard to Operation
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/span[1]"))
//				.click();//--yet to start
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/span[1]"))
//				.click();//--On Hold
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/span[1]"))
//				.click();//--In Progress
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]/span[1]/*[1]"))
//				.click();//--Success
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/span[1]/span[1]/*[1]"))
//				.click();//--Errored
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/span[1]"))
//				.click();//--Terminated
//		Thread.sleep(2000);
//	
//	}	
//	@Test(priority = 17, dataProvider = "getUserNameList")
//	public void ETL_LP_042(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
//				.click();//--Entity Drop Down
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
//				.click();//--Entity Close
//		Thread.sleep(3000);
//		driver.findElement(By
//				.xpath("//span[contains(text(),'Operation')]"))
//				.click();//--Dashboard to Operation
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
//				.click();//--Entity Drop Down
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]"))
//				.click();//--Entity Close
//		Thread.sleep(2000);
//	}
//	@Test(priority = 18, dataProvider = "getUserNameList")
//	public void ETL_LP_043(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
//				.click();//--EOD Status
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]/span[1]"))
//				.click();//--EOD Status Reset
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
//				.click();//--EOD stat 
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]/span[1]"))
//				.click();//--EOD stat Reset
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
//				.click();//--Table Statistics
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]/span[1]"))
//				.click();//--Table Statistics Reset
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"))
//				.click();//--Errored Feeds
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]/span[1]"))
//				.click();//--Errored Feeds Reset
//		Thread.sleep(2000);	
//	}
//	@Test(priority = 19, dataProvider = "getUserNameList")//--- When Widget is Changed this testcase will get Failed----//
//	public void ETL_LP_044(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/i[1]"))
//				.click();//--Close widget
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//span[contains(text(),'add_circle_outline')]"))
//				.click();//--Add Widget
//		Thread.sleep(5000);
//		driver.findElement(By
//				.xpath("//span[contains(text(),'EOD Error/Terminated')]"))
//				.click();//--Choose Widget
//		Thread.sleep(5000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/i[1]"))
//				.click();//--Close widget
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//span[contains(text(),'add_circle_outline')]"))
//				.click();//--Add Widget
//		Thread.sleep(3000);
//		driver.findElement(By
//				.xpath("//span[contains(text(),'EOD On Hold')]"))
//				.click();//--Choose Widget
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//i[contains(text(),'more_horiz')]"))
//				.click();//--Three horizontal click to Save(Widget Menu)
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//span[contains(text(),'Save')]"))
//				.click();//--Save
//		Thread.sleep(5000);
//	}
//	@Test(priority = 20, dataProvider = "getUserNameList")
//	public void ETL_LP_045(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		//--First Widget for Max screen
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
//		Thread.sleep(2000);//--Max Screen End
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		//--Second Widget for Max screen
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
//		Thread.sleep(2000);//--Max Screen End
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		//--Third Widget for Max screen
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
//		Thread.sleep(2000);//--Max Screen End
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		//--Fourth Widget for Max screen
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Minimize')]")).click();
//		Thread.sleep(2000);//--Max Screen End
//	}
//	@Test(priority = 21, dataProvider = "getUserNameList")
//	public void ETL_LP_046(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/i[1]")).click();
//		Thread.sleep(1000);//--First close widget
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/i[1]")).click();
//		Thread.sleep(1000);//--Second close widget
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/i[1]")).click();
//		Thread.sleep(1000);//--Third close widget
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/i[1]")).click();
//		Thread.sleep(1000);//--Fourth close widget
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		Thread.sleep(3000);//--Reload for Dashboard Widget
//
//	}
//	@Test(priority = 22, dataProvider = "getUserNameList")
//	public void ETL_LP_047(String loginName, String loginPwd) throws InterruptedException {
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
//		driver.findElement(By.xpath("//i[@id='viewList']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]/b[1]")).click();
//		Thread.sleep(1000);//--Connector Drop Down
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[2]/li[1]/a[1]/span[1]/b[1]")).click();
//		Thread.sleep(1000);//-Con, con Script, con query
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]/b[1]")).click();
//		Thread.sleep(1000);//--Close Connector
//	}
//	@Test(priority = 23, dataProvider = "getUserNameList")
//	public void ETL_LP_048(String loginName, String loginPwd) throws InterruptedException {
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
//		WebElement elementToHover = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
//	    // Create an instance of Actions class
//	    Actions actions = new Actions(driver);
//	    // Perform mouse hover action on the element
//	    actions.moveToElement(elementToHover).perform();
//	    WebElement threeDot = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
//	    threeDot.click();
//		Thread.sleep(2000);//-- Three dot Click in Volume Trend--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/div[1]/span[1]")).click();
//		Thread.sleep(2000);//--Chart Type Click--//
//		driver.findElement(By.xpath("//div[contains(text(),'Stack Column 2D Line')]")).click();//-- Chart Type Select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		Thread.sleep(2000);//-- Three dot Click in Volume Trend--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/span[1]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'In Billions')]")).click();
//		Thread.sleep(5000);
//	}
//	@Test(priority = 24, dataProvider = "getUserNameList")
//	public void ETL_LP_049(String loginName, String loginPwd) throws InterruptedException {
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
//		WebElement elementToHover = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
//	    // Create an instance of Actions class
//	    Actions actions = new Actions(driver);
//	    // Perform mouse hover action on the element
//	    actions.moveToElement(elementToHover).perform();
//	    WebElement threeDot = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
//	    threeDot.click();
//		Thread.sleep(2000);//-- Three dot Click in Volume Trend--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/span[1]")).click();//-- Scaling Click--//
//		driver.findElement(By.xpath("//div[contains(text(),'In Billions')]")).click();//-- Scaling Select--//
//		Thread.sleep(5000);
//	}
//	@Test(priority = 25, dataProvider = "getUserNameList")
//	public void ETL_LP_006(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Help Icon--//
//		driver.findElement(By.xpath("//i[contains(text(),'help')]")).click();
//		Thread.sleep(2000);
//		WebElement Userprofile = driver.findElement(By.xpath("//i[contains(text(),'person')]"));
//		Actions actionsprofile = new Actions(driver);
//		actionsprofile.moveToElement(Userprofile).perform();
//		Thread.sleep(5000);	
//	}
//	@Test(priority = 26, dataProvider = "getUserNameList")
//	public void ETL_LP_009(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Help Icon--//
//		driver.findElement(By.xpath("//i[contains(text(),'help')]")).click();
//		Thread.sleep(2000);
//		//-- Help Icon Close Button--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/div[1]/div[1]/span[3]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(priority = 27, dataProvider = "getUserNameList")
//	public void ETL_LP_030(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(7000);
//		//-- Three dot in Volume Trend--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/a[1]/span[1]/i[1]")).click();
//		//-- Sort Button Click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/span[1]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 28, dataProvider = "getUserNameList")
//	public void ETL_LP_034(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Settings Button--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/img[1]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'RA Builds')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'more_horiz')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//		Thread.sleep(4000);	
//	}
//	@Test(priority = 29, dataProvider = "getUserNameList")
//	public void ETL_LP_037(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(4000);
//		//-- Connector Click--//
//		driver.findElement(
//				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
//				.click();
//		Thread.sleep(1000);
//		//-- Connector Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(3000);
//		//-- Dropdown Slect--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//	}
//	@Test(priority = 30, dataProvider = "getUserNameList")
//	public void ETL_LP_023(String loginName, String loginPwd) throws InterruptedException {
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
//		//--Referesh Button--//
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		Thread.sleep(3000);
//		//-- Operation Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);	
//	}
//	@Test(priority = 30, dataProvider = "getUserNameList")
//	public void ETL_LP_028(String loginName, String loginPwd) throws InterruptedException {
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
//		// -- Settings Button--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
//				.click();
//		// -- Templates Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
//		Thread.sleep(2000);
//		// --- template 1 Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/img[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Popup click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(4000);
//		// -- Settings Button--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
//				.click();
//		// -- Templates Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
//		Thread.sleep(2000);
//		// --- template 2 Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/img[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Settings Button--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
//				.click();
//		// -- Templates Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
//		Thread.sleep(2000);
//		// --- template 3 Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/img[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Settings Button--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
//				.click();
//		// -- Templates Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
//		Thread.sleep(2000);
//		// --- template 4 Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/img[1]"))
//				.click();
//		Thread.sleep(4000);
//	}
//	@Test(priority = 31, dataProvider = "getUserNameList")
//	public void ETL_LP_031(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(7000);
//		//-- Operation Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(5000);
////		//-- Date picker close button --Process date--//
////		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[6]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/span[1]")).click();
////		//-- More Filter arrow click--//
////		driver.findElement(By.xpath("//span[contains(text(),'arrow_drop_down')]")).click();
////		Thread.sleep(2000);
////		//--Select date close click--//
////		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/span[1]")).click();
////		//-- End date close Click--//
////		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/span[1]")).click();
////		Thread.sleep(2000);
////		//-- Run Button--//
////		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
////		Thread.sleep(2000);
//		//-- Category close--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]/a[1]")).click();
//		//--Category Click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Category Select--//
//		driver.findElement(By.xpath("//div[contains(text(),'DEV_TEST_01 - dev Test 01 desc')]")).click();
//		//-- Run Button--//
//		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
//		Thread.sleep(5000);
//	}
//	@Test(priority = 32, dataProvider = "getUserNameList")
//	public void ETL_LP_010(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Help icon click--//
//		driver.findElement(By.xpath("//i[contains(text(),'help')]")).click();
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\LandingPage\\ETL_LP_010.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" ETL_LP_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("ETL_LP_010 Failed to save screenshot: " + e.getMessage());
//		}	
//	}
//	@Test(priority = 33, dataProvider = "getUserNameList")
//	public void ETL_LP_050(String loginName, String loginPwd) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		WebElement Login =driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"));
//		Thread.sleep(2000);
//			Login.sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
//	}
//	@Test(priority = 34, dataProvider = "getUserNameList")
//	public void ETL_LP_070(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- 1st dashboard close--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/i[1]")).click();
//		//-- Add click--//
//		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
//		Thread.sleep(2000);
//		//-- Dashboard Select --//
//		driver.findElement(By.xpath("//div[@class='ps ps--active-y']//div[@class='ps-content']//div//span[contains(text(),'EOD Volume Trend')]")).click();
//		//-- Close--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/i[1]")).click();
//		//-- Add click--//
//		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
//		//-- Dashboard select--//
//		driver.findElement(By.xpath("//span[normalize-space()='EOD Error/Terminated']")).click();
//		//-- Widget Menu click--//
//		driver.findElement(By.xpath("//i[contains(text(),'more_horiz')]")).click();
//		//-- Save click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//		Thread.sleep(2000);
//		//-- Referesh Click--//
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		Thread.sleep(2000);
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 35, dataProvider = "getUserNameList")
//	public void ETL_LP_116(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(2000);
//		//-- Add button--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		WebElement Submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
//		String Text = Submit.getText();
//		System.out.println(Text);
//	}
//	@Test(priority = 36, dataProvider = "getUserNameList")
//	public void ETL_LP_063(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(2000);
//		//-- Add button--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(2000);
//		//-- Country click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
//		//-- LE book click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- LE book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- Feed category Click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_FLOW16");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/span[1]/div[1]/label[1]/input[1]")).click();
//		//--Time stamp--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).click();
//		//-- Time reduce--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/virtual-scroller[1]/div[2]")).click();
//		Thread.sleep(2000);
//		WebElement Submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
//		Submit.click();
//		Thread.sleep(15000);
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		//-- Category close--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]/a[1]")).click();
//		//-- Category click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Category select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys("vat_flow16");
//		Thread.sleep(2000);
//		//-- Category click--//
//		driver.findElement(By.xpath("//div[contains(text(),'VAT_FLOW16 - VAT_FLOW16')]")).click();
//		//-- Run click--//
//		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
//		Thread.sleep(3000);
//		//-- Success click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/span[1]/span[1]/*[1]")).click();
//		Thread.sleep(3000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Feed = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-operationdashboard[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/span[1]"));
//		Feed.click();
//		Thread.sleep(2000);
//		String Success= Feed.getText();
//		System.out.println(Success);
//	}
//	@Test(priority = 37, dataProvider = "getUserNameList")
//	public void ETL_LP_066(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(2000);
//		//-- Add button--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(2000);
//		//-- Country click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
//		//-- LE book click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- LE book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- Feed category Click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Feed category sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_CATEGORY_10");
//		//-- Category select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Select All --//
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/div[1]/label[1]/input[1]")).click();
//		//--Time stamp--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).click();
//		//-- Time reduce--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/virtual-scroller[1]/div[2]")).click();
//		Thread.sleep(2000);
//		//-- Submit click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
//		Thread.sleep(10000);
//	}
//	@Test(priority = 38, dataProvider = "getUserNameList")
//	public void ETL_LP_068(String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Operation click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
//		Thread.sleep(2000);
//		//-- Add button--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(2000);
//		//-- Country click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
//		//-- LE book click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- LE book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- Feed category Click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Feed category sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_CATEGORY_11");
//		//-- Category select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Select All --//
//		driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/div[1]/label[1]/input[1]")).click();
//		//--Time stamp--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).click();
//		//-- Time reduce--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/virtual-scroller[1]/div[2]")).click();
//		Thread.sleep(2000);
//		//-- Submit click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
//		Thread.sleep(10000);
//	}
//	@Test(priority = 39, dataProvider = "getUserNameList")
//	public void ETL_LP_096(String loginName, String loginPwd) throws InterruptedException {
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
//		Thread.sleep(2000);
//		//-- Entity dropdown click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]")).click();
//		Actions actions = new Actions(driver);
//		WebElement elementTarget = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
//		actions.moveToElement(elementTarget);
//		WebElement Target = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[2]"));
//		actions.scrollToElement(Target);
//		actions.perform();
//		Target.click();
//		Thread.sleep(3000);
//	}
	@Test(priority = 40, dataProvider = "getUserNameList")//----- Pending----///////
	public void ETL_LP_033(String loginName, String loginPwd) throws InterruptedException {
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
		//--Operation click--//
		driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
		Thread.sleep(2000);
		//-- Add in console--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		//-- Country click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		//-- LE Book click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Le book select--/
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Category click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Category sendkeys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("VAT_CATEGORY_10");
		Thread.sleep(2000);
		//-- Category Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- Feed all click--//
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/div[1]/label[1]/input[1]")).click();
		//--Next schedule date click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")).click();
		//-- Time reduce--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/dp-date-picker[1]/div[2]/div[1]/dp-day-time-calendar[1]/dp-time-select[1]/ul[1]/li[1]/button[2]")).click();
		//-- Submit Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		//-- Reload Button--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		//-- Category Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]")).click();
		//--close button--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]/a[1]")).click();
		//-- Sendkeys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys("VAT_CATEGORY_1");
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//div[contains(text(),'VAT_CATEGORY_1 - VAT_Category_1')]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(2000);
		//-- Run click--//
		driver.findElement(By.xpath("//span[contains(text(),'play_arrow')]")).click();
		Thread.sleep(3000);
		//-- Terminate click--//
		driver.findElement(By.xpath("//i[contains(text(),'do_not_disturb_alt')]")).click();
		//-- Reload Button--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
		
	}
	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
