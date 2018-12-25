package TestNGEx;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class prog2 {
@Test
public void login()
{
	//Assert.assertEquals("abc", "def");
	Assert.assertEquals("abc", "abc");
}
@Test(dependsOnMethods={"login"})
public void search()
{
	
}
@Test(alwaysRun=true)
public void logout()
{
	
}
@BeforeSuite
public void s1()
{
	System.out.println("Before executing the suite...");
}
}
