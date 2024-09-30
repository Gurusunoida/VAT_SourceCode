												//--Update string Numbers while running Vision_Variables--//
package visionRA.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Package_PageObject.Login;


public class RA_VisionVariables extends BaseClass{
	String Variable 	     = "A_VAT001";
  	String Value    	     = "VAT";
	String VariableSelect    = "VAT_SET_CLICK1";
	String VariableSelect_IN = "VAT_SET_CLICK_APP1";
	String Value_IN    	     = "VAT_APP1";
	String VariableSelect_CS = "VAT_SET_CLICK_DEL1";
	String Value_CS    	     = "VAT_DEL1";

  private Login LoginApp;
  @BeforeMethod
  public void setUpLogin() {
	  LoginApp = new Login(driver);
  }
	@Test(dataProvider = "loginCredentials", priority = 1)
  @TestDescription("The vision variable saved successfully.")
	public void VIS_VAR_001(String username, String password) throws InterruptedException {
		String ScreenName = "VisionVariables";
		String testCaseId = "VIS_VAR_001";
        String notes = "The vision variable saved successfully.";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginApp.loginUsername(username);
    	LoginApp.loginPassword(password);
    	LoginApp.LoginClick();
		Thread.sleep(5000);
		//--side menu--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		//--RA admin--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		//--VisionVariable click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"))
				.click();
		Thread.sleep(1000);
		//--Add click--//
		driver.findElement(By
				.xpath("//i[contains(text(),'add')]"))
				.click();
		Thread.sleep(300);
		//--Apply variable--//
		driver.findElement(By
				.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/input[1]"))
				.sendKeys(Variable);
		Thread.sleep(300);
		//--Apply value--//
		driver.findElement(By
				.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"))
		.sendKeys(Value);
		Thread.sleep(1000);
		//--Click on save --//
		driver.findElement(By
				.xpath("//i[contains(text(),'save')]"))
				.click();
		Thread.sleep(3000);
	}
	@Test(dataProvider = "loginCredentials", priority = 1)
  @TestDescription("If user uses the special character Inline trigger should appear")
	public void VIS_VAR_002(String username, String password) throws InterruptedException {
		String ScreenName = "VisionVariables";
		String testCaseId = "VIS_VAR_002";
        String notes = "If user uses the special character Inline trigger should appear";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginApp.loginUsername(username);
    	LoginApp.loginPassword(password);
    	LoginApp.LoginClick();
		Thread.sleep(5000);
		//--side menu--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		//--RA admin--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		//--VisionVariable click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"))
				.click();
		Thread.sleep(1000);
		//--Add click--//
		driver.findElement(By
				.xpath("//i[contains(text(),'add')]"))
				.click();
		Thread.sleep(300);
		//--Apply variable--//
		driver.findElement(By
				.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/input[1]"))
				.sendKeys("VAT@<");
		Thread.sleep(300);
		//--Apply value--//
		driver.findElement(By
				.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"))
		.sendKeys(Value);
		Thread.sleep(1000);
		//--Click on save --//
		driver.findElement(By
				.xpath("//i[contains(text(),'save')]"))
				.click();
		Thread.sleep(3000);

	}
	@Test(dataProvider = "loginCredentials", priority = 1)
  @TestDescription("While approving mutiple pending record the record should get approved")
	public void VIS_VAR_003(String username, String password) throws InterruptedException {
		String ScreenName = "VisionVariables";
		String testCaseId = "VIS_VAR_003";
        String notes = "While approving mutiple pending record the record should get approved";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        	LoginApp.loginUsername(username);
        	LoginApp.loginPassword(password);
        	LoginApp.LoginClick();
    		Thread.sleep(5000);
    		//--side menu--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
    				.click();
    		Thread.sleep(3000);
    		//--RA admin--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
    				.click();
    		Thread.sleep(2000);
    		//--VisionVariable click--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"))
    				.click();
    		Thread.sleep(1000);
    	for(int i = 1;i<=5;i++) {
    		//--Add click--//
    		driver.findElement(By
    				.xpath("//i[contains(text(),'add')]"))
    				.click();
    		Thread.sleep(100);
    		//--Apply variable--//
    		driver.findElement(By
    				.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/input[1]"))
    				.sendKeys(VariableSelect_IN+i);
    		Thread.sleep(100);
    		//--Apply value--//
    		driver.findElement(By
    				.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"))
    		.sendKeys(Value_IN+i);
    		Thread.sleep(300);
        }
    		//--Click on save--//
    		driver.findElement(By
    				.xpath("//i[contains(text(),'save')]"))
    				.click();
    		Thread.sleep(6000);
    		//--user profile click--//
    		WebElement elementToHoverM = driver.findElement(By.xpath("//i[contains(text(),'person')]"));
    		Actions actionsClick = new Actions(driver);
    		actionsClick.moveToElement(elementToHoverM).perform();
    		WebElement Logout = driver.findElement(By.xpath("//i[contains(text(),'person')]"));
    		Logout.click();
    		Thread.sleep(2000);
        	//--Logout click--//
        	driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]"))
        	.click();
        	Thread.sleep(1000);
        	/////////////-------------Login--------------//////////////
        	LoginApp.loginUsername("MJ");
        	LoginApp.loginPassword(password);
        	LoginApp.LoginClick();
    		Thread.sleep(5000);
    		//--side menu--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
    				.click();
    		Thread.sleep(3000);
    		//--RA admin--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
    				.click();
    		Thread.sleep(2000);
    		//--VisionVariable click--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"))
    				.click();
    		Thread.sleep(1000);
    		//--Add Filter--//
    		driver.findElement(By
    				.xpath("//i[contains(text(),'filter_alt')]"))
    				.click();
    		Thread.sleep(300);
    		//--Click column filter--//
    		driver.findElement(By
    				.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
    				.click();
    		Thread.sleep(300);
    		//--Choose filter column--//
    		driver.findElement(By
    				.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
    		Thread.sleep(300);
    		//--Click Value filter--//
    		driver.findElement(By
    				.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
    				.sendKeys("VAT_SET_CLICK_APP");
    		Thread.sleep(300);
    		//--Apply click --//
    		driver.findElement(By
    				.xpath("//button[contains(text(),'Apply')]"))
    				.click();
    		//--Select box click--//
    		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
    		Thread.sleep(200);
    		//--approve click--//S
    		driver.findElement(By.xpath("//i[contains(text(),'done')]")).click();
    		Thread.sleep(300);
    		//--approve yes click--//
    		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
    		Thread.sleep(3000);
	}
  @TestDescription("While rejecting mutiple pending record the record should get rejected")
	@Test(dataProvider = "loginCredentials", priority = 1)
	public void VIS_VAR_004(String username, String password) throws InterruptedException {
		String ScreenName = "VisionVariables";
		String testCaseId = "VIS_VAR_004";
        String notes = "While rejecting mutiple pending record the record should get rejected";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        String Value_IN    = "vaty";
        String VariableSelect_IN = "VAT_SET_CLICK";
        LoginApp.loginUsername(username);
    	LoginApp.loginPassword(password);
    	LoginApp.LoginClick();
    		Thread.sleep(5000);
    		//--side menu--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
    				.click();
    		Thread.sleep(3000);
    		//--RA admin--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
    				.click();
    		Thread.sleep(2000);
    		//--VisionVariable click--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"))
    				.click();
    		Thread.sleep(1000);
    	for(int i = 1;i<=3;i++) {
    		//--Add click--//
    		driver.findElement(By
    				.xpath("//i[contains(text(),'add')]"))
    				.click();
    		Thread.sleep(300);
    		//--Apply variable--//
    		driver.findElement(By
    				.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/input[1]"))
    				.sendKeys(VariableSelect_IN+i);
    		Thread.sleep(300);
    		//--Apply value--//
    		driver.findElement(By
    				.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"))
    		.sendKeys(Value_IN+i);
    		Thread.sleep(1000);
        }
    		//--Click on save --//
    		driver.findElement(By
    				.xpath("//i[contains(text(),'save')]"))
    				.click();
    		Thread.sleep(3000);
    		//--Add Filter--//
    		driver.findElement(By
    				.xpath("//i[contains(text(),'filter_alt')]"))
    				.click();
    		Thread.sleep(300);
    		//--Click column filter--//
    		driver.findElement(By
    				.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
    				.click();
    		Thread.sleep(300);
    		//--Choose filter--//
    		driver.findElement(By
    				.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]"))
    				.click();
    		Thread.sleep(300);
    		//--Click Value filter--//
    		driver.findElement(By
    				.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
    				.sendKeys("Pend");
    		Thread.sleep(300);
    		//--Add another filter
    		driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/div[1]/div[1]/span[1]")).click();
    		Thread.sleep(300);
    		//--Click column filter--//
    		driver.findElement(By
    				.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
    				.click();
    		Thread.sleep(300);
    		//--Choose filter column--//
    		driver.findElement(By.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
    		Thread.sleep(300);
    		//--Click Value filter--//
    		driver.findElement(By
    				.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]"))
    				.sendKeys(VariableSelect);
    		Thread.sleep(300);
    		//--Apply click --//
    		driver.findElement(By
    				.xpath("//button[contains(text(),'Apply')]"))
    				.click();
    		//--Select box click--//
    		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
    		driver.findElement(By.xpath("//i[contains(text(),'do_not_disturb_alt')]")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
    		Thread.sleep(3000);
	}
    @TestDescription("While deleting mutiple pending record the record should get deleted")
	@Test(dataProvider = "loginCredentials", priority = 1)
	public void VIS_VAR_005(String username, String password) throws InterruptedException {
		String ScreenName = "VisionVariables";
		String testCaseId = "VIS_VAR_005";
        String notes = "While deleting mutiple pending record the record should get deleted";
        ListenersRA.reportTestDetails1(ScreenName,testCaseId, notes);
        LoginApp.loginUsername(username);
    	LoginApp.loginPassword(password);
    	LoginApp.LoginClick();
    		Thread.sleep(5000);
    		//--side menu--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
    				.click();
    		Thread.sleep(3000);
    		//--RA admin--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
    				.click();
    		Thread.sleep(2000);
    		//--VisionVariable click--//
    		driver.findElement(By
    				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"))
    				.click();
    		Thread.sleep(1000);
    	for(int i = 1;i<=3;i++) {
    		//--Add click--//
    		driver.findElement(By
    				.xpath("//i[contains(text(),'add')]"))
    				.click();
    		Thread.sleep(300);
    		//--Apply variable--//
    		driver.findElement(By
    				.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/input[1]"))
    				.sendKeys(VariableSelect_CS+i);
    		Thread.sleep(300);
    		//--Apply value--//
    		driver.findElement(By
    				.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/input[1]"))
    		.sendKeys(Value_CS+i);
    		Thread.sleep(1000);
        }
		//--Click on save --//
		driver.findElement(By
				.xpath("//i[contains(text(),'save')]"))
				.click();
		Thread.sleep(6000);
    	//--user profile click--//
		WebElement elementToHoverM = driver.findElement(By.xpath("//i[contains(text(),'person')]"));
		Actions actionsClick = new Actions(driver);
		actionsClick.moveToElement(elementToHoverM).perform();
		WebElement Logout = driver.findElement(By.xpath("//i[contains(text(),'person')]"));
		Logout.click();
		Thread.sleep(2000);
    	//--Logout click--//
    	driver.findElement(By.xpath("//body/app-root[1]/app-main-container[1]/div[1]/div[2]/app-top-bar[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/button[1]"))
    	.click();
    	Thread.sleep(1000);
    	/////////////-------------Login--------------//////////////
    	LoginApp.loginUsername("MJ");
    	LoginApp.loginPassword(password);
    	LoginApp.LoginClick();
		Thread.sleep(5000);
		//--side menu--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/p[1]"))
				.click();
		Thread.sleep(3000);
		//--RA admin--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		//--VisionVariable click--//
		driver.findElement(By
				.xpath("//body/app-root[1]/app-main-container[1]/div[1]/app-side-bar[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"))
				.click();
		Thread.sleep(1000);
    		//--Add Filter--//
    		driver.findElement(By
    				.xpath("//i[contains(text(),'filter_alt')]"))
    				.click();
    		Thread.sleep(300);
    		//--Click column filter--//
    		driver.findElement(By
    				.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"))
    				.click();
    		Thread.sleep(300);
    		//--Choose filter--//
    		driver.findElement(By
    				.xpath("/html[1]/body[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"))
    				.click();
    		Thread.sleep(300);
    		//--Click Value filter--//
    		driver.findElement(By
    				.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-smart-search[1]/div[2]/form[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]"))
    				.sendKeys(VariableSelect_CS);
    		Thread.sleep(300);
    		//--Apply click --//
    		driver.findElement(By
    				.xpath("//button[contains(text(),'Apply')]"))
    				.click();
    		//--Select box click--//
    		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
    		Thread.sleep(2000);
    		//--Approve records--//
    		driver.findElement(By.xpath("//i[contains(text(),'done')]")).click();
    		Thread.sleep(300);
    		//--Approve yes click--//
    		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
    		Thread.sleep(3000);
    		//--Select all checkBox--//
    		driver.findElement(By.xpath("//thead/tr[1]/th[1]/input[1]")).click();
    		Thread.sleep(300);
    		//--delete click--//
    		driver.findElement(By.xpath("//i[contains(text(),'delete')]")).click();
    		Thread.sleep(500);
    		//--Delete yes click--//
    		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
    		Thread.sleep(3000);
	}
	@DataProvider(name = "loginCredentials")
    public Object[][] getUserNameList() {
        return new Object[][] {
            {"RA", "Vision@123"},
        };
    }
}
