package Vision_RA_v1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import visionRA.Test_OLD.BaseClass;
import visionRA.Test_OLD.ListenersRA;
import visionRA.Test_OLD.TestDescription;

public class RA_General extends BaseClass{
	String VarDesc = "VAT";


	   @Test(dataProvider = "loginCredentials", priority = 1)
	   @TestDescription("VAT_RA_Login")
	   public void VAT_RA_Login(String username, String password) throws InterruptedException {
		   String ScreenName = "General";
			String testCaseId = "VAT_RA_Login";
	       String notes = "Login";
	       ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
	       driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(username);
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(password);
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
	       Thread.sleep(5000);
	     //-- Take screenshot and save it to a file--//
	     		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\RA\\VAT_RA_Login.png";
	     		//-- save the screenshot --//
	     		File destinationFile = new File(Location);
	     		// Move the screenshot file to the specified destination
	     		try {
	     			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
	     			System.out.println(" VAT_RA_Login Screenshot saved to: " + destinationFile.getAbsolutePath());
	     		} catch (IOException e) {
	     			System.out.println("VAT_RA_Login Failed to save screenshot: " + e.getMessage());
	     		}
	   }
	   @Test( priority = 2)
	   @TestDescription("If there is no Records from the Selected date No Records found should Display")
		public void RA_GL_006() throws InterruptedException {
		   String ScreenName = "General";
			String testCaseId = "RA_GL_006";
	      String notes = "If there is no Records from the Selected date No Records found should Display";
	      ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
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
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/p[1]"))
					.click();
			Thread.sleep(2000);// -- Master Configuration tab Click
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
					.click();
			Thread.sleep(2000);// -- MAster Config Dropdown Click
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[7]/a[1]/span[1]"))
					.click();
			Thread.sleep(7000);// -- Variance Flagging click--//
			// -- Add in Variance flagging--//
			driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
			Thread.sleep(5000);
			// -- Description Sendkeys--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/input[1]"))
					.sendKeys(VarDesc);
			// -- Variance flagging click--//
			driver.findElement(By.xpath(
					"//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-exception[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/span[1]"))
					.click();
			Thread.sleep(2000);
			// --Business date from click--//
			driver.findElement(By.xpath(
					"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
					.click();
			Thread.sleep(2000);
			// --Business date from Select--//
			driver.findElement(By.xpath("//div[normalize-space()='1']")).click();
			// -- Business date To Click-//
			driver.findElement(By.xpath(
					"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/app-custom-date-picker[1]/app-regular-datepicker[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
					.click();
			Thread.sleep(2000);
			// --Business date To Select--//
			driver.findElement(By.xpath("//div[normalize-space()='1']")).click();
			//-- Query Click--//
			driver.findElement(By.xpath("//button[contains(text(),'Query')]")).click();
			Thread.sleep(2000);
			WebElement TexttoDisplay = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]"));
			String Text = TexttoDisplay.getText();
			System.out.println(Text);
			Thread.sleep(2000);
		}
		 @Test( priority = 3)
		 @TestDescription("Proper Report option should display")
			public void RA_GL_009() throws InterruptedException {
			 String ScreenName = "General";
				String testCaseId = "RA_GL_009";
		      String notes = "Proper Report option should display";
		      ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
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
	       //-- You can define multiple sets of valid and invalid login credentials--//
	       return new Object[][] {
	           {"RA", "Vision@123"},
	           {"RA", "vis@123"},
	           {"QW", "Vision@123"},
	       };
	   }
	}