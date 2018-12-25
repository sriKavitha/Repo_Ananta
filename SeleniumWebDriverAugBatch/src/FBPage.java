import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FBPage {
	//public class FBXpath

//	public static void main(String[] args){
	@Test
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
/*	if (actual.equals(expected))

	{

	System.out.println("Pass");

	}
	else

	{

	System.out.println("Fail"); }
*/
	}
}
