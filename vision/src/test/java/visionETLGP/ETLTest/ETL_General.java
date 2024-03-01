package visionETLGP.ETLTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ETL_General {
	WebDriver driver;

	@Parameters("ApplicationURL")
	@BeforeMethod
	public void BrowserOpening(String applicationURL) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
	  @Test(dataProvider = "loginCredentials")
	  public void RA_Login(String username, String password) throws InterruptedException {
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
			.sendKeys(username);
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
					.sendKeys(password);
			driver.findElement(By
					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
					.click();
			Thread.sleep(5000);
	  }
	  @DataProvider(name = "loginCredentials")
	  public Object[][] provideLoginData() {
	      // You can define multiple sets of valid and invalid login credentials
	      return new Object[][] {
	          {"RA", "Vision@123"},
	          {"RA", "vision@123"},
	          {"QW", "Vision@123"},
	      };
	  }
}
