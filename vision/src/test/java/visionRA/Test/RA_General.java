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

public class RA_General {
	String VarDesc = "VAT";
	WebDriver driver;
	 @Parameters("ApplicationURL")
   @BeforeMethod
   public void setUp(String applicationURL) throws InterruptedException {
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

//   @Test(dataProvider = "loginCredentials"priority = 1)
//   public void VAT_RA_Login(String username, String password) throws InterruptedException {
//       driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(username);
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(password);
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
//       Thread.sleep(5000);
//   }
//   @Test( priority = 2)
//	public void RA_GL_007() throws InterruptedException {
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
//				.sendKeys("RA");
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
//				.sendKeys("Vision@123");
//		Thread.sleep(2000);
//		driver.findElement(By
//				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
//				.click();
//		Thread.sleep(2000);// -- Master Configuration tab Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
//				.click();
//		Thread.sleep(2000);// -- MAster Config Dropdown Click
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
//				.click();
//		Thread.sleep(3000);// -- Variance Flagging click--//
//		// -- Add in Variance flagging--//
//		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
//		Thread.sleep(2000);
//		// -- Description Sendkeys--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
//				.sendKeys(VarDesc);
//		// -- Variance flagging click--//
//		driver.findElement(By.xpath(
//				"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
//				.click();
//		Thread.sleep(2000);
//		// --Business date from click--//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		// --Business date from Select--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
//		// -- Business date To Click-//
//		driver.findElement(By.xpath(
//				"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
//				.click();
//		// --Business date To Select--//
//		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]")).click();
//		//-- Query Click--//
//		driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
//		Thread.sleep(2000);
//		WebElement TexttoDisplay = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]"));
//		String Text = TexttoDisplay.getText();
//		System.out.println(Text);
//		Thread.sleep(2000);
//	}
	 @Test( priority = 3)
		public void RA_GL_009() throws InterruptedException {
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
					.sendKeys("RA");
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
					.sendKeys("Vision@123");
			Thread.sleep(2000);
			driver.findElement(By
					.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
					.click();
			Thread.sleep(5000);
			WebElement elementToHoverA = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"));
			Actions actionshoverA = new Actions(driver);
			actionshoverA.moveToElement(elementToHoverA).perform();
			Thread.sleep(2000);
			WebElement elementToHoverB = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/p[1]"));
			Actions actionshoverB = new Actions(driver);
			actionshoverB.moveToElement(elementToHoverB).perform();
			Thread.sleep(2000);
			WebElement elementToHoverC = driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"));
			Actions actionshoverC = new Actions(driver);
			actionshoverC.moveToElement(elementToHoverC).perform();
			Thread.sleep(2000);	
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
