package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_FTPLogin extends Base_PageObject {

    // Constructor
    public POM_FTPLogin(WebDriver driver) {
        super(driver);
    }

    
    @FindBy(xpath = "//body/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/input[1]")
    private WebElement usernameField;

    @FindBy(xpath = "//body/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]")
    private WebElement passwordField;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    private WebElement loginButton;

    
    public void enterUsername(String username) {
        if (usernameField.isDisplayed()) {
            usernameField.clear();
            usernameField.sendKeys(username);
        } else {
            throw new RuntimeException("Username field is not visible.");
        }
    }

    public void enterPassword(String password) {
        if (passwordField.isDisplayed()) {
            passwordField.clear();
            passwordField.sendKeys(password);
        } else {
            throw new RuntimeException("Password field is not visible.");
        }
    }

    public void clickLogin() {
        if (loginButton.isDisplayed()) {
            loginButton.click();
        } else {
            throw new RuntimeException("Login button is not visible.");
        }
    }
}