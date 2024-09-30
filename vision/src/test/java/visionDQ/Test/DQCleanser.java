package visionDQ.Test;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class DQCleanser {
	WebDriver driver;
	String CaseCondition = "VAT";
	String CaseCondition1 = "VAT1";
	//ExtentReports report_extent;
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
//	public void DQ_CR_013 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
//		Thread.sleep(4000);
//		//--Edit Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
//		Thread.sleep(2000);
//		//-- Next click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
//		//-- Data cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[3]/span[1]")).click();
//		Thread.sleep(2000);
//		//-- Column name check box click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
//		//-- Add cleanser click--//
//		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
//		Thread.sleep(2000);
//		//--Add select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[2]/input[1]")).click();
//		//-- Next Click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
//		Thread.sleep(2000);
//	}
//	@Test(priority = 2, dataProvider = "getUserNameList")
//	public void DQ_CR_002 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
//		Thread.sleep(4000);
//		//-- Cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[3]/span[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverC).perform();
//		WebElement Cleanser = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]"));
//		Cleanser.click();
//		Thread.sleep(2000);
//		//-- Column name check box click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
//		//-- Add cleanser click--//
//		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
//		Thread.sleep(2000);
//		//--Add select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[2]/input[1]")).click();
//		//-- Next Click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
//		Thread.sleep(2000);
//		//-- Column name in Source click--//
//		driver.findElement(By.xpath("//div[contains(text(),'Column_Name')]")).click();
//		//-- Copy select--//
//		driver.findElement(By.xpath("//i[contains(text(),'content_copy')]")).click();
//		Thread.sleep(2000);
//		//--Target table click--//
//		driver.findElement(By.xpath("//span[@id='transFormationText_write']")).click();
//		//-- Paste Select--//
//		driver.findElement(By.xpath("//i[contains(text(),'content_paste')]")).click();
//		Thread.sleep(2000);
//		//-- save click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[2]/app-cleanser-transformation[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")).click();
//		Thread.sleep(2000);
//		WebElement CleanserT=driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
//		String Cleanser_Text = CleanserT.getText();
//		System.out.println(Cleanser_Text);
//	}
//	@Test(priority = 3, dataProvider = "getUserNameList")
//	public void DQ_CR_003 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
//		Thread.sleep(4000);
//		//-- Cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[3]/span[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverC).perform();
//		WebElement Cleanser = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]"));
//		Cleanser.click();
//		Thread.sleep(2000);
//		WebElement elementToHoverCE = driver.findElement(By.xpath("//td[contains(text(),'GRP_1714123718949')]"));
//		Actions actionsClickE = new Actions(driver);
//		actionsClickE.moveToElement(elementToHoverCE).perform();
//		WebElement Cleanser_edit = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Cleanser_edit.click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("//span[@id='transFormationText_write']"));
//		Actions actionsClickHover = new Actions(driver);
//		actionsClickHover.moveToElement(elementToHoverM).perform();
//		Thread.sleep(3000);
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\DQ_CR_003.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" DQ_CR_003 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("DQ_CR_003 Failed to save screenshot: " + e.getMessage());
//		}	
//	}
//	@Test(priority = 4, dataProvider = "getUserNameList")
//	public void DQ_CR_005 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
//		Thread.sleep(4000);
//		//-- Cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[3]/span[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverC).perform();
//		WebElement Cleanser = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]"));
//		Cleanser.click();
//		Thread.sleep(2000);
//		WebElement elementToHoverCE = driver.findElement(By.xpath("//td[contains(text(),'GRP_1714123718949')]"));
//		Actions actionsClickE = new Actions(driver);
//		actionsClickE.moveToElement(elementToHoverCE).perform();
//		WebElement Cleanser_edit = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Cleanser_edit.click();
//		Thread.sleep(2000);
//		//-- Fullscreen click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[2]/app-cleanser-transformation[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/*[1]")).click();
//		Thread.sleep(2000);
//		//-- Back button--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		Thread.sleep(5000);
//	}
//	@Test(priority = 5, dataProvider = "getUserNameList")
//	public void DQ_CR_006 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
//		Thread.sleep(4000);
//		//-- Cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[3]/span[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverC).perform();
//		WebElement Cleanser = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]"));
//		Cleanser.click();
//		Thread.sleep(2000);
//		WebElement elementToHoverCE = driver.findElement(By.xpath("//td[contains(text(),'GRP_1714123718949')]"));
//		Actions actionsClickE = new Actions(driver);
//		actionsClickE.moveToElement(elementToHoverCE).perform();
//		WebElement Cleanser_edit = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Cleanser_edit.click();
//		Thread.sleep(4000);
//		WebElement ElementtoDrag = driver.findElement(By.xpath("//span[@id='transFormationText_write']"));
//				WebElement ElementtoDrop = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]"));
//				Actions actionsDragDrop = new Actions(driver);
//				Thread.sleep(2000);
//				actionsDragDrop.clickAndHold(ElementtoDrag).moveToElement(ElementtoDrop).release().build().perform();
//		//-- Reset to default click--//
//				driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[2]/app-cleanser-transformation[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/*[1]")).click();
//				Thread.sleep(2000);
//				//-- Take screenshot and save it to a file--//
//				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\DQ_CR_006.png";
//				//-- save the screenshot --//
//				File destinationFile = new File(Location);
//				// Move the screenshot file to the specified destination
//				try {
//					org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//					System.out.println(" DQ_CR_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
//				} catch (IOException e) {
//					System.out.println("DQ_CR_006 Failed to save screenshot: " + e.getMessage());
//				}			
//	}
//	@Test(priority = 6, dataProvider = "getUserNameList")
//	public void DQ_CR_007 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
//		Thread.sleep(4000);
//		//-- Cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[3]/span[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverC).perform();
//		WebElement Cleanser = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]"));
//		Cleanser.click();
//		Thread.sleep(2000);
//		//-- Column name check box click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
//		//-- Add cleanser click--//
//		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
//		Thread.sleep(2000);
//		//--Add select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[2]/input[1]")).click();
//		//-- Next Click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
//		Thread.sleep(2000);
//		//-- Column name in Source click--//
//		driver.findElement(By.xpath("//div[contains(text(),'Column_Name')]")).click();
//		//-- Copy select--//
//		driver.findElement(By.xpath("//i[contains(text(),'content_copy')]")).click();
//		Thread.sleep(2000);
//		//--Target table click--//
//		driver.findElement(By.xpath("//span[@id='transFormationText_write']")).click();
//		//-- Paste Select--//
//		driver.findElement(By.xpath("//i[contains(text(),'content_paste')]")).click();
//		Thread.sleep(2000);
//		//-- save click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[2]/app-cleanser-transformation[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")).click();
//		Thread.sleep(2000);
//		//-- Back button click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[2]/app-cleanser-transformation[1]/div[2]/div[1]/div[1]/button[1]")).click();
//		WebElement elementToHoverM = driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
//		Actions actionsClickV = new Actions(driver);
//		actionsClickV.moveToElement(elementToHoverM).perform();
//		WebElement Connector = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Connector.click();
//		Thread.sleep(4000);
//	}
//	@Test(priority = 7, dataProvider = "getUserNameList")
//	public void DQ_CR_008 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_TEST')]")).click();
//		Thread.sleep(4000);
//		//-- Cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/label[3]/span[1]")).click();
//		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_Error_Codes')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverC).perform();
//		WebElement Cleanser = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Cleanser.click();
//		Thread.sleep(2000);
//		WebElement elementToHoverErrorCodes = driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
//		Actions actionsEditClick = new Actions(driver);
//		actionsEditClick.moveToElement(elementToHoverErrorCodes).perform();
//		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Edit.click();
//		Thread.sleep(2000);
//		//-- ErrorCodes click--//
//		driver.findElement(By.xpath("//div[contains(text(),'Error_Code')]")).click();
//		//-- Expand click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[2]/app-cleanser-transformation[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/*[1]")).click();
//		//-- Data viewer click--//
//		driver.findElement(By.xpath("//a[contains(text(),'Data Viewer')]")).click();
//		Thread.sleep(2000);
//		WebElement DataCleanser=driver.findElement(By.xpath("//td[contains(text(),'Invalid Num Tab and Num Sub Tab value - Source Bal')]"));
//		String Cleansertext = DataCleanser.getText();
//		System.out.println(Cleansertext);
//	}
//	@Test(priority = 8, dataProvider = "getUserNameList")
//	public void DQ_CR_010 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_TEST')]")).click();
//		Thread.sleep(4000);
//		//-- Cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/label[3]/span[1]")).click();
//		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_Error_Codes')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverC).perform();
//		WebElement Cleanser = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Cleanser.click();
//		Thread.sleep(2000);
//		WebElement elementToHoverErrorCodes = driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
//		Actions actionsEditClick = new Actions(driver);
//		actionsEditClick.moveToElement(elementToHoverErrorCodes).perform();
//		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Edit.click();
//		Thread.sleep(5000);
//		//-- Column name in Source click--//
//		driver.findElement(By.xpath("//div[contains(text(),'Error_Code')]")).click();
//		//-- Copy select--//
//		driver.findElement(By.xpath("//i[contains(text(),'content_copy')]")).click();
//		Thread.sleep(2000);
//		//--Target table click--//
//		driver.findElement(By.xpath("//span[@id='transFormationText_write']")).click();
//		//-- Paste Select--//
//		driver.findElement(By.xpath("//i[contains(text(),'content_paste')]")).click();
//		Thread.sleep(2000);
//		//-- Back button--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		 //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\DQ_CR_010.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" DQ_CR_010 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("DQ_CR_010 Failed to save screenshot: " + e.getMessage());
//		}	
//		Thread.sleep(2000);
//	}
//	@Test(priority = 9, dataProvider = "getUserNameList")
//	public void DQ_CR_001 (String loginName, String loginPwd) throws InterruptedException {
//		//--Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		//--Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		//--Login Click--//
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		//-- Project select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_TEST')]")).click();
//		Thread.sleep(2000);
//		//-- Cleanser click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/label[3]/span[1]")).click();
//		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_Error_Codes')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverC).perform();
//		WebElement Cleanser = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Cleanser.click();
//		Thread.sleep(2000);
//		WebElement elementToHoverErrorCodes = driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
//		Actions actionsEditClick = new Actions(driver);
//		actionsEditClick.moveToElement(elementToHoverErrorCodes).perform();
//		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
//		Edit.click();
//		Thread.sleep(3000);
//		WebElement elementToHoverCopy = driver.findElement(By.xpath("//i[contains(text(),'content_copy')]"));
//		Actions actionsClickCopy = new Actions(driver);
//		actionsClickCopy.moveToElement(elementToHoverCopy).perform();
//		WebElement elementToHoverSelectAll = driver.findElement(By.xpath("//i[contains(text(),'content_paste')]"));
//		Thread.sleep(2000);
//		Actions actionsClickSelecct = new Actions(driver);
//		actionsClickSelecct.moveToElement(elementToHoverSelectAll).perform();
//		Thread.sleep(2000);
//	}
	@Test(priority = 10, dataProvider = "getUserNameList")
	public void DQ_CR_012 (String loginName, String loginPwd) throws InterruptedException {
		//--Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		//--Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		//--Login Click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		//-- Project select--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_TEST')]")).click();
		Thread.sleep(4000);
		//-- Cleanser click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/label[3]/span[1]")).click();
		WebElement elementToHoverC = driver.findElement(By.xpath("//td[contains(text(),'Vat_Error_Codes')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverC).perform();
		WebElement Cleanser = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
		Cleanser.click();
		Thread.sleep(2000);
		WebElement elementToHoverErrorCodes = driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
		Actions actionsEditClick = new Actions(driver);
		actionsEditClick.moveToElement(elementToHoverErrorCodes).perform();
		WebElement Edit = driver.findElement(By.xpath("//i[contains(text(),'edit')]"));
		Edit.click();
		Thread.sleep(2000);
		//-- Back button click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cleanser-tab[1]/div[2]/app-cleanser-transformation[1]/div[2]/div[1]/div[1]/button[1]")).click();
		//-- Forward back button--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(2000);
	}
	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];
		loginDetails[0][0] = "bb.satyaprakash";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
