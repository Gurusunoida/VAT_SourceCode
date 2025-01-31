package Package_PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Package_PageObject.Base_PageObject;

public class POM_ETL extends Base_PageObject {

	public POM_ETL(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//p[contains(text(),'ETL Category')]")
	WebElement cCategory;

	@FindBy(xpath = "//p[contains(text(),'ETL Feed Configuration')]")
	WebElement fFeedConfiguration;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")
	WebElement lLink;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")
	WebElement dDropdown;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement cConnector;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")
	WebElement cConnectorScript;

//	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//a[@class='nav-link']//span[@class='sidebar-normal' and contains(text(),'ETL Connector Script')]")
//	WebElement cConnectorScript;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")
	WebElement cConnectorQuery;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/p[1]")
	WebElement eETLAdmin;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")
	WebElement eETLDropdown;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement pProfileSetup;

	public void Connector() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lLink);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", dDropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", cConnector);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void ConnectorScript() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lLink);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", dDropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", cConnectorScript);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void ConnectorQuery() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lLink);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", dDropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", cConnectorQuery);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void Category() {
		cCategory.click();
	}

	public void FeedConfiguration() {
		fFeedConfiguration.click();
	}

	public void ProfileSetup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", eETLAdmin);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", eETLDropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", pProfileSetup);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
