import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.rediff.com/");
	System.out.println("Page title:::"+driver.getTitle());
	driver.switchTo().frame("moneyiframe");
	
	driver.findElement(By.id("query")).sendKeys("TCS");
	driver.findElement(By.xpath(".//*[@id='get_quote']/div/div[2]/div")).click();
	
	driver.switchTo().defaultContent();
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	Set<String> wNames = driver.getWindowHandles();
	System.out.println(wNames.size());
	for( String s : wNames)
	{
		driver.switchTo().window(s);
		System.out.println(driver.getWindowHandle());
	Set<String> aa = driver.getWindowHandles();
	}
}
}
