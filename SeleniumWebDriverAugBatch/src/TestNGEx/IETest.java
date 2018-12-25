package TestNGEx;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class IETest {
	public WebDriver driver;
	@Test()
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver","C:\\JavaH2K\\JavaDownloads\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email'][class='inputtext']")).sendKeys("Test");
		driver.findElement(By.cssSelector("#pass")).sendKeys("demo123");
		driver.findElement(By.cssSelector("#loginbutton")).click();
	}
}
