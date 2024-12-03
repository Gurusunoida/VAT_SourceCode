package Package_PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_General extends Base_PageObject{
	public POM_General(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//i[contains(text(),'add')]")
	WebElement Add;
	
	@FindBy(xpath = "//i[contains(text(),'filter_alt')]")
	WebElement Filter;
	
	
	@FindBy(xpath = "//i[contains(text(),'person')]")
	WebElement Uprofile;
	
	
	@FindBy(xpath = "//i[contains(text(),'home')]")
	WebElement Hhome;
	
	
	@FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")
	WebElement hFiltercolumn;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/span[4]/b[1]")
	WebElement hBusinessDropdown;
	
	@FindBy(xpath = "//button[contains(text(),'No')]")
	WebElement nNoButton;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yYesButton;
	
	public void NoButton() {
		nNoButton.click();
	}
	
	public void YesButton() {
		yYesButton.click();
	}
	
	
	public void BusinessDropdown() {
		hBusinessDropdown.click();
	}
	
	
	public void FilterColumnclick() {
		hFiltercolumn.click();
	}
	
	public void ADD() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", Add);
	}
	
	public void FILTER() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", Filter);
		
	}
	
	public void UserProfile() {
		Uprofile.click();
	}
	
	public void Home() {
		Hhome.click();
	}

}
