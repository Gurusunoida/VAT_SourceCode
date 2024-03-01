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

public class RA_MasterConfiguration {
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
//	public void RA_MC_001(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//		.sendKeys(username);
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//		.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//		.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//		.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//		.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//		.click();
//		Thread.sleep(2000);// -- MAster Config Dropdown Click
//		//-- Transline config Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[4]/span[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Transline = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[4]/div[1]/div[6]/a[1]/i[1]"));
//		Transline.click();
//		Thread.sleep(2000);
//		//-- Description--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("NEW");
//		Thread.sleep(2000);
//		//-- Back Button--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/a[1]/i[1]")).click();
//		Thread.sleep(3000);	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 2)
//	public void RA_MC_002(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//		.sendKeys(username);
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//		.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//		.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//		.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//		.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//		.click();
//		Thread.sleep(2000);// -- MAster Config Dropdown Click
//		//-- Transline config Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add Button--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();
//		Thread.sleep(2000);
//		//--Transline Type Cancel Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[1]")).click();
//		Thread.sleep(2000);	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 3)
//	public void RA_MC_003(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//		.sendKeys(username);
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//		.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//		.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//		.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//		.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//		.click();
//		Thread.sleep(2000);// -- MAster Config Dropdown Click
//		//-- Transline config Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add Button--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();
//		Thread.sleep(2000);
//		//-- Transline Type Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--Transline Type Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		Thread.sleep(2000);
//		//--Transline Type Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
//		Thread.sleep(3000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 4)
//	public void RA_MC_004(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//		.sendKeys(username);
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//		.sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By
//		.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//		.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//		.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//		"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//		.click();
//		Thread.sleep(2000);// -- MAster Config Dropdown Click
//		//-- Transline config Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Add Button--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();
//		Thread.sleep(2000);
//		//-- Transline ID Click--/
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- Transline Description Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- Transline ID Click--/
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).click();
//		Thread.sleep(3000);
//	}
	@Test(dataProvider = "loginCredentials", priority = 5)
	public void RA_MC_006(String username, String password) throws InterruptedException {
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
		"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
		.click();
		Thread.sleep(2000);// -- Recon Configuration Click--//
		WebElement elementToHoverC = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ngb-tooltip-window[1]/div[2]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverC).perform();
		Thread.sleep(2000);
		WebElement elementToHoverE = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-recon-config[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/span[1]/ngb-tooltip-window[1]/div[2]"));
		Actions actionsClick1 = new Actions(driver);
		actionsClick1.moveToElement(elementToHoverE).perform();
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
