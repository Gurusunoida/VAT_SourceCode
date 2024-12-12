package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_BusinessLine extends Base_PageObject {

	public POM_BusinessLine(WebDriver driver) {
		super(driver);
	}

	// --- Business line ID --//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement bBusinesslineID;

	// -- Business line Desc--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement bBusinesslineDesc;

	// -- Business line Type click--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]")
	WebElement bBusinesslineType;

	@FindBy(xpath = "//span[contains(text(),'Expense')]")
	WebElement bBusinesslineSelectExpense;

	@FindBy(xpath = "//span[contains(text(),'Income')]")
	WebElement bBusinesslineSelectIncome;

	// --Details Add row--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]")
	WebElement aAddrow;

	// -- Modify Click--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement mModify;

	// --Income Expensse Type--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement iIncomeexpensetype;

	// -- Income Expense Select---//
	@FindBy(xpath = "//span[contains(text(),'Fee & Comission')]")
	WebElement iIncomeexpenseSelect;

	// -- Service type dropdown--//
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement sServiceType;

	// -- Service Select--//
	@FindBy(xpath = "/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")
	WebElement sServiceSelect;

	// -- Service Description click--//
	@FindBy(xpath = "//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement sServiceDesc;

	// -- Service Desc Select--//
	@FindBy(xpath = "//span[contains(text(),'ALL - All')]")
	WebElement sServiceDescSelect;

	// --Currency Click--//
	@FindBy(xpath = "//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement cCurrencyclick;

	// -- Currency Select--//
	@FindBy(xpath = "/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")
	WebElement cCurrencySelect;

	// -- Gl code Click--//
	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	WebElement GLclick;

	// -- Gl Select--//
	@FindBy(xpath = "//td[contains(text(),'ALL')]")
	WebElement GLSelect;

	// -- Account no Click--//
	@FindBy(xpath = "//tbody/tr[1]/td[6]/input[1]")
	WebElement AccClick;

	// -- Account Select--//
	@FindBy(xpath = "//td[contains(text(),'ALL')]")
	WebElement AccSelect;

	// -- Recon Rule click--//
	@FindBy(xpath = "//span[contains(text(),'Recon Rule')]")
	WebElement rReconClick;

	// -- Rule Priority--//
	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	WebElement priority;

	// -- Rule ID Dropdown--//
	@FindBy(xpath = "//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement rRuleIDdropdown;

	// -- Rule ID Select--//
	@FindBy(xpath = "//span[contains(text(),'Contract & Ref Rule')]")
	WebElement rRuleSelect;

	// -- Recon type dropdown--//
	@FindBy(xpath = "//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement rReconTypedropdown;

	// -- Recon Select--//
	@FindBy(xpath = "//span[contains(text(),'Recon Backdated')]")
	WebElement rReconSelect;

	// -- Recon Method Dropdown--//
	@FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement rReconMethoddropdown;

	// -- Recon method Select--//
	@FindBy(xpath = "//span[contains(text(),'First In First Out')]")
	WebElement rReconMethodSelect;

	// -- Grace days--//
	@FindBy(xpath = "//body[1]/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/perfect-scrollbar[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement gracedays;

	// -- Save Businessline--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-businesslineconfig[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement bSave;

	public void BusinesslineSave() {
		bSave.click();
	}

	public void ReconMethodDropdown() {
		rReconMethoddropdown.click();
	}

	public void ReconMethodSelect() {
		rReconMethodSelect.click();
	}

	public void GraceDays(String Days) {
		gracedays.sendKeys(Days);
	}

	public void ReconSelect() {
		rReconSelect.click();
	}

	public void ReconDropdown() {
		rReconTypedropdown.click();
	}

	public void RuleSelect() {
		rRuleSelect.click();
	}

	public void RuleID_Dropdown() {
		rRuleIDdropdown.click();
	}

	public void RulePriority(String Priority) {
		priority.sendKeys(Priority);
	}

	public void ReconClick() {
		rReconClick.click();
	}

	public void AccountSelect() {
		AccSelect.click();
	}

	public void AccountClick() {
		AccClick.click();
	}

	public void GLSelect() {
		GLSelect.click();
	}

	public void GLCode() {
		GLclick.click();
	}

	public void CurrencySelect() {
		cCurrencySelect.click();
	}

	public void CurrencyClick() {
		cCurrencyclick.click();
	}

	public void ServideDesSelect() {
		sServiceDescSelect.click();
	}

	public void ServiceDescClick() {
		sServiceDesc.click();
	}

	public void ServiceTypeclick() {
		sServiceType.click();
	}

	public void ServiceTypeSelect() {
		sServiceSelect.click();
	}

	public void IEType() {
		iIncomeexpensetype.click();
	}

	public void IESelect() {
		iIncomeexpenseSelect.click();
	}

	public void Modify() {
		mModify.click();
	}

	public void DetailsAddrow() {
		aAddrow.click();
	}

	public void BusinessLineID(String ID) {
		bBusinesslineID.sendKeys(ID);
	}

	public void BusinesslineDesc(String Desc) {
		bBusinesslineDesc.sendKeys(Desc);
	}

	public void BusinessLineType() {
		bBusinesslineType.click();
	}

	public void BusinessLineTypeExpense() {
		bBusinesslineSelectExpense.click();
	}

	public void BusinessLineTypeIncome() {
		bBusinesslineSelectIncome.click();
	}

}
