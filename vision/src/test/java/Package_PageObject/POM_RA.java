package Package_PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_RA extends Base_PageObject {

	public POM_RA(WebDriver driver) {
		super(driver);
	}

//	@FindBy(xpath ="//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")
//	WebElement mMasterConfig;

	@FindBy(xpath = "//li[@class='nav-item firstLevelMenuIcon firstLevel']//a[@class = 'nav-link aaa firstLevelMenuIcon menu-main']//i[contains(text(),'apps')]")
	WebElement mMasterConfig;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement mMasterDropdown;

//	@FindBy(xpath = "//li[@class='nav-item secondLevelMenuLi']//a[@class = 'nav-link m-0']//span[@class = 'sidebar-normal sidebar-normal-1']")
//	WebElement mMasterDropdown;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement tTransline;

//	@FindBy(xpath = "//li[@class='nav-item']//a[@class = 'nav-link']//span[contains(text(),'Trans Line Configuration')]")
//	WebElement tTransline;

//	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")
//	WebElement vVarianceFlagging;

	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//a[@class = 'nav-link']//span[contains(text(),'Variance Flagging')]")
	WebElement vVarianceFlagging;

//	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")
//	WebElement uUser;

	@FindBy(xpath = "//li[@class= 'nav-item firstLevelMenuIcon firstLevel']//a[@class= 'nav-link aaa firstLevelMenuIcon menu-main']//p[contains(text(),'RA Admin ')]")
	WebElement uUser;

//	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
//	WebElement rRAAdmin;

//	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
//	WebElement rRecon;

	@FindBy(xpath = "//li[@class= 'nav-item']//a[@class= 'nav-link']//span[contains(text(),'Recon Configuration')]")
	WebElement rRecon;

//	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")
//	WebElement vVisionVariables;

	@FindBy(xpath = "//li[@class= 'nav-item']//a[@class= 'nav-link']//span[contains(text(),'Vision Variables')]")
	WebElement vVisionVariables;

	@FindBy(xpath = "//span[contains(text(),'Business Line Configuration')]")
	WebElement bBusinessline;

	@FindBy(xpath = "//span[contains(text(),'Fees Configuration')]")
	WebElement fFeesConfig;

	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//a[@class = 'nav-link']//span[contains(text(),'Fees Priority')]")
	WebElement fFeesPriority;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")
	WebElement rRAAdmin;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]")
	WebElement rRADropdown;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")
	WebElement aAlphaNumTab;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")
	WebElement tTellerCounter;

	public void VarianceFlagging() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", mMasterConfig);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", mMasterDropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", vVarianceFlagging);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void UserSetup() {
		uUser.click();
	}

	public void RAAdmin() {
		rRAAdmin.click();
	}

	public void Recon() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", uUser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", rRAAdmin);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", rRecon);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void Transline() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", mMasterConfig);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", mMasterDropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", tTransline);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void Businessline() {
		bBusinessline.click();
	}

	public void FeesConfig() {
		fFeesConfig.click();
	}

	public void MasterDropdown() {
		mMasterDropdown.click();
	}

	public void MasterConfig() {
		mMasterConfig.click();
	}

	public void AlphaNumTab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", rRAAdmin);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", rRADropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", aAlphaNumTab);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void TellerCounter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", mMasterConfig);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", mMasterDropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", tTellerCounter);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
