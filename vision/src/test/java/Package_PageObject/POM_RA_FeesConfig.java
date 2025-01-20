package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_RA_FeesConfig extends Base_PageObject {

	public POM_RA_FeesConfig(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath ="//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")
	WebElement feeType;
	
	@FindBy(xpath = "//span[contains(text(),'Flat')]")
	WebElement feeTypeFlat;
	
	@FindBy(xpath = "//span[contains(text(),'Range')]")
	WebElement feeTypeRange;
	
	@FindBy(xpath = "//span[contains(text(),'Slab')]")
	WebElement feeTypeSlab;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/ng-select[1]/div[1]/span[2]")
	WebElement tierRangetype;
	
	@FindBy(xpath = "//span[contains(text(),'Amount')]")
	WebElement amountSelect;
	
	@FindBy(xpath = "/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/span[1]")
	WebElement countSelect;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]")
	WebElement addRowFees;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-transaction-line-module[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-fees-line-transaction[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/ng-select[1]/div[1]/span[2]")
	WebElement feeBasis;
	
	@FindBy(xpath = "//span[contains(text(),'Percentage')]")
	WebElement feeBasisPercentage;
	
	@FindBy(xpath = "//span[contains(text(),'Per Unit')]")
	WebElement feeBasisPerUnit;
	
	@FindBy(xpath = "/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")
	WebElement feeBasisUnit;
	
	public void AddRowFees() {
		addRowFees.click();
	}
	
	public void TierRangeTypeClick() {
		tierRangetype.click();
	}
	
	public void AmountSelect() {
		amountSelect.click();
	}
	
	public void CountSelect() {
		countSelect.click();
	}
	
	public void FeeTypeClick() {
		feeType.click();
	}
	
	public void FeeTypeSelectFlat() {
		feeTypeFlat.click();
	}
	
	public void FeeTypeSelectRange() {
		feeTypeRange.click();
	}
	
	public void FeeTypeSelectSlab() {
		feeTypeSlab.click();
	}

}
