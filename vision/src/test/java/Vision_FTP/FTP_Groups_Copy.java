package Vision_FTP;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import Package_PageObject.POM_FTPLogin;
import Package_PageObject.POM_FTP_Groups;

public class FTP_Groups_Copy extends FTP_BaseClass_Copy {

    private POM_FTPLogin login;
    private POM_FTP_Groups FTP;

    @BeforeMethod
    public void setup() {
        login = new POM_FTPLogin(driver);
        FTP = new POM_FTP_Groups(driver);
    }

    @DataProvider(name = "loginCredentials")
    public Object[][] getLoginCredentials() {
        String username = getProperty("login.ID2"); 
        String password = getProperty("login.PASS2"); 
        return new Object[][] {
            {username, password}
        };
    }
    
    
    private void takeScreenshot(String testName) throws IOException {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String location = "test-output/Screenshot/FTP/" + testName + ".png";
        File destinationFile = new File(location);
        try {
            FileUtils.copyFile(screenshotFile, destinationFile);
            System.out.println(testName + " Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println(testName + " Failed to save screenshot: " + e.getMessage());
        }
    }

    @Test(dataProvider = "loginCredentials", priority = 1)
    public void FTP_GR_001(String username, String password) throws InterruptedException, IOException {
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
        System.out.println("Login test passed with user: " + username);
        Thread.sleep(5000);
        takeScreenshot("FTP_GR_001");
    }

    @Test(dataProvider = "loginCredentials", priority = 2)
    public void FTP_GR_002(String username, String password) throws InterruptedException, IOException {
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
        System.out.println("Login test failed with user: " + username);
        Thread.sleep(7000);
        takeScreenshot("FTP_GR_002");
    }

//    @Test(dataProvider = "loginCredentials", priority = 3)
//    public void FTP_GR_003(String username, String password) throws InterruptedException, IOException {
//        login.enterUsername(username);
//        login.enterPassword(password);
//        login.clickLogin();
//        System.out.println("Login test failed with user: " + username);
//        Thread.sleep(5000);
//        takeScreenshot("FTP_GR_003");
//    }
//
//    @Test(dataProvider = "loginCredentials", priority = 4)
//    public void FTP_GR_006(String username, String password) throws InterruptedException, IOException {
//        login.enterUsername(username);
//        login.enterPassword(password);
//        login.clickLogin();
//        System.out.println("Login test passed with user: " + username);
//        Thread.sleep(10000);
//        FTP.MenuFTP();
//        Thread.sleep(5000);
//        FTP.FTP_Click();
//        Thread.sleep(10000);
//        FTP.Add();
//        Thread.sleep(5000);
//        takeScreenshot("FTP_GR_006");
//    }
//
//    @Test(dataProvider = "loginCredentials", priority = 5)
//    public void FTP_GR_007(String username, String password) throws InterruptedException, IOException {
//        login.enterUsername(username);
//        login.enterPassword(password);
//        login.clickLogin();
//        System.out.println("Login test passed with user: " + username);
//        Thread.sleep(10000);
//        FTP.MenuFTP();
//        Thread.sleep(5000);
//        FTP.FTP_Click();
//        Thread.sleep(5000);
//        FTP.Add();
//        Thread.sleep(5000);
//        FTP.FTP_Repricing();
//        Thread.sleep(5000);
//        takeScreenshot("FTP_GR_007");
//        FTP.FTP_Nominal();
//        Thread.sleep(5000);
//        takeScreenshot("FTP_GR_007_001");
//    }

  
}
