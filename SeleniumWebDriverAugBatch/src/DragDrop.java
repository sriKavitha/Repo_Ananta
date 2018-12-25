import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		Actions action=new Actions(driver);

		/*Method-1*/
		action.clickAndHold(driver.findElement(By.id("draggable")));

		action.moveToElement(driver.findElement(By.id("droppable")));
		action.release(driver.findElement(By.id("draggable")));
		
		action.perform();
		
		/*Method-2*/
		 WebElement source=driver.findElement(By.id("draggable"));
		 WebElement target=driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, target).build().perform();

	}
}
