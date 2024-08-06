package visionETL.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners1.class)
public class DummyClassConnector extends BaseClass {

    @DataProvider(name = "getUserNameList")
    public Object[][] getUserNameList() {
        return new Object[][] {
            {"R", "Vision@123"},
        };
    }

    @Test(priority = 1, dataProvider = "getUserNameList")
    public void ETL_CC_001(String loginName, String loginPwd) throws InterruptedException {
        String screenName = "Connector";
        String testCaseId = "ETL_CC_001";
        String notes = "Page_nation Issue";
        ListenersETL.reportTestDetails1(screenName, testCaseId, notes);
        WebDriver driver = getDriver();
        driver.get("http://202.83.25.244:9010/");
        driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]")).sendKeys(loginName);
        driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]")).sendKeys(loginPwd);
        driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]/b[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();
        Select select = new Select(driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/div[1]/app-etl-script[1]/div[1]/div[1]/div[1]/div[1]/app-smart-table[1]/div[2]/div[1]/span[2]/select[1]")));
        select.selectByIndex(0);
        Thread.sleep(2000);
        select.selectByIndex(2);
    }
}

