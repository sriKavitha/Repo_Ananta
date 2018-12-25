package TestNGEx;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class prog3 
{
	@Test(invocationCount=10)
	public void m2()
	{
		System.out.println("Hi!");
	}

	@AfterSuite
	public void s2()
	{
		System.out.println("After executing the suite...");
	}

}
