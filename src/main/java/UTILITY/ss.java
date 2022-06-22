package UTILITY;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {
	public static void ss(WebDriver driver, String url) throws IOException {
	
	       File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       
	       File destination = new File("D:\\Software testing\\Java Automation\\Selenium\\ss\\"+url);;
	       
	       FileHandler.copy(source, destination);
	       
	       String sss= driver.getTitle();
	}
}
