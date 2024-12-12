package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_RA_VarianceFlagging extends Base_PageObject {

	public POM_RA_VarianceFlagging(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]")
	WebElement dDesc;

	@FindBy(xpath = "//i[contains(text(),'mode_edit')]")
	WebElement eEdit;

	@FindBy(xpath = "//button[contains(text(),'Query')]")
	WebElement qQuery;

	@FindBy(xpath = "//i[contains(text(),'chevron_right')]")
	WebElement cChevronRight;

	public void ChevronRight() {
		cChevronRight.click();
	}

	public void Query() {
		qQuery.click();
	}

	public void Edit() {
		eEdit.click();
	}

	public void Description(String Desc) {
		dDesc.sendKeys(Desc);
	}

}
