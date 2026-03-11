package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTest extends Base {
	public LoginTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//used to initialize webelement
	}
	public void enterTheUserName(String user)
	{
		username.sendKeys(user);
	}
	public void enterThePassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnLoginButton()
	{
		submit.click();
	}

}
