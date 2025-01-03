package Vision_FTP;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.POM_FTPLogin;
import Package_PageObject.POM_FTP_Groups;

public class FTP_Groups extends FTP_BaseClass {

    private POM_FTPLogin login;
    private POM_FTP_Groups FTP;

    @DataProvider(name = "loginCredentials")
    public Object[][] getUserNameList() {
        return new Object[][] {
            {"vision", "Vision@123"}
        };
    }
    
    @DataProvider(name = "InvalidProvider")
    public Object[][] invalid() {
        return new Object[][] {
            {"MJ","Vision@123"}
        };
    }
    
    @DataProvider(name = "InvalidProviderPass")
    public Object[][] invalidPass() {
        return new Object[][] {
            {"vision","Vision@123"}
        };
    }


    @BeforeMethod
    public void login() {
    	login = new POM_FTPLogin(driver);
    	FTP = new POM_FTP_Groups(driver);
    }

//    @Test(dataProvider = "loginCredentials", priority = 1)
//    public void FTP_GR_001(String username, String password) throws InterruptedException {
//        login.enterUsername(username);
//        login.enterPassword(password);
//        login.clickLogin();
//        System.out.println("Login test passed with user: " + username);
//        Thread.sleep(5000);
//        //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\FTP\\FTP_GR_001.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" FTP_GR_001 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("FTP_GR_001 Failed to save screenshot: " + e.getMessage());
//		}
//    }
//    
//    @Test(dataProvider = "InvalidProvider", priority = 2)
//    public void FTP_GR_002(String username , String password) throws InterruptedException {
//    	login.enterUsername(username);
//        login.enterPassword(password);
//        login.clickLogin();
//        System.out.println("Login test Failed with user: " + username );
//        Thread.sleep(7000);
//        WebElement Invalid = driver.findElement(By.xpath("//span[contains(text(),'Invalid Credentials')]"));
//        String InvalidLoginText = Invalid.getText();
//        System.out.println(InvalidLoginText);
//        //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\FTP\\FTP_GR_002.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" FTP_GR_002 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("FTP_GR_002 Failed to save screenshot: " + e.getMessage());
//		}
//    }
//    @Test(dataProvider = "InvalidProviderPass", priority = 3)
//    public void FTP_GR_003(String username , String password) throws InterruptedException {
//        String User = "RA";
//    	login.enterUsername(username);
//        login.enterPassword(password);
//        login.clickLogin();
//        System.out.println("Login test Failed with user: " + User );
//        Thread.sleep(5000);
////        WebElement Invalid = driver.findElement(By.xpath("//span[contains(text(),'Invalid Credentials')]"));
////        Invalid.getText();
//        //-- Take screenshot and save it to a file--//
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\FTP\\FTP_GR_003.png";
//		//-- save the screenshot --//
//		File destinationFile = new File(Location);
//		// Move the screenshot file to the specified destination
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
//			System.out.println(" FTP_GR_003 Screenshot saved to: " + destinationFile.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("FTP_GR_003 Failed to save screenshot: " + e.getMessage());
//		}
//    }
    @Test(dataProvider = "loginCredentials", priority = 4)
    public void FTP_GR_006(String username, String password) throws InterruptedException {
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
        System.out.println("Login test passed with user: " + username);
        Thread.sleep(10000);
        FTP.MenuFTP();
        Thread.sleep(5000);
        FTP.FTP_Click();
        Thread.sleep(10000);
        FTP.Add();
        Thread.sleep(5000);
        //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\FTP\\FTP_GR_006.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FTP_GR_006 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FTP_GR_006 Failed to save screenshot: " + e.getMessage());
		}
    }
    
    @Test(dataProvider = "loginCredentials", priority = 4)
    public void FTP_GR_007(String username, String password) throws InterruptedException {
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
        System.out.println("Login test passed with user: " + username);
        Thread.sleep(10000);
        FTP.MenuFTP();
        Thread.sleep(5000);
        FTP.FTP_Click();
        Thread.sleep(5000);
        FTP.Add();
        Thread.sleep(5000);
        FTP.FTP_Repricing();
        Thread.sleep(5000);
        //-- Take screenshot and save it to a file--//
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location = "D:\\Source code\\vision\\test-output\\Screenshot\\FTP\\FTP_GR_007.png";
		//-- save the screenshot --//
		File destinationFile = new File(Location);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
			System.out.println(" FTP_GR_007 Screenshot saved to: " + destinationFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FTP_GR_007 Failed to save screenshot: " + e.getMessage());
		}
        FTP.FTP_Nominal();
        Thread.sleep(5000);
        //-- Take screenshot and save it to a file--//
		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Location1 = "D:\\Source code\\vision\\test-output\\Screenshot\\FTP\\FTP_GR_007_001.png";
		//-- save the screenshot --//
		File destinationFile1 = new File(Location1);
		// Move the screenshot file to the specified destination
		try {
			org.apache.commons.io.FileUtils.copyFile(screenshotFile1, destinationFile1);
			System.out.println(" FTP_GR_007_001 Screenshot saved to: " + destinationFile1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("FTP_GR_007_001 Failed to save screenshot: " + e.getMessage());
		}
    }
    
  
    
}
