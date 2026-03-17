package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.FooterPage;
import pages.LoginPage;

public class FooterTest extends Base {
	@Test
	public void editFooter() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.enterTheUserName("admin");
		login.enterThePassword("admin");
		login.clickOnLoginButton();
		
		FooterPage footerpage = new FooterPage(driver);
		footerpage.clickmanageFooterButton();
		footerpage.clickeditFooterText();
		footerpage.editAddress("111 HeartFeild");
		footerpage.editEmail("sam@gmail.com");
		footerpage.editPhone("25896345");
		footerpage.clickupdate();
		
		
		
		
	}

}
