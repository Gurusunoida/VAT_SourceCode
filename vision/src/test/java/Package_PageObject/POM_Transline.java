package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class POM_Transline extends Base_PageObject {

	public POM_Transline(WebDriver driver) {
		super(driver);
	}

	// -- Transline ID Send keys--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement tID;

	// -- Transline Desc--//

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")
	WebElement tDesc;

	// --Transline Type dropdown click--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement tType;

	// -- Service Select --//
	@FindBy(xpath = "//span[contains(text(),'Service')]")
	WebElement tService;

	// --- Product Select --//
	@FindBy(xpath = "//span[contains(text(),'Product')]")
	WebElement tProduct;

	// -- Transline Group Service click--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[1]")
	WebElement tGroupService;

	// -- Group- Branch operation--//
	@FindBy(xpath = "//span[contains(text(),'Branch Operations')]")
	WebElement gBranch;

	// -- Transline Group Product Click--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ng-select[1]/div[1]/span[2]")
	WebElement tGroupProduct;

	// -- Product Select for Group--//
	@FindBy(xpath = "/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")
	WebElement gProduct;

	// --Group- Trade finance--//
	@FindBy(xpath = "//span[contains(text(),'Trade Finance')]")
	WebElement gTrade;

	// -- Business vertical click--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[2]/span[1]")
	WebElement bBusinessVertical;

	// -- Product line type click--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")
	WebElement pProductLineType;

	// -- Product line type Select--//
	@FindBy(xpath = "//span[contains(text(),'Liabilities')]")
	WebElement plSelectLiabilities;

	// -- Product line type Select --//
	@FindBy(xpath = "//span[contains(text(),'Asset')]")
	WebElement plSelectAsset;

	// -- Apply Click--//
	@FindBy(xpath = "//button[contains(text(),'Apply')]")
	WebElement aApply;

	// -- Refresh--//
	@FindBy(xpath = "//i[contains(text(),'autorenew')]")
	WebElement rRefresh;

	// -- Add--//
	@FindBy(xpath = "//i[contains(text(),'add')]")
	WebElement aAdd;

	// -- Save--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement sSave;
	
	
	//-- Extraction frequency--//
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ng-select[1]/div[1]/span[1]")
	WebElement extractionFreq;
	
	//--Extraction select--//
	@FindBy(xpath = "//span[contains(text(),'Daily')]")
	WebElement extractionSelect;
	
	//-- Product Type grid--//
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement producttypeGridClick;
	
	//-- Product Type grid Select--//
	@FindBy(xpath = "//span[contains(text(),'FDA - Fixed Deposit')]")
	WebElement producttypeGridSelectFD;
	
	//-- Product Desc Grid--//
	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement productDescGridClick;
	
	//-- Product Desc Select--//
	@FindBy(xpath = "//span[contains(text(),'ALL - All')]")
	WebElement productDescSelectAll;
	
	//-- Currency Click--//
	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement currencyClick;
	
	//-- Currency Select--//
	@FindBy(xpath = "/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")
	WebElement CurrencySelectAll;
	
	//-- Success Toaster--//
	@FindBy(xpath = "//div[contains(text(),'- Successful')]")
	WebElement successToaster;
	
	public void SuccessToaster() {
		Actions actions = new Actions(driver);
		actions.moveToElement(successToaster).perform();
		String SuccessText = successToaster.getText();
		System.out.println(SuccessText);
	}
	
	public void Currency() {
		currencyClick.click();
		CurrencySelectAll.click();
	}
	
	
	public void ProductTypGridClick() {
		producttypeGridClick.click();
	}
	
	public void ProductTypeGridSelectFD() {
		producttypeGridSelectFD.click();
	}
	
	public void ProductDescClick() {
		productDescGridClick.click();
		productDescSelectAll.click();
	}
	
	
	
	
	public void ExtractionFreqClick() {
		extractionFreq.click();
	}
	
	public void ExtractioDaily() {
		extractionSelect.click();
	}
	
	

	public void TranslineSave() {
		sSave.click();
	}

	public void TranslineAdd() {
		aAdd.click();
	}

	public void Referesh() {
		rRefresh.click();
	}

	public void Apply() {
		aApply.click();
	}

	public void TranslineID(String ID) {
		tID.sendKeys(ID);
	}

	public void TranslineDesc(String Desc) {
		tDesc.sendKeys(Desc);
	}

	public void TranslineType() {
		tType.click();
	}

	public void TranslineService() {
		tService.click();
	}

	public void TranslineProduct() {
		tProduct.click();
	}

	public void TranslineGroupService() {
		tGroupService.click();
	}

	public void GroupBranch() {
		gBranch.click();
	}

	public void TranslineGroupProduct() {
		tGroupProduct.click();
	}

	public void GroupProductCASA() {
		gProduct.click();
	}

	public void GroupdTrade() {
		gTrade.click();
	}

	public void Businessvertical() {
		bBusinessVertical.click();
	}

	public void ProductlineType() {
		pProductLineType.click();
	}

	public void ProductSelectAsset() {
		plSelectAsset.click();
	}

	public void ProductSelectLiability() {
		plSelectLiabilities.click();
	}
}
