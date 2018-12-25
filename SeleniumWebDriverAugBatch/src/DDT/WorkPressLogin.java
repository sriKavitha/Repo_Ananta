package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkPressLogin {
	WebDriver driver;
	@Test(dataProvider="WordPressData")
	public void wordPressLogin(String name, String pwd)
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaH2K\\JavaAug_18\\POM1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(name);
		driver.findElement(By.id("user_pass")).sendKeys(pwd);
		driver.findElement(By.id("wp-submit")).click();
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is unsuccessful to signin... Invalid credentials!!!");
		System.out.println("Page title verified... User logged in successfully");
	}
	
	@DataProvider(name="WordPressData")
	public String[][] wordPressData()
	{
		String dat[][]=new String[3][2];
		dat[0][0]="admin1";
		dat[0][1]="demo1";
		dat[1][0]="admin";
		dat[1][1]="demo123";
		dat[2][0]="admin2";
		dat[2][1]="demo2";
		return dat;
	}
	
	
}
