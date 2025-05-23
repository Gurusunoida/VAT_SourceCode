package Vision_BI;

import java.awt.AWTException;                    //--FTP_Seq_ID_App Need to change--//
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.POM_FTPLogin;
import Package_PageObject.POM_FTP_Groups;

public class AdvanceFTP extends BaseClassFTP {

	String FTP_Seq_ID = "668";
	String FTP_Seq_ID_App = "670";
	String FTPDel = "669";
	
	private POM_FTPLogin login;
	private POM_FTP_Groups FTP;

	@BeforeMethod
	public void setup() {
		login = new POM_FTPLogin(driver);
		FTP = new POM_FTP_Groups(driver);
	}

	@DataProvider(name = "loginCredentials")
	public Object[][] getLoginCredentials() {
		String username = getProperty("login.ID2");
		String password = getProperty("login.PASS2");
		return new Object[][] { { username, password } };
	}

	@DataProvider(name = "loginCredentials2")
	public Object[][] getLoginCredentials2() {
		String username = getProperty("login.ID2");
		String password = getProperty("login.PASS2");
		String username2 = getProperty("login.ID3");
		String password2 = getProperty("login.PASS3");
		return new Object[][] { { username, password, username2, password2 } };
	}

	private void takeScreenshot(String testName) throws IOException {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String location = "test-output/Screenshot/FTP/" + testName + ".png";
		File destinationFile = new File(location);
		try {
			FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(testName + " Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println(testName + " Failed to save screenshot: " + e.getMessage());
		}
	}

//	@Test(dataProvider = "loginCredentials", priority = 1)
//	@TestDescription("Verify login using user name and password,Logged in successfully.")
//	public void FTP_GR_001(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_001";
//		String notes = "Verify login using user name and password,Logged in successfully.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		takeScreenshot("FTP_GR_001");
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 2)
//	@TestDescription("Add a New record in FTP-Groups and verify the Status")
//	public void FTP_GR_006(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_006";
//		String notes = "Add a New record in FTP-Groups and verify the Status";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_006");
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 3)
//	@TestDescription("Add a New record in FTP-Groups and verify Pricing")
//	public void FTP_GR_007(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_007";
//		String notes = "Add a New record in FTP-Groups and verify Pricing";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Repricing();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_007");
//		FTP.FTP_Nominal();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_007_1");
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 4)
//	@TestDescription("Add a New record in FTP-Groups and enter Condition vaule,Text filter is not working")
//	public void FTP_GR_010(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_010";
//		String notes = "Add a New record in FTP-Groups and enter Condition vaule,Text filter is not working";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		// -- Source dropdown click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/app-form-dropdown[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		// -- Source select Country--//
//		driver.findElement(By.xpath("//li[contains(text(),'Country')]")).click();
//		Thread.sleep(3000);
//		// --Magnifier click--//
//		driver.findElement(
//				By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/app-magnifier-cntrl[1]/div[1]/div[1]/div[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Country Mag send keys--//
//		driver.findElement(By.xpath("//body/app-popover[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("K");
//		Thread.sleep(2000);
//		// -- Magnifier search click--//
//		driver.findElement(By.xpath("//body/app-popover[1]/div[1]/div[1]/div[1]/span[1]/*[1]")).click();
//		Thread.sleep(5000);
//		WebElement OutPut = driver.findElement(By.xpath("//td[contains(text(),'KE - Kenya')]"));
//		String OutputText = OutPut.getText();
//		String enteredText = "KE - Kenya";
//		// Compare the entered text with the expected text
//		if (OutputText.equals(enteredText)) {
//			System.out.println("Text matches: " + OutputText);
//		} else {
//			System.out.println("Text does not match!");
//			System.out.println("Expected text: " + OutputText);
//			System.out.println("Entered text: " + enteredText);
//		}
//		takeScreenshot("FTP_GR_010");
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 5)
//	@TestDescription("Add a New record in FTP-Groups and enter Condition vaule,All the Condition value should be displyed")
//	public void FTP_GR_011(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_011";
//		String notes = "Add a New record in FTP-Groups and enter Condition vaule,All the Condition value should be displyed";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		// -- Source dropdown click--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/app-form-dropdown[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		// -- Source select Country--//
//		driver.findElement(By.xpath("//li[contains(text(),'Country')]")).click();
//		Thread.sleep(3000);
//		// --Magnifier click--//
//		driver.findElement(
//				By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/app-magnifier-cntrl[1]/div[1]/div[1]/div[1]/span[1]/*[1]"))
//				.click();
//		Thread.sleep(5000);
//		// --Country Mag send keys--//
//		driver.findElement(By.xpath("//body/app-popover[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("K");
//		Thread.sleep(2000);
//		// -- Magnifier search click--//
//		driver.findElement(By.xpath("//body/app-popover[1]/div[1]/div[1]/div[1]/span[1]/*[1]")).click();
//		Thread.sleep(5000);
//		// --Show All click--//
//		driver.findElement(By.xpath("//span[contains(text(),'Show All')]")).click();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_011");
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 6)
//	@TestDescription("Add a New record in FTP-Groups and enter Tenor Description in Nominal	-If user enter the Keywords of description , matched details should be displayed in popup")
//	public void FTP_GR_012(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_012";
//		String notes = "Add a New record in FTP-Groups and enter Tenor Description in Nominal	-If user enter the Keywords of description , matched details should be displayed in popup";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Nominal();
//		Thread.sleep(2000);
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 7)
//	@TestDescription("Add a New record in FTP-Groups and enter End date lesser than Effective date,Trigger should appear that End date is Lesser than Effective date")
//	public void FTP_GR_013(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_013";
//		String notes = "Add a New record in FTP-Groups and enter End date lesser than Effective date,Trigger should appear that End date is Lesser than Effective date";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Nominal();
//		Thread.sleep(2000);
//		// --Data source click--//
//		FTP.FTP_DataSourceTabClick();
//		Thread.sleep(2000);
//		// --Data source Select--//
//		driver.findElement(By.xpath(
//				"//div[@id='-1customSelectDropdown3']//ul[@class='w-full min-content-height max-content-height overflow-auto scrollbar-fancy text-gray-500 text-[11px] mt-1']//li[normalize-space()='Group A']"))
//				.click();
//		// -- Seq Send keys--//
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc("VAT_TEST");
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector(
//				"div[id='0popButton34'] span[class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]'] svg"))
//				.click();
//		Thread.sleep(5000);
//		// -- Scroll To End date--//
//		driver.findElement(By.xpath("//td[contains(text(),'Maturity < 90 Days')]")).click();
//		WebElement scrollableDiv = driver.findElement(By.xpath(
//				"//div[contains(@class,'table-container overflow-auto scrollbar-fancy h-calc_30px w-full border-[1px] color-b rounded-lg')]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;",
//				scrollableDiv);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[@title='Remove']//*[name()='svg']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='043']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='043']")).sendKeys(Keys.TAB);
//		Thread.sleep(2000);
//		WebElement Clear = driver.findElement(By.xpath(
//				"//input[@class='border-none datepicker formInputControl ng-untouched ng-pristine ng-valid form-control input active']"));
//		Clear.sendKeys(Keys.BACK_SPACE);
//		Thread.sleep(2000);
//		WebElement Calender = driver.findElement(By.xpath(
//				"//div[@class='flatpickr-calendar animate open arrowTop arrowLeft rightMost']//select[@aria-label='Month']"));
//		Thread.sleep(2000);
//		Calender.click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("span[class='flatpickr-day today']")).click();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//div[@class='global-controls-min-height']//div[@class='relative']//input[@id='044']"))
//				.sendKeys("2");
//		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_013");
//		WebElement Text = driver.findElement(By.cssSelector("div[class='ms-3 text-[13px] font-medium flex-1']"));
//		String DateTrigger = Text.getText();
//		System.out.println(DateTrigger);
//		String expected = "End should be greater than Start";
//		Assert.assertEquals(DateTrigger, expected);
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 8)
//	@TestDescription("Verify Copy in records,Duplicate record should pop for saving a copy")
//	public void FTP_GR_016(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_016,FTP_GR_019";
//		String notes = "Verify Copy in records,Duplicate record should pop for saving a copy";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		// -- Filter click---//
//		FTP.FTP_FilterClick();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(
//				"div[id='0customSelectMenu1'] span[class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[normalize-space()='Sub Group']")).click();
//		driver.findElement(By.cssSelector("input[id='03']")).sendKeys("VAT");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ftp-group[1]/section[1]/div[1]/div[1]/div[1]/app-smart-grouping-table[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/span[1]"))
//				.click();
//		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
//		Thread.sleep(5000);
//		// -- Check box tick--//
//		driver.findElement(By.xpath(
//				"//th[@class='table-th border-b freeze-th freeze-left-0 w-1']//div[@class='flex items-center justify-center custom-checkbox']//input[@type='checkbox']"))
//				.click();
//		// -- Copy Click--//
//		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_016");
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 9)
//	@TestDescription("Filter value column should accept larger characters ")
//	public void FTP_GR_021(String username, String password) throws InterruptedException, IOException {
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		// -- Filter click---//
//		FTP.FTP_FilterClick();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(
//				"div[id='0customSelectMenu1'] span[class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[normalize-space()='Sub Group']")).click();
//		WebElement inputField = driver.findElement(By.cssSelector("input[id='03']"));
//		inputField.sendKeys("VAT_TEST_FILTER_VALUE");
//		// Retrieve and print the entered value
//		String enteredValue = inputField.getAttribute("value");
//		System.out.println("Entered Value: " + enteredValue);
//		takeScreenshot("FTP_GR_021");
//		Thread.sleep(2000);
//		int textCount = enteredValue.length();
//		System.out.println("Character Count: " + textCount);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_021";
//		String notes = "Filter value column should accept larger characters " + " " + " ,"+"TextColumn vaules Entered =" + textCount;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 10)
//	@TestDescription("Filter should perform based on the condition")
//	public void FTP_GR_022(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_022,FTP_GR_023";
//		String notes = "Filter should perform based on the condition";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		// -- Filter click---///
//		FTP.FTP_FilterClick();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(
//				"div[id='0customSelectMenu1'] span[class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[normalize-space()='Sub Group']")).click();
//		WebElement inputField = driver.findElement(By.cssSelector("input[id='03']"));
//		inputField.sendKeys("VAT");
//		// -- Add row in Filter--//
//		FTP.AddInFilter();
//		// -- Dropdown Column Click--//
//		driver.findElement(By.cssSelector(
//				"div[id='1customSelectMenu1'] span[class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]'] svg path"))
//				.click();
//		driver.findElement(By.xpath("//li[normalize-space()='Record Indicator']")).click();
//		WebElement inputField1 = driver.findElement(By.cssSelector("input[id='13']"));
//		inputField1.sendKeys("Pend");
//		// -- Apply Click--//
//		FTP.ApplyClickInFilter();
//		Thread.sleep(3000);
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 11)
//	@TestDescription("Record should be deleted if its a Approved record or if its pending records is clicked popup should show that only approved records can be Deleted")
//	public void FTP_GR_024(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_024";
//		String notes = "Record should be deleted if its a Approved record or if its pending records is clicked popup should show that only approved records can be Deleted";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		// -- Filter click---///
//		FTP.FTP_FilterClick();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(
//				"div[id='0customSelectMenu1'] span[class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[normalize-space()='Group Id']")).click();
//		WebElement inputField = driver.findElement(By.cssSelector("input[id='03']"));
//		inputField.sendKeys("CASA");
//		// -- Apply Click--//
//		FTP.ApplyClickInFilter();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//th[@class='table-th w-[35px]']//div[@class='flex items-center justify-center custom-checkbox w-[35px]']//input[@type='checkbox']"))
//				.click();
//		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
//		WebElement Trigger = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String Text = Trigger.getText();
//		System.out.println(Text);
//		Thread.sleep(2000);
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 12)
//	@TestDescription("Trigger should appear that Maker cannot Approve the record or Approve should not be Interactable(for same Maker)")
//	public void FTP_GR_025(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_025";
//		String notes = "Trigger should appear that Maker cannot Approve the record or Approve should not be Interactable(for same Maker)";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(10000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.LegalEntityMagnifier();
//		driver.findElement(By.xpath("//span[contains(text(),'D&C Bank Ghana')]")).click();
//		FTP.DataSourceDropdown();
//		driver.findElement(By.xpath("//li[contains(text(),'Projection')]")).click();
//		// -- Filter click---///
//		FTP.FTP_FilterClick();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector(
//				"div[id='0customSelectMenu1'] span[class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[normalize-space()='Sub Group']")).click();
//		WebElement inputField = driver.findElement(By.cssSelector("input[id='03']"));
//		inputField.sendKeys("VAT_GBP");
//		// -- Add row in Filter--//
//		FTP.AddInFilter();
//		Thread.sleep(5000);
//		// -- Dropdown Column Click--//
//		driver.findElement(By.cssSelector(
//				"div[id='1customSelectMenu1'] span[class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]'] svg path"))
//				.click();
//		driver.findElement(By.xpath("//li[contains(text(),'Group Id')]")).click();
//		WebElement inputField1 = driver.findElement(By.cssSelector("input[id='13']"));
//		inputField1.sendKeys("CASA");
//		// -- Apply Click--//
//		FTP.ApplyClickInFilter();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ftp-group[1]/section[1]/div[1]/div[1]/div[1]/app-smart-grouping-table[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/span[1]/*[name()='svg']/*[name()='ellipse']"))
//				.click();
//		takeScreenshot("FTP_GR_025");
//		Thread.sleep(3000);
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 13)
//	@TestDescription("Tooltip should be displayed for the details of that particular Tab")
//	public void FTP_GR_026(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_026";
//		String notes = "Tooltip should be displayed for the details of that particular Tab";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		WebElement elementToHoverM = driver.findElement(By.xpath("//li[@id='Parameters']"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_026");
//		WebElement elementToHoverFTP = driver.findElement(By.xpath("//li[@id='Fund Transfer Pricing']"));
//		Actions actionsClickFTP = new Actions(driver);
//		actionsClickFTP.moveToElement(elementToHoverFTP).perform();
//		takeScreenshot("FTP_GR_026_1");
//		Thread.sleep(2000);
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 14)
//	@TestDescription("Only view acces should be enabled")
//	public void FTP_GR_027(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_027";
//		String notes = "Only view acces should be enabled";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		// -- Three icon CLick--//
//		driver.findElement(By.xpath("//span[@class='svgIcon w-[25px] h-[19px] block rounded-lg']")).click();
//		// -- View click//
//		driver.findElement(By.xpath("//span[contains(text(),'View')]")).click();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_027");
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 15)
//	@TestDescription("Verify the status when adding a record the status should not be interactable. ")
//	public void FTP_GR_028(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_028";
//		String notes = "Verify the status when adding a record the status should not be interactable. ";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		WebElement Status = driver.findElement(By.xpath(
//				"//div[@class='w-full relative disabled-wrapper']//span[@class='ng-untouched ng-pristine ng-invalid']"));
//		WebElement elementToHoverM = driver.findElement(By.xpath(
//				"//div[@class='w-full relative disabled-wrapper']//span[@class='ng-untouched ng-pristine ng-invalid']"));
//		Actions actionsClick = new Actions(driver);
//		actionsClick.moveToElement(elementToHoverM).perform();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_028");
//	}
//
//	@Test(dataProvider = "loginCredentials", priority = 16)
//	@TestDescription("Remove of the record should takes place, if there is only one record trigger should pop that atleast one record is mandatory")
//	public void FTP_GR_029(String username, String password) throws InterruptedException, IOException, AWTException {
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Nominal();
//		// -- Tenor MagnifierClick--//
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[normalize-space()='Maturity < 90 Days']")).click();
//		FTP.FTP_Rate("8");
//		FTP.AddInCurve();
//		Thread.sleep(5000);
//		driver.findElement(
//				By.cssSelector("tbody tr:nth-child(1) td:nth-child(23) div:nth-child(1) span:nth-child(1) svg"))
//				.click();
//		driver.findElement(By.cssSelector("span[title='Remove'] svg")).click();
//		WebElement Trigger = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String error = Trigger.getText();
//		System.out.println(error);
//		Thread.sleep(3000);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_029";
//		String notes = "Remove of the record should takes place, if there is only one record trigger should pop that atleast one record is mandatory"
//				+ " ,Text =" + error;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 17)
//	@TestDescription("If the Filter is applied, that only should erase")
//	public void FTP_GR_030(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_030";
//		String notes = "If the Filter is applied, that only should erase";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Nominal();
//		// -- Tenor MagnifierClick--//
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[normalize-space()='Maturity < 90 Days']")).click();
//		FTP.FTP_Rate("8");
//		FTP.AddInCurve();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("div[id='undefinedpopButton23'] span[class='absolute cursor-pointer w-[14px] h-[20px] text-grey-1 banner right-[20px] top-[6px]'] svg path")).click();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_030");
//	}
//	@Test(dataProvider = "loginCredentials", priority = 18)
//	@TestDescription("At first time record should be saved ,second time  it should get modified ")
//	public void FTP_GR_031(String username, String password) throws InterruptedException, IOException, AWTException {
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Nominal();
//		// --Data source click--//
//		FTP.FTP_DataSourceTabClick();
//		Thread.sleep(2000);
//		// --Data source Select--//
//		driver.findElement(By.xpath(
//				"//div[@id='-1customSelectDropdown3']//ul[@class='w-full min-content-height max-content-height overflow-auto scrollbar-fancy text-gray-500 text-[11px] mt-1']//li[normalize-space()='Group A']"))
//				.click();
//		// -- Seq Send keys--//
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc("VAT_TEST");
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector(
//				"div[id='0popButton34'] span[class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]'] svg"))
//				.click();
//		// -- Tenor MagnifierClick--//
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[normalize-space()='Maturity < 90 Days']")).click();
//		FTP.FTP_Rate("8");
//		FTP.Save();
//		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//		WebElement Save = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String Text = Save.getText();
//		System.out.println(Text);
//		Thread.sleep(5000);
//		FTP.Save();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);  
//		String Add = "FTP Groups - Add  - Successful";
//		Assert.assertEquals(Add, Text);
//		WebElement Modify = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		takeScreenshot("FTP_GR_031");
//		String Text1 = Modify.getText();
//		System.out.println(Text1);
//		String actual = "FTP Groups - Modify  - Successful";
//		Assert.assertEquals(actual, Text1);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_031";
//		String notes = "At first time record should be saved ,second time  it should get modified " + " ," + Text + ", " + Text1;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);	
//		driver.findElement(By.xpath("//span[normalize-space()='Reject']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 19)
//	@TestDescription("Click on Deleted record modify and then Reject,After click on Reject previous status should be displayed")
//	public void FTP_GR_032(String username, String password) throws InterruptedException, IOException, AWTException {	
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		Thread.sleep(2000);
//		//-- Filter Column dropdown click--/
//		driver.findElement(By.cssSelector(
//				"div[id='0customSelectMenu1'] span[class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[normalize-space()='Sub Group']")).click();
//		WebElement inputField = driver.findElement(By.cssSelector("input[id='03']"));
//		inputField.sendKeys("VAT_Advance");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='cursor-pointer relative drop-down popover-container']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
//		Thread.sleep(5000);
//		//-- Status dropdown click--//
//		driver.findElement(By.xpath("//div[@id='-1customSelectMenu6']//input[@class='border-custom-grey-border dropdownElem formInputControl rounded-md']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[normalize-space()='Active']")).click();
//		//-- Save click--//
//		FTP.Save();
//		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
//		Thread.sleep(5000);
//		//-- Reject Click--//
//		driver.findElement(By.xpath("//span[normalize-space()='Reject']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
//		Thread.sleep(3000);
//		WebElement Reject =driver.findElement(By.cssSelector("div[class='ms-3 text-[13px] font-medium flex-1']"));
//		String reject = Reject.getText();
//		System.out.println(reject);
//		Thread.sleep(5000);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_032";
//		String notes = "Click on Deleted record modify and then Reject,After click on Reject previous status should be displayed";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		takeScreenshot("FTP_GR_032");
//	}
//	@Test(dataProvider = "loginCredentials", priority = 20)
//	@TestDescription("Add data in Repricing Column,Created record should be saved")
//	public void FTP_GR_033(String username, String password) throws InterruptedException, IOException, AWTException {	
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_033";
//		String notes = "Add data in Repricing Column,Created record should be saved";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Repricing();
//		FTP.FTP_Nominal();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[normalize-space()='Maturity < 90 Days']")).click();
//		FTP.FTP_Rate("10");
//		WebElement FTP_Group = driver.findElement(By.xpath("//div[@id='-1customSelectMenu3']//input[@type='text']"));
//		FTP_Group.click();
//		driver.findElement(By.xpath("//li[contains(text(),'Group A')]")).click();
//		FTP.SequenceKeys(FTP_Seq_ID);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		FTP.FTP_SourceTab();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[normalize-space()='Method - Repricing']")).click();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_033");
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 21)
//	@TestDescription("Enter invalid Credetials,Message should pop that 'Invalid Credentials'")
//	public void FTP_GR_034(String username, String password) throws InterruptedException, IOException, AWTException {	
//		login.enterUsername("vis");
//		login.enterPassword(password);
//		login.clickLogin();
//		Thread.sleep(5000);
//		WebElement Error = driver.findElement(By.xpath("//span[@class='error show-error']"));
//		String Login = Error.getText();
//		System.out.println(Login);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_034";
//		String notes = "Enter invalid Credetials,Message should pop that 'Invalid Credentials'" + "Text=" + Login;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 22)
//	@TestDescription("Create a Record and reject that record , Add another record,Only newly added record should be editable other should be freezed.")
//	public void FTP_GR_037(String username, String password) throws InterruptedException, IOException, AWTException {	
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_037";
//		String notes = "Create a Record and reject that record , Add another record,Only newly added record should be editable other should be freezed.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		driver.findElement(By.xpath("//li[contains(text(),'Sub Group')]")).click();
//		driver.findElement(By.xpath("//input[@id='03']")).sendKeys("VAT_REPRICING_FD");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(2000);
//		//-- Three dot clikc for edit--//
//		driver.findElement(By.xpath("//span[@class='cursor-pointer relative drop-down popover-container']")).click();
//		//-- Edit click--//
//		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
//		Thread.sleep(5000);
//		FTP.AddInCurve();
//		//-- Tenor desc Click--//
//		driver.findElement(By.cssSelector("div[id='0popButton34'] span[class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")).click();
//		Thread.sleep(5000);
//		//-- Tenor Select--//
//		driver.findElement(By.xpath("//td[normalize-space()='Maturity > 90 Days And < 360 Days']")).click();
//		Thread.sleep(2000);
//		//-- FTP rate Send keys--/
//		driver.findElement(By.xpath("//input[@id='044']")).sendKeys("5");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_037");
//	}
//	@Test(dataProvider = "loginCredentials", priority = 23)
//	@TestDescription("The trigger alignment and the triggers should be in a fixed format , it should not appear in different standards.")
//	public void FTP_GR_041(String username, String password) throws InterruptedException, IOException, AWTException {	
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_041";
//		String notes = "The trigger alignment and the triggers should be in a fixed format , it should not appear in different standards.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[contains(text(),'Sub Group')]")).click();
//		driver.findElement(By.xpath("//input[@id='03']")).sendKeys("VAT_REPRICING_FD");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(2000);
//		//-- Three dot clikc for edit--//
//		driver.findElement(By.xpath("//span[@class='cursor-pointer relative drop-down popover-container']")).click();
//		//-- Edit click--//
//		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//th[@class='table-th border-b freeze-th freeze-left-0 w-1']//div[@class='flex items-center justify-center custom-checkbox']//input[@type='checkbox']")).click();
//		FTP.CopyInCurve();
//		Thread.sleep(2000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(2000);
//		WebElement Trigger = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String TriggerText = Trigger.getText();
//		System.out.println(TriggerText);
//		takeScreenshot("FTP_GR_041");
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 24)
//	@TestDescription("Create a record,Tab should Open for adding details")
//	public void FTP_GR_042(String username, String password) throws InterruptedException, IOException, AWTException {	
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_042";
//		String notes = "Create a record,Tab should Open for adding details";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(2000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[normalize-space()='Group A']")).click();
//		FTP.MethodNominal();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_042");
//	}
//	@Test(dataProvider = "loginCredentials", priority = 25)
//	@TestDescription("Create a record in both nominal & repricing,Entered details should be saved and displayed as in Nominal and repricing")
//	public void FTP_GR_045(String username, String password) throws InterruptedException, IOException, AWTException {	
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_045";
//		String notes = "Create a record in both nominal & repricing,Entered details should be saved and displayed as in Nominal and repricing";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(2000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[normalize-space()='Group A']")).click();
//		FTP.FTP_Repricing();
//		FTP.MethodNominal();
//		Thread.sleep(5000);
//		//--Adding details--//
//		FTP.TenorMagnifierClick(); 
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//td[contains(text(),'Maturity < 90 Days')]")).click();
//		FTP.FTP_Rate("2");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(7000);
//		FTP.MethodRepricing();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//td[contains(text(),'Maturity > 90 Days And < 360 Days')]")).click();
//		FTP.FTP_Rate("3");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(7000);
//		FTP.MethodNominal();
//		takeScreenshot("FTP_GR_045");
//		Thread.sleep(5000);
//		FTP.MethodRepricing();
//		takeScreenshot("FTP_GR_045_1");
//		Thread.sleep(5000);
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 26)
//	@TestDescription("The trigger alignment and the triggers should be in a fixed format , it should not appear in different standards.")
//	public void FTP_GR_046(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_046";
//		String notes = "The trigger alignment and the triggers should be in a fixed format , it should not appear in different standards.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		Thread.sleep(5000);
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[contains(text(),'Sub Group')]")).click();
//		driver.findElement(By.xpath("//input[@id='03']")).sendKeys("VAT_REPRICING_FD");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(2000);
//		// -- Three dot click for edit--//
//		driver.findElement(By.xpath("//span[@class='cursor-pointer relative drop-down popover-container']")).click();
//		// -- Edit click--//
//		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
//		Thread.sleep(2000);
//		FTP.Save();
//		FTP.YesClick();
//		// -- Back click--//
//		driver.findElement(By.cssSelector("svg[width='35']")).click();
//		Thread.sleep(2000);
//		// -- Three dot click for edit--//
//		driver.findElement(By.xpath("//span[@class='cursor-pointer relative drop-down popover-container']")).click();
//		// -- Edit click--//
//		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
//		Thread.sleep(4000);
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_046");
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 27)
//	@TestDescription("Create a record ,If the feed is empty a single trigger should appear .")
//	public void FTP_GR_047(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_047";
//		String notes = "Create a record ,If the feed is empty a single trigger should appear .";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(2000);
//		FTP.Save();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_047");	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 28)
//	@TestDescription("Verify Tenor Application code in FTP-Groups,New  Selected Tenor application code should be changed")
//	public void FTP_GR_048(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_048";
//		String notes = "Verify Tenor Application code in FTP-Groups,New  Selected Tenor application code should be changed";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[normalize-space()='Group A']")).click();
//		FTP.MethodNominal();
//		Thread.sleep(5000);		
//		driver.findElement(By.xpath("//div[@id='-1customSelectMenu22']//input[@type='text']")).click();
//		Thread.sleep(2000);
//		WebElement scrollableDiv = driver.findElement(By.cssSelector(
//				"div[id='-1customSelectDropdown22']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;",
//				scrollableDiv);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[contains(text(),'FTP Core')]")).click();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_048");
//	}
//	@Test(dataProvider = "loginCredentials", priority = 29)
//	@TestDescription("Create a record ( In FTP - AddON) Click on Reject,Record should  get Rejected")
//	public void FTP_GR_051(String username, String password) throws InterruptedException, IOException, AWTException {
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[normalize-space()='Group A']")).click();
//		FTP.FTP_Repricing();
//		FTP.FTP_Nominal();
//		Thread.sleep(5000);
//		FTP.MethodRepricing();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		Thread.sleep(5000);
//		FTP.FTP_Rate("10");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(2000);
//		WebElement Trigger = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String TriggerText = Trigger.getText();
//		System.out.println(TriggerText);
//		Thread.sleep(5000);
//		FTP.Reject();
//		FTP.YesClick();	
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_051");
//		Thread.sleep(2000);
//		WebElement RejectTrigger = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String Reject = RejectTrigger.getText();
//		System.out.println(Reject);
//		Thread.sleep(2000);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_051";
//		String notes = "Create a record ( In FTP - AddON) Click on Reject,Record should  get Rejected" + " " + Reject;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 30)
//	@TestDescription("Verify VisionSBU,VisionSBU Code and Description should be displayed")
//	public void FTP_GR_053(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_053";
//		String notes = "Verify VisionSBU,VisionSBU Code and Description should be displayed" ;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[normalize-space()='Group A']")).click();
//		FTP.MethodNominal();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		Thread.sleep(5000);
//		FTP.SBUdropdownClick();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_053");
//	}
//	@Test(dataProvider = "loginCredentials", priority = 31)
//	@TestDescription("Create a record and verify Sequence,Duplicate sequence of record in a group should not be allowed")
//	public void FTP_GR_054(String username, String password) throws InterruptedException, IOException, AWTException {
//		
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc("1");
//		FTP.SequenceKeys("1");
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		FTP.GroupSelect();
//		FTP.MethodNominal();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		Thread.sleep(5000);
//		FTP.FTP_Rate("10");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_054");
//		WebElement Dup = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String DuplicateTrigger = Dup.getText();
//		System.out.println(DuplicateTrigger);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_054";
//		String notes = "Create a record and verify Sequence,Duplicate sequence of record in a group should not be allowed" + " ,"+"DuplicateText="  + DuplicateTrigger;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 32)
//	@TestDescription("Create a Record in LP	Before and after saving the record same data should be displayed")
//	public void FTP_GR_057(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_057";
//		String notes = "Create a Record in LP	Before and after saving the record same data should be displayed";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		FTP.GroupSelect();
//		FTP.MethodNominal();
//		Thread.sleep(5000);
//		FTP.LPClick();
//		Thread.sleep(5000);
//		FTP.LPTenorClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		FTP.Premium("10");
//		WebElement scrollableDiv = driver.findElement(By.xpath(
//				"//div[contains(@class,'table-container overflow-auto scrollbar-fancy h-calc_30px w-full border-[1px] color-b rounded-lg')]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;",
//				scrollableDiv);
//		Thread.sleep(5000);
//		FTP.CustomerID();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[contains(text(),'50000001')]")).click();
//		Thread.sleep(5000);
//		FTP.ContractID();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//td[contains(text(),'Paid Up Share Capital')]")).click();
//		Thread.sleep(5000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_057");
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 33)
//	@TestDescription("Click on Review in a record , click on CRR rate and save")
//	public void FTP_GR_060(String username, String password) throws InterruptedException, IOException, AWTException {
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[normalize-space()='Seq']")).click();
//		FTP.FilterValue("666");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(3000);
//		FTP.ThreeDotClick();
//		FTP.EditClick();
//		Thread.sleep(3000);
//		FTP.ReviewClick();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='w-full table-container h-auto selected-date']//table[@class='w-full table-fixed min-[1594px]:w-auto min-[1594px]:table-auto divide-y border-gray-300 border-[0px] divide-gray-200']//td[@class='text-[11px] pl-2.5 pr-2 h-5 leading-5 font-medium text-content-color-600 border-[0px] whitespace-nowrap overflow-hidden text-ellipsis min-w-20 max-w-20 text-right bg-column-even']")).click();
//		Thread.sleep(3000);
//		WebElement CRR =driver.findElement(By.xpath("//input[@id='76']"));
//		CRR.clear();
//		CRR.sendKeys("2");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(3000);
//		WebElement ModifyTrigger = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String Text= ModifyTrigger.getText();
//		System.out.println(Text);
//		Thread.sleep(3000);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_060";
//		String notes = "Click on Review in a record , click on CRR rate and save" + " ModifyText = " + Text;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 34)
//	@TestDescription("Click on Required record and click on Copy,Duplicate trigger should appear or if the record is in Add pending condition Trigger should appear that already waiting for approval")
//	public void FTP_GR_061(String username, String password) throws InterruptedException, IOException, AWTException {
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		Thread.sleep(5000);
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[normalize-space()='Seq']")).click();
//		FTP.FilterValue("666");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(3000);
//		FTP.ThreeDotClick();
//		FTP.EditClick();
//		Thread.sleep(3000);
//		//-- Checkbox tick--//
//		driver.findElement(By.xpath("//th[@class='table-th border-b freeze-th freeze-left-0 w-1']//div[@class='flex items-center justify-center custom-checkbox']//input[@type='checkbox']")).click();
//		FTP.CopyInCurve();
//		Thread.sleep(3000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_061");
//		WebElement DuplicateTrgger = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String Text = DuplicateTrgger.getText();
//		System.out.println(Text);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_061";
//		String notes = "Click on Required record and click on Copy,Duplicate trigger should appear or if the record is in Add pending condition Trigger should appear that already waiting for approval" + " DuplicateTrigger = " + Text;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 35)
//	@TestDescription("Click on Edit in Repricing and add details,Record should be saved with entered details in Curve and AddOn")
//	public void FTP_GR_062(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_062";
//		String notes = "Click on Edit in Repricing and add details,Record should be saved with entered details in Curve and AddOn";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		FTP.FTP_GroupDropdown();
//		FTP.GroupSelect();
//		FTP.FTP_Repricing();
//		Thread.sleep(5000);
//		FTP.MethodRepricing();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(7000);
//		FTP.Tenor90DaysSelect();
//		FTP.FTP_Rate("5");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		FTP.AddOnClick();
//		Thread.sleep(5000);
//		//--Tenor Click in AddOn--//
//		driver.findElement(By.xpath("//div[@id='0customSelectMenu52']//div[@id='0popButton52']//span[@class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")).click();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		FTP.Subsidy("65");
//		FTP.Save();
//		FTP.YesClick();
//		takeScreenshot("FTP_GR_062");
//		Thread.sleep(5000);
//		FTP.FTP_Curve();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_062_1");
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 36)
//	@TestDescription("Verify Review in a record	,Required date should be Highlighted and it should be displayed")
//	public void FTP_GR_065(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_065";
//		String notes = "Verify Review in a record,Required date should be Highlighted and it should be displayed";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		Thread.sleep(5000);
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[contains(text(),'Sub Group')]")).click();
//		FTP.FilterValue("group b");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ftp-group[1]/section[1]/div[1]/div[1]/div[1]/app-smart-grouping-table[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/span[1]")).click();
//		FTP.EditClick();
//		Thread.sleep(5000);
//		FTP.ReviewClick();
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//div[contains(text(),'Oct 2024')]")).click();
//		takeScreenshot("FTP_GR_065");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[contains(text(),'Dec 2024')]")).click();
//		takeScreenshot("FTP_GR_065_1");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[contains(text(),'Jan 2025')]")).click();
//		takeScreenshot("FTP_GR_065_2");
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 37)
//	@TestDescription("Change Default Checkbox to another record")
//	public void FTP_GR_066(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_066";
//		String notes = "Change Default Checkbox to another record";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(2000);
//		FTP.LegalEntityMagnifier();
//		driver.findElement(By.xpath("//span[normalize-space()='D&C Bank Ghana']")).click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		driver.findElement(By.xpath("//li[contains(text(),'Group Id')]")).click();
//		FTP.FilterValue("REPO");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_066");
//		driver.findElement(By.xpath("//td[@class='border-gray-300 text-center']//input[@type='radio']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_066_1");
//		driver.findElement(By.xpath("//td[@class='border-gray-300 text-center']//input[@type='radio']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_066_2");
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 38)
//	@TestDescription("Only View acces should be enabled, Record should not save")
//	public void FTP_GR_067(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_067";
//		String notes = "Only View acces should be enabled, Record should not save";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		Thread.sleep(5000);
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[contains(text(),'Sub Group')]")).click();
//		FTP.FilterValue("group b");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ftp-group[1]/section[1]/div[1]/div[1]/div[1]/app-smart-grouping-table[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/span[1]")).click();
//		FTP.ViewClick();
//		Thread.sleep(5000);
//		FTP.ReviewClick();
//		Thread.sleep(7000);
//		takeScreenshot("FTP_GR_067");
//		Thread.sleep(5000);
//		//-- FTP_Rate click in Review--//
//		driver.findElement(By.xpath("//div[@class='w-full table-container h-auto selected-date']//table[@class='w-full table-fixed min-[1594px]:w-auto min-[1594px]:table-auto divide-y border-gray-300 border-[0px] divide-gray-200']//td[@class='text-[11px] pl-2.5 pr-2 h-5 leading-5 font-medium text-content-color-600 border-[0px] whitespace-nowrap overflow-hidden text-ellipsis min-w-20 max-w-20 text-right bg-column-odd']//div[@title='4.00']")).click();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_067_1");
//	}
//	@Test(dataProvider = "loginCredentials", priority = 39)
//	@TestDescription("Verify Source in SubGroup	For Between Two datas should be allowed ")
//	public void FTP_GR_070(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_070";
//		String notes = "Verify Source in SubGroup,For Between Two datas should be allowed ";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SourceTab();
//		Thread.sleep(5000);
//		FTP.SourceColumnDropdownClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//li[contains(text(),'Country')]")).click();
//		FTP.SourceOperandDropdownClick();
//		Thread.sleep(3000);
//		WebElement scrollableDiv = driver.findElement(By.xpath(
//				"//div[@id='0customSelectDropdown13']//ul[@class='w-full min-content-height max-content-height overflow-auto scrollbar-fancy text-gray-500 text-[11px] mt-1']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;",
//				scrollableDiv);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[contains(text(),'between')]")).click();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_070");
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 40)
//	@TestDescription("Add Nominal,After saving the record Click on reject , record should get rejected.")
//	public void FTP_GR_085(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_085";
//		String notes = "Add Nominal	After saving the record Click on reject , record should get rejected.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		FTP.GroupSelect();
//		FTP.MethodNominal();
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		FTP.FTP_Rate("5");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_085");
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 41)
//	@TestDescription("Verify Data before saving	,While clicking on Repricing no data should be displayed.")
//	public void FTP_GR_087(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_087";
//		String notes = "Verify Data before saving,While clicking on Repricing no data should be displayed.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		FTP.GroupSelect();
//		FTP.FTP_Repricing();
//		FTP.MethodNominal();
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		FTP.FTP_Rate("10");
//		Thread.sleep(5000);
//		FTP.MethodRepricing();
//		takeScreenshot("FTP_GR_087");
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials2", priority = 42)
//	@TestDescription("Verify Nominal & Repricing and Approve the data,Record should be approved.")
//	public void FTP_GR_088(String username, String password , String username2 , String password2 ) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_088";
//		String notes = "Verify Nominal & Repricing and Approve the data,Record should be approved.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.LegalEntityMagnifier();
//		driver.findElement(By.xpath("//span[normalize-space()='D&C Bank Ghana']")).click();
//		Thread.sleep(2000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		driver.findElement(By.xpath("//li[normalize-space()='Seq']")).click();
//		FTP.FilterValue("954");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(2000);
//		FTP.ThreeDotClick();
//		FTP.EditClick();
//		Thread.sleep(5000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		FTP.UserProfileClick();
//		Thread.sleep(2000);
//		FTP.LogoutClick();
//		Thread.sleep(5000);
//		login.enterUsername(username2);
//		login.enterPassword(password2);
//		login.clickLogin();
//		Thread.sleep(5000);
//		System.out.println("Login test passed with user: " + username2);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.LegalEntityMagnifier();
//		driver.findElement(By.xpath("//span[normalize-space()='D&C Bank Ghana']")).click();
//		Thread.sleep(2000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		driver.findElement(By.xpath("//li[normalize-space()='Seq']")).click();
//		FTP.FilterValue("954");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(2000);
//		FTP.ThreeDotClick();
//		Thread.sleep(2000);
//		FTP.ApproveClick();
//		FTP.YesClick();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_088");
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 43)
//	@TestDescription("Add Repricing	,Add one record  then save and again click on Modify	,Record should be modified.")
//	public void FTP_GR_089(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_089";
//		String notes = "Add Repricing,Add one record  then save and again click on Modify	,Record should be modified.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		FTP.GroupSelect();
//		FTP.FTP_Repricing();
//		Thread.sleep(5000);
//		FTP.MethodRepricing();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(7000);
//		FTP.Tenor90DaysSelect();
//		FTP.FTP_Rate("5");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		FTP.AddOnClick();
//		Thread.sleep(5000);
//		//--Tenor Click in AddOn--//
//		driver.findElement(By.xpath("//div[@id='0customSelectMenu52']//div[@id='0popButton52']//span[@class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")).click();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		FTP.Subsidy("65");
//		FTP.Save();
//		FTP.YesClick();
//		takeScreenshot("FTP_GR_089");
//		Thread.sleep(5000);
//		FTP.FTP_Curve();
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_089_1");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_089_2");
//		WebElement Trigger = driver.findElement(By.xpath("//div[contains(@class,'ms-3 text-[13px] font-medium flex-1')]"));
//		String Text = Trigger.getText();
//		System.out.println(Text);
//		Thread.sleep(5000);
//		FTP.MethodNominal();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		FTP.FTP_Rate("10");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 44)
//	@TestDescription("Change Tenor Application code and create a record in FTP-AddOn,Record should be saved with the changed.")
//	public void FTP_GR_090(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_090";
//		String notes = "Change Tenor Application code and create a record in FTP-AddOn,Record should be saved with the changed.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_GroupDropdown();
//		Thread.sleep(5000);
//		FTP.GroupSelect();
//		FTP.MethodNominal();
//		FTP.AddOnClick();
//		Thread.sleep(5000);
//		//-- Tenor Application code dropdown--//
//		driver.findElement(By.xpath("//div[@id='-1customSelectMenu46']//input[@type='text']")).click();
//		Thread.sleep(5000);
//		WebElement scrollableDiv = driver.findElement(By.xpath(
//				"//div[@id='-1customSelectDropdown46']//ul[@class='w-full min-content-height max-content-height overflow-auto scrollbar-fancy text-gray-500 text-[11px] mt-1']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;",
//				scrollableDiv);
//		driver.findElement(By.xpath("//li[normalize-space()='FTP Core']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='0popButton52']//span[@class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[normalize-space()='CORE']")).click();
//		Thread.sleep(5000);
//		FTP.Subsidy("10");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_090");
//		FTP.ReviewClick();
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_090_1");
//		driver.findElement(By.xpath("//div[@id='reviewBack']//span//*[name()='svg']")).click();
//		Thread.sleep(10000);
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 45)
//	@TestDescription("Click on Add and create a record in Repricing	Record should be saved, record should be displayed in Repricing only")
//	public void FTP_GR_092(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_092";
//		String notes = "Click on Add and create a record in Repricing	Record should be saved, record should be displayed in Repricing only";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Repricing();
//		Thread.sleep(5000);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		FTP.SequenceKeys(FTP_Seq_ID);
//		FTP.FTP_GroupDropdown();
//		FTP.GroupSelect();
//		FTP.FTP_Nominal();
//		Thread.sleep(2000);
//		FTP.AddOnClick();
//		Thread.sleep(5000);
//		//-- Tenor Application code dropdown--//
//		driver.findElement(By.xpath("//div[@id='-1customSelectMenu46']//input[@type='text']")).click();
//		Thread.sleep(5000);
//		WebElement scrollableDiv = driver.findElement(By.xpath(
//				"//div[@id='-1customSelectDropdown46']//ul[@class='w-full min-content-height max-content-height overflow-auto scrollbar-fancy text-gray-500 text-[11px] mt-1']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;",
//				scrollableDiv);
//		driver.findElement(By.xpath("//li[normalize-space()='FTP Core']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='0popButton52']//span[@class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[normalize-space()='CORE']")).click();
//		Thread.sleep(5000);
//		FTP.Subsidy("10");
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_092");
//		FTP.ReviewClick();
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_092_1");
//		driver.findElement(By.xpath("//div[@id='reviewBack']//span//*[name()='svg']")).click();
//		Thread.sleep(10000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_092_2");
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(5000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 46)
//	@TestDescription("Change the Default,Default should be changed to Another record.")
//	public void FTP_GR_094(String username, String password) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_094";
//		String notes = "Change the Default,Default should be changed to Another record.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.LegalEntityMagnifier();
//		driver.findElement(By.xpath("//span[normalize-space()='D&C Bank Ghana']")).click();
//		Thread.sleep(5000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		driver.findElement(By.xpath("//li[normalize-space()='FTP Group']")).click();
//		Thread.sleep(3000);
//		FTP.FilterValue("Over");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='border-gray-300 text-center']//input[@type='radio']")).click();
//		Thread.sleep(3000);
//		FTP.Save();
//		Thread.sleep(2000);
//		FTP.YesClick();
//		Thread.sleep(5000);
//		//-- Before saving Default ---//
//		takeScreenshot("FTP_GR_094");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[@class='border-gray-300 text-center']//input[@type='radio']")).click();
//		Thread.sleep(3000);
//		FTP.Save();
//		Thread.sleep(2000);
//		FTP.YesClick();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_094_1");
//		Thread.sleep(2000);
//		//-- After saving Default--//
//	}
//	@Test(dataProvider = "loginCredentials2", priority = 47)
//	@TestDescription("Verify Filter for the Particular record,Record should be approved and filter should remains same.")
//	public void FTP_GR_095(String username, String password , String username2 , String password2) throws InterruptedException, IOException, AWTException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_095";
//		String notes = "Verify Filter for the Particular record,Record should be approved and filter should remains same.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.LegalEntityMagnifier();
//		driver.findElement(By.xpath("//span[normalize-space()='D&C Bank Ghana']")).click();
//		Thread.sleep(5000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		driver.findElement(By.xpath("//li[normalize-space()='FTP Group']")).click();
//		Thread.sleep(3000);
//		FTP.FilterValue("Over");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(3000);
//		FTP.ThreeDotClick();
//		FTP.EditClick();
//		Thread.sleep(5000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(10000);
//		FTP.UserProfileClick();
//		Thread.sleep(5000);
//		FTP.LogoutClick();
//		Thread.sleep(5000);
//		login.enterUsername(username2);
//		login.enterPassword(password2);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.LegalEntityMagnifier();
//		driver.findElement(By.xpath("//span[normalize-space()='D&C Bank Ghana']")).click();
//		Thread.sleep(5000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		driver.findElement(By.xpath("//li[normalize-space()='FTP Group']")).click();
//		Thread.sleep(3000);
//		FTP.FilterValue("Over");
//		FTP.ApplyClickInFilter();
//		Thread.sleep(3000);
//		FTP.ThreeDotClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[4]/span[1]")).click();
//		FTP.YesClick();
//		Thread.sleep(3000);
//		WebElement Text = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String ApproveText = Text.getText();
//		System.out.println(ApproveText);
//		takeScreenshot("FTP_GR_095");
//		Thread.sleep(3000);	
//	}
//	@Test(dataProvider = "loginCredentials", priority = 48)
//	@TestDescription("Create a record in Sub group with source query as Manual,Record should be saved.")
//	public void FTP_GR_097(String username, String password) throws InterruptedException, IOException, AWTException {	
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_097";
//		String notes = "Create a record in Sub group with source query as Manual,Record should be saved.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Repricing();
//		FTP.FTP_Nominal();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[normalize-space()='Maturity < 90 Days']")).click();
//		FTP.FTP_Rate("10");
//		WebElement FTP_Group = driver.findElement(By.xpath("//div[@id='-1customSelectMenu3']//input[@type='text']"));
//		FTP_Group.click();
//		driver.findElement(By.xpath("//li[contains(text(),'Group A')]")).click();
//		FTP.SequenceKeys(FTP_Seq_ID);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID);
//		Thread.sleep(5000);
//		FTP.FTP_SourceTab();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@id='-1customSelectMenu7']//span[@class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']")).click();
//		driver.findElement(By.xpath("//li[@class='block w-full hover:bg-gray-100 cursor-pointer select-none rounded-md px-3 py-1 text-start leading-tight transition-all']")).click();
//		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Select * from FTP_GROUPS");
//		Thread.sleep(5000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(5000);
//		FTP.FTP_SourceTab();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_097");
//		FTP.Reject();
//		FTP.YesClick();
//		Thread.sleep(2000);
//	}
//	@Test(dataProvider = "loginCredentials2", priority = 49)
//	@TestDescription("Add Record in Nominal,Entered record should be saved and Approved.")
//	public void FTP_GR_099(String username, String password, String username2 , String password2) throws InterruptedException, IOException, AWTException {	
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_099";
//		String notes = "Add Record in Nominal,Entered record should be saved and Approved.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.FTP_Repricing();
//		Thread.sleep(5000);
//		FTP.TenorMagnifierClick();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[normalize-space()='Maturity < 90 Days']")).click();
//		FTP.FTP_Rate("10");
//		WebElement FTP_Group = driver.findElement(By.xpath("//div[@id='-1customSelectMenu3']//input[@type='text']"));
//		FTP_Group.click();
//		driver.findElement(By.xpath("//li[contains(text(),'Group A')]")).click();
//		FTP.SequenceKeys(FTP_Seq_ID_App);
//		FTP.FTP_SubGroupDesc(FTP_Seq_ID_App);
//		Thread.sleep(5000);
//		FTP.AddOnClick();
//		Thread.sleep(5000);
//		FTP.AddOnTenorClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		FTP.Subsidy("10");
//		Thread.sleep(5000);
//		FTP.LPClick();
//		FTP.LPTenorClick();
//		Thread.sleep(5000);
//		FTP.Tenor90DaysSelect();
//		FTP.Premium("10");
//		Thread.sleep(5000);
//		FTP.FTP_SourceTab();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@id='-1customSelectMenu7']//span[@class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']")).click();
//		driver.findElement(By.xpath("//li[@class='block w-full hover:bg-gray-100 cursor-pointer select-none rounded-md px-3 py-1 text-start leading-tight transition-all']")).click();
//		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Select * from FTP_GROUPS");
//		Thread.sleep(5000);
//		FTP.Save();
//		FTP.YesClick();
//		Thread.sleep(10000);
//		FTP.UserProfileClick();
//		FTP.LogoutClick();
//		Thread.sleep(10000);
//		login.enterUsername(username2);
//		login.enterPassword(password2);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username2);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-dropdown[1]/div[1]/ul[1]/li[3]")).click();
//		FTP.FilterValue(FTP_Seq_ID_App);
//		FTP.ApplyClickInFilter();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@width='22']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[4]/span[1]")).click();
//		FTP.YesClick();
//		Thread.sleep(3000);
//		WebElement App = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String Text = App.getText();
//		System.out.println(Text);
//		Thread.sleep(5000);	
//	}
//	@Test(dataProvider = "loginCredentials2", priority = 50)
//	@TestDescription("Verify Deleted record	Record should move to Delete pending status.")
//	public void FTP_GR_100(String username, String password, String username2 , String password2) throws InterruptedException, IOException, AWTException {	
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-dropdown[1]/div[1]/ul[1]/li[3]")).click();
//		FTP.FilterValue(FTP_Seq_ID_App);
//		FTP.ApplyClickInFilter();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@width='22']")).click();
//		Thread.sleep(3000);
//		FTP.DeleteInThreedotClick();
//		Thread.sleep(3000);
//		FTP.YesClick();
//		Thread.sleep(3000);
//		WebElement deleteText = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String DeleteText = deleteText.getText();
//		System.out.println(DeleteText);
//		Thread.sleep(3000);
//		takeScreenshot("FTP_GR_100");
//		Thread.sleep(3000);
//		String actual = "FTP Groups - Delete - Successful";
//		Assert.assertEquals(actual, DeleteText);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_100";
//		String notes = "Verify Deleted record	Record should move to Delete pending status" + " "+DeleteText;
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@width='22']")).click();
//		//-- Reject Click--//
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[5]/span[1]")).click();
//		FTP.YesClick();
//		Thread.sleep(3000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 51)
//	@TestDescription("Verify Source in SubGroup	Unwanted records can be deleted if needed.")
//	public void FTP_GR_102(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_102";
//		String notes = "Verify Source in SubGroup Unwanted records can be deleted if needed.";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		// -- Source dropdown click--//
//		FTP.SourceColumnDropdownClick();
//		Thread.sleep(3000);
//		// -- Source select Country--//
//		driver.findElement(By.xpath("//li[contains(text(),'Country')]")).click();
//		Thread.sleep(3000);
//		FTP.SourceOperandDropdownClick();
//		Thread.sleep(3000);
//		FTP.sourceOperandEqualSelect();
//		// --Magnifier click--//
//		FTP.sourceConditionMagnifierClick();
//		Thread.sleep(5000);
//		// --Country Mag send keys--//
//		driver.findElement(By.xpath("//body/app-popover[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("K");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[contains(text(),'KE - Kenya')]")).click();
//		driver.findElement(By.xpath("//span[@class='tableActionBtn']//span[@class='block w-[16px]']")).click();
//		driver.findElement(By.xpath("//span[@class='tableActionBtn']//span[@class='block w-[16px]']")).click();
//		takeScreenshot("FTP_GR_102");
//	}
//	@Test(dataProvider = "loginCredentials2", priority = 52)
//	@TestDescription("Verify Reject in Delete pending records( Inside the record)	Status of the record should change to Approve")
//	public void FTP_GR_104(String username, String password, String username2 , String password2) throws InterruptedException, IOException, AWTException {	
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(10000);
//		FTP.FTP_FilterClick();
//		FTP.FilterColumnDropdownClick();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-dropdown[1]/div[1]/ul[1]/li[3]")).click();
//		FTP.FilterValue(FTPDel);
//		FTP.ApplyClickInFilter();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@width='22']")).click();
//		Thread.sleep(3000);
//		FTP.EditClick();
//		Thread.sleep(5000);
//		FTP.deleteClick();
//		Thread.sleep(3000);
//		FTP.YesClick();
//		Thread.sleep(5000);
//		WebElement Delete = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String DeleteMsg = Delete.getText();
//		System.out.println(DeleteMsg);
//		String actualDelete = "FTP Groups - Delete - Successful";
//		Assert.assertEquals(actualDelete, DeleteMsg);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@width='22']")).click();
//		Thread.sleep(3000);
//		FTP.EditClick();
//		Thread.sleep(5000);
//		FTP.rejectClick();
//		Thread.sleep(3000);
//		FTP.YesClick();
//		Thread.sleep(5000);
//		WebElement Reject = driver.findElement(By.xpath("//div[@class='ms-3 text-[13px] font-medium flex-1']"));
//		String RejectMsg = Reject.getText();
//		System.out.println(RejectMsg);
//		String actualReject = "FTP Groups - Reject - Successful";
//		Assert.assertEquals(actualReject, RejectMsg);
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_104";
//		String notes = "Verify Reject in Delete pending records( Inside the record)	Status of the record should change to Approve";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		Thread.sleep(3000);
//	}
//	@Test(dataProvider = "loginCredentials", priority = 53)
//	@TestDescription("Verify Product Attribute	Entered Product Attribute should be displayed")
//	public void FTP_GR_108(String username, String password) throws InterruptedException, IOException {
//		String ScreenName = "AdvancedFTP";
//		String testCaseId = "FTP_GR_108";
//		String notes = "Verify Product Attribute	Entered Product Attribute should be displayed";
//		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickLogin();
//		System.out.println("Login test passed with user: " + username);
//		Thread.sleep(10000);
//		FTP.MenuFTP();
//		Thread.sleep(5000);
//		FTP.FTP_Click();
//		Thread.sleep(5000);
//		FTP.Add();
//		Thread.sleep(5000);
//		FTP.MethodNominal();
//		Thread.sleep(5000);
//		FTP.productAttributeMagnifierClick();
//		Thread.sleep(5000);
//		takeScreenshot("FTP_GR_108");
//		driver.findElement(By.xpath("//td[contains(text(),'P2210050')]")).click();
//		Thread.sleep(2000);
//		takeScreenshot("FTP_GR_108_1");
//		FTP.productAttributeMagnifierClick();
//		Thread.sleep(5000);
//		//--ShowAll--//
//		driver.findElement(By.xpath("//span[@class='text-[9px] text-gray-500 pl-2 cursor-pointer']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[contains(text(),'Home Equity-Fcy')]")).click();
//		takeScreenshot("FTP_GR_108_2");
//		Thread.sleep(5000);
//	}
	@Test(dataProvider = "loginCredentials", priority = 54)
	@TestDescription("Verify Source in SubGroup	Field is mandatory trigger should appear ( for entering Manual query)")
	public void FTP_GR_109(String username, String password) throws InterruptedException, IOException {
		String ScreenName = "AdvancedFTP";
		String testCaseId = "FTP_GR_109";
		String notes = "Verify Source in SubGroup	Field is mandatory trigger should appear ( for entering Manual query)";
		Listeners_FTP.reportTestDetails1(ScreenName, testCaseId, notes);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
		System.out.println("Login test passed with user: " + username);
		Thread.sleep(10000);
		FTP.MenuFTP();
		Thread.sleep(5000);
		FTP.FTP_Click();
		Thread.sleep(5000);
		FTP.Add();
		Thread.sleep(5000);
		FTP.FTP_SourceTab();
		Thread.sleep(5000);
		FTP.sourceQueryDropdownClickSelect();
		FTP.Save();
		Thread.sleep(5000);
		takeScreenshot("FTP_GR_109");
		
	}
		
}
