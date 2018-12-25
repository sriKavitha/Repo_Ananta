package RaviKanthLella;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	List<WebElement> locs = driver.findElements(By.tagName("a"));
	//Will filter empty links
	for(int i=0; i<locs.size();i++)
	{
		if(!locs.get(i).getText().isEmpty())
		{
		System.out.println(locs.get(i).getText());
		}
	}
}
}
