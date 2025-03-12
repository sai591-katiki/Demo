package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Browser.Browser;
import Locaters.Page2Objects;

public class Page2 extends Browser{
	static Page2Objects obj;
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    // method to choose one option from showing all options in home page
	public static void getUser() {
		obj=PageFactory.initElements(driver, Page2Objects.class);
		//obj=PageFactory.initElements(driver, Page2Objects.class);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(obj.getuser));
		Assert.assertEquals(obj.getuser.getText(), "Nilesh Kumar");
	}
	public static void chooseOption(String data)  {
		
		obj=PageFactory.initElements(driver, Page2Objects.class);
		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));
      List<WebElement> list1= obj.list;
     // System.out.println(list.get(i).getT);
		for (int i = 0; i < list1.size(); i++) {
             //System.out.println(list.get(i).getText());
			if (list1.get(i).getText().equalsIgnoreCase(data))

			{

				list1.get(i).click();
				break;
           }
   }
 }
}
