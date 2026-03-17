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
		user.sendKeys(user);
	}
	public void enterThePassword(String pass)
	{
		pass.sendKeys(pass);
	}
	public void clickOnLoginButton()
	{
		submit.click();
	}

}
