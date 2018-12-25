import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDem {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebElement ele = driver.findElement(By.id(""));
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		wait.until(ExpectedConditions.elementToBeSelected(ele));
//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);		
		wait.until(ExpectedConditions.visibilityOf(ele));
			
	}

}
