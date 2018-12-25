import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFF {
	public static void main(String[] args) {
		
	
	  //System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver", "C:\\JavaH2K\\JavaAug_18\\SeleniumWebDriverAugBatch\\geckodriver.exe");
	  FirefoxDriver driver=new FirefoxDriver();
//	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.indeed.com/");
	  
	} 

}
