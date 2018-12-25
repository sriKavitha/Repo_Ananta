import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Thread.sleep(000);proceed")
		driver.findElement(By.name("proceed")).click();

		Alert a =driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();

		System.out.println(s);
		driver.switchTo().alert().accept();
		
		
	}
}
