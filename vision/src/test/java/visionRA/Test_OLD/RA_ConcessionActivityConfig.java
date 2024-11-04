package visionRA.Test_OLD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RA_ConcessionActivityConfig {
	WebDriver driver;

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

//	@Test(dataProvider = "loginCredentials", priority = 1)
//	public void CON_AC_001(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// -- Concession Activity Config Click--//
//		//-- Add --//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();
//		Thread.sleep(2000);
//		// --Activity ID send keys--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("VAT2702");
//		// --Description --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("VAT2702");
//		Thread.sleep(2000);
//		// --Transline ID Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Transline ID Select
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"))
//				.click();
//		// --Activity Source Table Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// --Activity Source Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Aggregation Function Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// --Aggregation Function Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Aggregation Cloumn CLick--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Aggregation Cloumn Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Time Series Click--// 
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--Time Series Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//-- Activity Type Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Activity Type Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Sort Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[3]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Sort Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--Range From--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")).sendKeys("10");
//		//--Range To--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[2]/input[1]")).sendKeys("15");
//		//--LHS Filter Table Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--LHS Filter Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- LHS Filter Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- LHS Filter Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--Condition Operation Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--Condition Operation Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		//-- RHS Filter Table Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- RHS Filter Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--RHS Filter Column Click--//
//		Thread.sleep(2000);			
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- RHS Filter Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Save--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 2)
//	public void CON_AC_002(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// -- Concession Activity Config Click--//
//		//-- Add --//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[2]/input[1]")).sendKeys("15");
//		//--LHS Filter Table Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--LHS Filter Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- LHS Filter Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- LHS Filter Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--Condition Operation Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--Condition Operation Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		//-- RHS Filter Table Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- RHS Filter Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--RHS Filter Column Click--//
//		Thread.sleep(2000);			
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- RHS Filter Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 3)
//	public void CON_AC_003(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// -- Concession Activity Config Click--//
//		//-- Add --//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();
//		Thread.sleep(2000);
//		// --Activity ID send keys--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("VAT2702");
//		// --Description --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("VAT2702");
//		Thread.sleep(2000);
//		// --Transline ID Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Transline ID Select
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"))
//				.click();
//		// --Activity Source Table Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// --Activity Source Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		// -- Aggregation Function Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		// --Aggregation Function Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Aggregation Cloumn CLick--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Aggregation Cloumn Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Time Series Click--// 
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--Time Series Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//-- Activity Type Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Activity Type Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- Sort Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[3]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Sort Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--Range From--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")).sendKeys("10");
//		//--Range To--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[2]/input[1]")).sendKeys("15");
//		//--LHS Filter Table Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--LHS Filter Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- LHS Filter Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- LHS Filter Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--Condition Operation Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--Condition Operation Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();
//		//-- RHS Filter Table Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- RHS Filter Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--RHS Filter Column Click--//
//		Thread.sleep(2000);			
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- RHS Filter Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//--Filter column --//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//--Filter Table Click-//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Filter Table Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- Filter Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Filter Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		//-- Condition Operation--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Condition Operation Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
//		//-- COndition Value--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")).click();	
//		//-- Condition Value Popup--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[1]")).sendKeys("VAT");
//		//-- Condition Value apply--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
//		Thread.sleep(3000);	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 4)
//	public void CON_AC_004(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// -- Concession Activity Config Click--//
//		//-- Add --//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();
//		Thread.sleep(2000);
//		// --Activity ID send keys--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("VAT2802");
//		// --Description --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("VAT2802");
//		Thread.sleep(2000);
//		// --Transline ID Click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);
		//-- Search Button in Transline ID--//
//		 WebElement Search = driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
//		 Search.sendKeys("asdf");
//		 driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")).click();
//		 Thread.sleep(2000);
//		 Search.clear();
//		 driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")).click();
//		 Search.sendKeys("Testt");
//		 driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[1]/a[1]/i[1]")).click();
//		 Thread.sleep(3000);	 
//	}
//	@Test(dataProvider = "loginCredentials", priority = 5)
//	public void CON_AC_005(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// -- Concession Activity Config Click--//
//		//-- Filter Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/span[1]/i[1]")).click();
//		//-- Filter Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		//-- Filter Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
//		//-- Filter Value--//								
//		WebElement FilterValue = driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"));
//		FilterValue.sendKeys("VAT");
//		//-- Apply--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[3]/button[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/span[1]/i[1]")).click();
//		//-- Filter Reset--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[3]/button[2]")).click();
//		Thread.sleep(2000);
//		//-- Filter Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/span[1]/i[1]")).click();
//		//-- Filter Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		//-- Filter Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
//		//--Filter Criteria--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//		//-- Filter Criteria Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Reject");
//		//-- Apply--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[3]/button[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/span[1]/i[1]")).click();
//		//-- Filter Reset--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[3]/button[2]")).click();
//		Thread.sleep(2000);
//		//-- Filter Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/span[1]/i[1]")).click();
//		//-- Filter Column Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		//-- Filter Column Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]")).click();
//		//-- Filter Value--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[3]/button[1]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 6)
//	public void CON_AC_006(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// -- Concession Activity Config Click--//
//		//-- Referesh Button--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[3]/span[1]/i[1]")).click();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 7)
//	public void CON_AC_007(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(username);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(3000);// -- Concession Activity Config Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[4]/span[1]/i[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[contains(text(),'fullscreen')]")).click();
//		Thread.sleep(2000);
//	}
	@Test(dataProvider = "loginCredentials", priority = 8)
	public void CON_AC_008(String username, String password) throws InterruptedException {
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
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);// -- Concession Activity Config Click--//
		//-- Edit Button Clcik--/
		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/span[1]"));
				Actions actionsClick = new Actions(driver);
				actionsClick.moveToElement(elementToHoverM).perform();
				WebElement ActivityEdit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/a[2]/i[1]"));
				ActivityEdit.click();
				Thread.sleep(3000);
		// --Description --//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys("Edit");
		Thread.sleep(3000);
		// --Activity Source Table Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// --Activity Source Table Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		//-- Aggregate Column Click--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Aggregate Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Sort Column CLick--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[3]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Sort Column Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		//-- Modify Button--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-activity[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
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
