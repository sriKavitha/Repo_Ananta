package RaviKanthLella;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PrintingLinks {
	public WebDriver driver;
	@Test

	public void m1()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			if(!(links.get(i).getText().isEmpty()))
			{
				System.out.println(links.get(i).getText());
				links = driver.findElements(By.tagName("a"));
			}	
		}
	}


	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
}
