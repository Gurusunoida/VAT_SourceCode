package visionRA.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RA_FeesConfig extends BaseClass {
	
	String VAT = "VAT1604";

	@Test(dataProvider = "loginCredentials", priority = 1)
	public void VAT_FEE_DC_001(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		// -- Criteria click--/
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		// -- Criteria select--//
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		//-- Edit click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
		Thread.sleep(3000);
		// -- Business Line Config click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();// -- Effective Date Btton click--//
		driver.findElement(By.xpath(
				"//body/div[2]/div[1]/dp-day-time-calendar[1]/dp-day-calendar[1]/div[1]/div[1]/div[3]/button[2]"))
				.click();// -- Effective date Select--//
		Thread.sleep(3000);
	}

	@Test(dataProvider = "loginCredentials", priority = 2)
	public void VAT_FEE_DC_002(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Flat')]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Slab')]"))
				.click();
		Thread.sleep(5000);
	}

	@Test(dataProvider = "loginCredentials", priority = 2)
	public void VAT_FEE_DC_002_01(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
						.click();
				Thread.sleep(5000);
				// -- MAster Config Dropdown Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
						.click();
				Thread.sleep(5000);
				// --- TransLine Config--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(4000);
				// -- Edit Button in Manin screen of Trans Line--//
						// -- Filter click--//
						driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
						// -- Filter column click--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
								.click();
						Thread.sleep(5000);
						// -- Filter Column select--//
						driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
						// -- Criteria click--/
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
								.click();
						// -- Criteria select--//
						driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
						// -- Value sendkeys--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(5000);
				//-- Add in Fees --//
				driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
				Thread.sleep(5000);
		
		// --- Fees BAsis dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Per Unit')]"))
				.click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// --- Fees BAsis dropdown Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Unit x Sub Count')]")).click();
		Thread.sleep(5000);
	}

	@Test(dataProvider = "loginCredentials", priority = 3)
	public void VAT_FEE_DC_003(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Tenor based on days past (Business_Date-Start Date')]"))
				.click();
		Thread.sleep(5000);
	}
	
	@Test(dataProvider = "loginCredentials", priority = 4)
	public void VAT_FEE_DC_004(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(5000);
		// -- Channel type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// --- Channel type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
		// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'ATM Transactions')]"))
				.click();
		// --buusiness vertical dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- business vertical select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// --customer id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();
		Thread.sleep(5000);
		// -- contract id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- contract id select--//
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();
		Thread.sleep(5000);
		// --product type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[8]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[30]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		// -- posting currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// -- posting currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(5000);
		// -- currency conversion type --//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- currency converssiont select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Buy Rate')]"))
				.click();
		Thread.sleep(5000);
		 // -- look up amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- look up amount type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Actual Amt')]")).click();
		Thread.sleep(5000);
		// -- percentage amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- percentage amount type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		// -- round of basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- round of basis dropdown select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(5000);
	}

	@Test(dataProvider = "loginCredentials", priority = 5)
	public void VAT_FEE_DC_005(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(4000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		// -- add button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]"))
				.click();
		// -- Channel type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// --- Channel type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
		// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'ATM Transactions')]"))
				.click();
		// --buusiness vertical dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- business vertical select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// --customer id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();
		Thread.sleep(5000);
		// -- contract id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- contract id select--//
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();
		Thread.sleep(5000);
		// -- transaction currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[30]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		// -- posting currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// -- posting currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(5000);
		// -- currency conversion type --//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- currency converssiont select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Buy Rate')]"))
				.click();
		Thread.sleep(5000);
		 // -- look up amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- look up amount type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Actual Amt')]")).click();
		Thread.sleep(5000);
		// -- percentage amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- percentage amount type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(5000);
		// -- round of basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- round of basis dropdown select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("0.00");// -- min fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(5000);
	}

	@Test(dataProvider = "loginCredentials", priority = 6)
	public void VAT_FEE_DC_006(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		// -- add button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]"))
				.click();
		// -- Channel type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// --- Channel type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
		// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'ATM Transactions')]"))
				.click();
		// --buusiness vertical dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- business vertical select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// --customer id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();
		Thread.sleep(5000);
		// -- contract id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- contract id select--//
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();
		Thread.sleep(5000);
		// -- transaction currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[30]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		// -- posting currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// -- posting currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(5000);
		// -- currency conversion type --//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- currency converssiont select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Buy Rate')]"))
				.click();
		Thread.sleep(5000);
		 // -- look up amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- look up amount type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Actual Amt')]")).click();
		Thread.sleep(5000);
		// -- percentage amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- percentage amount type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(5000);
		// -- round of basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- round of basis dropdown select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("0.00");// -- min fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(element);
		WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		actions.scrollToElement(FromAmount);
		actions.perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();// -- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");// ---From Account Sendkeys--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();// -- To Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("3456789");// ---To Account Sendkeys--//
		Thread.sleep(3000);
	}

	@Test(dataProvider = "loginCredentials", priority = 7)
	public void VAT_FEE_DC_007(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		// -- add button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]"))
				.click();
		// -- Channel type dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// --- Channel type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
		// channel code dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- channel code dropdown select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'ATM Transactions')]"))
				.click();
		// --buusiness vertical dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- business vertical select--//
		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();
		// --customer id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'EZEKIEL KUYA OTIENO')]")).click();
		Thread.sleep(5000);
		// -- contract id click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- contract id select--//
		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();
		Thread.sleep(5000);
		// -- transaction currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[30]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- transaction currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions1.moveToElement(elementTarget1);
		WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
		actions1.scrollToElement(Target1);
		actions1.perform();
		Target1.click();
		// -- posting currency--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000); 
		// -- posting currency select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
				.click();
		Thread.sleep(5000);
		// -- currency conversion type --//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- currency converssiont select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Buy Rate')]"))
				.click();
		Thread.sleep(5000);
		 // -- look up amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- look up amount type select--//
		driver.findElement(By.xpath("//span[contains(text(),'Actual Amt')]")).click();
		Thread.sleep(5000);
		// -- percentage amount type--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- percentage amount type select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.clear();
		Thread.sleep(5000);
		// -- Interest basis--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(5000);
		// -- round of basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- round of basis dropdown select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis dropdown--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
				.click();
		Thread.sleep(5000);
		// -- fee basis select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.clear();// -- min fee amount--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("0.00");// -- min fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.clear();// -- max fee amount--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");// -- max fee amount--//
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(element);
		WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		actions.scrollToElement(FromAmount);
		actions.perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();// -- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");// ---From Account Sendkeys--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();// -- To Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("3456789");// ---To Account Sendkeys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("25");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]/div[1]"))
				.click();
		Actions actions11 = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions11.moveToElement(element1);
		WebElement FromAmount1 = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		actions.scrollToElement(FromAmount1);
		actions.perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).clear();// -- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("3456789");// ---From Account Sendkeys--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();// -- To Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("4567890");// ---To Account Sendkeys--//
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).sendKeys("50");
		Thread.sleep(7000);
	}
	
	@Test(dataProvider = "loginCredentials", priority = 8) // -- Unable to Proceed further to amount is clearing--//
	public void VAT_FEE_DC_013(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		//-- Add in Fees --//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Unit x Sub Count')]")).click();
		Thread.sleep(5000);
		//-- Add row click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(element);
		WebElement FromAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		actions.scrollToElement(FromAmount);
		actions.perform();
		// -- From Amount Clear--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
		// ---From Account Sendkeys--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("123456");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).clear();
		// -- To Amount--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("1000000");
		Thread.sleep(4000);
		// --Fee Basis dropdown--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(4000);
		// --Fee Basis dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Percentage')]"))
				.click();
		Thread.sleep(7000);
		// -- To Amount--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("100000");
		Thread.sleep(3000);
		// --Fee amount / Percentage--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).sendKeys("25");
		Thread.sleep(4000);
	}

	@Test(dataProvider = "loginCredentials", priority = 9)
	public void VAT_FEE_DC_022(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
	driver.findElement(By.xpath(
			"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
			.click();
	Thread.sleep(5000);
	// -- MAster Config Dropdown Click--//
	driver.findElement(By.xpath(
			"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
			.click();
	Thread.sleep(5000);
	// --- TransLine Config--//
	driver.findElement(By.xpath(
			"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
			.click();
	Thread.sleep(4000);
	// -- Edit Button in Manin screen of Trans Line--//
			// -- Filter click--//
			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			// -- Filter column click--//
			driver.findElement(By.xpath(
					"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
					.click();
			Thread.sleep(5000);
			// -- Filter Column select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
			// -- Criteria click--/
			driver.findElement(By.xpath(
					"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
					.click();
			// -- Criteria select--//
			driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
			// -- Value sendkeys--//
			driver.findElement(By.xpath(
					"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
					.sendKeys(VAT);
			// -- Apply click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(5000);
			//-- Edit click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
			Thread.sleep(5000);
			// -- Business Line Config click--//
			driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
	Thread.sleep(5000);
	// -- Fees Config Button Click--//
	driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
	Thread.sleep(5000);
	WebElement elementToHoverM = driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]"));
	Actions actionsClick = new Actions(driver);
	actionsClick.moveToElement(elementToHoverM).perform();
	WebElement FeesDeleteClick = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/a[2]/i[1]"));
	FeesDeleteClick.click();
	Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(3000);
	}

	@Test(dataProvider = "loginCredentials", priority = 10,enabled = false)
	public void VAT_FEE_DC_015(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
	// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Fee Type dropdown--//
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]"))
				.click();// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);// --Fee Basis dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Unit x Sub Count')]")).click();// --Fee Basis dropdown
																							// Select--//
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();// -- Add Row--//
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement scroll = driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(scroll);
		WebElement Target = driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Target.sendKeys("25");
		Thread.sleep(3000);
		throw new SkipException("Skip");
	}

	@Test(dataProvider = "loginCredentials", priority = 11,enabled = false)
	public void VAT_FEE_DC_016(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);// -- MAster Config Dropdown Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);// --- TransLine Config
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[5]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement FeesConfig = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/a[1]/i[1]"));
		FeesConfig.click();
		Thread.sleep(5000);// -- Edit Buttom--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("12");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("15");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/a[2]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
				.sendKeys("20");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(5000);
		throw new SkipException("Skip");
	}

	@Test(dataProvider = "loginCredentials", priority = 12)
	public void VAT_FEE_DC_028(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(5000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		// --- TransLine Config--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		// -- Edit Button in Manin screen of Trans Line--//
				// -- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				// -- Filter column click--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Filter Column select--//
				driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
				// -- Criteria click--/
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				// -- Criteria select--//
				driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
				// -- Value sendkeys--//
				driver.findElement(By.xpath(
						"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
						.sendKeys(VAT);
				// -- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Edit click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
				Thread.sleep(5000);
				// -- Business Line Config click--//
				driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		Thread.sleep(5000);
		// -- Fees Config Button Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
		Thread.sleep(3000);
		// -- Fee Type dropdown--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Fee Type dropdown Select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Range')]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		// -- Tier Range type drop down Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
				.click();
		//-- Fee basis click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		//-- Fee basis Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
		Thread.sleep(5000);
		// -- add Row button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		// apply button--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		//-- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
		Thread.sleep(5000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FeesConfig\\VAT_FEE_DC_028.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" VAT_FEE_DC_028 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("VAT_FEE_DC_028 Failed to save screenshot: " + e.getMessage());
		}
	}

	@Test(dataProvider = "loginCredentials", priority = 13)
	public void VAT_FEE_DC_029(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
						.click();
				Thread.sleep(5000);
				// -- MAster Config Dropdown Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
						.click();
				Thread.sleep(5000);
				// --- TransLine Config--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(4000);
				// -- Edit Button in Manin screen of Trans Line--//
						// -- Filter click--//
						driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
						// -- Filter column click--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
								.click();
						Thread.sleep(5000);
						// -- Filter Column select--//
						driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
						// -- Criteria click--/
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
								.click();
						// -- Criteria select--//
						driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
						// -- Value sendkeys--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fee Type dropdown--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Fee Type dropdown Select--//
				driver.findElement(By.xpath(
						"//span[contains(text(),'Range')]"))
						.click();
				Thread.sleep(5000);
				// -- Tier Range type drop down--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Tier Range type drop down Select--//
				driver.findElement(By.xpath(
						"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
						.click();
				//-- Fee basis click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee basis Select--//
				driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
				Thread.sleep(5000);
				//-- Filter click--//
				driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
				// -- add Row button--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]"))
						.click();
				Thread.sleep(5000);
				// apply button--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();		
				Thread.sleep(5000);
	}
	@Test(dataProvider = "loginCredentials", priority = 4)
	public void VAT_FEE_DC_032(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
						.click();
				Thread.sleep(5000);
				// -- MAster Config Dropdown Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
						.click();
				Thread.sleep(5000);
				// --- TransLine Config--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(4000);
				// -- Edit Button in Manin screen of Trans Line--//
						// -- Filter click--//
						driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
						// -- Filter column click--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
								.click();
						Thread.sleep(5000);
						// -- Filter Column select--//
						driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
						// -- Criteria click--/
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
								.click();
						// -- Criteria select--//
						driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
						// -- Value sendkeys--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(5000);
				//-- Fee type  (flat)--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Fee Type dropdown Select--//
				driver.findElement(By.xpath(
						"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
						.click();
				//-- Fee basis click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee basis Select--//
				driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
				Thread.sleep(5000);		
	}
	@Test(dataProvider = "loginCredentials", priority = 15)
	public void VAT_FEE_DC_034(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
						.click();
				Thread.sleep(5000);
				// -- MAster Config Dropdown Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
						.click();
				Thread.sleep(5000);
				// --- TransLine Config--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(4000);
				// -- Edit Button in Manin screen of Trans Line--//
						// -- Filter click--//
						driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
						// -- Filter column click--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
								.click();
						Thread.sleep(5000);
						// -- Filter Column select--//
						driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
						// -- Criteria click--/
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
								.click();
						// -- Criteria select--//
						driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
						// -- Value sendkeys--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
								.sendKeys(VAT);
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fee Type dropdown--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Fee Type dropdown Select--//
				driver.findElement(By.xpath(
						"//span[contains(text(),'Range')]"))
						.click();
				Thread.sleep(5000);
				// -- Tier Range type drop down--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
						.click();
				Thread.sleep(5000);
				// -- Tier Range type drop down Select--//
				driver.findElement(By.xpath(
						"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/span[1]"))
						.click();
				//-- Fee basis click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee basis Select--//
				driver.findElement(By.xpath("//span[contains(text(),'Per Unit')]")).click();
				Thread.sleep(5000);
				// -- add Row button--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]"))
						.click();
				Thread.sleep(5000);
				Actions actions = new Actions(driver);
				WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions.moveToElement(elementTarget);
				WebElement Target = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
				actions.scrollToElement(Target);
				actions.perform();
				Target.click();
				Target.clear();
				Target.sendKeys("9999999999999999");
				// apply button--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();		
				Thread.sleep(5000);		
	}
	@Test(dataProvider = "loginCredentials", priority = 16)
	public void VAT_FEE_DC_045(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
						.click();
				Thread.sleep(5000);
				// -- MAster Config Dropdown Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
						.click();
				Thread.sleep(5000);
				// --- TransLine Config--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(4000);
				// -- Edit Button in Manin screen of Trans Line--//
						// -- Filter click--//
						driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
						// -- Filter column click--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
								.click();
						Thread.sleep(5000);
						// -- Filter Column select--//
						driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
						// -- Criteria click--/
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
								.click();
						// -- Criteria select--//
						driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
						// -- Value sendkeys--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
								.sendKeys("ENPLPL0029");
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(3000);
				//-- Another Fees click--//
				driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).click();
				Thread.sleep(5000);
				//-- Preferential click--//
				driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
				//-- Another Fees click--//
				driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).click();
				Thread.sleep(5000);
				//-- ALL Click--//
				driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
				Thread.sleep(3000);		
	}
	@Test(dataProvider = "loginCredentials", priority = 17)
	public void VAT_FEE_DC_037(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
						.click();
				Thread.sleep(5000);
				// -- MAster Config Dropdown Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
						.click();
				Thread.sleep(5000);
				// --- TransLine Config--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(4000);
				// -- Edit Button in Manin screen of Trans Line--//
						// -- Filter click--//
						driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
						// -- Filter column click--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
								.click();
						Thread.sleep(5000);
						// -- Filter Column select--//
						driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
						// -- Criteria click--/
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
								.click();
						// -- Criteria select--//
						driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
						// -- Value sendkeys--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
								.sendKeys("BUS_TEST");
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(3000);
				//-- Add CLick--//
				driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
				Thread.sleep(5000);
				//-- Fee type dropdown--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee type flat select--//
				driver.findElement(By.xpath("//span[contains(text(),'Flat')]")).click();
				//-- Fee basis dropdown--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Fee basis select Percentage---//
				driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();
				//-- Standard click--//
				driver.findElement(By.xpath("//span[contains(text(),'Standard')]")).click();
				Thread.sleep(5000);
				//-- Add row click--//
				driver.findElement(By.xpath("//div[@class='addRow']")).click();
				Thread.sleep(5000);
				Actions actions = new Actions(driver);
				WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions.moveToElement(elementTarget);
				WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
				actions.scrollToElement(Target);
				actions.perform();
				Target.click();
				//-- Fee amount/percentage send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
				//-- Apply Click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Modify click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
				Thread.sleep(4000);
				//-- Preferential click--//
				driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
				Thread.sleep(5000);
				//-- Add row click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/i[1]")).click();
				Thread.sleep(5000);
				//-- Channel type click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Channel type select-- Mobile banking--//
				driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
				Actions actions1 = new Actions(driver);
				WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions1.moveToElement(elementTarget1);
				WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
				actions1.scrollToElement(Target1);
				actions1.perform();
				Target1.click();
				//-- Fee amount/percentage send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Modify click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
				Thread.sleep(5000);
				//-- All click--//
				driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
				Thread.sleep(5000);
				//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FeesConfig\\VAT_FEE_DC_037.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_FEE_DC_037 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_FEE_DC_037 Failed to save screenshot: " + e.getMessage());
				}			
	}
	@Test(dataProvider = "loginCredentials", priority = 18)
	public void VAT_FEE_DC_039(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(username);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(7000);
		// -- Master Configuration tab Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
						.click();
				Thread.sleep(5000);
				// -- MAster Config Dropdown Click--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
						.click();
				Thread.sleep(5000);
				// --- TransLine Config--//
				driver.findElement(By.xpath(
						"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(4000);
				// -- Edit Button in Manin screen of Trans Line--//
						// -- Filter click--//
						driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
						// -- Filter column click--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
								.click();
						Thread.sleep(5000);
						// -- Filter Column select--//
						driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
						// -- Criteria click--/
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
								.click();
						// -- Criteria select--//
						driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
						// -- Value sendkeys--//
						driver.findElement(By.xpath(
								"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
								.sendKeys("ENPLPL0029");
						// -- Apply click--//
						driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
						Thread.sleep(5000);
						//-- Edit click--//
						driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]")).click();
						Thread.sleep(5000);
						// -- Business Line Config click--//
						driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
				Thread.sleep(5000);
				// -- Fees Config Button Click--//
				driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
				Thread.sleep(3000);
				//-- Standard add row--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]")).click();
				Actions actions = new Actions(driver);
				WebElement elementTarget = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions.moveToElement(elementTarget);
				WebElement Target = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[1]/input[1]"));
				actions.scrollToElement(Target);
				actions.perform();
				Target.click();
				//-- Fee amount/percentage send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- Modify click--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[2]/button[1]")).click();
				Thread.sleep(3000);
				//-- Preferential click--//
				driver.findElement(By.xpath("//span[contains(text(),'Preferential')]")).click();
				Thread.sleep(5000);
				//-- Add row--//
				driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")).click();
				Thread.sleep(5000);
				//-- Channel type click--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
				Thread.sleep(5000);
				//-- Channel type select-- Mobile banking--//
				driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();
				Actions actions1 = new Actions(driver);
				WebElement elementTarget1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
				actions1.moveToElement(elementTarget1);
				WebElement Target1 = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]"));
				actions1.scrollToElement(Target1);
				actions1.perform();
				Target1.click();
				//-- Fee amount/percentage send keys--//
				driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
				//-- Apply click--//
				driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
				Thread.sleep(5000);
				//-- All click--//
				driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
				Thread.sleep(5000);
				//-- Take screenshot and save it to a file--//
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\FeesConfig\\VAT_FEE_DC_039.png";
				//-- save the screenshot --//
				File destinationFile = new File(Location);
				// Move the screenshot file to the specified destination
				try {
					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
					System.out.println(" VAT_FEE_DC_039 Screenshot saved to: " + destinationFile.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("VAT_FEE_DC_039 Failed to save screenshot: " + e.getMessage());
				}	
				Thread.sleep(5000);
	}

	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
