package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.PageUtility;

public class AdminUsersPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and contains(@class,'small-box-footer')]")WebElement adminUserMoreInfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement adminNewButton;
	@FindBy(xpath="//input[@id='username']")WebElement adminNewUsername;
	@FindBy(xpath="//input[@id='password']")WebElement adminNewUserPassword;
	@FindBy(xpath="//select[@id='user_type']")WebElement adminNewUserType;
	@FindBy(xpath="//button[@name='Create']")WebElement adminNewSave;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement successMessage;
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickAdminUserMoreInfo()
	{
		adminUserMoreInfo.click();
	}
	public void clickAdminNewButton()
	{
		adminNewButton.click();
	}
	public void addNewUsername(String user)
	{
		adminNewUsername.sendKeys(user);
		
	}
	public void addNewPassword(String pass)
	{
		adminNewUserPassword.sendKeys(pass);
		
	}
	public void dropdown()
	{
		PageUtility drop = new PageUtility();
		drop.dropDownVisisableText(adminNewUserType, "Staff");
	}
	public void save()
	{
		adminNewSave.click();
	}
	public String getSuccessMessageText() {
	    return successMessage.getText();
	}
}
