import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://jqueryui.com/droppable/");
	Thread.sleep(3000);
	//WebElement source=driver.findElement(By.id("draggable"));
	WebElement source=driver.findElement(By.className("desc"));
	Point p = source.getLocation();
	System.out.println(p.getX());
	System.out.println(p.getY());
	}
}
