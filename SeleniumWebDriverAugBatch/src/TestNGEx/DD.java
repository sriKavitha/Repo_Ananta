package TestNGEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DD {
	public static WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\chromedriver.exe");

		driver.get("https://www.flagstar.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement e= driver.findElement(By.xpath(".//*[@id='parent-container']/div[1]/nav/div[2]/ul/li[2]"));
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		System.out.println("I clicked");
		//WebElement e1= driver.findElement(By.xpath(".//*[@id='parent-container']/div[1]/nav/div[2]/ul/li[2]/div/div/div[1]/ul/li[2]"));
		//a.moveToElement(e1).build().perform();
		
		
		/*
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");		
		driver.findElement(By.name("Name")).sendKeys("Mere SAI");
		driver.findElement(By.name("Name")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("Name")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("comments")).sendKeys(Keys.CONTROL+"v");
		*/
		/*
		 //Dropdown selection
		
		WebElement c=driver.findElement(By.name("countries"));
		Select s=new Select(c);
		s.selectByVisibleText("Albania");
		
		//Dropdown Multiple item Selection
		WebElement mc=driver.findElement(By.name("computerbrands"));
		Select s1=new Select(mc);
		s1.deselectByIndex(0);
		s1.selectByVisibleText("IBM");
		s1.selectByVisibleText("Compaq");
		*/
	}
}
