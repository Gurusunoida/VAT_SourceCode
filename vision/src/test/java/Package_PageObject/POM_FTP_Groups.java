package Package_PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_FTP_Groups extends Base_PageObject {

	public POM_FTP_Groups(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath = "//body/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-ftp-group[1]/section[1]/div[1]/div[1]/div[1]/app-smart-grouping-table[1]/div[1]/div[2]/div[1]/span[2]/span[2]")
	WebElement group_Add;
	
	public void Add() {
		group_Add.click();
	}
	
	@FindBy(xpath ="//li[@id='Fund Transfer Pricing']")
	WebElement menuClick;
	
	public void MenuFTP() {
		menuClick.click();
	}
	
	@FindBy(xpath = "//li[@id='FTPGroups']")
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

	@FindBy(xpath = "//div[@id='-1customSelectMenu3']//span[@class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']")
	WebElement dataSource;
	
	public void FTP_DataSourceTabClick() {
		dataSource.click();
	}
	
	@FindBy(xpath = "//div[@class='global-controls-height num']//div[@class='relative']//input[@id='4']")
	WebElement sequence;
	
	public void SequenceKeys(String Seq ) {
		sequence.sendKeys(Seq);
	}
	
	@FindBy(xpath = "//input[@id='5']")
	WebElement FTP_SubgrpDesc;
	
	public void FTP_SubGroupDesc(String Desc) {
		FTP_SubgrpDesc.click();
		FTP_SubgrpDesc.sendKeys(Desc);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Filter')]")
	WebElement FTP_FilterClick;
	
	public void FTP_FilterClick() {
		FTP_FilterClick.click();
	}
	
	@FindBy(xpath = "//div[@class='flex mt-1 cursor-pointer absolute right-2 text-icon-fnt-color-500 font-sans h-25px pr-1 p-0.5 hover:bg-gray-200 rounded-md text-base font-medium']//span[@class='tableActionBtnLabel'][contains(text(),'Add')]")
	WebElement AddinFilter;
	
	public void AddInFilter() {
		AddinFilter.click();
	}
	
	@FindBy(xpath = "//div[@class='relative bg-white rounded-lg shadow']//span[@class='global-btn-text'][normalize-space()='Apply']")
	WebElement ApplyclickinFilter;
	
	public void ApplyClickInFilter() {
		ApplyclickinFilter.click();
	}
	
	@FindBy(xpath = "//span[@class='absolute cursor-pointer right-1 h-[18px] focus:text-gray-400 top-[6px]']")
	WebElement LegalEntityclick;
	
	public void LegalEntityMagnifier() {
		LegalEntityclick.click();
	}
	
	@FindBy(xpath = "//span[@class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']")
	WebElement DataSourcedropdownClick;
	
	public void DataSourceDropdown() {
		DataSourcedropdownClick.click();
	}
	
	@FindBy(xpath = "//div[@id='0popButton34']//span[@class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")
	WebElement TenorMagnifierClick;
	
	public void TenorMagnifierClick() {
		TenorMagnifierClick.click();
	}
	
	@FindBy(xpath = "//input[@id='044']")
	WebElement FTP_Rate;
	
	public void FTP_Rate(String FtpRate) {
		FTP_Rate.sendKeys(FtpRate);
	}
	
	@FindBy(xpath = "//li[@class='relative flex justify-center items-center active-tab cursor-pointer flex-row']//span[contains(text(),'Add')]")
	WebElement AddinCurve;
	
	public void AddInCurve() {
		AddinCurve.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement Save;
	
	public void Save() {
		Save.click();
	}
	
	@FindBy(css = "div[class='text-center h-[32px] w-full place-items-center overflow-x-scroll rounded-lg lg:overflow-visible flex justify-center items-center'] app-close-button[class='ml-2'] span[class='global-btn-text']")
	WebElement Close;
	
	public void Close() {
		Close.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Source']")
	WebElement Source;
	
	public void FTP_Source() {
		Source.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Reject']")
	WebElement Reject;

	public void Reject() {
		Reject.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Yes']")
	WebElement Yes;
	
	public void YesClick() {
		Yes.click();
	}
	
	@FindBy(xpath ="//span[normalize-space()='Method - Nominal']")
	WebElement methodNominalClick;
	
	public void MethodNominal() {
		methodNominalClick.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Method - Repricing']")
	WebElement methodRepricingClick;
	
	public void MethodRepricing() {
		methodRepricingClick.click();
	}
	
	@FindBy(xpath="//div[@id='0customSelectMenu1']//span[@class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']")
	WebElement filterColumnDropdownclick;
	
	public void FilterColumnDropdownClick() {
		filterColumnDropdownclick.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Copy']")
	WebElement copyClick;
	
	public void CopyInCurve() {
		copyClick.click();
	}
	
	@FindBy(xpath = "//div[@id='-1customSelectMenu3']//span[@class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']")
	WebElement FTP_groupDropdown;
	
	public void FTP_GroupDropdown() {
		FTP_groupDropdown.click();
	}
	
	@FindBy(xpath = "//td[normalize-space()='Maturity < 90 Days']")
	WebElement Tenor90Days;
	
	public void Tenor90DaysSelect() {
		Tenor90Days.click();
	}
	
	@FindBy(xpath = "//div[@id='0customSelectMenu36']//input[@type='text']")
	WebElement sbuClick;
	
	public void SBUdropdownClick() {
		sbuClick.click();
	}
	
	@FindBy(xpath = "//li[normalize-space()='Group A']")
	WebElement GrpSelect;
	
	public void GroupSelect() {
		GrpSelect.click();
	}
	
	@FindBy(xpath = "//li[@title='FTP Add-On']//span[@class='global-icon-svg icon-w-h']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")
	WebElement addOn_click;
	
	public void AddOnClick() {
		addOn_click.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Liquidity Premium']")
	WebElement lpClick;
	
	public void LPClick() {
		lpClick.click();
	}
	
	@FindBy(xpath = "//input[@id='071']")
	WebElement lpPremium;
	
	public void Premium(String premium) {
		lpPremium.sendKeys(premium);
	}
	
	@FindBy(css = "div[id='0popButton69'] span[class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]'] svg")
	WebElement customerID;
	
	public void CustomerID() {
		customerID.click();
	}
	
	@FindBy(css  = "div[id='0popButton70'] span[class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]'] svg")
	WebElement contractID;
	
	public void ContractID() {
		contractID.click();
	}
	
	@FindBy(css = "div[id='0popButton63'] span[class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]'] svg")
	WebElement LPtenorclick;
	
	public void LPTenorClick() {
		LPtenorclick.click();
	}
}
