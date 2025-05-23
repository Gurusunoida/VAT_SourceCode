package Vision_BI;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseClassFTP {

    protected  WebDriver driver; 
    public Logger logger;
    private Properties properties;

    public BaseClassFTP() {
        try {
            loadProperties(); // Ensure properties are loaded before any test runs
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file", e);
        }
    }

    private void loadProperties() throws IOException {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(input);
            System.out.println("Properties loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading properties file: " + e.getMessage());
            throw e;
        }
    }

    public String getProperty(String key) {
        if (properties == null) {
            throw new IllegalStateException("Properties not initialized. Ensure the class constructor is called.");
        }
        String value = properties.getProperty(key);
        if (value == null) {
            logger.warn("Key not found in properties file: " + key);
        }
        return value;
    }

    @BeforeMethod
    public void ChromesetUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        logger = LogManager.getLogger(this.getClass());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();

     // ✅ Disable Chrome's password manager and autofill
     Map<String, Object> prefs = new HashMap<>();
     prefs.put("credentials_enable_service", false);
     prefs.put("profile.password_manager_enabled", false);
     options.setExperimentalOption("prefs", prefs);

     // ✅ Suppress all password-related popups and autofill
     options.addArguments(
         "--disable-features=AutofillServerCommunication,PasswordManagerEnabled,PasswordCheck,EnablePasswordsAccountStorage"
     );
     options.addArguments("--disable-save-password-bubble");
     options.addArguments("--disable-notifications");
     options.addArguments("--disable-extensions");
     options.addArguments("--disable-popup-blocking");
     options.addArguments("--start-maximized");

     // ✅ Create a temporary clean Chrome user profile to avoid old settings
     options.addArguments("user-data-dir=" + System.getProperty("java.io.tmpdir") + "/tempProfile_" + System.currentTimeMillis());

        String baseUrl = getProperty("ftp_URL"); 
        if (baseUrl == null) {
            throw new IOException("ftp_URL not found in the properties file.");
        }

        driver.get(baseUrl);
        System.out.println("Driver setup successful. Navigated to: " + baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

	public WebDriver getDriver() {
		return driver;
	}

} 