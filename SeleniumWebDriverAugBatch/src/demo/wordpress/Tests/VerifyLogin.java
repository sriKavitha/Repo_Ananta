package demo.wordpress.Tests;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demo.wordpress.Pages.LoginPage;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class VerifyLogin extends BaseClass
{
	//WebDriver driver;
	@Test(dataProvider="testdata")
	public void validLogin(String nam, String passwd) throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.typeuserName(nam);
		lp.typepassWord(passwd);
		lp.clickLogin();
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	//	closeBrowser();
//		Thread.sleep(4000);
		signout();
	}

	
	//@Test
	public void signout() throws InterruptedException
	{
		WebElement e=driver.findElement(By.xpath("(.//span[text()='admin'])[1]"));
		Actions a =new Actions(driver);
		a.moveToElement(e);
		a.build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='wp-admin-bar-logout']/a")).click();
		System.out.println("Signout Clicked...");
	}

	@DataProvider(name="testdata")
	public String[][] data() throws BiffException, IOException
	{

		File f=new File("C:\\JavaH2K\\JavaProgs\\Interview\\Data1.xls");
		Workbook wbk= Workbook.getWorkbook(f);
		Sheet sheet1 = wbk.getSheet("Sheet1");
		int r= sheet1.getRows();
		int c = sheet1.getColumns();
		String[][] dat=new String[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				dat[i][j] = sheet1.getCell(j,i).getContents();
			}
		}
	/*	for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(dat[i][j]);
			}
		}
	*/
		return dat;
	}
}
