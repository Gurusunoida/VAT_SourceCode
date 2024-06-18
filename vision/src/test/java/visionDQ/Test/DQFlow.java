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

public class DQFlow {
	WebDriver driver;
	String AddConnector = "VAT_TST_FLOW1";
	String Filter_Search = "VAT_TST_FLOW";
	String DBIP = "10.16.1.38";
	int Port = 52866;
	String DBPort = Integer.toString(Port);
	String DBUser = "vision";
	String DBPwd = "Vision_RA";
	String DBName = "VISION_RA";
	String DBInstance = "VISION_RA";
	String Project_name = "VAT_FLOW";
	String Filter_OutputSchema = "VAT";
	

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
	
	@Test(priority = 1, dataProvider = "getUserNameList")
	public void DQ_MT_001 (String loginName, String loginPwd) throws InterruptedException {
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
		// -- Extractor Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
				.click();
		Thread.sleep(2000);
		// -- Add connector --//
		driver.findElement(By.xpath("//span[contains(text(),'+ Add Connector')]")).click();
		// -- Connection Name--//
		driver.findElement(By.xpath("//input[@id='connectionName']")).sendKeys(AddConnector);
		Thread.sleep(3000);
		// -- Source type dropdown click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		// -- Source type dropdown Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Database')]")).click();
		// -- Endpoint Type Dropdown Click--//
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		// -- Endpoint Type Select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		// -- Connector type Dropdown CLick--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(3000);
		// -- Connector type Select--//
		driver.findElement(By.xpath("//span[contains(text(),'SQL Server')]")).click();
		Thread.sleep(2000);
		// -- DB IP--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(DBIP);
		// --DB Port--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(DBPort);
		// -- DB User--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(DBUser);
		// --DBPwd--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(DBPwd);
		// --DBName--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[5]/input[1]"))
				.sendKeys(DBName);
		// --DBInstance--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/input[1]"))
				.sendKeys(DBInstance);
		Thread.sleep(3000);
		// --Test Connection Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Test Connection')]")).click();
		Thread.sleep(2000);
		// --Add Button--//
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(3000);	
		WebElement elementToHoverExtractor = driver.findElement(By.xpath("//span[contains(text(),'VAT_TST_FLOW1')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverExtractor).perform();
		WebElement Extractor = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[7]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/div[1]/div[1]/span[1]"));
		Extractor.click();
		Thread.sleep(2000);
		//-- Filter table search send keys--//
		driver.findElement(By.xpath("//input[@id='live-search-box']")).sendKeys(Filter_OutputSchema);
		Thread.sleep(2000);
		//-- Select all --//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]/span[1]")).click();
		Thread.sleep(2000);
		//-- Next Click--//
		driver.findElement(By.xpath("//button[@id='list-next']")).click();
		Thread.sleep(2000);
		//-- Finish Click--//
		driver.findElement(By.xpath("//button[@id='list-finish']")).click();
		Thread.sleep(7000);
		//-- Home click--//
		driver.findElement(By.xpath("//i[contains(text(),'home')]")).click();
		Thread.sleep(2000);
		//-- Add project click--//
		driver.findElement(By.xpath("//span[contains(text(),'add_circle_outline')]")).click();
		Thread.sleep(2000);
		//--Project name send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).sendKeys(Project_name);
		Thread.sleep(2000);
		//-- Connection name click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")).click();
		//-- Search in connection name--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[1]/li[2]/input[1]")).sendKeys(Filter_Search);
		Thread.sleep(3000);
		//-- Checkbox tick--//  	   	  
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[1]/div[1]")).click();
		Thread.sleep(2000);
		//-- Data profiler click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).click();
		//-- Data Monitor click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]")).click();
		//-- Data Cleanser click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(2000);
		//-- Check box in project tick--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-checkbox[1]/input[1]")).click();
		Thread.sleep(5000);
		//-- save click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(2000);	
		//-- Project Click--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_FLOW')]")).click();
		//-- Edit Click--//
		driver.findElement(By.xpath("//span[contains(text(),'edit')]")).click();
		Thread.sleep(2000);
		//-- Next CLick--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-create-project-profiler[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
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
