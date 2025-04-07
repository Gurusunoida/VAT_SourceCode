package Vision_FTP;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseClass {

    protected  WebDriver driver; 
    public Logger logger;
    private Properties properties;

    public BaseClass() {
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

        String baseUrl = getProperty("ftp_URL"); // Use getProperty() now safely
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