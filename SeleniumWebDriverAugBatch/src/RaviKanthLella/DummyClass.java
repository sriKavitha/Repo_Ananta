package RaviKanthLella;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DummyClass implements WebDriver{

	@Override
	public void close() {
	}
	@Override
	public WebElement findElement(By arg0) {
		return null;
	}
	@Override
	public List<WebElement> findElements(By arg0) {
		return null;
	}
	@Override
	public void get(String arg0) {
	}
	@Override
	public String getCurrentUrl() {
		return null;
	}
	@Override
	public String getPageSource() {
		return null;
	}
	@Override
	public String getTitle() {
		return null;
	}
	@Override
	public String getWindowHandle() {
		return null;
	}
	@Override
	public Set<String> getWindowHandles() {
		return null;
	}
	@Override
	public Options manage() {
		return null;
	}
	@Override
	public Navigation navigate() {
		return null;
	}
	@Override
	public void quit() {
	}
	@Override
	public TargetLocator switchTo() {
		return null;
	}
}
