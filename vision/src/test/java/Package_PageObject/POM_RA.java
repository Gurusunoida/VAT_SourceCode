package Package_PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_RA extends Base_PageObject{

	
	public POM_RA(WebDriver driver) {	
		super(driver);
	}
	
	@FindBy(xpath ="//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")
	WebElement mMasterConfig;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement mMasterDropdown;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement tTransline;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement vVarianceFlagging;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]")
	WebElement uUser;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
	WebElement rRAAdmin;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement rRecon;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")
	WebElement vVisionVariables;
	
	
	public void VarianceFlagging() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", mMasterConfig);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].click();", mMasterDropdown);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("arguments[0].click();", vVarianceFlagging);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
	
	
	public void MasterDropdown() {
		mMasterDropdown.click();
	}
	
	public void MasterConfig() {
		mMasterConfig.click();
	}
	
}
