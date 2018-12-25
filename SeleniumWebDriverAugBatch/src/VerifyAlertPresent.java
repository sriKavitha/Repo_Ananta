import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlertPresent {
	static ChromeDriver driver;
	public boolean AlertPresent()
	{
		
		try {
			driver.findElement(By.name("proceed")).click();
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
			}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	VerifyAlertPresent obj=new VerifyAlertPresent();
	boolean ver = obj.AlertPresent();
	System.out.println("Alert is present..." + ver);
}
}
