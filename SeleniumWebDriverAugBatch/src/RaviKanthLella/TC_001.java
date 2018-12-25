package RaviKanthLella;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_001 extends BaseClass
{
public static void main(String[] args) throws IOException {
	

	 launch(loadData("browserType"),loadData("url"));
	String s=driver.findElement(By.xpath("(.//*[@class='gb_P'])[1]")).getText();
	System.out.println(s);
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	String s1=driver.findElement(By.name("q")).getAttribute("value");
	System.out.println(s1);
	
}
}
