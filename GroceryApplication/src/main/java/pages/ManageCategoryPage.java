package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilites.FileUploadUtilites;


public class ManageCategoryPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and  @class=\"small-box-footer\"]")
	WebElement manageCategoryMoreInfo;
	@FindBy(css="a[onclick='click_button(1)']")WebElement newButton;
	@FindBy(xpath="//input[@id='category']")WebElement enterCatogary;
	@FindBy(xpath="//input[@id='category']")WebElement imageUpload;
	@FindBy(xpath="//button[text()=\"Save\"]")WebElement imageSave;
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickManageCategoryMoreInfo()
	{
		manageCategoryMoreInfo.click();
	}
	public void clickManageNewButton()
	{
		newButton.click();
	}
	public void enterCatogary(String catogary)
	{
		enterCatogary.sendKeys(catogary);
	}
	public void fileUpload()
	{
		FileUploadUtilites image = new FileUploadUtilites();
		image.fileUploadUsingsendKeys(imageUpload, Constant.TESTDATAIMAGE);
	}
	public void save()
	{
		imageSave.click();
	}
}
