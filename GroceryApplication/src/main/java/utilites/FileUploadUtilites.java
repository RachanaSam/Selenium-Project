package utilites;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtilites {
	public void fileUploadUsingsendKeys(WebElement element, String path)
	{
		element.sendKeys(path);
		
	}
	public void fileUploadUsingRobotClass(WebElement element, String path) throws Exception
	{
		StringSelection string = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_CONTROL);// KeyEvent class, VK-vertual key
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
