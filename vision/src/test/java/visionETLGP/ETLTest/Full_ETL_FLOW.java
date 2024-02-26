package visionETLGP.ETLTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Full_ETL_FLOW {
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

	@Test(priority = 1) // -- Connector--//
	public void FullETL1() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_ETLFlow3");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys("VAT_ETLFlow process3");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
				.click();// --Connector Type Dropdown--///
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(2000); // -- Connector type dropdown Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();// --DB Type Dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(2000);// --DB Type Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
				.sendKeys("10.16.1.38");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
				.sendKeys("52866");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[4]/input[1]"))
				.sendKeys("vision");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[5]/input[1]"))
				.sendKeys("Vision_RA");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[6]/input[1]"))
				.sendKeys("VISION_RA");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]"))
				.click();// -- Logout Button--//
		Thread.sleep(4000);
	}

	@Test(priority = 2) // -- Connector Approve--//
	public void FullETL2() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("System");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		WebElement view = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
		view.click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 3) // -- Connector Script --//
	public void FullETL3() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);// -- Connector Script Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);// -- Add Button--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Country Dropdown--//
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();// -- Country
																											// Dropdown
																											// Select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Le Book Dropdown--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();// --
																													// Le
																													// Book
																													// Seect--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Connector ID Dropdown--//
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(element);
		Thread.sleep(5000);
		WebElement connectorID = driver
				.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[30]"));
		actions.scrollToElement(connectorID);
		actions.perform();
		Thread.sleep(5000);// -- Connector ID Select--//
		connectorID.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT_ETLFlow3");// --Script ID--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- Script Type Dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'Pre Script (Before ETL Process)')]")).click();// -- Script
																											// Type
																											// Dropdown
																											// Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Execution Type Dropdown--//
		driver.findElement(By.xpath("//span[contains(text(),'SQL Script')]")).click();// -- Execution Type Dropdown
																						// Select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]"))
				.sendKeys("SELECT * FROM MJTEST_01");// --Script Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/textarea[1]"))
				.sendKeys("SELECT * FROM MJTEST_01");// --Script --//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 4) // -- Connector Script Approve--//
	public void FullETL4() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("System");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		WebElement view = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[2]/a[4]/i[1]"));
		view.click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 5) // -- Connector Query--//
	public void FullETL5() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// -- Connector Query Click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- Country Dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();// --
																													// Country
																													// Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(5000);// -- LE Book Dropdown
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);// -- LE Book Dropdown Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- Connector ID Dropdown--//
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]"));
		actions.moveToElement(element);
		Thread.sleep(5000);
		WebElement connectorID = driver
				.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[30]/span[1]"));
		actions.scrollToElement(connectorID);
		actions.perform();
		Thread.sleep(5000);// -- Connector ID Select--//
		connectorID.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("VAT_ETLFlow3");
		Thread.sleep(2000);// -- Query Id--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT_ETLFlow3");// -- Query Description--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Type dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();// -- type
																											// select--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]"))
				.sendKeys("SELECT * FROM GPTEST"); // -- Query send keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);// -- Validate Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(5000);// -- Save Button--//
	}

	@Test(priority = 6) // -- Connector Query Approve--//
	public void FullETL6() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("System");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);// -- Connector Query Click--//
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/span[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		WebElement view = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[2]/a[4]/i[1]"));
		view.click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void FullETL7() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);// -- Category Dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);// --Add in Connector
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]"))
				.click();
		Thread.sleep(2000);// -- Country dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();// --
																													// Country
																													// dropdown
																													// Select--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);// -- LE Book Dropdown--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();// --
																													// LE
																													// Book
																													// Dropdown
																													// Select--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("VAT_ETLFlow3");// --Category ID--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT_ETLFlow3");// --Description--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();// -- Save--//
		Thread.sleep(2000);
	}

	@Test(priority = 8) // -- Category Query Approve--//
	public void FullETL8() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("System");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
				.click();
		Thread.sleep(3000);// -- Category Dropdown
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		WebElement view = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-category[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[2]/a[5]/i[1]"));
		view.click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void FullETL9() throws InterruptedException {
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys("RA");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys("Vision@123");
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();// -- Feed Configuration Click--//
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]"))
				.sendKeys("VAT_ETLFlow3");// -- Feed Name--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Feed Category Click--//
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]"));
		actions.moveToElement(element);
		Thread.sleep(5000);
		WebElement categoryID = driver
				.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[34]/span[1]"));
		actions.scrollToElement(categoryID);
		actions.perform();
		Thread.sleep(5000);// -- Feed Category ID Select--//
		categoryID.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]"))
				.sendKeys("VAT_ETLFlow3");// -- Description
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();// -- Apply--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Source Setup')]")).click();// -- Source Setup Click--//
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".sourceSetup > span")).click();
		driver.findElement(By.name("connecterSearch")).click();
		Thread.sleep(2000);// -- Add connector search--//
		driver.findElement(By.cssSelector(".connecterSearchList:nth-child(13)")).click();
		Thread.sleep(2000);// -- Connector click--//
		driver.findElement(By.xpath("//span[contains(text(),'MJTESTVAT01')]")).click();// -- After display connector
																						// click--//
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);// -- Internal view Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[2]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-checkbox[1]/input[1]"))
				.click();
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[3]/button[1]"));
		Actions actionsApply = new Actions(driver);
		actionsApply.moveToElement(elementToHover).perform();
		WebElement view = driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[3]/button[1]"));
		view.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[3]/button[1]"))
				.click();
		Thread.sleep(5000);// -- Apply Button in Table--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-source-setup-form[1]/div[1]/div[3]/button[2]"))
				.click();
		Thread.sleep(2000);// -- Apply Button in Source Setup--//
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-materialized-view-setup-form[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[2]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Connector = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-materialized-view-setup-form[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[2]"));
		Connector.click();
		Thread.sleep(2000);
		WebElement ElementtoDrag = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-materialized-view-setup-form[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/span[2]"));
		WebElement ElementtoDrop = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-materialized-view-setup-form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/virtual-scroller[1]/div[2]"));
		Actions actionsDragDrop = new Actions(driver);
		Thread.sleep(2000);
		actionsDragDrop.clickAndHold(ElementtoDrag).moveToElement(ElementtoDrop).release().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-materialized-view-setup-form[1]/div[1]/div[2]/button[3]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Actions actionsTarget = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]"));
		actionsTarget.moveToElement(elementTarget);
		Thread.sleep(5000);
		WebElement Target = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[11]/span[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Thread.sleep(5000);// -- Feed Category ID Select--//
		Target.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"))
				.click();
		Thread.sleep(2000);// --Target Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/virtual-scroller[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]"))
				.click();
		Thread.sleep(2000);// -- Target Table Select--//
		driver.findElement(By.cssSelector(".connection_icon-top > .fa-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".h-100 > .ng-star-inserted:nth-child(1) > span")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[2]/button[2]"))
				.click();
		Thread.sleep(2000);// -- Save --//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[2]/button[3]"))
				.click();
		Thread.sleep(5000);// -- Next--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]"))
				.sendKeys("VAT_ETLFlow3");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/div[1]/mat-radio-group[1]/mat-radio-button[2]/label[1]/div[1]/div[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[2]/button[2]"))
				.click();
		Thread.sleep(5000);
	}
}
