package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and contains(@class,'small-box-footer')]")WebElement manageNewsMoreInfo;
	@FindBy(css="a[onclick='click_button(1)']")WebElement newButton;
	@FindBy(xpath="//textarea[@id='news']")WebElement enterTheNews;
	@FindBy(xpath="//button[@type='submit']")WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement successMessage;
	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//used to initialize webelement
	}
	public void clickOnManageNews()
	{
		manageNewsMoreInfo.click();
	}
	public void clickOnNew()
	{
		newButton.click();
	}
	public void enterNews(String newsText)
	{
		enterTheNews.sendKeys(newsText);
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	public String getSuccessMessageText() {
	    return successMessage.getText();
	}
	
}
