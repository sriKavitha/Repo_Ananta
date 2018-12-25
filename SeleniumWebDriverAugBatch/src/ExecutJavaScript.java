import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutJavaScript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	
	JavascriptExecutor exe = (JavascriptExecutor)driver;
	exe.executeScript("document.getElementById(\"u_0_c\").value=\"Kavitha\"");
}
}
