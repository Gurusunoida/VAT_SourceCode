package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_ETLConnector_J17  extends Base_PageObject{

	public POM_ETLConnector_J17(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement cCountryClick;
	
	public void CountryClickConnector() {
		cCountryClick.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'AE - United Arab Emirates')]")
	WebElement cCountrySelectAE;
	
	public void CountrySelectConnectorAE() {
		cCountrySelectAE.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'KE - Kenya')]")
	WebElement cCountrySelecyKE;
	
	public void CountrySelectConnectorKE() {
		cCountrySelecyKE.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")
	WebElement lLeBookClick ;
	
	public void LEBookClickConnector() {
		lLeBookClick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement cConnectorIDSendkeys;
	
	public void ConnectorIDSkeys(String ID) {
		cConnectorIDSendkeys.sendKeys(ID);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")
	WebElement cConnectorDesSendkeys;
	
	public void ConnectorDescSkeys(String Desc){
		cConnectorDesSendkeys.sendKeys(Desc);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/ng-select[1]/div[1]/span[2]")
	WebElement eEndPointClick;
	
	public void EndPointClick() {
		eEndPointClick.click();
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Source & Destination')]")
	WebElement eEndpointSelectSD;
	
	public void EndPointSelect() {
		eEndpointSelectSD.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/ng-select[1]/div[1]/span[2]")
	WebElement cConnetcorTypeClick;
	
	public void ConnectorTypeClick() {
		cConnetcorTypeClick.click();
	}
	
	@FindBy(xpath = "/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")
	WebElement cConnectorTypeSelectStructured;
	
	public void ConnectorTypeStructureSlect() {
		cConnectorTypeSelectStructured.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement dDBTypeClick;
	
	public void DBTypeClick() {
		dDBTypeClick.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'MSSQL')]")
	WebElement msSQLSelect;
	
	public void DBmsSQLSelect() {
		msSQLSelect.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
	WebElement ipSendkeys;
	
	public void IPSkeys(String IP) {
		ipSendkeys.sendKeys(IP);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	WebElement portSendkeys;
	
	public void PortSkeys(String Port) {
		portSendkeys.sendKeys(Port);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]")
	WebElement userSendkeys;
	
	public void UserSkeys(String User) {
		userSendkeys.sendKeys(User);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]")
	WebElement pwdSendkeys;
	
	public void PWDsKeys(String PWD) {
		pwdSendkeys.sendKeys(PWD);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement testConnectionclick;
	
	public void TestConnectionClick() {
		testConnectionclick.click();
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-connector[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")
	WebElement saveClick;
	
	public void SaveClick() {
		saveClick.click();	
	}
	
}
