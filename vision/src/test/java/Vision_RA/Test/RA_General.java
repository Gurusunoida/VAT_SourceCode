package Vision_RA.Test; //////---- VAT_UserSetup = "VAT00" need to change------/////

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Package_PageObject.Login;
import Package_PageObject.POM_General;

public class RA_General extends BaseClass {

	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	ExtentTest currentTest = test.get();

	String VarDesc = "VAT";
	String VAT = "VAT";
	String Approved = "Approved";
	String Businessline_ID = "VAT_Auto";
	String Businessline_DESC = "VAT_Business";
	String VAT_UserSetup = "VAT009";
	String Password = "Vision@123";

	private Login LoginPage;
	private POM_General RA_General;

	@BeforeMethod
	public void setUpLogin() {
		LoginPage = new Login(driver);
		RA_General = new POM_General(driver);
	}

	@DataProvider(name = "loginCredentials")
	public Object[][] getUserNameList() {
		return new Object[][] { { "RA", "Vision@123" }, };
	}

   @Test(priority = 1, dataProvider = "loginCredentials")
   @TestDescription("If there is no Records from the Selected date No Records found should Display")
	public void RA_GL_006(String username, String password) throws InterruptedException {
	   String ScreenName = "General";
		String testCaseId = "RA_GL_006";
      String notes = "If there is no Records from the Selected date No Records found should Display";
      ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
      LoginPage.loginUsername(username);
      LoginPage.loginPassword(password);
      LoginPage.LoginClick();
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
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);// -- Variance Flagging click--//
		// -- Add in Variance flagging--//
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		// -- Description Sendkeys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(VarDesc);
		// -- Variance flagging click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// --Business date from click--//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(2000);
		// --Business date from Select--//
		driver.findElement(By.xpath("//div[normalize-space()='1']")).click();
		// -- Business date To Click-//
		driver.findElement(By.xpath(
				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		Thread.sleep(2000);
		// --Business date To Select--//
		driver.findElement(By.xpath("//div[normalize-space()='1']")).click();
		//-- Query Click--//
		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
		Thread.sleep(2000);
		WebElement TexttoDisplay = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]"));
		String Text = TexttoDisplay.getText();
		System.out.println(Text);
		Thread.sleep(2000);
		 //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\RA_GL_006.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" RA_GL_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("RA_GL_006 Failed to save screenshot: " + e.getMessage());
		}
	}
	 @Test( priority = 2, dataProvider = "loginCredentials")
	 @TestDescription("Proper Report option should display")
		public void RA_GL_009(String username, String password) throws InterruptedException {
		 String ScreenName = "General";
			String testCaseId = "RA_GL_009";
	      String notes = "Proper Report option should display";
	      ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	      LoginPage.loginUsername(username);
	      LoginPage.loginPassword(password);
	      LoginPage.LoginClick();
			Thread.sleep(5000);
			WebElement elementToHoverA = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"));
			Actions actionshoverA = new Actions(driver);
			actionshoverA.moveToElement(elementToHoverA).perform();
			Thread.sleep(2000);
			WebElement elementToHoverB = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"));
			Actions actionshoverB = new Actions(driver);
			actionshoverB.moveToElement(elementToHoverB).perform();
			Thread.sleep(2000);
			WebElement elementToHoverC = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"));
			Actions actionshoverC = new Actions(driver);
			actionshoverC.moveToElement(elementToHoverC).perform();
			Thread.sleep(2000);	
	 }
	 @Test( priority = 3, dataProvider = "loginCredentials")
	 @TestDescription("The Records gets Rejected")
		public void RA_GL_005(String username, String password) throws InterruptedException {
		 String ScreenName = "General";
			String testCaseId = "RA_GL_005";
	      String notes = "The Records gets Rejected";
	      ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	      LoginPage.loginUsername(username);
	      LoginPage.loginPassword(password);
	      LoginPage.LoginClick();
	      Thread.sleep(5000);
	      //-- RA Parameter click--//
	      driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")).click();
	      Thread.sleep(2000);	
	      //-- Master config click--//
	      driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
	      Thread.sleep(2000);	
	      //-- Transline config click--//
	      driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
	      Thread.sleep(5000);
	      RA_General.FILTER();
	      RA_General.FilterColumnclick();
	      Thread.sleep(2000);
	      //-- Column select --//
	      driver.findElement(By.xpath("//span[contains(text(),'Trans Line Record Indicator')]")).click();
	      //-- Value send keys--//
	      driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Add");
	      //-- Apply click--//
	      driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
	      Thread.sleep(5000);
	      WebElement ElementToHover = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]"));
	      Actions RejectClick = new Actions(driver);
	      RejectClick.moveToElement(ElementToHover).perform();
	      WebElement Reject = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[5]/i[1]"));
	      Reject.click();
	      Thread.sleep(5000);
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	      WebElement Popup = driver.findElement(By.xpath("//button[contains(text(),'No')]"));
	      Actions actions = new Actions(driver);
	      actions.sendKeys(Keys.SPACE).perform();
	      actions.sendKeys(Keys.SPACE).perform();
	      Thread.sleep(2000);
	      WebElement RejectSuccess =  driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
	      String Text = RejectSuccess.getText();
	      System.out.println(Text);
	      currentTest.log(Status.FAIL,notes);
	     
	 }
	@Test(priority = 4, dataProvider = "loginCredentials")
	@TestDescription("Data should be properly aligned (If multiple entity occurs scroll down function should be enabled.)")
	public void RA_GL_014(String username, String password) throws InterruptedException {
		String ScreenName = "General";
		String testCaseId = "RA_GL_014";
		String notes = "Data should be properly aligned (If multiple entity occurs scroll down function should be enabled.)";
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(5000);
		RA_General.BusinessDropdown();
		Actions actions = new Actions(driver);
		WebElement elementTarget = driver.findElement(By.xpath(
				" //body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[3]/div[1]"));
		actions.moveToElement(elementTarget);
		WebElement Target = driver.findElement(By.xpath("//tbody/tr[8]/td[1]"));
		actions.scrollToElement(Target);
		actions.perform();
		Target.click();
		Thread.sleep(3000);

	}
	@Test(dataProvider = "loginCredentials", priority = 5)
	@TestDescription("Transline description should be displayed in Header of business line")
	public void RA_GL_015(String username, String password) throws InterruptedException {
		String ScreenName = "BusinessLine Configuration";
		String testCaseId = "RA_GL_015";
        String notes = "Transline description should be displayed in Header of business line";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(username);
        LoginPage.loginPassword(password);
        LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- Master Configuration tab Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(4000);
		// -- MAster Config Dropdown Click
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		// --- TransLine Config
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(7000);
		// -- Edit Button in Manin screen of Trans Line--//
		// -- Filter click--//
		driver.findElement(By.xpath("//i[contains(text(),'filter_alt')]")).click();
		// -- Filter column click--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(4000);
		// -- Filter Column select--//
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Criteria click--/
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		//-- Criteria select--//
		driver.findElement(By.xpath("//span[contains(text(),'Equals...')]")).click();
		// -- Value sendkeys--//
		driver.findElement(By.xpath(
				"//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys(VAT);
		// -- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		//--Edit CLick--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]/i[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).clear();
		//-- Description send keys--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).sendKeys("VAT123");
		//-- Modify--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(10000);
		// -- Business Line Config  click--//
		driver.findElement(By.xpath("//span[contains(text(),'Business Line Configuration')]")).click();
		WebElement TransText = driver.findElement(By.xpath("//span[contains(text(),'VAT123')]"));
		String Text = TransText.getText();
		System.out.println(Text);
		Thread.sleep(5000);
		String EnteredText = "VAT123";
		Assert.assertEquals(EnteredText, Text);
		//-- Transline click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
		Thread.sleep(5000);
		//-- Reject click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
	}
	@Test(dataProvider = "loginCredentials", priority = 6)
	@TestDescription("New record should be added , Updated changes should be modified, The record should get approved(Add pending Status should change to approved), The record should get approved(Modify pending status should change to approved).")
	public void RA_GL_018(String username, String password) throws InterruptedException {
		String ScreenName = "User Setup";
		String testCaseId = "RA_GL_018";
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- RA Admin Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- RA Admin dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- User setup click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		// -- Add click--//
		RA_General.ADD();
		Thread.sleep(5000);
		// -- Login ID Send keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(VAT_UserSetup);
		// -- User name send keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]"))
				.sendKeys(VAT_UserSetup);
		// -- Password send keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Password);
		// -- User group dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Dropdown select--//
		driver.findElement(By.xpath("//span[contains(text(),'System Administrator')]")).click();
		// -- User profile click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[2]"))
				.click();
		Thread.sleep(2000);
		// -- Select--//
		driver.findElement(By.xpath("//span[contains(text(),'Admin User')]")).click();
		// -- Save click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		WebElement Success = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String TextAdd = Success.getText();
		System.out.println(TextAdd);
		Assert.assertEquals(TextAdd, "Vision Users - Add - Successful");
		Thread.sleep(5000);
		// -- Password send keys--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
				.sendKeys(Password);
		Thread.sleep(2000);
		// -- Modify CLick--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		// -- Modify Msg--//
		WebElement Msg = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String TextModify = Msg.getText();
		System.out.println(TextModify);
		Assert.assertEquals(TextModify, "Vision Users - Modify - Successful");
		Thread.sleep(8000);
		RA_General.UserProfile();
		Thread.sleep(2000);
		// -- Logout Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]"))
				.click();
		Thread.sleep(2000);
		LoginPage.loginUsername("System");
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- RA Admin Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- RA Admin dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- User setup click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_UserSetup);
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHover = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/span[1]	"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		WebElement Approve = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
		Approve.click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		WebElement elementToHover1 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/span[1]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(elementToHover1).perform();
		WebElement Edit1 = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[2]/a[2]/i[1]"));
		Edit1.click();
		Thread.sleep(5000);
		//-- Modify click--//
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-user-setup[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(8000);
		RA_General.UserProfile();
		Thread.sleep(2000);
		// -- Logout Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]"))
				.click();
		Thread.sleep(2000);
		LoginPage.loginUsername(username);
		LoginPage.loginPassword(password);
		LoginPage.LoginClick();
		Thread.sleep(7000);
		// -- RA Admin Click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(2000);
		// -- RA Admin dropdown click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		// -- User setup click--//
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]"))
				.click();
		Thread.sleep(5000);
		RA_General.FILTER();
		RA_General.FilterColumnclick();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		//-- Value send keys--//
		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(VAT_UserSetup);
		//-- Apply click--//
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		WebElement elementToHover11 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/span[1]	"));
		Actions actions11 = new Actions(driver);
		actions11.moveToElement(elementToHover11).perform();
		WebElement Approve1 = driver.findElement(By.xpath("//i[contains(text(),'done')]"));
		Approve1.click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		WebElement ApproveMsg = driver.findElement(By.xpath("//div[contains(text(),'- Successful')]"));
		String ApproveText = ApproveMsg.getText();
		System.out.println(ApproveText);
		Assert.assertEquals(ApproveText, "Vision Users - Approve - Successful");
		Thread.sleep(2000);
		String notes = TextAdd + TextModify + ApproveText ;
		ListenersRA.reportTestDetails1(ScreenName, testCaseId, notes);
	}

}
