package TestNGEx;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog11 
{
	@Test(priority=2, groups="a")
	public void VerifyTitle()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String exp="Google";
		String actual="Google";
		Assert.assertEquals(actual, exp);
	}

	@Test(description="Method-1",priority=3)
	public void m1()
	{

	}

	@Test(enabled=true,priority=4)
	public void m2()
	{

	}

	@Test(priority=1, groups="a")
	public void m3()
	{
		
	}

}
