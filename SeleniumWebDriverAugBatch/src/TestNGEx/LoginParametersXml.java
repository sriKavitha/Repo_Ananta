package TestNGEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginParametersXml {
	public static void main(String[] args) {
		{
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver","C:\\JavaH2K\\JavaDownloads\\Drivers\\geckodriver-v0.22.0-win32\\geckodriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("marionette", false); 
            FirefoxOptions options = new FirefoxOptions(); 
            options.merge(capabilities);
            driver = new FirefoxDriver(options);
			driver.get("http://demosite.center/wordpress/wp-login.php");
			driver.findElement(By.id("user_login")).sendKeys("Admin");
			driver.findElement(By.id("user_pass")).sendKeys("demo123");
			driver.findElement(By.id("wp-submit")).click();
			System.out.println("Application opened");
			System.out.println("Page Title is : "+driver.getTitle());
			driver.quit();
			
	}}
	
}
