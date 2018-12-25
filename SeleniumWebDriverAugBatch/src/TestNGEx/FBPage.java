package TestNGEx;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class FBPage {
	@Test(groups="a")
	public void verifytest()
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	ChromeDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");

	String actual= driver.findElement(By.xpath("//h2[contains(text(),'Connect')]")).getText();

	//String actual= driver.findElement(By.xpath("//h2[contains(text(),'Connect')]")).getText(); 
	System.out.println(actual);

	String expected= "Connect with friends and the\nworld around you on Facebook.";
	Assert.assertEquals(actual, expected);
	}
	@BeforeGroups(groups="a")
	public void test()
	{
		System.out.println("Before executing the groups...");
	}
	@AfterGroups(groups="a")
	public void test1()
	{
		System.out.println("After executing the groups...");
	}
}
