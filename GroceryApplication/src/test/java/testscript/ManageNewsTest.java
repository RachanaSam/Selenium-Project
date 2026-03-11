package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;


public class ManageNewsTest extends Base {
	@Test
	public void ManageNews() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.enterTheUserName("admin");
		login.enterThePassword("admin");
		login.clickOnLoginButton();
		
		ManageNewsPage manageNewsPage = new ManageNewsPage(driver); 
		
		manageNewsPage.clickOnManageNews();
		manageNewsPage.clickOnNew();
		manageNewsPage.enterNews("50% offer");
		manageNewsPage.clickSaveButton();
		manageNewsPage.getSuccessMessageText();
		
		String expectedMessage = "News Created Successfully";
		String actualMessage = manageNewsPage.getSuccessMessageText();

		Assert.assertTrue(actualMessage.contains(expectedMessage));
	}

}
