package TestngAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testmathod {

	@Test
	public void eb()
	{
		System.out.println("1st @Test eb case executed");
	}
	@BeforeTest
	public void BeforeTets()
	{
		System.out.println("TBeforeTest");
	}
	//@BeforeClass
	public void Beforeclass()
	{
		System.out.println("1st Beforeclass");
	}
	@Test(priority=2)
	public void ze()
	{
		System.out.println("(priority=2)");
	}
	@Test
	public void be()
	{
		System.out.println("3rd be @Test");
	}
	
	@Test(priority=1)
	public void de()
	{
		System.out.println("priority=1");
	}
	@Test(priority=0)
	public void we()
	{
		System.out.println("priority=0");
	}
	
}
