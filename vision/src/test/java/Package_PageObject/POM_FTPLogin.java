package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_FTPLogin extends Base_PageObject {

    // Constructor
    public POM_FTPLogin(WebDriver driver) {
        super(driver);
    }

    
    @FindBy(xpath = "//input[@placeholder='User Name']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@placeholder='Password']")
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
