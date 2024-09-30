package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login  extends Base_PageObject{
	public Login(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")
	WebElement LoginName;
	
	@FindBy(xpath = "//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")
	WebElement LoginPassword;
	
	@FindBy(xpath ="//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")
	WebElement LoginCLick;
	
public void loginUsername(String userName) {
	LoginName.sendKeys(userName);
}

public void loginPassword(String password) {
	LoginPassword.sendKeys(password);
}

public void  LoginClick() {
	LoginCLick.click();
}

}
