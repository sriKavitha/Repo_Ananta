package TestNGEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\chromedriver.exe");
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"v");
		
		
	}
}
