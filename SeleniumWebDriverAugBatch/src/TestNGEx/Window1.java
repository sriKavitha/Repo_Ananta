package TestNGEx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\chromedriver.exe");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		WebElement e= driver.findElement(By.xpath("html/body/div[2]/div/ul/li[1]/a/div"));
		a.moveToElement(e).build().perform();
		WebElement e1= driver.findElement(By.xpath("html/body/div[2]/div/ul/li[1]/div/ul[1]/li[1]/a"));
		a.moveToElement(e1).build().perform();
		WebElement e2= driver.findElement(By.xpath("html/body/div[2]/div/ul/li[1]/div/ul[2]/li[1]/a"));
		a.moveToElement(e2).click().build().perform();
		Set<String> wh = driver.getWindowHandles(); //Set will have no duplicates
		//Using Enhanced FOR...LOOP
		for(String s: wh)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
		}
		//Using Iterator
		Iterator itr=wh.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next().toString());
			System.out.println(driver.getTitle());
		}}}
	//}
//}

