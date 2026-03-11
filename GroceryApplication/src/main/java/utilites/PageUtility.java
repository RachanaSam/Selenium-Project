package utilites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropDownVisisableText(WebElement element , String visiableText)
	{
		Select obj = new Select(element);
		
		obj.selectByVisibleText(visiableText);
	}

}
