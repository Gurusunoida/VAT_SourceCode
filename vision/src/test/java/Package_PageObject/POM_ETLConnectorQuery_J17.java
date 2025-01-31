package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_ETLConnectorQuery_J17 extends Base_PageObject{

	public POM_ETLConnectorQuery_J17(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement countryClick;
	
	public void CountryClickQuery() {
		countryClick.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'AE - United Arab Emirates')]")
	WebElement countrySelectAE;
	
	public void CountrySelectQueryAE() {
		countrySelectAE.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'KE - Kenya')]")
	WebElement countrySelectKE;
	
	public void CountrySelectQueryKE() {
		countrySelectKE.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")
	WebElement leBookClick;
	
	public void LeBookClick() {
		leBookClick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]")
	WebElement connectorIDClick;
	
	public void ConnectorIDClick() {
		connectorIDClick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement queryIDsendKeys;
	
	public void QueryIDSendkeys(String Query) {
		queryIDsendKeys.sendKeys(Query);
	}
	
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]")
	WebElement descSendkeys;
	
	public void QueryDescSendkeys(String Desc) {
		descSendkeys.sendKeys(Desc);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]")
	WebElement typeClick;
	
	public void TypeClick() {
		typeClick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]")
	WebElement querySendKeys;
	
	public void QuerySendKeys(String Query) {
		querySendKeys.sendKeys(Query);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement validateClick;
	
	public void ValidateClick() {
		validateClick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-manual-query[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")
	WebElement saveClick;
	
	public void SaveClick() {
		saveClick.click();
	}
	
}
