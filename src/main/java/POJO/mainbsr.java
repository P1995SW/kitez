package POJO;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class mainbsr {
	public static WebDriver openbsr() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
	
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
}