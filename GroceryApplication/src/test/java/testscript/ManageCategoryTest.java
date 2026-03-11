package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;

public class ManageCategoryTest  extends Base{
	@Test
	public void ManageCategory()
	{
		LoginPage login = new LoginPage(driver);
		login.enterTheUserName("admin");
		login.enterThePassword("admin");
		login.clickOnLoginButton();
	
	ManageCategoryPage manageCategoryPage = new ManageCategoryPage (driver);
	manageCategoryPage.clickManageCategoryMoreInfo();
	manageCategoryPage.clickManageNewButton();
	manageCategoryPage.enterCatogary("Juice");
	manageCategoryPage.fileUpload();
	manageCategoryPage.save();
	
	}
}
