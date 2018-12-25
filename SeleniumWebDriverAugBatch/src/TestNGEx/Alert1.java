package TestNGEx;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {
	public static void main(String[] args) {
//		Chrome implementation works		
//		WebDriver driver=new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\chromedriver.exe");
//		Here is Firefox implementation
//		System.setProperty("webdriver.firefox.marionette","C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\geckodriver.exe"); //Works 
		System.setProperty("webdriver.firefox.marionette","");
		WebDriver driver=new FirefoxDriver();
//		
		driver.get("https://www.google.com");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
		driver.findElement(By.name("proceed")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
}
