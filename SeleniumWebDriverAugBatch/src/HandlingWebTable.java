import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath(".//*[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath(".//*[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@title='Contacts']")).click();

		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";

		for(int i=10;i<20;i++)
		{
			String pth=before_xpath+i+after_xpath;
			System.out.println(pth);
			WebElement ename = driver.findElement(By.xpath(pth));
			String name=ename.getText();
			System.out.println(name);
			//if(sname.contains("QA"))
			{
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
			}


		}

	}
}
