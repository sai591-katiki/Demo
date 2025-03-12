package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;
import Locaters.Page1Objects;

public class Page1 extends Browser{
	static Page1Objects obj;
	// this method is used to enter the username
public static void userNameEnter(String data) {
	//static Page1Objects obj;
	obj=PageFactory.initElements(driver, Page1Objects.class);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    try {
    	wait.until(ExpectedConditions.elementToBeClickable(obj.username));
        obj.username.sendKeys(data);
    }
    catch(Exception e){
    	System.out.println("not entered");
    }
    
	
}
public static void passwordEnter(String data) {
	obj=PageFactory.initElements(driver, Page1Objects.class);
	wait.until(ExpectedConditions.elementToBeClickable(obj.password));
    obj.password.sendKeys(data);
	
}

public static void login() {
	obj=PageFactory.initElements(driver, Page1Objects.class);
	wait.until(ExpectedConditions.elementToBeClickable(obj.login));
     obj.login.click();
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
}
}
