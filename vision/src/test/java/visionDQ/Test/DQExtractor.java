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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DQExtractor {
	int PrimaryKey1 = 1;
	int PrimaryKey2 = 2;
	int PrimaryKey3 = 1;
	int intValue = 12345;
	String Primary1 = Integer.toString(PrimaryKey1);
	String Primary2 = Integer.toString(PrimaryKey2);
	String Primary3 = Integer.toString(PrimaryKey3);
	String FilterTable = "VAT";
	String AddConnector = "VAT_SE_TST_001";
	String AddConnector1 = "VAT_tst";
	String DBIP = "10.16.1.38";
	int Port = 52866;
	String DBPort = Integer.toString(Port);
	String DBUser = "vision";
	String DBPwd = "Vision_RA";
	String DBName = "VISION_RA";
	String DBInstance = "VISION_RA";

	WebDriver driver;
	ExtentReports report_extent;
	ExtentTest eTest;

	@Parameters("ApplicationURL")
	@BeforeMethod
	public void BrowserOpening(String applicationURL) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
		String File = System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter Report = new ExtentSparkReporter(File);
		//-- Configuration of report
		Report.config().setReportName("DQ_Test_report");
		Report.config().setDocumentTitle("DQ_Tilte");
		//-- Attaching details 
		report_extent = new ExtentReports();
		report_extent.attachReporter(Report);
		report_extent.setSystemInfo("Tested", "QA");
	}

	@AfterMethod
	public void closeDriver() {
		if (driver != null) {
			driver.quit();
			report_extent.flush();
		}
	}

	@Test(priority = 1, dataProvider = "getUserNameList")
	public void DQ_DE_005(String loginName, String loginPwd) throws InterruptedException {
		eTest = report_extent.createTest("Test starting");
		eTest.info("DQ_DE_005");
		// --Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		// --Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		// --Login Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
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
	}

	@Test(priority = 2, dataProvider = "getUserNameList")
	public void DQ_DE_002(String loginName, String loginPwd) throws InterruptedException {
		eTest = report_extent.createTest("Test starting");
		eTest.info("DQ_DE_002");
		// --Username Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		// --Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		// --Login Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Extractor Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
				.click();
		Thread.sleep(3000);
		// -- Add tables click--//
		WebElement elementToHoverExtractor = driver.findElement(By.xpath("//span[contains(text(),'VAT_SE_TST')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverExtractor).perform();
		WebElement VAT = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/div[1]/div[1]/span[1]"));
		VAT.click();
		Thread.sleep(2000);
		// -- Filter table send keys--//
		driver.findElement(By.xpath("//input[@id='live-search-box']")).sendKeys(FilterTable);
		// --Select all click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Next click--//
		driver.findElement(By.xpath("//button[@id='list-next']")).click();
		// -- Finish Click--//
		driver.findElement(By.xpath("//button[@id='list-finish']")).click();
		Thread.sleep(2000);
		// -- To get text--//
		WebElement DataProfiler = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Extractortext = DataProfiler.getText();
		System.out.println(Extractortext);
	}

	@Test(priority = 3, dataProvider = "getUserNameList")
	public void DQ_DE_001(String loginName, String loginPwd) throws InterruptedException {
		eTest = report_extent.createTest("Test starting");
		eTest.info("DQ_DE_001");
		// --Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		// --Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		// --Login Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Extractor Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
				.click();
		Thread.sleep(2000);
		WebElement elementToHoverExtractor = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverExtractor).perform();
		WebElement VAT = driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"));
		VAT.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Vat_03')]")).click();
		Thread.sleep(3000);
		WebElement PrimaryKey1 = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]"));
		PrimaryKey1.click();
		PrimaryKey1.sendKeys(Primary1);
		WebElement PrimaryKey2 = driver.findElement(By.xpath("//tbody/tr[2]/td[5]/input[1]"));
		PrimaryKey2.click();
		PrimaryKey2.sendKeys(Primary2);
		Thread.sleep(3000);
		
	}
	@Test(priority = 4, dataProvider = "getUserNameList")
	public void DQ_DE_014(String loginName, String loginPwd) throws InterruptedException {
		eTest.info("DQ_DE_014");
		// --Username Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		// --Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		// --Login Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Extractor Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
				.click();
		Thread.sleep(2000);
		// --VAT Extractor Click--//
		WebElement elementToHoverExtractor = driver.findElement(By.xpath("//span[contains(text(),'VAT_SE_TST')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverExtractor).perform();
		WebElement VAT = driver.findElement(By.xpath("//span[contains(text(),'VAT_SE_TST')]"));
		VAT.click();
		// -- +icon Click in Extractor--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/div[1]/div[1]/span[1]"))
				.click();
		// -- Sendkeys in Filter--//
		driver.findElement(By.xpath("//input[@id='live-search-box']")).sendKeys(FilterTable);
		Thread.sleep(2000);
		// -- Checkbox Tick--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/virtual-scroller[1]/div[2]/div[1]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		// -- Next Button--//
		driver.findElement(By.xpath("//button[@id='list-next']")).click();
		Thread.sleep(2000);
		// -- Finish Buttom--//
		driver.findElement(By.xpath("//button[@id='list-finish']")).click();
		Thread.sleep(3000);
		// -- To get text--//
		WebElement DataProfiler = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String Extractortext = DataProfiler.getText();
		System.out.println(Extractortext);
	}

	@Test(priority = 5, dataProvider = "getUserNameList")
	public void DQ_DE_006(String loginName, String loginPwd) throws InterruptedException {
		eTest.info("DQ_DE_006");
		// --Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		// --Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		// --Login Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
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
		Thread.sleep(3000);
	}

	@Test(priority = 6, dataProvider = "getUserNameList")
	public void DQ_DE_007(String loginName, String loginPwd) throws InterruptedException {
		eTest.info("DQ_DE_007");
		// --Usernamee Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		// --Password Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		// --Login Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Extractor Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
				.click();
		Thread.sleep(2000);
		// --Project Select--//
		driver.findElement(By.xpath("//span[contains(text(),'VAT_SE_TST')]")).click();
		Thread.sleep(2000);
		// -- +icon Click in Extractor--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- Sendkeys in Filter--//
		driver.findElement(By.xpath("//input[@id='live-search-box']")).sendKeys(FilterTable);
		Thread.sleep(2000);
		// -- Checkbox Tick--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/virtual-scroller[1]/div[2]/div[1]/div[1]/label[1]/span[1]/span[1]"))
				.click();
		// -- Next Button--//
		driver.findElement(By.xpath("//button[@id='list-next']")).click();
		Thread.sleep(2000);
		// -- Finish Buttom--//
		driver.findElement(By.xpath("//button[@id='list-finish']")).click();
		Thread.sleep(3000);
	}
//
//	/*
//	 * // @Test(priority = 7, dataProvider = "getUserNameList")////////----- Not
//	 * required----///// // public void DQ_DE_008 (String loginName, String
//	 * loginPwd) throws InterruptedException { // //--Usernamee Click--// //
//	 * driver.findElement(By.xpath( //
//	 * "//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"
//	 * )) // .sendKeys(loginName); // //--Password Click--// //
//	 * driver.findElement(By.xpath( //
//	 * "//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"
//	 * )) // .sendKeys(loginPwd); // //--Login Click--// // driver.findElement(By //
//	 * .xpath(
//	 * "//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"
//	 * )) // .click(); // Thread.sleep(5000); // //-- Extractor Click--// //
//	 * driver.findElement(By.xpath(
//	 * "//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"
//	 * )).click(); // Thread.sleep(2000); // //--Project Select--// //
//	 * driver.findElement(By.xpath("//span[contains(text(),'VAT_SE_TST')]")).click()
//	 * ; // Thread.sleep(2000); // //--Edit Button--// //
//	 * driver.findElement(By.xpath(
//	 * "//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/div[1]/div[1]/span[2]"
//	 * )).click(); // Thread.sleep(2000); // }
//	 */
//	@Test(priority = 8, dataProvider = "getUserNameList")
//	public void DQ_DE_009(String loginName, String loginPwd) throws InterruptedException {
//		eTest.info("DQ_DE_009");
//		// --Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		// --Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		// --Login Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Extractor Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Project Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'vat')]")).click();
//		Thread.sleep(3000);
//		// --Delete in Connector--//
//		WebElement elementToHoverConnector = driver.findElement(By.xpath("//span[contains(text(),'vat')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverConnector).perform();
//		WebElement Delete = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[9]/div[1]/tree-node-wrapper[1]/div[1]/div[1]/tree-node-content[1]/div[1]/div[1]/span[3]"));
//		Delete.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 9, dataProvider = "getUserNameList")
//	public void DQ_DE_003(String loginName, String loginPwd) throws InterruptedException {
//		eTest.info("DQ_DE_003");
//		// --Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		// --Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		// --Login Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Extractor Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Project Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SE_TST')]")).click();
//		WebElement elementToHoverConnector = driver.findElement(By.xpath("//span[contains(text(),'Vat_03')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverConnector).perform();
//		elementToHoverConnector.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/label[1]/span[1]")).click();
//		driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/label[1]/span[1]")).click();
//		driver.findElement(By.xpath("//tbody/tr[3]/td[7]/div[1]/label[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fa-icon[1]/*[1]"))
//				.click();
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 10, dataProvider = "getUserNameList")
//	public void DQ_DE_010(String loginName, String loginPwd) throws InterruptedException {
//		eTest.info("DQ_DE_010");
//		// --Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		// --Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		// --Login Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Extractor Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Add connector --//
//		driver.findElement(By.xpath("//span[contains(text(),'+ Add Connector')]")).click();
//		// -- Connection Name--//
//		driver.findElement(By.xpath("//input[@id='connectionName']")).sendKeys(AddConnector1);
//		Thread.sleep(3000);
//		// -- Source type dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Source type dropdown Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Database')]")).click();
//		// -- Endpoint Type Dropdown Click--//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Endpoint Type Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- Connector type Dropdown CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Connector type Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'SQL Server')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[3]/button[3]")).click();
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 11, dataProvider = "getUserNameList")
//	public void DQ_DE_011(String loginName, String loginPwd) throws InterruptedException {
//		eTest.info("DQ_DE_011");
//		// --Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		// --Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		// --Login Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Extractor Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Project Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'VAT_SE_TST')]")).click();
//		WebElement elementToHoverConnector = driver.findElement(By.xpath("//span[contains(text(),'Vat_Error_Codes')]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverConnector).perform();
//		elementToHoverConnector.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/label[1]/span[1]")).click();
//		driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/label[1]/span[1]")).click();
//		driver.findElement(By.xpath("//tbody/tr[3]/td[7]/div[1]/label[1]/span[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fa-icon[1]/*[1]"))
//				.click();
//		Thread.sleep(5000);
//		WebElement maskingText = driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"));
//		String AfterMasking = maskingText.getText();
//		System.out.println(AfterMasking);
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 12, dataProvider = "getUserNameList")
//	public void DQ_DE_004(String loginName, String loginPwd) throws InterruptedException {
//		eTest.info("DQ_DE_004");
//		// --Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		// --Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		// --Login Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Extractor Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(2000);
//		// -- Add connector --//
//		driver.findElement(By.xpath("//span[contains(text(),'+ Add Connector')]")).click();
//		// -- Connection Name--//
//		driver.findElement(By.xpath("//input[@id='connectionName']")).sendKeys(AddConnector1);
//		Thread.sleep(3000);
//		// -- Source type dropdown click--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Source type dropdown Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Database')]")).click();
//		// -- Endpoint Type Dropdown Click--//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Endpoint Type Select--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		// -- Connector type Dropdown CLick--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);
//		// -- Connector type Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'SQL Server')]")).click();
//		Thread.sleep(2000);
//		// -- DB IP--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
//				.sendKeys(DBIP);
//		// --DB Port--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
//				.sendKeys(DBPort);
//		// -- DB User--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys(DBUser);
//		// --DBPwd--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys(DBPwd);
//		// --DBName--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[5]/input[1]"))
//				.sendKeys(DBName);
//		// --DBInstance--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/input[1]"))
//				.sendKeys(DBInstance);
//		Thread.sleep(3000);
//		// --Test Connection Button--//
//		driver.findElement(By.xpath("//button[contains(text(),'Test Connection')]")).click();
//		Thread.sleep(2000);
//		// --Add Button--//
//		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
//		Thread.sleep(3000);
//		WebElement Extractor = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
//		String DataExtractor = Extractor.getText();
//		System.out.println(DataExtractor);
//	}
//
//	@Test(priority = 13, dataProvider = "getUserNameList")
//	public void DQ_DE_013(String loginName, String loginPwd) throws InterruptedException {
//		eTest.info("DQ_DE_013");
//		// --Usernamee Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys(loginName);
//		// --Password Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys(loginPwd);
//		// --Login Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login-new-design[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		// -- Extractor Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(2000);
//		WebElement elementToHoverExtractor = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverExtractor).perform();
//		WebElement VAT = driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main[1]/div[1]/div[2]/div[1]/app-data-extractor[1]/div[1]/div[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/tree-root[1]/tree-viewport[1]/div[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[1]/div[1]/tree-node-children[1]/div[1]/tree-node-collection[1]/div[1]/tree-node[5]/div[1]/tree-node-wrapper[1]/div[1]/tree-node-expander[1]/span[1]/span[1]"));
//		VAT.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Vat_03')]")).click();
//		Thread.sleep(3000);
//		WebElement PrimaryKey1 = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]"));
//		PrimaryKey1.click();
//		PrimaryKey1.sendKeys(Primary1);
//		WebElement PrimaryKey2 = driver.findElement(By.xpath("//tbody/tr[2]/td[5]/input[1]"));
//		PrimaryKey2.click();
//		PrimaryKey2.sendKeys(Primary3);
//		Thread.sleep(3000);
//	}

	@DataProvider(name = "getUserNameList")
	public Object[][] getUserNameList() {
		Object[][] loginDetails = new Object[1][2];
		loginDetails[0][0] = "bb.satyaprakash";
		loginDetails[0][1] = "Vision@123";
		return loginDetails;
	}

}
