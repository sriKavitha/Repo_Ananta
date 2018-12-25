package demo.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.id("user_pass");
	By loginButton=By.id("wp-submit");

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void typeuserName(String usr)
	{
		driver.findElement(username).sendKeys(usr);	
	}


	public void typepassWord(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}


	public void clickLogin()
	{
		driver.findElement(loginButton).click();
	}


}
