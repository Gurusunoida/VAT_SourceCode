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

	@FindBy(xpath = "//span[normalize-space()='View']")
	WebElement viewClick;
	
	public void ViewClick() {
		viewClick.click();
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
	
	@FindBy(xpath = "//div[@class='block flex-grow-0 flex-shrink-0 h-10 relative cursor-pointer']")
	WebElement userprofile;
	
	public void UserProfileClick() {
		userprofile.click();
	}
	
	@FindBy(xpath = "//span[@class='flex text-xs font-semibold h-5 items-center justify-center ml-1']")
	WebElement logout;
	
	public void LogoutClick() {
		logout.click();	
	}
	
	@FindBy(css = "body > div:nth-child(8) > ul:nth-child(1) > li:nth-child(4) > span:nth-child(2)")
	WebElement approve;
	
	public void ApproveClick() {
		approve.click();
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
	
	public void FTP_SourceTab() {
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
	
	@FindBy(xpath = "//div[@id='0customSelectMenu12']//span[@class='absolute cursor-pointer right-1 w-[10px] h-[20px] text-grey-1 top-[6px]']")
	WebElement sourceColumnDropdown;
	
	public void SourceColumnDropdownClick() {
		sourceColumnDropdown.click();
	}
	
	@FindBy(xpath = "//div[@id='0customSelectMenu13']//span[@class='absolute cursor-pointer right-1 w-[10px] h-[20px] text-grey-1 top-[6px]']")
	WebElement sourceOperandDropdown;
	
	public void SourceOperandDropdownClick() {
		sourceOperandDropdown.click();
	}
	
	@FindBy(xpath = "//input[@id='03']")
	WebElement FilterValue;
	
	public void FilterValue(String value) {
		FilterValue.sendKeys(value);
	}
	
	@FindBy(xpath = "//span[@class='cursor-pointer relative drop-down popover-container']")
	WebElement ThreeDotclick;
	
	public void ThreeDotClick() {
		ThreeDotclick.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	WebElement EditClick;
	
	public void EditClick() {
		EditClick.click();
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Review')]")
	WebElement ReviewCLick;
	
	public void ReviewClick() {
		ReviewCLick.click();
	}
	
	@FindBy(xpath = "//input[@id='056']")
	WebElement SubsidyClick;
	
	
	
	public void Subsidy(String subsidy) {
		SubsidyClick.click();
		SubsidyClick.sendKeys(subsidy);
	}
	
	@FindBy(xpath = "//span[contains(text(),'FTP Curve')]")
	WebElement FTP_CurveClick;
	
	public void FTP_Curve() {
		FTP_CurveClick.click();
	}
	
	@FindBy(xpath = "//div[@id='0popButton52']//span[@class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")
	WebElement AddOnTenor;
	
	public void AddOnTenorClick() {
		AddOnTenor.click();
	}
	
	@FindBy(xpath = "//input[@id='056']")
	WebElement subsidyKeys;
	
	public void SubsidySendKeys(String subsidy) {
		subsidyKeys.sendKeys(subsidy);
	}
	
	@FindBy(xpath = "//span[@class='text-group-color-400 text-[11px]'][normalize-space()='Delete']")
	WebElement deleteThreedotClick;
	
	public void DeleteInThreedotClick() {
		deleteThreedotClick.click();
	}
	
	@FindBy(xpath = "//li[normalize-space()='=']")
	WebElement sourceOperandEqualSelect;
	
	public void sourceOperandEqualSelect() {
		sourceOperandEqualSelect.click();
	}
	
	@FindBy(xpath = "//div[@id='0popButton14']//span[@class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")
	WebElement sourceConditionMagnifierClick;
	
	public void sourceConditionMagnifierClick() {
		sourceConditionMagnifierClick.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	WebElement deleteClick;
	
	public void deleteClick() {
		deleteClick.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	WebElement rejectClick;
	
	public void rejectClick() {
		rejectClick.click();
	}
	
	@FindBy(xpath ="//div[@id='0popButton37']//span[@class='absolute cursor-pointer h-[18px] focus:text-gray-400 right-[0px] top-[1px]']")
	WebElement productAttributeMagnifierClick;
	
	public void productAttributeMagnifierClick() {
		productAttributeMagnifierClick.click();
	}
	
	@FindBy(xpath ="//div[@id='-1customSelectMenu7']//span[@class='text-grey-1 w-[10px] absolute cursor-pointer right-1 w-[15px] h-[20px] top-[10px]']")
	WebElement sourceQueryDropdownClick;
	
	@FindBy(xpath ="//li[@class='block w-full hover:bg-gray-100 cursor-pointer select-none rounded-md px-3 py-1 text-start leading-tight transition-all']")
	WebElement manualSelect;
	
	
	public void sourceQueryDropdownClickSelect() {
		sourceQueryDropdownClick.click();
		manualSelect.click();
		
	}
	
}

