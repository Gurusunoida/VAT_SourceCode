package Package_PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_ETL extends Base_PageObject{

	public POM_ETL(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath = "//p[contains(text(),'ETL Category')]")
	WebElement aCategory;
	
	@FindBy(xpath = "//p[contains(text(),'ETL Feed Configuration')]")
	WebElement fFeedConfiguration;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]")
	WebElement cLink;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")
	WebElement cDropdown;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement cConnector;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")
	WebElement cCOnnectorScript;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")
	WebElement cConnectorQuery;
	
	public void Connector() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", cLink);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].click();", cDropdown);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("arguments[0].click();", cConnector);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void ConnectorScript() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", cLink);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].click();", cDropdown);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("arguments[0].click();", cCOnnectorScript);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void ConnectorQuery() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", cLink);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].click();", cDropdown);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("arguments[0].click();", cConnectorQuery);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	public void Category() {	
		aCategory.click();
	}
	
	public void FeedConfiguration() {
		fFeedConfiguration.click();
	}
	
}
