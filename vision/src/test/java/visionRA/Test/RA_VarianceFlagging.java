package visionRA.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RA_VarianceFlagging {

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

//		@Test(dataProvider = "loginCredentials", priority = 1)
//		public void FG_CF_001(String username, String password) throws InterruptedException {
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
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]")).click();
//			Thread.sleep(2000);//-- Variance Flagging click--//
//			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();//-- Add button in variance Flagging--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("Vat_VarianceFlagging01");
//			Thread.sleep(2000);//-- Description--//
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();
//			Thread.sleep(2000);//-- Variance flagging button in ADD --//
//			driver.findElement(By.xpath("//i[contains(text(),'close')]")).click();//-- Close Button in variance flagging--//
//			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();//-- Popup for closing variance flagging--//
//			Thread.sleep(3000);		
//}
//	@Test(dataProvider = "loginCredentials", priority = 2)
//	public void FG_CF_002(String username, String password) throws InterruptedException {
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
//				.click();
//		Thread.sleep(5000);// -- Variance Flagging click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();// -- Add button in variance Flagging--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Vat_VarianceFlagging01");
//		Thread.sleep(2000);// -- Description--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);// -- Variance flagging button --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/div[3]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]"))
//				.click();
//		Thread.sleep(2000);// -- Business date From Click and select above two Lines--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/div[3]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]"))
//				.click();
//		Thread.sleep(2000);// -- Business date To Click and select above two Lines--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);// -- RM Name Click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[2]/div[1]/div[1]/app-magnifier-checkbox[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);// -- Search Filter Button--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[2]/div[1]/div[1]/app-magnifier-checkbox[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
//				.sendKeys("MARY");
//		Thread.sleep(2000);// -- Search Filter Sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[2]/div[1]/div[1]/app-magnifier-checkbox[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]"))
//				.click();
//		Thread.sleep(2000);// -- Search Button Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();// -- Ok Button Click--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[4]/input[1]"))
//				.click();// -- Customer ID Click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[2]/div[1]/div[1]/app-magnifier-checkbox[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();// -- Customer Id Search Click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[2]/div[1]/div[1]/app-magnifier-checkbox[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
//				.sendKeys("EZEKIEL");
//		Thread.sleep(2000);// -- Customer ID Search Button Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
//				.click();// -- Contract ID Click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[2]/div[1]/div[1]/app-magnifier-checkbox[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();// -- Contract ID Search Click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[2]/div[1]/div[1]/app-magnifier-checkbox[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
//				.sendKeys("Elgon");// -- Contract ID Search Sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[2]/div[1]/div[1]/app-magnifier-checkbox[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]"))
//				.click();// -- Search Button Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
//		Thread.sleep(2000);
//	}
//
//		@Test(dataProvider = "loginCredentials", priority = 3)
//		public void FG_CF_003(String username, String password) throws InterruptedException {
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
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]")).click();
//			Thread.sleep(5000);//-- Variance Flagging click--//	
//			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//			Thread.sleep(2000);//Add in VAriance flagging
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("VAT_12-02");
//			Thread.sleep(2000);//Description
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[contains(text(),'Re-Flagging')]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//			Thread.sleep(2000);
//		}
//		@Test(dataProvider = "loginCredentials", priority = 4)
//		public void FG_CF_004(String username, String password) throws InterruptedException {
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
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//					.click();
//			Thread.sleep(2000);// -- Master Configuration tab Click
//			driver.findElement(By.xpath(
//					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//					.click();
//			Thread.sleep(2000);// -- MAster Config Dropdown Click
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]")).click();
//			Thread.sleep(5000);//-- Variance Flagging click--//	
//			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//			Thread.sleep(2000);//Add in VAriance flagging
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("VAT_12-02");
//			Thread.sleep(2000);//Description
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/ng-select[1]/div[1]/span[2]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[contains(text(),'De-Flagging')]")).click();
//			Thread.sleep(2000);//Description
//			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/ng-select[1]/div[1]/span[2]")).click();
//			driver.findElement(By.xpath("//span[contains(text(),'Re-Flagging')]")).click();
//			Thread.sleep(2000);
//			
//		}
//	@Test(dataProvider = "loginCredentials", priority = 5)
//	public void FG_CF_005(String username, String password) throws InterruptedException {
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
//				.click();
//		Thread.sleep(5000);// -- Variance Flagging click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();// -- Add button in variance Flagging--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Vat_VarianceFlagging02");
//		Thread.sleep(2000);// -- Description--//
//		driver.findElement(By.xpath(
//				"//i[contains(text(),'mode_edit')]"))
//				.click();
//		Thread.sleep(2000);// -- Variance flagging button --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/div[3]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]"))
//				.click();
//		Thread.sleep(2000);// -- Business date From Click and select above two Lines--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//div[contains(text(),'30')]"))
//				.click();
//		Thread.sleep(2000);// -- Business date To Click and select above two Lines--//
//		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
//		Thread.sleep(8000);// -- Querry Button Click--//
//		driver.findElement(By.xpath(
//				"//tbody/tr[1]/td[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);// -- Select Data--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/ng-select[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Type drop down--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(2000);//-- Type drop down Select--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/input[1]")).sendKeys("3");//--- Amount LCV Send Keys--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[13]/input[1]")).sendKeys("1");//-- Amount fcy send keys--//
//		driver.findElement(By.xpath(
//				"//tbody/tr[2]/td[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);// -- Select Data--//
//		driver.findElement(By.xpath("//tbody/tr[2]/td[11]/ng-select[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Type drop down--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Type drop down Select--//
//		driver.findElement(By.xpath("//tbody/tr[2]/td[12]/input[1]")).sendKeys("30");//--- Amount LCV Send Keys--//
//		driver.findElement(By.xpath("//tbody/tr[2]/td[13]/input[1]")).sendKeys("10");//-- Amount fcy send keys--//
//		driver.findElement(By.xpath(
//				"//tbody/tr[3]/td[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);//--Select Data--//
//		driver.findElement(By.xpath("//tbody/tr[3]/td[11]/ng-select[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Type dropdown--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);// -- Type Select--//
//		driver.findElement(By.xpath("//tbody/tr[3]/td[12]/input[1]")).sendKeys("20");//--- Amount LCV Send Keys--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//tbody/tr[3]/td[13]/input[1]")).sendKeys("100");//-- Amount fcy send keys--//
//		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//		Thread.sleep(1000);// -- Save Button--//
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(3000);// -- Pop up for save--//
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 6)
//	public void FG_CF_014(String username, String password) throws InterruptedException {
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
//				.click();
//		Thread.sleep(5000);// -- Variance Flagging click--//
//		driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
//		//driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/a[1]/i[1]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 7)
//	public void FG_CF_017(String username, String password) throws InterruptedException {
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
//				.click();
//		Thread.sleep(5000);// -- Variance Flagging click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();// -- Add button in variance Flagging--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Vat_VarianceFlagging");
//		Thread.sleep(2000);// -- Description--//
//		driver.findElement(By.xpath(
//				"//i[contains(text(),'mode_edit')]"))
//				.click();
//		Thread.sleep(2000);// -- Variance flagging button --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/div[3]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]"))
//				.click();
//		Thread.sleep(2000);// -- Business date From Click and select above two Lines--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//div[contains(text(),'30')]"))
//				.click();
//		Thread.sleep(2000);// -- Business date To Click and select above two Lines--//
//		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
//		Thread.sleep(8000);// -- Querry Button Click--//
//		driver.findElement(By.xpath(
//				"//tbody/tr[3]/td[1]/input[1]"))
//				.click();
//		Thread.sleep(2000);//--Select Data--//
//		driver.findElement(By.xpath("//tbody/tr[3]/td[11]/ng-select[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Type dropdown--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
//		Thread.sleep(2000);// -- Type Select--//
//		driver.findElement(By.xpath("//tbody/tr[3]/td[12]/input[1]")).sendKeys("20");//--- Amount LCV Send Keys--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//tbody/tr[3]/td[13]/input[1]")).sendKeys("100");//-- Amount fcy send keys--//
//		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//		Thread.sleep(1000);// -- Save Button--//
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(10000);// -- Pop up for save--//
//		driver.findElement(By.xpath("//i[contains(text(),'close')]")).click();
//		Thread.sleep(2000);//-- Close Variance flagging--//
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);//-- Popup for close variance flagging--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Waiver')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 8)
//	public void FG_CF_018(String username, String password) throws InterruptedException {
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
//				.click();
//		Thread.sleep(5000);// -- Variance Flagging click--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();// -- Add button in variance Flagging--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("Vat_VarianceFlagging");
//		Thread.sleep(2000);// -- Description--//
//		driver.findElement(By.xpath(
//				"//i[contains(text(),'mode_edit')]"))
//				.click();
//		Thread.sleep(2000);// -- Variance flagging button --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/div[3]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]"))
//				.click();
//		Thread.sleep(2000);// -- Business date From Click and select above two Lines--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		driver.findElement(By.xpath(
//				"//div[contains(text(),'30')]"))
//				.click();
//		Thread.sleep(2000);// -- Business date To Click and select above two Lines--//
//		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
//		Thread.sleep(8000);// -- Querry Button Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Show Filter')]")).click();
//		Thread.sleep(2000);//-- Filter button in variance flagging querry--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Transline group dropdown--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'Branch Operations')]")).click();//-- Dropdown Select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);//--Transline ID Dropdown--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
//		Thread.sleep(2000);//-- Transline ID Select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Business Line ID Dropdown--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
//		Thread.sleep(2000);//-- Businessline ID Select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[6]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Business Line vartical dropdown--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[6]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
//		Thread.sleep(2000);//-- Business Line vartical dropdown Select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);// -- Channel name dropdown--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
//		Thread.sleep(2000);// -- Channel name dropdown Select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);//-- RC Code Dropdown--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
//		Thread.sleep(2000);//-- RC Code Dropdown Select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[6]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Product Type dropdown--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[6]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
//		Thread.sleep(2000);//-- Product Type dropdown Select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")).click();
//		Thread.sleep(2000);//-- Product ID dropdown--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")).click();
//		Thread.sleep(5000);//-- Product ID dropdown Select--//
//		
//	}
	@Test(dataProvider = "loginCredentials", priority = 9)
	public void FG_CF_011(String username, String password) throws InterruptedException {
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
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
				.click();
		Thread.sleep(3000);// -- Variance Flagging click--//
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();// -- Select all record--//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();// -- Select all record--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"))
				.click();// -- Select the Record--//
		WebElement elementToHover = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]"));
		// Create an instance of Actions class
		Actions actions = new Actions(driver);
		// Perform mouse hover action on the element
		actions.moveToElement(elementToHover).perform();
		WebElement Approve = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[1]/i[1]"));
		Approve.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Maker cannot Approve Pending Records !!')]")).click();
		Thread.sleep(5000);
		WebElement elementToHover1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]"));
		// Create an instance of Actions class
		Actions actions1 = new Actions(driver);
		// Perform mouse hover action on the element
		actions1.moveToElement(elementToHover1).perform();
		WebElement Reject = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[2]/i[1]"));
		Reject.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-generic-popup[1]/div[1]/div[2]/button[1]"))
				.click();
		Thread.sleep(5000);// -- Reject Record Popup--//
	}
//	@Test(dataProvider = "loginCredentials", priority = 10)
//	public void FG_CF_016(String username, String password) throws InterruptedException {
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
//				.click();
//		Thread.sleep(3000);// -- Variance Flagging click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();//-- Add Button--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("Vat23Feb");//-- Description Send Keys--//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]")).click();				
//		Thread.sleep(3000);
//	}

	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];

		loginDetails[0][0] = "RA";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
