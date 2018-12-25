import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	  public static void main(String[] args) {
	         
	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://total-qa.com/live-examples/loginpage/");
	         
	        WebElement e = driver.findElement(By.id("username"));
	        e.sendKeys("Hello");
	        String enteredText = e.getAttribute("value");
	        System.out.println("Entered Text "+ enteredText);
	        System.out.println("id" + e.getAttribute("id"));
	        System.out.println("name" +e.getAttribute("name"));
	        System.out.println("class" +e.getAttribute("class"));
	        e.clear();
	        //e.click();
	        System.out.println("location" +e.getLocation());
	        System.out.println("size" +e.getSize());
	        System.out.println("color" +e.getCssValue("background-color"));
	        System.out.println("fontsize" +e.getCssValue("font-size"));
	        e.getTagName();
	        File srcFile = e.getScreenshotAs(OutputType.FILE);
	        System.out.println(srcFile.getAbsolutePath());
	          
	          
	         
	          
	         
	         
	         
	         
	    }
}
