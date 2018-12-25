package DDT;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Actions1 {
	public static WebDriver driver;
	
	
	@Test
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\hms1\\src\\test\\java\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
		driver.findElement(By.id("user_login")).sendKeys("admin");	

		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();

		//Thread.sleep(4000);
		//signout();
	//}

	
	//public void signout()
	//{
		WebElement e=driver.findElement(By.xpath("(.//span[text()='admin'])[1]"));
		Actions a =new Actions(driver);
		a.moveToElement(e);
		a.build().perform();
		//a.moveToElement(e);
		//a.build().perform();
		Thread.sleep(3000);
		//e.click();
		driver.findElement(By.xpath(".//*[@id='wp-admin-bar-logout']/a")).click();
		System.out.println("Signout Clicked...");
	}



	
	
	
	
	
	
	
	
	
	
	//@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
