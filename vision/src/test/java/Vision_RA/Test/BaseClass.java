package Vision_RA.Test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Package_PageObject.Login;
import io.github.bonigarcia.wdm.WebDriverManager;


public abstract class BaseClass  {


	protected WebDriver driver;
	public Logger logger;

    
    @BeforeMethod
    public void setUp() {
   
    	WebDriverManager.chromedriver().setup();
    	logger = LogManager.getLogger(this.getClass());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("http://202.83.25.244:8001/");
        driver.get("http://10.16.1.235:4200/");
        
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
