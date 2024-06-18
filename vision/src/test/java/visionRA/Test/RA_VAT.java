package visionRA.Test;

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

public class RA_VAT {
	WebElement TransDesc;
	WebElement BusinessDesc;
	String VAT_ID = "RA_VAT";
	WebDriver driver;
	String username1 = "System";
	String password1 = "Vision@123";
	int priority = 1;
	String Rule_priority = Integer.toString(priority);
	int recondays = 20;
	String Recon_days = Integer.toString(recondays);
	int Fee = 10;
	String FeePercentage = Integer.toString(Fee);
	
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
//		@Test(dataProvider = "loginCredentials", priority = 1)
//		public void RA_VAT_001(String username, String password) throws InterruptedException {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//					.sendKeys(username);
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//					.sendKeys(password);
//			Thread.sleep(2000);
//			driver.findElement(By
//					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//					.click();
//			Thread.sleep(5000);
//			// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);
//			// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);
//			//--Transline click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//			Thread.sleep(2000);
//			//-- add click--//
//			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//			//-- Transline Id send keys--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys(VAT_ID);
//			//--Transline desc--//
//			TransDesc = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"));TransDesc.sendKeys(VAT_ID);
//			//-- product line type click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")).click();
//			Thread.sleep(2000);
//			//--product line type select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Asset')]")).click();
//			//-- Transline group click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Transline group select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
//			//-- Business vertical click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")).click();
//			Thread.sleep(2000);
//			//-- Business vertical select--//
//			driver.findElement(By.xpath("//div[contains(text(),'Personal Banking')]")).click();
//			//-- Extraction frequency--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]")).click();
//			Thread.sleep(2000);
//			//-- Extraction frequency select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Monthly')]")).click();
//			//-- Product type click---//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Product type select--//
//			driver.findElement(By.xpath("//span[contains(text(),'LAA - Loan Account')]")).click();
//			//-- Product description--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- product description select--//
//			driver.findElement(By.xpath("//span[contains(text(),'03008 - Personal Loan')]")).click();
//			//-- Currency click--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Currency select--//
//			driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
//			Thread.sleep(2000);
//			//-- Save click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//			Thread.sleep(5000);
//		}
//		@Test(priority = 2)
//		public void RA_VAT_002() throws InterruptedException {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//					.sendKeys(username1);
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//					.sendKeys(password1);
//			Thread.sleep(2000);
//			driver.findElement(By
//					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//					.click();
//			Thread.sleep(5000);
//			// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);
//			// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);
//			//--Transline click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//			Thread.sleep(2000);
//			//-- Filter click--//
//			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//			//-- Column click--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Column select--//
//			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//			//-- Value send keys--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_ID);
//			//-- Apply click--//
//			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//			Thread.sleep(2000);
//			WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'RA_VAT / RA_VAT')]"));
//			Actions actionsClick = new Actions(driver);
//			actionsClick.moveToElement(elementToHoverM).perform();
//			WebElement Transline = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[4]/i[1]"));
//			Transline.click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//			Thread.sleep(3000);
//		}
//	 @Test(dataProvider = "loginCredentials", priority = 3)
//		public void RA_VAT_003(String username, String password) throws InterruptedException {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//					.sendKeys(username);
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//					.sendKeys(password);
//			Thread.sleep(2000);
//			driver.findElement(By
//					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//					.click();
//			Thread.sleep(5000);
//			// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);
//			// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);
//			//--Transline click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//			Thread.sleep(2000);
//			WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'RA_VAT / RA_VAT')]"));
//			Actions actionsClick = new Actions(driver);
//			actionsClick.moveToElement(elementToHoverM).perform();
//			WebElement TranslineEdit = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"));
//			TranslineEdit.click();
//			Thread.sleep(3000);
//			//-- Business line click--//
//			driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
//			//-- Business line send keys--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(VAT_ID);
//			BusinessDesc = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"));BusinessDesc.sendKeys(VAT_ID);
//			Thread.sleep(2000);
//			//--business line type click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Business line type select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Expense')]")).click();
//			//-- Income expense type--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Income select--//
//			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//			driver.findElement(By.xpath("//span[contains(text(),'Details')]")).click();
//			Thread.sleep(2000);
//			// --Service Type Dropdown--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//					.click();
//			Thread.sleep(2000);
//			// --Service type dropdown Select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Loan Account')]")).click();
//			// Service Description dropdown--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();// --																								
//			Thread.sleep(2000);
//			// -- Service Description drop down Select--//
//			driver.findElement(By.xpath("//span[contains(text(),'03008 - Personal Loan')]")).click();
//			Thread.sleep(3000);
//			// --Currency dropdown--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			// -- Currency Select--//
//			driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
//			Thread.sleep(3000);
//			// --GL Code Click--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
//			Thread.sleep(2000);
//			// --- GL Code Seleect---//
//			driver.findElement(By.xpath(
//					"//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"))
//					.click();
//			Thread.sleep(3000);
//			// -- Account number click--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]")).click();
//			Thread.sleep(2000);
//			// -- Account number select--//
//			driver.findElement(By.xpath("//td[contains(text(),'01110011')]")).click();
//			Thread.sleep(2000);
//			//-- Reccon rule cick--//
//			driver.findElement(By.xpath("//span[contains(text(),'Recon Rule')]")).click();
//			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).sendKeys(Rule_priority);
//			Thread.sleep(2000);
//			//--Rule ID click--//
//			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//					.click();
//			Thread.sleep(2000);
//			//--Rule id Select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Contract Wise')]")).click();		
//			//-- Recon type--//
//			driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//					.click();
//			Thread.sleep(2000);
//			//-- Recon type Select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Recon Backdated')]")).click();
//			//-- Recon method--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//					.click();
//			Thread.sleep(2000);
//			//-- Recon method select--//
//			driver.findElement(By.xpath("//span[contains(text(),'First In First Out')]")).click();
//			//-- //-- Recon grace days--//
//			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")).sendKeys(Recon_days);
//			Thread.sleep(2000);
//			// -- Save--//
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//					.click();
//			Thread.sleep(3000);
//	 }
//		@Test(priority = 4)
//		public void RA_VAT_004() throws InterruptedException {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//					.sendKeys(username1);
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//					.sendKeys(password1);
//			Thread.sleep(2000);
//			driver.findElement(By
//					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//					.click();
//			Thread.sleep(5000);
//			// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);
//			// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);
//			//--Transline click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//			Thread.sleep(2000);
//			//-- Filter click--//
//			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//			//-- Column click--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Column select--//
//			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//			//-- Value send keys--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_ID);
//			//-- Apply click--//
//			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//			Thread.sleep(2000);
//			WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]/span[1]"));
//			Actions actionsClick = new Actions(driver);
//			actionsClick.moveToElement(elementToHoverM).perform();
//			WebElement Business = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[4]/i[1]"));
//			Business.click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//			Thread.sleep(3000);
//		}
//	 @Test(dataProvider = "loginCredentials", priority = 5)
//		public void RA_VAT_005(String username, String password) throws InterruptedException {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//					.sendKeys(username);
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//					.sendKeys(password);
//			Thread.sleep(2000);
//			driver.findElement(By
//					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//					.click();
//			Thread.sleep(5000);
//			// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);
//			// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);
//			//--Transline click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//			Thread.sleep(2000);
//			WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'RA_VAT / RA_VAT')]"));
//			Actions actionsClick = new Actions(driver);
//			actionsClick.moveToElement(elementToHoverM).perform();
//			WebElement TranslineEdit = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"));
//			TranslineEdit.click();
//			Thread.sleep(3000);
//			//-- Business line click--//
//			driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
//			//-- Fees config click--//
//			driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
//			Thread.sleep(2000);
//			 //-- Fee type dropdown--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Fee type select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Range')]")).click();
//			//-- Fee basis click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Fee basis select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
//			//-- Add row click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
//			Thread.sleep(2000);
//			//-- Channel type click--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Channel type select--//
//			driver.findElement(By.xpath("//span[contains(text(),'Internet Banking')]")).click();
//			Actions actions = new Actions(driver);
//			WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
//			actions.moveToElement(elementTarget);
//			WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]"));
//			actions.scrollToElement(Target);
//			actions.perform();
//			Target.click();
//			Target.sendKeys(FeePercentage);
//			//-- Apply click--//
//			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//			Thread.sleep(3000);
//			//--preferential click--//
//			driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//			Thread.sleep(3000);
//			//-- Add row click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]/i[1]")).click();
//			Thread.sleep(2000);
//			Actions actions1 = new Actions(driver);
//			WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
//			actions1.moveToElement(elementTarget1);
//			WebElement Target1 = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]"));
//			actions1.scrollToElement(Target1);
//			actions1.perform();
//			Target1.click();
//			Target1.sendKeys(FeePercentage);
//			//-- Apply click--//
//			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//			Thread.sleep(2000);
//			//--save click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
//			Thread.sleep(3000);
//	 }
//		@Test(priority = 6)
//		public void RA_VAT_006() throws InterruptedException {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//					.sendKeys(username1);
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//					.sendKeys(password1);
//			Thread.sleep(2000);
//			driver.findElement(By
//					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//					.click();
//			Thread.sleep(5000);
//			// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);
//			// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);
//			//--Transline click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//			Thread.sleep(2000);
//			//-- Filter click--//
//			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//			//-- Column click--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Column select--//
//			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//			//-- Value send keys--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_ID);
//			//-- Apply click--//
//			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//			Thread.sleep(2000);
//			WebElement elementToHoverM = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[3]"));
//			Actions actionsClick = new Actions(driver);
//			actionsClick.moveToElement(elementToHoverM).perform();
//			WebElement Fees = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/a[4]/i[1]"));
//			Fees.click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//			Thread.sleep(3000);
//		}
//	 @Test(dataProvider = "loginCredentials", priority = 7)
//		public void RA_VAT_007(String username, String password) throws InterruptedException {
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//					.sendKeys(username);
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//					.sendKeys(password);
//			Thread.sleep(2000);
//			driver.findElement(By
//					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//					.click();
//			Thread.sleep(5000);
//			// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);
//			// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);
//			//--Transline click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//			Thread.sleep(2000);
//			//-- Filter click--//
//			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//			//-- Column click--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Column select--//
//			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//			//-- Value send keys--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_ID);
//			//-- Apply click--//
//			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//			Thread.sleep(2000);
//			WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'RA_VAT / RA_VAT')]"));
//			Actions actionsClick = new Actions(driver);
//			actionsClick.moveToElement(elementToHoverM).perform();
//			WebElement TranslineEdit = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"));
//			TranslineEdit.click();
//			Thread.sleep(2000);
//			WebElement TransDesc= driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"));
//			TransDesc.clear();
//			TransDesc.sendKeys(VAT_ID);
//			//-- Modify click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//			Thread.sleep(2000);
//			//-- Review button--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[3]")).click();
//			Thread.sleep(2000);
//			//-- Review close--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-review[1]/div[1]/a[1]/i[1]")).click();
//			//-- Reject Click--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
//			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//			Thread.sleep(3000);
//			//-- Filter click--//
//			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//			//-- Column click--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			//-- Column select--//
//			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//			//-- Value send keys--//
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_ID);
//			//-- Apply click--//
//			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//			Thread.sleep(2000);
//			WebElement elementToHoverM1 = driver.findElement(By.xpath("//span[contains(text(),'RA_VAT / RA_VAT')]"));
//			Actions actionsreview = new Actions(driver);
//			actionsreview.moveToElement(elementToHoverM1).perform();
//			WebElement TranslineReview = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[6]/i[1]"));
//			TranslineReview.click();
//			Thread.sleep(2000);
//	 } 
//	 @Test(dataProvider = "loginCredentials", priority = 8)
//		public void RA_VAT_008(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//--Transline click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//-- Value send keys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_ID);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement BusinessEdit = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/i[1]"));
//		BusinessEdit.click();
//		Thread.sleep(2000);
//		//-- Business line column click--//
//		driver.findElement(By.xpath("//td[contains(text(),'TESTB111')]")).click();
//		Thread.sleep(2000);
//		//-- Modify click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverBU = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]"));
//		Actions actionsClick1 = new Actions(driver);
//		actionsClick1.moveToElement(elementToHoverBU).perform();
//		WebElement BusinessLineReview = driver.findElement(By.xpath("//i[contains(text(),'fact_check')]"));
//		BusinessLineReview.click();
//		Thread.sleep(5000);
//		//-- Review close--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-review[1]/div[1]/a[1]/i[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverB = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]"));
//		Actions actionsClick2 = new Actions(driver);
//		actionsClick2.moveToElement(elementToHoverB).perform();
//		WebElement BusinessLineReject = driver.findElement(By.xpath("//i[contains(text(),'do_not_disturb_alt')]"));
//		BusinessLineReject.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(3000);
//	 }
//	 @Test(dataProvider = "loginCredentials", priority = 8)
//		public void RA_VAT_008(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//--Transline click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		//-- Value send keys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_ID);
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverB = driver.findElement(By.xpath("//span[contains(text(),'RA_VAT1 / RA_VAT1')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverB).perform();
//		WebElement BusinessDelete = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/a[4]/i[1]"));
//		BusinessDelete.click();
//		Thread.sleep(2000);
//		//-- Delete yes click--//
//		WebElement Yes = driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[2]/button[1]"));
//		Yes.click();
//		Thread.sleep(3000);
//	 }
	 @Test(dataProvider = "loginCredentials", priority = 8)
		public void RA_VAT_008(String username, String password) throws InterruptedException {
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
		// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- MAster Config Dropdown Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(2000);
		//--Transline click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		//-- Column click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_ID);
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverB = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[4]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverB).perform();
		WebElement FeesEdit = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/a[1]/i[1]"));
		FeesEdit.click();
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
