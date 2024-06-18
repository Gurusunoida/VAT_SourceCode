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

public class FeedCreation {
	WebDriver driver;
	String str = "VAT_";
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

	@Test(priority = 9) // -- Feed Configuration--//
	public void FullETL9() throws InterruptedException {
	    for (int i = 70; i <=90; i++) {
	        String Id = str + i;
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
				.sendKeys(Id);// -- Feed Name--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();// -- Feed Category Click--//
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]"));
		actions.moveToElement(element);
		Thread.sleep(5000);
		WebElement categoryID = driver
				.findElement(By.xpath("//span[contains(text(),'VAT_CATEGORY_26 - VAT_Category_26')]"));
		actions.scrollToElement(categoryID);
		actions.perform();
		Thread.sleep(5000);// -- Feed Category ID Select--//
		categoryID.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-feed-setup-form[1]/div[1]/form[1]/div[1]/div[5]/div[1]/textarea[1]"))
				.sendKeys(Id);// -- Description
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();// -- Apply--//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Source Setup')]")).click();// -- Source Setup Click--//
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".sourceSetup > span")).click();
		// -- Add connector search--//
		driver.findElement(By.name("connecterSearch")).click();
		Thread.sleep(2000);
		// -- Connector click--//
		Actions actionsTarget = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-source-setup-form[1]/div[1]/div[1]/div[3]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actionsTarget.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.cssSelector(".connecterSearchList:nth-child(36)"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//span[contains(text(),'VAT_FLOW')]"))
				.click();
		Thread.sleep(3000);
		//-- Filter click --//
		driver.findElement(By.xpath("//input[@id='filter']")).click();
		//--filter sendkeys--//
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("VAT_CAT_26_BKP");
		//-- Search click--//
		driver.findElement(By.xpath("//i[contains(text(),'search')]")).click();
		Thread.sleep(2000);
		//-- Check box tick--//		
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[2]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-checkbox[1]/input[1]")).click();
		Thread.sleep(2000);
		// -- Apply Button in Table--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-data-connector-table[1]/div[3]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Apply Button in Source Setup--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-source-setup-form[1]/div[1]/div[3]/button[2]"))
				.click();
		Thread.sleep(2000);
		//-- Next Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		WebElement elementToHoverM = driver.findElement(By.xpath(
				"//span[contains(text(),'VAT_CAT_26_BKP')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Connector = driver.findElement(By.xpath(
				"//span[contains(text(),'VAT_CAT_26_BKP')]"));
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
		//-- Save Button--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-materialized-view-setup-form[1]/div[1]/div[2]/button[3]"))
				.click();
		Thread.sleep(3000);
		//-- Next Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		//--injection type Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[1]"))
				.click();
		//--Injection type select--//
		driver.findElement(By.xpath(
				"//span[contains(text(),'Baseline - Only Insert')]"))
				.click();
		Thread.sleep(2000);
		//--Target connector Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Actions Target11 = new Actions(driver);
		WebElement elementTarget1 = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]"));
		Target11.moveToElement(elementTarget1);
		Thread.sleep(5000);
		WebElement Target111 = driver.findElement(By.xpath(
				"//span[contains(text(),'VAT_FLOW')]"));
		actions.scrollToElement(Target111);
		actions.perform();
		Thread.sleep(5000);
		Target111.click();
		// --Target  Table Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"))
				.click();
		Thread.sleep(4000);
		// -- Target Table Select--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("VAT_CAT_BKP");
		//--Target table Select--//
		driver.findElement(By.xpath("//td[contains(text(),'VAT_CAT_BKP')]")).click();
		Thread.sleep(3000);
		//--Auto connect click--//
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".connection_icon-top > .fa-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".h-100 > .ng-star-inserted:nth-child(1) > span")).click();
		// -- Save --//
		driver.findElement(By.xpath(
				"//button[contains(text(),'Save')]"))
				.click();
		Thread.sleep(2000);
		// -- Next--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-loader-setup[1]/div[1]/div[2]/button[3]"))
				.click();
		Thread.sleep(5000);
		//--Process data type Click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		//-- Scheduler Description--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]"))
				.sendKeys(Id);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/form[1]/div[3]/div[1]/mat-radio-group[1]/mat-radio-button[2]/label[1]/div[1]/div[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-wizard-form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-schedular-setup[1]/div[1]/div[2]/button[2]"))
				.click();
		Thread.sleep(3000);
		// -- Publish Button--//
		driver.findElement(By.xpath("//span[contains(text(),'publish')]")).click();
		// -- Popup for Publish--//
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		//--- Home Click--//
		driver.findElement(By.xpath("//i[contains(text(),'forward')]")).click();
		Thread.sleep(5000);
		//-- USer profile click--//
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		Thread.sleep(2000);
		//-- Logout click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
		Thread.sleep(7000);
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
		WebElement elementToHoverFEED = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/span[1]"));
		Actions actionsClickApprove = new Actions(driver);
		actionsClickApprove.moveToElement(elementToHoverFEED).perform();
		WebElement FEED = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-feed-list[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[2]/a[3]/i[1]"));
		FEED.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(8000);
		//-- USer profile click--//
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		Thread.sleep(2000);
		//-- Logout click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/button[1]")).click();
		Thread.sleep(6000);
	}
	}
}
