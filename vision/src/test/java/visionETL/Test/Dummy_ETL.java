package visionETL.Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Package_PageObject.Login;
import Package_PageObject.POM_ETL;
import Package_PageObject.POM_General;

public class Dummy_ETL extends BaseClass{
	
	 @DataProvider(name = "getUserNameList")
	    public Object[][] getUserNameList() {
	        return new Object[][] {
	            {"Vision", "Vision@123"},
	        };
	    }
	private Login LoginPage;
	 @BeforeMethod
	    public void setUpLogin() {
	        LoginPage = new Login(driver); 
	    }
	 
	private POM_General ETL_General;
	@BeforeMethod
	public void ETL() {
		ETL_General = new POM_General(driver);
	}
	
	private POM_ETL ETLConnector;
	@BeforeMethod
	public void Connector() {
		ETLConnector = new POM_ETL(driver);
	}

	@Parameters("ApplicationURL")
	@Test(priority = 1, dataProvider = "getUserNameList")
	 @TestDescription(" Page navigation issue observed in the ETL connector Script")
	public void ETL_CC_001(String loginName, String loginPwd) throws InterruptedException {
		String ScreenName = "Connector Script";
		String testCaseId = "ETL_CC_001";
        String notes = "Page_nation Issue";
        ListenersETL.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginPage.loginUsername(loginName);
        LoginPage.loginPassword(loginPwd);
        LoginPage.LoginClick();
		Thread.sleep(5000);
		ETLConnector.ConnectorScript();
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/div[1]/ul[1]/li[2]/button[1]")).click();
		Thread.sleep(5000);
		  LoginPage.loginUsername("Power.user");
	        LoginPage.loginPassword(loginPwd);
	        LoginPage.LoginClick();
	        Thread.sleep(5000);
	        ETLConnector.ConnectorScript(); 
	        Thread.sleep(5000);
}
}
