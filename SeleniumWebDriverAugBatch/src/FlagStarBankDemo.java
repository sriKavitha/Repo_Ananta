import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlagStarBankDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://shopping.rediff.com/?sc_cid=ushome_icon");

	Actions action=new Actions(driver);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//
	action.moveToElement(driver.findElement(By.id("topcat2")));
	action.perform();
	Thread.sleep(3000);
	action.moveToElement(driver.findElement(By.xpath(".//a[@class='hm_catlink' and text()='Anarkali Suits']")));
	action.click();
	action.perform();
	
	
	
}
}
