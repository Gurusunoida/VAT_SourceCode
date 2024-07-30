package visionETL.ETLTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import io.github.bonigarcia.wdm.WebDriverManager;


public class SampleETL {
	
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
	  @Test(priority=1,dataProvider="getUserNameList" )
	  public void tESTconnector1(String loginName, String loginPwd) throws InterruptedException {
		  driver.findElement(By.xpath(
					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
					.sendKeys(loginName);
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
					.sendKeys(loginPwd);
			driver.findElement(By
					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
			driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Semi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			Thread.sleep(2000);
		    // 7 | mouseOut | css=.nav-item:nth-child(1) > .nav > .nav-item .nav-item:nth-child(1) > .nav-link | 
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    Thread.sleep(5000);
		    // 10 | mouseOver | css=#highLightRow0 .modal-trigger:nth-child(2) > .material-icons | 
		    {
		      WebElement element = driver.findElement(By.cssSelector("body.sidebar-mini.body-background:nth-child(2) div.wrapper div.main-panel.ps-container.content-area_bound:nth-child(3) div.content-area:nth-child(2) app-connector.ng-tns-c300-1.ng-star-inserted:nth-child(2) div.card-body.material-table.p-0.ng-tns-c300-1 div.row.m-0.ng-tns-c300-1 div.col-sm-12.col-md-12.col-lg-12.col-xl-12.h-100.p-0.ng-tns-c300-1 div.material-table.dashboard-bg-white.b-radius-12.h-100.m-0.ng-tns-c300-1 app-smart-table.ng-tns-c289-2.ng-tns-c300-1.ng-star-inserted div.table-responsive.ng-tns-c289-2 perfect-scrollbar.ng-tns-c289-2.ng-star-inserted div.ps.ps--active-y div.ps-content table.inlineEditTable tbody.ng-tns-c289-2.ng-star-inserted:nth-child(2) tr.ng-tns-c289-2.ng-star-inserted:nth-child(1) td.ng-tns-c289-2.ng-star-inserted:nth-child(7) div.tr-edit-icons.row.a1.ng-tns-c289-2.ng-star-inserted a.modal-trigger.waves-effect.btn-flat.nopadding.pr-2.ng-tns-c289-2.ng-star-inserted:nth-child(2) > i.material-icons.ng-tns-c289-2"));
		      Actions builder = new Actions(driver);
		      Thread.sleep(2000);
		      builder.moveToElement(element).perform();
		    }
		    // 11 | click | css=#highLightRow0 .modal-trigger:nth-child(2) > .material-icons | 
		    driver.findElement(By.cssSelector("body.sidebar-mini.body-background:nth-child(2) div.wrapper div.main-panel.ps-container.content-area_bound:nth-child(3) div.content-area:nth-child(2) app-connector.ng-tns-c300-1.ng-star-inserted:nth-child(2) div.card-body.material-table.p-0.ng-tns-c300-1 div.row.m-0.ng-tns-c300-1 div.col-sm-12.col-md-12.col-lg-12.col-xl-12.h-100.p-0.ng-tns-c300-1 div.material-table.dashboard-bg-white.b-radius-12.h-100.m-0.ng-tns-c300-1 app-smart-table.ng-tns-c289-2.ng-tns-c300-1.ng-star-inserted div.table-responsive.ng-tns-c289-2 perfect-scrollbar.ng-tns-c289-2.ng-star-inserted div.ps.ps--active-y div.ps-content table.inlineEditTable tbody.ng-tns-c289-2.ng-star-inserted:nth-child(2) tr.ng-tns-c289-2.ng-star-inserted:nth-child(1) td.ng-tns-c289-2.ng-star-inserted:nth-child(7) div.tr-edit-icons.row.a1.ng-tns-c289-2.ng-star-inserted a.modal-trigger.waves-effect.btn-flat.nopadding.pr-2.ng-tns-c289-2.ng-star-inserted:nth-child(2) > i.material-icons.ng-tns-c289-2")).click();
	  }

	  @DataProvider(name = "getUserNameList")
		public Object[][] getUserNameList() {
			Object[][] loginDetails = new Object[1][2];

			loginDetails[0][0] = "Deepak";
			loginDetails[0][1] = "Vision@123";
			return loginDetails;
}
}
