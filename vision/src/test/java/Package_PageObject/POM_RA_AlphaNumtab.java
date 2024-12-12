package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_RA_AlphaNumtab extends Base_PageObject {

	public POM_RA_AlphaNumtab(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement aAlphaTabID;

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-alphatab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	WebElement dDescription;
					
	@FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")
	WebElement aAlphaSubTabID;

	@FindBy(xpath = "//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")
	WebElement aAlphaSubTabDesc;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement sSave;

	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	WebElement cClear;

	@FindBy(xpath = "//i[contains(text(),'add')]")
	WebElement aAlphaTabAdd;

	@FindBy(xpath = "//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement sStatusClick;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement nNumTabID;
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-alphanumtab[1]/div[1]/div[1]/div[1]/div[1]/app-numtab[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	WebElement nNumTabDesc;
	
	@FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]")
	WebElement nNumSubTabID;
	
	@FindBy(xpath = "//tbody/tr[1]/td[11]/div[1]/div[1]/input[1]")
	WebElement nNumSubTabDesc;
	
	public void NumTabID(String NumID) {
		nNumTabID.sendKeys(NumID);
	}
	
	public void  NumTabDesc(String NumDesc) {
		nNumTabDesc.sendKeys(NumDesc);
	}
	
	public void NumSubTabID (String NumSubID) {
		nNumSubTabID.sendKeys(NumSubID);
	}
	
	public void NumSubTabDesc (String NumSubDesc) {
		nNumSubTabDesc.sendKeys(NumSubDesc);
	}


	public void AlphaTabClear() {
		cClear.click();
	}

	public void AlphaTabAdd() {
		aAlphaTabAdd.click();
	}

	public void StatusClick() {
		sStatusClick.click();
	}

	public void AlphaSubTabID(String SubTabID) {
		aAlphaSubTabID.sendKeys(SubTabID);
	}

	public void AlphaSubTabDesc(String SubTabDesc) {
		aAlphaSubTabDesc.sendKeys(SubTabDesc);
	}

	public void AlphaTabID(String ID) {
		aAlphaTabID.sendKeys(ID);
	}

	public void AlphaTabDesc(String Desc) {
		dDescription.sendKeys(Desc);
	}

	public void AlphaTabSave() {
		sSave.click();
	}

}
