package Package_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_FTP_Groups extends Base_PageObject {

	public POM_FTP_Groups(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//span[@class='tableActionBtnLabel'][normalize-space()='Add']")
	WebElement group_Add;
	
	public void Add() {
		group_Add.click();
	}
	
	@FindBy(xpath ="//span[@title='Fund Transfer Pricing']//*[name()='svg']")
	WebElement menuClick;
	
	public void MenuFTP() {
		menuClick.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='FTP Groups']")
	WebElement FTPmenuClick;
	
	public void FTP_Click() {
		FTPmenuClick.click();
	}
	
	@FindBy(xpath = "//input[@id='REPRICING']")
	WebElement repricing;
	
	public void FTP_Repricing() {
		repricing.click();
	}
	
	@FindBy(xpath =  "//input[@id='NOMINAL']")
	WebElement nominal;
	
	public void FTP_Nominal() {
		nominal.click();
	}

}