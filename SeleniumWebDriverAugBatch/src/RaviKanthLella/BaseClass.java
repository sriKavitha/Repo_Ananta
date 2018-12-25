package RaviKanthLella;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BaseClass {
	public static WebDriver driver;
	public static void launch(String browserType, String url)
	{
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static String loadData(String key) throws IOException
	{
		//File f = new File("./data.properties");
		FileInputStream fis=new FileInputStream("./data.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	/*public static void main(String[] args) throws IOException 
	{
		String btype;
		String url1;
		//Method#1 - to call launch method
		btype=loadData("browserType");
		url1=loadData("url");
		launch(btype, url1);
		//Method#2 - to call launch method
		launch(loadData("browserType"),loadData("url"));
	}*/
}

