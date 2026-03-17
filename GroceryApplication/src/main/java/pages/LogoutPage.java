package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	@FindBy(xpath="//a[@class='nav-link' and @data-toggle='dropdown']")WebElement adminButton;
	@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item'] ")WebElement logoutButton;
	public WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickAdminButton()
	{
		adminButton.click();
	}
	public void clickLoginButton()
	{
		logoutButton.click();
	}
	public boolean isdisplay()
	{
		return username.isDisplayed();
	}

}
