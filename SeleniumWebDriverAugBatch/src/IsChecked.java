import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsChecked {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//Metho-1---- To find particular checkbox is checked or not
	driver.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-1/checkbox-1.html");
	boolean x = driver.findElement(By.xpath("(//*[@role='checkbox'])[1]")).getAttribute("aria-checked").contains("true");
	System.out.println(x);
	
	boolean x1 = driver.findElement(By.xpath("(//*[@role='checkbox'])[2]")).getAttribute("aria-checked").contains("true");
	System.out.println(x1);
	
	
}
}
