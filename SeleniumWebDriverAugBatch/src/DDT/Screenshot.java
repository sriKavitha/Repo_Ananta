package DDT;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//import org.apache.commons.*;
import org.apache.commons.io.FileUtils;

public class Screenshot {
//private static final String FILE = null;
WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaH2K\\JavaAug_18\\POM1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demosite.center/wordpress/wp-login.php");
	new ChromeDriver();
	new ChromeDriver();
	}
	}
