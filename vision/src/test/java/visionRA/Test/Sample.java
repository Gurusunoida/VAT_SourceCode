package visionRA.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {

	WebDriver driver;

	
	
	@Parameters("ApplicationURL")
	@Test(priority = 3)//----------Pendding----------------------////
	public void CON_DC_011() throws InterruptedException {
		driver = new ChromeDriver();
		String applicationURL = "https://testsigma.com/blog/mouse-hover-in-selenium/";
		driver.get(applicationURL );
		driver.manage().window().maximize();
		WebElement copy= (WebElement) driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[18]/div[1]/button[1]"));
		((WebElement) copy).click();
		
	}
	@AfterMethod
	public void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

}
