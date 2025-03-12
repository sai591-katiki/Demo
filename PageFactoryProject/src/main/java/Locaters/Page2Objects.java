package Locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import Browser.Browser;

public class Page2Objects extends Browser {
	@FindBy(className = "oxd-userdropdown-name")
	public WebElement getuser;
	@FindAll(@FindBy(xpath = "//ul[@class='oxd-main-menu']/li"))
	@CacheLookup
	public List<WebElement> list;
/*static By searchoptions=By.xpath("//ul[@class='oxd-main-menu']/li");
public static List<WebElement> shearchoption(){
	List<WebElement> element=driver.findElements(searchoptions);
	return element;
}
*/
	
}
