package Day_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaDownloads\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
	Thread.sleep(3000);
	Select s=new Select(driver.findElement(By.name("countries")));
	s.selectByVisibleText("Albania");
	
	//Select multiple values from dropdown
	Select ms=new Select(driver.findElement(By.name("computerbrands")));
	//ms.selectByVisibleText("IBM");
	ms.selectByVisibleText("HP");
	ms.selectByVisibleText("Compaq");
	
	List<WebElement> l = ms.getAllSelectedOptions();
	int i=l.size();
	System.out.println(i);
    
	//Prints selected elements' text
	for(WebElement q: l)
	{
		System.out.println(q.getText());
	}
//Find a tags and print them
List<WebElement> atags = driver.findElements(By.tagName("a"));
System.out.println(atags.size());
for(WebElement q: atags)
{
	System.out.println(q.getText());
}

}
}
