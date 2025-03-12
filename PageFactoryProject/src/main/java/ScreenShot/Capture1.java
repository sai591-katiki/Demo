package ScreenShot;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;

public class Capture1 extends Browser {
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	public static void screenShot(String name) throws Exception { 
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		try {

			TakesScreenshot shot = ((TakesScreenshot) driver);

			File source = shot.getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";

			File destination = new File(path);

			FileUtils.copyFile(source, destination);

		} catch (Exception e) {

			System.out.println("Screenshot");

		}

	}
 
}
