package Vision_FTP;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class FTP_BaseClass_Copy {

    protected WebDriver driver;
    public Logger logger;
    private Properties properties;

    private void loadProperties() throws IOException {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(input);
            System.out.println("Properties loaded successfully.");
            System.out.println("ftp_URL: " + properties.getProperty("ftp_URL"));
        } catch (IOException e) {
            System.out.println("Error loading properties file: " + e.getMessage());
            throw e;
        }
    }
    @BeforeClass
    public void ChromesetUp() throws IOException {
        loadProperties();

       
        WebDriverManager.chromedriver().setup();
        logger = LogManager.getLogger(this.getClass());
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        String baseUrl = properties.getProperty("ftp_URL");
        if (baseUrl == null) {
            throw new IOException("ftp_URL not found in the properties file.");
        }

        driver.get(baseUrl);
        System.out.println("Driver setup successful. Navigated to: " + baseUrl);
    }
    
    public String getProperty(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            logger.warn("Key not found in properties file: " + key);
        }
        return value;
    }
    
   

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    
 
}