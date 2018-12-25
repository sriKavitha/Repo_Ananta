package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaDownloads\\Drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("C:\\JavaH2K\\JavaAug_18\\JavaFundamentals\\src\\Day_1\\MySamplePage.html");
	 driver.manage().window().maximize();
	 System.out.println(driver.getTitle());
	 Thread.sleep(5000);
	 driver.switchTo().frame("act1");
	 driver.findElement(By.id("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 System.out.println(driver.getTitle());
	 driver.switchTo().defaultContent();
	 Thread.sleep(5000);
	 driver.switchTo().frame("selenium");
	 driver.findElement(By.linkText("Projects")).click();
	 System.out.println(driver.getTitle());
	 Thread.sleep(5000);
	 driver.close();
}
}
