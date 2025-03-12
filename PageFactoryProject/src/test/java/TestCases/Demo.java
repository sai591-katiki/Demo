package TestCases;

import org.openqa.selenium.devtools.v131.page.model.Screenshot;

import Browser.Browser;
import Pages.Page1;
import Pages.Page2;
import ScreenShot.Capture1;

public class Demo {
public static void main(String[] args) throws Exception {
	Browser.openBrowser();
	
//	Browser.navigateToUrl();
	//Browser.closeBrowser();
	Thread.sleep(2000);
	//Page1.userNameEnter("Admin");
	//Browser.closeBrowser();
//	Page1.passwordEnter("admin123");
	//Page1.login();
	//Capture1.screenShot("demo");
	Thread.sleep(3000);
	//Page2.chooseOption("Leave");
	Thread.sleep(3000);
	Capture1.screenShot("demo");
	//Browser.closeBrowser();
}
}
