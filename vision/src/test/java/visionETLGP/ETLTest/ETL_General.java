package visionETLGP.ETLTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class ETL_General {
	WebDriver driver;
	String Category_select = "VAT";
	String Query_connectorID = "VAT";

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
	  @Test(dataProvider = "loginCredentials", priority = 0)
	  public void ETL_DC_001(String username, String password) throws InterruptedException {
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
			.sendKeys(username);
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
					.sendKeys(password);
			driver.findElement(By
					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
					.click();
			Thread.sleep(5000);
	  }
	  @Test( priority = 1)
	  public void ETL_DC_010() throws InterruptedException {
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
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
					.click();
			Thread.sleep(2000);
			//-- Filter icon--//	
			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			WebElement elementToHoverRemove = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/a[1]/span[1]/i[1]"));
			Actions actionsClick = new Actions(driver);
			actionsClick.moveToElement(elementToHoverRemove).perform();
			Thread.sleep(3000);	
	  }
	  @Test( priority = 2)
	  public void ETL_DC_015() throws InterruptedException {
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
			//--User Profile--//
			driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
			Thread.sleep(2000);
			//-- Selecting Colour Theme--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/div[1]/ul[1]/li[1]/a[1]/div[1]/span[1]")).click();
			//-- ETL-Connector Click--//
			driver.findElement(
					By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
					.click();
			Thread.sleep(5000);
			//-- Connector Dropdown Click--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
					.click();
			Thread.sleep(2000);
			//-- Connector Dropdown Select--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
					.click();
			Thread.sleep(2000);
	  }
	@Test( priority = 3)///------- Popup should ask while moving from etl connector to Script--///////
	  public void ETL_DC_016() throws InterruptedException {
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
			//-- ETL-Connector Click--//
			driver.findElement(
					By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
					.click();
			Thread.sleep(5000);
			//-- Connector Dropdown Click--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
					.click();
			Thread.sleep(2000);
			//-- Connector Dropdown Select--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
					.click();
			Thread.sleep(2000);
			//-- Add in Connector--//
			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
			//-- Country Dropdown Click--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			//-- Country Select--//
			driver.findElement(By.xpath("//span[contains(text(),'AE - United Arab Emirates')]")).click();
			Thread.sleep(2000);
			//--LE-Book Dropdown--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			//-- LE-Book Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
			Thread.sleep(2000);
			//--COnnector ID Sendkeys--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
					.sendKeys("VAT_ETL2603");
			Thread.sleep(2000);
			//-- Connector Description--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
					.sendKeys("VAT_ETL2603");
			//-- Endpoint type Dropdown--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			//-- Endpoint type Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
			Thread.sleep(2000);
			// --Connector Type Dropdown--///
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			 // -- Connector type dropdown Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
			Thread.sleep(2000);
			// --DB Type Dropdown--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]"))
					.click();
			// --DB Type Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();
			Thread.sleep(2000);
			//-- IP --//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
					.sendKeys("10.16.1.38");
			//-- Port--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
					.sendKeys("52866");
			Thread.sleep(2000);
			//--Left top Three dot for Selcting Connector--//
			driver.findElement(By.xpath("//i[@id='viewList']")).click();
			Thread.sleep(2000);
			// -- Connector Script Click--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[2]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//i[contains(text(),'Yes')]")).click();
	  }
	@Test( priority = 4)
	  public void ETL_DC_017() throws InterruptedException {
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
			//-- ETL-Connector Click--//
			driver.findElement(
					By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
					.click();
			Thread.sleep(5000);
			//-- Connector Dropdown Click--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
					.click();
			Thread.sleep(2000);
			//-- Connector Dropdown Select--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
					.click();
			Thread.sleep(2000);
			//--- Page nation Click--//
			Select select = new Select(driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
			select.selectByIndex(0);
			Thread.sleep(2000);
			//-- Autorenew--//
			driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
			Thread.sleep(3000);
	}
	@Test( priority = 5)
	  public void ETL_DC_018() throws InterruptedException {
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
			WebElement elementToHoverReferesh = driver.findElement(By.xpath("//i[contains(text(),'history')]"));
			Actions actionsReferesh = new Actions(driver);
			actionsReferesh.moveToElement(elementToHoverReferesh).perform();
			WebElement AutoReferesh = driver.findElement(By.xpath("//i[contains(text(),'history')]"));
			AutoReferesh.click();
			Thread.sleep(3000);
	}
	@Test( priority = 6)
	  public void ETL_DC_019() throws InterruptedException {
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
			//--Feed configuration click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
			Thread.sleep(3000);
			//--Chevon right--//
			driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
			driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
			WebElement elementToHover = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/span[1]"));
			Actions actionsClick = new Actions(driver);
			actionsClick.moveToElement(elementToHover).perform();
			Thread.sleep(2000);
			WebElement Edit = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[1]/i[1]"));
			Edit.click();
			Thread.sleep(2000);
			//-- Nav Back --//
			driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
			Thread.sleep(4000);
	}
	@Test( priority = 7)
	  public void ETL_DC_009() throws InterruptedException {
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
			//--Feed configuration click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			//-- Filter column click--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- Column select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
			//-- Value send keys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("abchjvasc");
			//-- Apply click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
			String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\General\\ETL_DC_009.png";
			//-- Take screenshot and save it to a file--//
	        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //-- save the screenshot --//
	        File destinationFile = new File(Location);
	        // Move the screenshot file to the specified destination
	        try {
	            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
	            System.out.println(" ETL_DC_009 Screenshot saved to: " + destinationFile.getAbsolutePath());
	        } catch (IOException e) {
	            System.out.println("ETL_DC_009 Failed to save screenshot: " + e.getMessage());
	        }	
	}
	@Test( priority = 8)
	  public void ETL_DC_013() throws InterruptedException {
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
			//--Feed configuration click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
			Thread.sleep(3000);
			//-- Take screenshot and save it to a file--//
			String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\General\\ETL_DC_013.png";
	        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //-- save the screenshot --//
	        File destinationFile = new File(Location);
	        // Move the screenshot file to the specified destination
	        try {
	            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
	            System.out.println(" ETL_DC_013 Screenshot saved to: " + destinationFile.getAbsolutePath());
	        } catch (IOException e) {
	            System.out.println("ETL_DC_013 Failed to save screenshot: " + e.getMessage());
	        }		
	}
	@Test( priority = 9)
	  public void ETL_DC_014() throws InterruptedException {
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
			//--Feed configuration click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
			Thread.sleep(2000);
			WebElement elementToHover = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[8]/div[1]/span[1]"));
			Actions actionsHover = new Actions(driver);
			actionsHover.moveToElement(elementToHover).perform();
			WebElement Details = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[9]/div[2]/a[4]/i[1]"));
			actionsHover.moveToElement(Details).perform();
			Thread.sleep(4000);
	}
	@Test( priority = 10)
	  public void ETL_DC_005() throws InterruptedException {
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
			//--Feed configuration click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
			Thread.sleep(3000);
			//-- Add--//
			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
			Thread.sleep(3000);
			//-- Country--//
			driver.findElement(By.xpath(
					"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			//-- Country Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
			//--LE Book--//
			driver.findElement(By.xpath(
					"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))
					.click();
			Thread.sleep(2000);
			//-- LE Book select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
			//--Feed ID--//
			driver.findElement(By.xpath("//span[contains(text(),'Auto')]")).click();
			Thread.sleep(2000);
			//-- Feed Category click--//
			WebElement Category_click = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
			Category_click.click();
			Category_click.sendKeys(Category_select);
			 //-- Take screenshot and save it to a file--//
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\General\\ETL_DC_005.png";
			//-- save the screenshot --//
			File destinationFile = new File(Location);
			// Move the screenshot file to the specified destination
			try {
				org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
				System.out.println(" ETL_DC_005 Screenshot saved to: " + destinationFile.getAbsolutePath());
			} catch (IOException e) {
				System.out.println("ETL_DC_005 Failed to save screenshot: " + e.getMessage());
			}	
			// --ETL Connector click--//
			driver.findElement(
					By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
					.click();
			Thread.sleep(2000);
			// --ETL Connector Dropdown click--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
					.click();
			Thread.sleep(3000);
			//-- Connector Query select--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
			Thread.sleep(2000);
			//-- Add--//
			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
			Thread.sleep(3000);
			WebElement Query = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
			Query.click();
			Query.sendKeys(Query_connectorID);
			 //-- Take screenshot and save it to a file--//
			File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\ETL\\gENERAL\\ETL_DC_005_1.png";
			//-- save the screenshot --//
			File destinationFile1 = new File(Location1);
			// Move the screenshot file to the specified destination
			try {
				org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
				System.out.println(" ETL_DC_005_1 Screenshot saved to: " + destinationFile1.getAbsolutePath());
			} catch (IOException e) {
				System.out.println("ETL_DC_005_1 Failed to save screenshot: " + e.getMessage());
			}	
	}
	@Test( priority = 11)
	  public void ETL_DC_029() throws InterruptedException {
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
			//-- Operation Click--//
			driver.findElement(By.xpath("//span[contains(text(),'Operation')]")).click();
			Thread.sleep(3000);
			//-- Referesh click--//
			driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
			Thread.sleep(5000);
	}
	@Test( priority = 12)
	  public void ETL_DC_032() throws InterruptedException {
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
			//-- Business date referesh click--//
			driver.findElement(By.xpath("//span[contains(text(),'refresh')]")).click();
			Thread.sleep(2000);
			//-- EOD Dropdown click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]")).click();
			Thread.sleep(2000);
	}
	@Test( priority = 13)
	  public void ETL_DC_020() throws InterruptedException {
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
			//--Feed configuration click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")).click();
			Thread.sleep(2000);
			//-- Filter click--///
			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			//-- Column click--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- column Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]/span[1]")).click();
			//value sendkeys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
			//-- Add symbol in filter--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
			//-- Column click--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- column Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
			//value sendkeys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("MJ");
			//-- Apply click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
			WebElement elemet_to_Hover = driver.findElement(By.xpath("//span[@title='MJTEST02']"));
			Actions action_Reject =  new Actions(driver);
			action_Reject.moveToElement(elemet_to_Hover).perform();
			WebElement Reject = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[3]/i[1]"));
			Reject.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).sendKeys(Keys.SPACE);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).sendKeys(Keys.SPACE);
			Thread.sleep(2000);		
	}
	@Test( priority = 14)
	  public void ETL_DC_022() throws InterruptedException {
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
			// --ETL Connector click--//
			driver.findElement(
					By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
					.click();
			Thread.sleep(2000);
			// --ETL Connector Dropdown click--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
					.click();
			Thread.sleep(3000);
			// -- Connector select--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
					.click();
			Thread.sleep(2000);
			//-- Filter click--///
			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			//-- Column click--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			//-- column Select--//
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
			//value sendkeys--//
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Testing");
			//-- Apply click--//
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(4000);
			WebElement elementToHoverM = driver.findElement(By.xpath("//span[contains(text(),'Structured Data')]"));
			Actions actionsClick = new Actions(driver);
			actionsClick.moveToElement(elementToHoverM).perform();
			WebElement Connector = driver.findElement(By.xpath("//i[contains(text(),'mode_edit')]"));
			Connector.click();
			Thread.sleep(3000);
			//-- TestConnection click--//
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
			driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
			Thread.sleep(3000);
			
	}
	  @DataProvider(name = "loginCredentials")
	  public Object[][] provideLoginData() {
	      return new Object[][] {
	          {"RA", "Vision@123"},
	          {"RA", "vision@123"},
	          {"QW", "Vision@123"},
	      };
	  }
}
