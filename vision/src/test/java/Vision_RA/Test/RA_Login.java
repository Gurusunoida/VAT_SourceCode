package Vision_RA.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.Login;

public class RA_Login extends BaseClass {

	private Login LoginPage;
	 @BeforeMethod
	    public void setUpLogin() {
	        LoginPage = new Login(driver); 
	    }
	 
   @Test(dataProvider = "loginCredentials", priority = 1)
   @TestDescription("RA_Login")
   public void VAT_RA_Login(String username, String password) throws InterruptedException {
	   String ScreenName = "General";
		String testCaseId = "VAT_RA_Login";
       String notes = "RA_Login";
       ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
       LoginPage.loginUsername(username);
       LoginPage.loginPassword(password);
       LoginPage.LoginClick();
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
