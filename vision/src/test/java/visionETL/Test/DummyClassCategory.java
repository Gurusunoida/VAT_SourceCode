package visionETL.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DummyClassCategory {
	  @DataProvider(name = "getUserNameList")
	    public Object[][] getUserNameList() {
	        return new Object[][] {
	            {"RA", "Vision@123"},
	        };
	    }
	  WebDriver driver;
	
	@Test(priority = 1, dataProvider = "getUserNameList")
	public void ETL_CT_002(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Category";
		String testCaseId = "ETL_CT_002";
        String notes = "Referesh button performs the action";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        driver.get("http://202.83.25.244:9010/");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[2]/div[1]/input[1]"))
				.sendKeys(loginName);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[3]/div[1]/input[1]"))
				.sendKeys(loginPwd);
		driver.findElement(By
				.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/span[4]/button[1]"))
				.click();
		Thread.sleep(5000);
		// -- Category Dropdown
				driver.findElement(By.xpath("//p[contains(text(),'ETL Category')]")).click();	
		Thread.sleep(3000);
		// -- Autoreferesh--//
		driver.findElement(By.xpath("//i[contains(text(),'autorenew')]")).click();
		Thread.sleep(3000);
	}
}
