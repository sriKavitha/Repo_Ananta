import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFindElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.techbeamers.com/");
	List<WebElement> lnks = driver.findElementsByXPath("//a");
	int s=lnks.size();
	for(WebElement e : lnks)
	{
		System.out.println(e.getText());
	}
	
}
}
