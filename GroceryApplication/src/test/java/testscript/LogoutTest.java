package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends Base {
	@Test
	public void logout()
	{
		LoginPage login = new LoginPage(driver);
		login.enterTheUserName("admin");
		login.enterThePassword("admin");
		login.clickOnLoginButton();
		
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickAdminButton();
		logoutpage.clickLoginButton();
		
		boolean check = logoutpage.isdisplay();
		Assert.assertTrue(check);
	}

}
