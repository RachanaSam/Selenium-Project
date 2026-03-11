package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;

public class AdminUsersTest extends Base{
@Test
public void clickAdminUser()
{
	LoginPage login = new LoginPage(driver);
	login.enterTheUserName("admin");
	login.enterThePassword("admin");
	login.clickOnLoginButton();
	AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
	
	adminUsersPage.clickAdminUserMoreInfo();
	adminUsersPage.clickAdminNewButton();
	adminUsersPage.addNewUsername("Dan@gmail.com");
	adminUsersPage.addNewPassword("hello");
	adminUsersPage.dropdown();
	adminUsersPage.save();
	String expectedMessage = "News Created Successfully";
	String actualMessage = adminUsersPage.getSuccessMessageText();

	Assert.assertTrue(actualMessage.contains(expectedMessage));

}
}
