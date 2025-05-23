package Vision_RA.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Package_PageObject.Login;
import Package_PageObject.POM_RA_BusinessLine;
import Package_PageObject.POM_General;
import Package_PageObject.POM_RA;
import Package_PageObject.POM_RA_FeesConfig;
import Package_PageObject.POM_Transline;

public class RA_FullTransLineConfigCreation extends BaseClass {

	String ID = "VAT_Full";
	String RULE_PRIORITY = "1";
	String GraceDays = "1";

	private Login LoginPage;
	private POM_RA RA;
	private POM_General General;
	private POM_Transline Trans;
	private POM_RA_BusinessLine BusinessLine;
	private POM_RA_FeesConfig Fees;

	@BeforeMethod
	public void setUpLogin() {
		LoginPage = new Login(driver);
		RA = new POM_RA(driver);
		General = new POM_General(driver);
		Trans = new POM_Transline(driver);
		BusinessLine = new POM_RA_BusinessLine(driver);
	}

	@Test(dataProvider = "loginCredentials", priority = 1)
	public void VAT_TBF01(String username, String password) throws InterruptedException {
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
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);// -- MAster Config Dropdown Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
		// --- TransLine Config--//
		RA.Transline();
		Thread.sleep(4000);
		General.ADD();
		Trans.TranslineID(ID);
		Trans.TranslineDesc(ID);
		Trans.ProductlineType();
		Trans.ProductSelectAsset();
		Trans.TranslineGroupProduct();
		Trans.GroupProductCASA();
		Trans.Businessvertical();
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		Trans.ExtractionFreqClick();
		Trans.ExtractioDaily();
		Trans.ProductTypGridClick();
		Trans.ProductTypeGridSelectFD();
		Trans.ProductDescClick();
		Trans.Currency();
		Thread.sleep(2000);
		Trans.TranslineSave();
		Trans.SuccessToaster();
		Thread.sleep(8000);
		RA.Businessline();
		BusinessLine.BusinessLineID(ID);
		BusinessLine.BusinesslineDesc(ID);
		BusinessLine.BusinessLineType();
		BusinessLine.BusinessLineTypeExpense();
		BusinessLine.IEType();
		BusinessLine.IESelect();
		BusinessLine.ServiceTypeclick();
		BusinessLine.ServiceTypeSelect();
		BusinessLine.ServiceDescClick();
		BusinessLine.ServideDesSelect();
		BusinessLine.CurrencyClick();
		BusinessLine.CurrencySelect();
		BusinessLine.GLCode();
		BusinessLine.GLSelect();
		BusinessLine.AccountClick();
		BusinessLine.AccountSelect();
		BusinessLine.ReconClick();
		BusinessLine.RulePriority(RULE_PRIORITY);
		BusinessLine.RuleID_Dropdown();
		BusinessLine.RuleSelect();
		BusinessLine.ReconTypeDropdown();
		BusinessLine.ReconTypeSelect();
		BusinessLine.ReconMethodDropdown();
		BusinessLine.ReconMethodSelect();
		BusinessLine.GraceDays(GraceDays);
		BusinessLine.BusinesslineSave();
		Trans.SuccessToaster();
		Thread.sleep(8000);
		RA.FeesConfig();
		Fees.FeeTypeClick();
		Fees.FeeTypeSelectFlat();
		

//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(2000);// --- Add in Trans line Config
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
//				.sendKeys("VAT_RA");
//		Thread.sleep(2000);// -- Trans Line ID send Key--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys("VAT_RA");
//		Thread.sleep(2000);// -- Trans Line Description--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);// ---Product Line DropDown--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(2000);// --Product Line Click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);// --Trans line Group Drop down--//
//		driver.findElement(By.xpath("//span[contains(text(),'Loan (A) Product')]")).click();
//		Thread.sleep(2000);// -- Trans line group Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]"))
//				.click();
//		Thread.sleep(2000);// --Business Vertical Dropdown--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[2]/ul[2]/li[6]/div[1]"))
//				.click();// --Business Vertical Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);// --extraction frequency dropdown--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(5000);// --extraction frequency Select--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);// --Product Type Dropdown--///
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(3000);// --Product Type Dropdown Select--///
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(3000);// --Product Description Dropdown--///
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
//		Thread.sleep(3000);// --Product Description Dropdown Select--///
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();// --Currency //
//		// Dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();
//		Thread.sleep(3000);// --Currency Select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();
//		Thread.sleep(8000);// --Save button
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[4]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("System");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();// --login Click
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);// --- TransLine Config
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		Thread.sleep(5000);// --Reload
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[4]/i[1]"))
//				.click();// Approve
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);// Approve Popup for Yes--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
//				.click();
//		Thread.sleep(5000);// --edit//
//		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
//		Thread.sleep(2000);// --Business Line --//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
//				.sendKeys("VAT_RA");// --Business Line ID--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]"))
//				.sendKeys("VAT_RA");// --Business Line Description--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]"))
//				.click();// --Business Line Type dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Income')]")).click();// --Business Line Type dropdown
//																					// Select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);// --Income /expense dropdown--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();// --Income
//																											// /expense
//																											// dropdown
//																											// Select--//
//		driver.findElement(By.xpath("//span[contains(text(),'Details')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();// --Service Type Dropdown--//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();// --Service
//																													// type
//																													// dropdown
//																													// Select--//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();// --
//																												// Service
//																												// Description
//																												// drop
//																												// down--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();// -- Service
//																											// Description
//																											// drop down
//																											// Select--//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();// --Currency
//																												// dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'AED')]")).click();// -- Currency Select--//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();// --GL Code Click--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-magnifier[1]/div[2]/div[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"))
//				.click();// --- GL Code Seleect---//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]")).click();// -- Account number click--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[contains(text(),'01110011')]")).click();// -- Account number select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Recon Rule')]")).click();
//		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).sendKeys("1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Contract Wise')]")).click();					
//		driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Recon Backdated')]")).click();		
//		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'First In First Out')]")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")).sendKeys("20");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[2]/div[1]/div[1]/button[1]"))
//				.click();// -- Save--//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[4]/button[1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("RA");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();// --login Click
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
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);// --- TransLine Config
//		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
//		Thread.sleep(5000);// --Reload
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[4]/i[1]"))
//				.click();// Approve
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);// Approve Popup for Yes--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/i[1]"))
//				.click();
//		Thread.sleep(2000);// edit button--//
//		driver.findElement(By.xpath("//span[contains(text(),'Fees Configuration')]")).click();
//		Thread.sleep(2000);// --fees congig--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(2000);// --fee type dropdown--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"))
//				.click();
//		Thread.sleep(2000);// --fee type select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]"))
//				.click();
//		Thread.sleep(2000);// -- fee basis dropdown--//
//		driver.findElement(By.xpath("//span[contains(text(),'Percentage')]")).click();// -- fee basis select--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[1]/button[1]"))
//				.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[2]/div[1]"))
//				.click();// -- add button--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(2000); // -- Channel type dropdown--//
//		driver.findElement(By.xpath("//span[contains(text(),'Mobile Banking')]")).click();// --- Channel type select--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(2000);// channel code dropdown--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]"))
//				.click();// -- channel code dropdown select--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(2000);// --buusiness vertical dropdown--//
//		driver.findElement(By.xpath("//span[contains(text(),'Treasury')]")).click();// -- business vertical select--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]"))
//				.click();// --customer id click--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//tbody/tr[7]/td[2]")).click();// -- customer id// select--//																				
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]"))
//				.click();// -- contract id click--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[contains(text(),'0205428840906')]")).click();// -- contract id select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[8]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();// --product type dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Loan Account')]")).click();// --product type dropdown
//																						// select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[9]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();// -- product description dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'03001 - Home Mortgage Loan')]")).click();// -- product
//																										// description
//																										// dropdown
//																										// select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[18]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();// -- transaction currency--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"))
//				.click();// -- transaction currency select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(2000); // -- posting currency--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]"))
//				.click();
//		Thread.sleep(2000);// -- posting currency select--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(2000);// -- currency conversion type --//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]"))
//				.click();// -- currency converssiont select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[3]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(2000); // -- look up amount type--//
//		driver.findElement(By.xpath("//span[contains(text(),'Expected Amt')]")).click();
//		Thread.sleep(2000);// -- look up amount type select--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[4]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();
//		Thread.sleep(3000);// -- percentage amount type--//
//		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
//		Thread.sleep(2000);// -- percentage amount type select--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
//				.clear();// -- Interest basis--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]"))
//				.sendKeys("200");// -- Interest basis--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[6]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();// -- round of basis dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
//				.click();// -- round of basis dropdown select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[9]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
//				.click();// -- fee basis dropdown--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]"))
//				.click();// -- fee basis select--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
//				.clear();// -- min fee amount--//
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[11]/div[1]/input[1]"))
//				.sendKeys("0.00");// -- min fee amount--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
//				.clear();// -- max fee amount--//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[12]/div[1]/div[1]/input[1]"))
//				.sendKeys("1234567890");// -- max fee amount--//
//		//-- Fee Amount/ Percentage--//
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).click();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).clear();
//		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[3]/div[10]/div[1]/input[1]")).sendKeys("123");
//		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
//		//-- Save Button--//
//		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[2]/div[1]/button[1]")).click();
//		Thread.sleep(5000);
	}

	@DataProvider(name = "loginCredentials")
	public Object[][] provideLoginData() {
		return new Object[][] { { "RA", "Vision@123" } };
	}
}
