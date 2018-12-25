package DDT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelData {
	WebDriver driver;
	@Test(dataProvider="data1")
	public void verifyLogin(String name, String pwd)
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaH2K\\JavaAug_18\\POM1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(name);
		driver.findElement(By.id("user_pass")).sendKeys(pwd);
		driver.findElement(By.id("wp-submit")).click();
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is unsuccessful to signin... Invalid credentials!!!");
		System.out.println("Page title verified... User logged in successfully");
	}
	@DataProvider(name="data1")
	public String[][] readData() throws BiffException, IOException
	{
		File f=new File("inputData.xls");
		Workbook wbk= Workbook.getWorkbook(f);
		Sheet sName = wbk.getSheet("Sheet1");
		int r=sName.getRows();
		int c=sName.getColumns();
		String[][] inputDat=new String[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				inputDat[i][j]=sName.getCell(j,i).getContents();
			}
		}	
		/* Below loop is to to print data on the comsole... Its optional
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(inputDat[i][j]);
			}
			System.out.println();
		}
		*/
		return inputDat;
	}
	
}
