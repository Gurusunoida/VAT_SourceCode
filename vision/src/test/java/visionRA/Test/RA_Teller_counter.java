package visionRA.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RA_Teller_counter {
	
	WebDriver driver;
	 String Teller_filter_app = "Approved";
	 String Teller_filter_add = "Add";
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
//	public void TEL_DC_001(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Teller_filter_app);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		//-- Check box tick--//
//		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
//		//-- Delete button click-//
//		driver.findElement(By.xpath("//i[contains(text(),'delete')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 2)
//	public void TEL_DC_003(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		//-- COuntry click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- le book click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--le book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- customer id click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- customer id select--//
//		driver.findElement(By.xpath("//td[contains(text(),'100017')]")).click();
//		//-- Teller bucket dropdown click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Teller bucket dropdown select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//date select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-teller-counter-array-table[1]/div[1]/div[1]/div[1]/div[1]/app-form-array-table[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
//		//-- save click--//
//		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
//		Thread.sleep(2000);
//		//-- Teller bucket dropdown click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Teller bucket dropdown select--//
//		driver.findElement(By.xpath("//span[contains(text(),'NOR2 - 20')]")).click();
//		//-- save click--//
//		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 3)
//	public void TEL_DC_004(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Teller_filter_app);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		//-- status click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		//-- satatus select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Old')]")).click();
//		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
//		Thread.sleep(3000);	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 4)
//	public void TEL_DC_005(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(Teller_filter_add);
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(3000);
//		//-- status click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		//-- satatus select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Inactive')]")).click();
//		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
//		Thread.sleep(3000);	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 5)
//	public void TEL_DC_006(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		//-- COuntry click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- le book click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--le book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- customer id click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- customer id select--//
//		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
//		//-- Teller bucket dropdown click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Teller bucket dropdown select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//date select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-teller-counter-array-table[1]/div[1]/div[1]/div[1]/div[1]/app-form-array-table[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
//		//-- Add click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		//-- COuntry click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- le book click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--le book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- customer id click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- customer id select--//
//		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
//		//-- Teller bucket dropdown click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Teller bucket dropdown select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//date select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-teller-counter-array-table[1]/div[1]/div[1]/div[1]/div[1]/app-form-array-table[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
//		//-- save click--//
//		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TellerCounter\\TEL_DC_006.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" TEL_DC_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("TEL_DC_006 Failed to save screenshot: " + e.getMessage());
//	}	
//		
//	}
//	@Test(dataProvider = "loginCredentials", priority = 6)
//	public void TEL_DC_012(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		//-- COuntry click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- le book click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--le book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- customer id click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- customer id select--//
//		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
//		//-- Teller bucket dropdown click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Teller bucket dropdown select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//date select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-teller-counter-array-table[1]/div[1]/div[1]/div[1]/div[1]/app-form-array-table[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
//		//--FIlter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		//--reset click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 7)
//	public void TEL_DC_007(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		//-- COuntry click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- le book click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--le book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- customer id click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- customer id select--//
//		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
//		Thread.sleep(2000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TellerCounter\\TEL_DC_007.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" TEL_DC_007 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("TEL_DC_007 Failed to save screenshot: " + e.getMessage());
//		}
//	}
//	@Test(dataProvider = "loginCredentials", priority = 8)
//	public void TEL_DC_008(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		//-- Save click--//
//		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
//		Thread.sleep(1000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TellerCounter\\TEL_DC_008.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" TEL_DC_008 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("TEL_DC_008 Failed to save screenshot: " + e.getMessage());
//		}
//
//		
//	}
//	@Test(dataProvider = "loginCredentials", priority = 9)
//	public void TEL_DC_009(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		//-- COuntry click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Country select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- le book click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--le book select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		//-- customer id click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- customer id select--//
//		driver.findElement(By.xpath("//td[contains(text(),'100013')]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 10)
//	public void TEL_DC_010(String username, String password) throws InterruptedException {
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
//		// -- Master Configuration tab Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- MAster Config Dropdown Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);
//		//-- Teller counter click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Filter click--//
//		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
//		Thread.sleep(2000);
//		//-- Column click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//-- Column select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]/span[1]")).click();
//		//-- Value sendkeys--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
//		//-- Apply click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		Thread.sleep(2000);
//		//-- Status Click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[15]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		//--  Inactive click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Inactive')]")).click();
//		//-- Save click--//
//		driver.findElement(By.xpath("//i[contains(text(),'save')]")).click();
//		Thread.sleep(2000);
//		//-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\TellerCounter\\TEL_DC_010.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" TEL_DC_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("TEL_DC_010 Failed to save screenshot: " + e.getMessage());
//		}
//	}
	@Test(dataProvider = "loginCredentials", priority = 11)
	public void TEL_DC_011(String username, String password) throws InterruptedException {
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
		// -- Master Configuration tab Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- MAster Config Dropdown Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(2000);
		//-- Teller counter click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		//-- Add click--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		//-- COuntry click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//-- Country select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- le book click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		//--le book select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		//-- customer id click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Page nation click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[3]/span[2]/ul[1]/li[2]/button[1]/i[1]")).click();
		//-- Page nation click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[3]/span[2]/ul[1]/li[2]/button[1]/i[1]")).click();
		//-- Page nation click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[3]/span[2]/ul[1]/li[2]/button[1]/i[1]")).click();	
		//-- customer id select--//
		driver.findElement(By.xpath("//td[contains(text(),'100046')]")).click();
		Thread.sleep(2000);
		//-- Date Select --//
		
	}
	
	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
