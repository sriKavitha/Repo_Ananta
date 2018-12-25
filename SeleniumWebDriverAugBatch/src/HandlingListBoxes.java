import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://register.rediff.com/register/register.php");

		WebElement e=driver.findElement(By.xpath(".//*[@id='country']"));
		//System.out.println(e.getText());
		WebElement e1=driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[22]/td[1]"));
		System.out.println(e1.getTagName());
		Dimension si = e.getSize();
		System.out.println(si);
		Select s=new Select(e);
		System.out.println("Multiple selection is not allowed:::"+s.isMultiple());
		s.selectByIndex(5);
		String a = s.getFirstSelectedOption().getText();
		System.out.println(a); //displays Antarctica

		List<WebElement> o = s.getOptions();
		int num=o.size();
		System.out.println("No of countries in the listbox listed:" + num);
		List<WebElement> we = driver.findElements(By.xpath(".//*[@id='country']"));
		System.out.println("SIZE:"+we.size()); //Displays number of elements as 1 only as with xpath, how many are displayed that many is the o/p
		
		//Display 10 countries in the list
		System.out.println("10 Countries listed...\n");
		for(int j=0;j<10;j++)
		{
			System.out.println(o.get(j).getText());
		}
		
		/*s.selectByValue("20");
		a = s.getFirstSelectedOption().getText();
		System.out.println(a); //displays Belgium

		
		String siz = e.getCssValue("font-size");
		System.out.println(siz);
		
		 String siz1 = e.getCssValue("style");
		System.out.println(siz1);
		
		System.out.println(e.getAttribute("id"));
		System.out.println(e.getCssValue("color"));
		String cc = e.getCssValue("color");
		String hex = Color.fromString(cc).asHex();
		System.out.println(hex);
		*/

	}
}
