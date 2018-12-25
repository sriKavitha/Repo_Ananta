package Day_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaDownloads\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //has just one example
		 driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/"); //has three examples
	driver.findElement(By.id("prompt")).click();
		 Alert a=driver.switchTo().alert();
		 a.sendKeys("Kavitha");;
		 a.accept();
		 //WebElement a1=driver.findElement(By.xpath(".//*(@text="ABSoft")"));
		 
	}
}
