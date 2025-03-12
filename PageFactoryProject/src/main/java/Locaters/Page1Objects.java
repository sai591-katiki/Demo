package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Browser.Browser;

public class Page1Objects extends Browser{
	@FindBy(name="username")
	public  WebElement username;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login;
//static By searchUsername=By.name("username");
//static By searchPassword=By.name("password");
//static By searchLogin=By.xpath("//button[@type='submit']");

  //Method to get element of search username and store it
/*public static WebElement userName() {
	WebElement element=driver.findElement(username);
	return element;
}
public static WebElement password() {
	WebElement element=driver.findElement(password);
	return element;
}
public static WebElement login() {
	WebElement element=driver.findElement(login);
	return element;
}
*/
}
