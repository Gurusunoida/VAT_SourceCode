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

public abstract class FTP_BaseClass {

	private static final String BASE_URL = "http://10.16.1.166:4300/";
	
	//protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	protected WebDriver driver;
	public Logger logger;
	
	protected static Properties prop;

    static {
        try {
            // Load the properties file
            FileInputStream fileInput = new FileInputStream("src/test/resources/application.properties");
            prop = new Properties();
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Getter methods for the properties
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

	@BeforeMethod
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		logger = LogManager.getLogger(this.getClass());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get(BASE_URL);
		System.out.println("Driver setup successful. Navigated ");
	}

	@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
}