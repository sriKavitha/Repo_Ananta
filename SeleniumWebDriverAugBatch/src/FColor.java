

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class FColor {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");

		WebElement color1 = driver.findElement(By.xpath("(//tbody/tr[1]/td"));
		String a = color1.getCssValue("font-color");
		System.out.println(a);
		String hex = Color.fromString(a).asHex();
		System.out.println(hex);
	}}
