package visionETLGP.ETLTest;

import org.openqa.selenium.By;
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
////	@Test(priority = 5, dataProvider = "getUserNameList") ////// To Be Coded For downloading Logs
////	public void ETL_LP_026(String loginName, String loginPwd) throws InterruptedException {
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
////		driver.findElement(By.linkText("Operation")).click();
////		Thread.sleep(5000);
////		WebElement logs = driver.findElement(By.xpath("//tbody/tr[@id='highLightRow0']/td[14]/div[2]/a[2]/i[1]"));
////		Actions actions = new Actions(driver);
////		actions.moveToElement(logs).perform();
////		logs.click();
////		Thread.sleep(3000);
////	}
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
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//		Thread.sleep(10000);
//	}
//	@Test(priority = 13, dataProvider = "getUserNameList")
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
//		Thread.sleep(1000);
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
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//				.click();//--Stakeholder Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]"))
//				.click();//--Category Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//				.click();//--Feed Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//				.click();//--Current Process Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//		.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
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
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//				.click();//--Stakeholder Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]"))
//				.click();//--Category Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]"))
//				.click();//--Category Drop down select all (Check box)
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//				.click();//--Feed Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]"))
//				.click();//--Feed Drop down select all (Check box)
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//				.click();//--Current Process Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]"))
//				.click();//--Current Process Drop down select all (Check box)
//		driver.findElement(By
//		.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//		.click();//--Connector Global filter
//		Thread.sleep(1000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]"))
//				.click();//--Connector Drop down select all (Check box)
//		Thread.sleep(1000);
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
	@Test(priority = 19, dataProvider = "getUserNameList")//--- When Widget is Changed this testcase will get Failed----//
	public void ETL_LP_044(String loginName, String loginPwd) throws InterruptedException {
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
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[1]/div[1]/div[1]/div[2]/i[1]"))
				.click();//--Close widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'add_circle_outline')]"))
				.click();//--Add Widget
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//span[contains(text(),'EOD Volume Trend')]"))
				.click();//--Choose Widget
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[2]/i[1]"))
				.click();//--Close widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'add_circle_outline')]"))
				.click();//--Add Widget
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]"))
				.click();//--Choose Widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[3]/div[1]/div[1]/div[2]/i[1]"))
				.click();//--Close widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'add_circle_outline')]"))
				.click();//--Add Widget
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//span[contains(text(),'Table Statistics')]"))
				.click();//--Choose Widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-pilot[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/app-template-gridster[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/gridster[1]/gridster-item[4]/div[1]/div[1]/div[2]/i[1]"))
				.click();//--Close widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'add_circle_outline')]"))
				.click();//--Add Widget
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'Errored Feeds')]"))
				.click();//--Choose Widget
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//i[contains(text(),'more_horiz')]"))
				.click();//--Three horizontal click to Save(Widget Menu)
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[contains(text(),'Save')]"))
				.click();//--Save
		Thread.sleep(5000);
	}
	@Test(priority = 20, dataProvider = "getUserNameList")
	public void ETL_LP_045(String loginName, String loginPwd) throws InterruptedException {
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
	public void ETL_LP_046(String loginName, String loginPwd) throws InterruptedException {
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
	public void ETL_LP_047(String loginName, String loginPwd) throws InterruptedException {
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
		driver.findElement(By.xpath("//i[@id='viewList']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]/b[1]")).click();
		Thread.sleep(10);//--Connector Drop Down
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[2]/li[1]/a[1]/span[1]/b[1]")).click();
		Thread.sleep(10);//-Con, con Script, con query
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]/b[1]")).click();
		Thread.sleep(10);//--Close Connector
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]/b[1]")).click();
		Thread.sleep(10);//--Category Drop Down
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[2]/li[1]/a[1]")).click();
		Thread.sleep(10);//--category
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]/b[1]")).click();
		Thread.sleep(10);//--Close Category
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]/b[1]")).click();
		Thread.sleep(10);//--Feed Configuration Drop Down  
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[2]/li[1]/a[1]")).click();
		Thread.sleep(10);//--feed configuration
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]/b[1]")).click();
		Thread.sleep(10);//--Feed configuration close
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[1]/div[1]/button[1]/i[1]")).click();
		Thread.sleep(10);//--Back to its Initial stage
//		driver.findElement(By.xpath("")).click();
//		Thread.sleep(2000);//--
	}
	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
