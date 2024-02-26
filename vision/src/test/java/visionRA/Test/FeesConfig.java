package visionRA.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FeesConfig {
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

	@Test(dataProvider = "loginCredentials", priority = 1)
	public void VAT_FEE_DC_001(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(2000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();// -- Effective Date Btton click--//
		driver.findElement(By.xpath(
				"//body/div[2]/div[1]/dp-day-time-calendar[1]/dp-day-calendar[1]/div[1]/div[1]/div[3]/button[2]"))
				.click();// -- Effective date Select--//
		Thread.sleep(5000);
	}
	@Test(dataProvider = "loginCredentials", priority = 2)
	public void VAT_FEE_DC_002(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(2000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(2000);// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(2000);// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]"))
				.click();
		Thread.sleep(2000);// -- Fee Type dropdown Select--//
	}
	@Test(dataProvider = "loginCredentials", priority = 3)
	public void VAT_FEE_DC_002_01(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(2000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);//--- Fees BAsis dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		Thread.sleep(2000);//--- Fees BAsis dropdown Select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);//--- Fees BAsis dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(2000);//--- Fees BAsis dropdown Select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);//--- Fees BAsis dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Unit x Sub Count')]")).click();
		Thread.sleep(2000);//--- Fees BAsis dropdown Select--//
	}
	@Test(dataProvider = "loginCredentials", priority = 4)
	public void VAT_FEE_DC_003(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(2000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);//-- Tier Range type drop down--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);//-- Tier Range type drop down Select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);//-- Tier Range type drop down--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(2000);//-- Tier Range type drop down Select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);//-- Tier Range type drop down--//
		driver.findElement(By.xpath("//span[contains(text(),'Tenor based on duration (End Date-Start Date)')]")).click();
		Thread.sleep(2000);//-- Tier Range type drop down Select--//
	}
	@Test(dataProvider = "loginCredentials", priority = 5)
	public void VAT_FEE_DC_004(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(2000);// -- Fees Config Button Click--//
		
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();// -- add button--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- Channel type dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();// --- Channel type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]"))
				.click();// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// --buusiness vertical dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();// -- business vertical select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();// --customer id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();// -- customer id
																								// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();// -- contract id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();// -- contract id select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[8]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// --product type dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Loan Account')]")).click();// --product type dropdown
																						// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[9]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- product description dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'03001 - Home Mortgage Loan')]")).click();// -- product
																										// description
																										// dropdown
																										// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[18]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- transaction currency--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();// -- transaction currency select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- posting currency--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]"))
				.click();
		Thread.sleep(2000);// -- posting currency select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// -- currency conversion type --//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();// -- currency converssiont select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- look up amount type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);// -- look up amount type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// -- percentage amount type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);// -- percentage amount type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();// -- Interest basis--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");// -- Interest basis--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- round of basis dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();// -- round of basis dropdown select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- fee basis dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();// -- fee basis select--//
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 6)
	public void VAT_FEE_DC_005(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(2000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();// -- add button--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- Channel type dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();// --- Channel type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]"))
				.click();// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// --buusiness vertical dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();// -- business vertical select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();// --customer id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();// -- customer id
																								// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();// -- contract id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();// -- contract id select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[8]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// --product type dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Loan Account')]")).click();// --product type dropdown
																						// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[9]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- product description dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'03001 - Home Mortgage Loan')]")).click();// -- product
																										// description
																										// dropdown
																										// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[18]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- transaction currency--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();// -- transaction currency select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- posting currency--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]"))
				.click();
		Thread.sleep(2000);// -- posting currency select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// -- currency conversion type --//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();// -- currency converssiont select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- look up amount type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);// -- look up amount type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// -- percentage amount type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);// -- percentage amount type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();// -- Interest basis--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");// -- Interest basis--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- round of basis dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();// -- round of basis dropdown select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- fee basis dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();// -- fee basis select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("0.00");// -- min fee amount--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(2000);
	}
	@Test(dataProvider = "loginCredentials", priority = 7)
	public void VAT_FEE_DC_006(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(2000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();// -- add button--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- Channel type dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();// --- Channel type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]"))
				.click();// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// --buusiness vertical dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();// -- business vertical select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();// --customer id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();// -- customer id
																								// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();// -- contract id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();// -- contract id select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[8]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// --product type dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Loan Account')]")).click();// --product type dropdown
																						// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[9]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- product description dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'03001 - Home Mortgage Loan')]")).click();// -- product
																										// description
																										// dropdown
																										// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[18]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- transaction currency--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();// -- transaction currency select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- posting currency--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]"))
				.click();
		Thread.sleep(2000);// -- posting currency select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// -- currency conversion type --//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();// -- currency converssiont select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- look up amount type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);// -- look up amount type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// -- percentage amount type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);// -- percentage amount type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();// -- Interest basis--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");// -- Interest basis--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- round of basis dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();// -- round of basis dropdown select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- fee basis dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();// -- fee basis select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("123.00");// -- min fee amount--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(3000);
		 Actions actions = new Actions(driver);
	        WebElement element = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
	        actions.moveToElement(element);
	        WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
	        actions.scrollToElement(FromAmount);
	        actions.perform();
	        Thread.sleep(5000);
			driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
	        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();//-- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");//---From Account Sendkeys--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();//-- To Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("3456789");//---To Account Sendkeys--//
		Thread.sleep(3000);	
	}
	@Test(dataProvider = "loginCredentials", priority = 8)
	public void VAT_FEE_DC_007(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(2000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();// -- add button--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- Channel type dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();// --- Channel type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- Channel type dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();// --- Channel type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- Channel type dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]")).click();// --- Channel type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]"))
				.click();// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// channel code dropdown--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Internet Banking')]"))
				.click();// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// channel code dropdown--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[8]"))
				.click();// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// --buusiness vertical dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();// -- business vertical select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// --buusiness vertical dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Premier Banking')]")).click();// -- business vertical select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// --buusiness vertical dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Corporate Banking')]")).click();// -- business vertical select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();// --customer id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();// -- customer id
																								// select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();// --customer id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'100009')]")).click();// -- customer id
																								// select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();// --customer id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();// -- customer id
																								// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();// -- contract id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();// -- contract id select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();// -- contract id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'1002330244')]")).click();// -- contract id select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();// -- contract id click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'1003200029')]")).click();// -- contract id select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[8]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// --product type dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Loan Account')]")).click();// --product type dropdown
																						// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[9]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- product description dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'03001 - Home Mortgage Loan')]")).click();// -- product
																										// description
																										// dropdown
																										// select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[9]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- product description dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]")).click();// -- product
																										// description
																										// dropdown
																										// select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[9]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- product description dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'03009 - Education Loan')]")).click();// -- product
																										// description
																										// dropdown
																										// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[18]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- transaction currency--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();// -- transaction currency select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- posting currency--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]"))
				.click();
		Thread.sleep(2000);// -- posting currency select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// -- currency conversion type --//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();// -- currency converssiont select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000); // -- look up amount type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);// -- look up amount type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(2000);// -- percentage amount type--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);// -- percentage amount type select--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();// -- Interest basis--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");// -- Interest basis--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- round of basis dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();// -- round of basis dropdown select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();// -- fee basis dropdown--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();// -- fee basis select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("123.00");// -- min fee amount--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(3000);
		 Actions actions = new Actions(driver);
	        WebElement element = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
	        actions.moveToElement(element);
	        WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
	        actions.scrollToElement(FromAmount);
	        actions.perform();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();//-- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");//---From Account Sendkeys--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();//-- To Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("3456789");//---To Account Sendkeys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("25");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]/div[1]")).click();
		Actions actions1 = new Actions(driver);
        WebElement element1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
        actions1.moveToElement(element1);
        WebElement FromAmount1 = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        actions.scrollToElement(FromAmount1);
        actions.perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).clear();//-- From Amount Clear--//
	driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("3456789");//---From Account Sendkeys--//
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();//-- To Amount Clear--//
	driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("4567890");//---To Account Sendkeys--//
	driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).sendKeys("50");
	 Thread.sleep(5000);	
	}
//	@Test(dataProvider = "loginCredentials", priority = 9)//-- Unable to Proceed further to amount is clearing--//
//	public void VAT_FEE_DC_013(String username, String password) throws InterruptedException {
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);// -- MAster Config Dropdown Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);// --- TransLine Config
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
//				.click();// --Edit Button click--//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
//		Thread.sleep(2000);// -- Fees Config Button Click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();//-- Fee Tyype dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();//-- Fee Tyype dropdown Select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]")).click();///-- Add button in fee config--//
//		 Actions actions = new Actions(driver);
//	        WebElement element = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
//	        actions.moveToElement(element);						
//	        WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
//	        actions.scrollToElement(FromAmount);
//	        actions.perform();
//	        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();//-- From Amount Clear--//
//			driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");//---From Account Sendkeys--//
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();
//			driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("100000");//-- To Amount--//
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();//--Fee Basis dropdown--//
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();//--Fee Basis dropdown Select--//
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("100000");//-- To Amount--//
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("25");//--Fee amount / Percentage--//
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]/div[1]")).click();//--- Add in fee config records--//
//			Thread.sleep(3000);
////			   WebElement element1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
////		        actions.moveToElement(element1);						
////		        WebElement FromAmount1 = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
////		        actions.scrollToElement(FromAmount1);
////		        actions.perform();
//	}
	@Test(dataProvider = "loginCredentials", priority = 10)
	public void VAT_FEE_DC_024(String username, String password) throws InterruptedException {
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
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[5]/a[1]/i[1]"))
				.click();// --Edit Button click--//
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[33]/div[1]/div[1]/a[3]//i[conitains(text(),'delete')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(3000);
	}
	
	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
