package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_ETLConnectorScript_J17 extends Base_PageObject {

	public POM_ETLConnectorScript_J17(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement connectorScriptCountryClick;
	
	public void ConnectorScriptCountryClick() {
		connectorScriptCountryClick.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'AE - United Arab Emirates')]")
	WebElement connectorScriptCountrySelectAE;
	
	public void ConnectorScriptCountrySelectAE() {
		connectorScriptCountrySelectAE.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'KE - Kenya')]")
	WebElement connectorScriptCountrySelectKE;
	
	public void ConnectorScriptCountrySelectKE() {
		connectorScriptCountrySelectKE.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")
	WebElement leBookClick;
	
	public void ConnectorScriptLebookClick() {
		leBookClick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement connectorIDClick;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement connetcorIDSendkeys;
	
	public void ConnectorScriptConnectorIDClick(String C_ID) {
		connectorIDClick.click();
		connetcorIDSendkeys.sendKeys(C_ID);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]")
	WebElement scriptIDSendkeys;
	
	public void ConnectorScriptScriptIDSendkeys(String ScriptID) {
		scriptIDSendkeys.sendKeys(ScriptID);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement scriptTypeClick;
	
	public void ConnectorScriptScriptTypeclick() {
		scriptTypeClick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/span[2]")
	WebElement executionTypeClick;
	
	public void ConnectorScriptExecutiontypeClick() {
		executionTypeClick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/textarea[1]")
	WebElement scriptDescSendkeys;
	
	public void ConnectorScriptDescSendkeys(String ScriptDesc) {
		scriptDescSendkeys.sendKeys(ScriptDesc);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/textarea[1]")
	WebElement scriptSendkeys;
	
	public void ScriptSendkeys(String Script) {
		scriptSendkeys.sendKeys(Script);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement saveClick;
	
	public void ConnectorScriptSaveClick() {
		saveClick.click();
	}

}
