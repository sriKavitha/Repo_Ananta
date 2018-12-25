import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in");
	Thread.sleep(10000);
	System.out.println("Page title:::"+driver.getTitle());
	driver.findElement(By.xpath("//app-header/div[1]/div[3]/a/i")).click();
	driver.findElement(By.xpath("(//*[text()='FLIGHTS'])[1]")).click();
	
	String parent=driver.getWindowHandle();
	System.out.println(parent);

	Set<String> wNames=driver.getWindowHandles();
	System.out.println(wNames.size());
	
	for(String wname:wNames)
	{
		System.out.println(wname);
		if(!(wname.equals(parent)))
		{
			driver.manage().window().maximize();
			driver.switchTo().window(wname);
			System.out.println(driver.getTitle());
			
		}
	}


}
}

