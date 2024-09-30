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

public class DQMonitor {
	WebDriver driver;
	
	String By_value = "vision99";

	@Parameters("ApplicationURL")
	@BeforeMethod
	public void BrowserOpening(String applicationURL) throws InterruptedException {
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
//	public void DQ_MT_001 (String loginName, String loginPwd) throws InterruptedException {
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
//		//-- Project Click--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
//		//-- Data Monitor click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[2]/span[1]")).click();
//		Thread.sleep(2000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		WebElement Monitor_click = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]"));
//		Monitor_click.click();
//		Thread.sleep(2000);
//		//--Data monitor Select--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
//		Thread.sleep(2000);
//		//-- Add monitor click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Add Mointor')]")).click();
//		//-- column name select--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[2]/input[1]")).click();
//		//-- Next button click--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
//		Thread.sleep(2000);
//		//-- By Value click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[2]/div[3]/label[1]/input[1]")).click();
//		//-- Search send keys in by value--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")).sendKeys(By_value);
//		Thread.sleep(4000);
//		//-- Select click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/virtual-scroller[1]/div[2]/li[1]/input[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/virtual-scroller[1]/div[2]/li[2]/input[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/virtual-scroller[1]/div[2]/li[3]/input[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/virtual-scroller[1]/div[2]/li[4]/input[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/virtual-scroller[1]/div[2]/li[5]/input[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/virtual-scroller[1]/div[2]/li[6]/input[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/virtual-scroller[1]/div[2]/li[7]/input[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/virtual-scroller[1]/div[2]/li[8]/input[1]")).click();
//		//-- Apply click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[2]/div[1]/div[1]/button[2]")).click();
//		//-- Save click--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/app-rules-configuration-tab[1]/div[2]/div[1]/div[1]/button[3]")).click();
//		Thread.sleep(2000);
//		//-- Back click--//
//		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(4000);
//		//-- Play button--//
//		WebElement elementToHoverMonitor = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
//		Actions actionsClickM = new Actions(driver);
//		actionsClickM.moveToElement(elementToHoverMonitor).perform();
//		WebElement Monitor_clickM = driver.findElement(By.xpath("//i[contains(text(),'play_arrow')]"));
//		Monitor_clickM.click();
//		Thread.sleep(4000);
//		WebElement elementToHoverMonitorStatus = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
//		Actions actionsClickS = new Actions(driver);
//		actionsClickS.moveToElement(elementToHoverMonitorStatus).perform();
//		WebElement Monitor_clickS = driver.findElement(By.xpath("//span[contains(text(),'Yet to Start')]"));
//		String  Status = Monitor_clickS.getText();
//		System.out.println(Status);
//		Thread.sleep(4000);	
//	}
	@Test(priority = 2, dataProvider = "getUserNameList")
	public void DQ_MT_002 (String loginName, String loginPwd) throws InterruptedException {
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
		//-- Project Click--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SEL_TESTING')]")).click();
		//-- Data Monitor click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-table-console[1]/div[1]/div[2]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[2]/span[1]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath("//td[contains(text(),'Vat_03')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Monitor_click = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]/i[1]"));
		Monitor_click.click();
		Thread.sleep(2000);
		//--Data monitor Select--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-monitor-tab[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(2000);
		//-- Add monitor click--//
		driver.findElement(By.xpath("//span[contains(text(),'Add Mointor')]")).click();
		//-- column name select--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[2]/input[1]")).click();
		//-- Next button click--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(2000);
		//-- Custom Click--//
		driver.findElement(By.xpath("//span[contains(text(),'Custom')]")).click();
		//Alpha Click--//
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		//--Special character clcik--//
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
		Thread.sleep(4000);
	}
	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];
		loginDetails[0][0] = "bb.satyaprakash";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}
}
