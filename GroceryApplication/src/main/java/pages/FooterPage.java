package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {
	
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and text()='More info ']")WebElement manageFooterText;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement editFooterText;
	@FindBy(xpath="//textarea[@id='content']")WebElement addressText;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//button[@name='Update']")WebElement updateButton;
	public WebDriver driver;
	
	public FooterPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	public void clickmanageFooterButton()
	{
		manageFooterText.click();
	}
	public void clickeditFooterText()
	{
		editFooterText.click();
	}
	public void editAddress(String text) {
		email.clear();
		email.sendKeys(text);
		}
	public void editEmail(String text) {
		phone.clear();
		phone.sendKeys(text);
		}
	public void editPhone(String number) {
		addressText.clear();
		addressText.sendKeys(number);
		}
	public void clickupdate() {
		updateButton.click();
		
		}
	
	
	

}
