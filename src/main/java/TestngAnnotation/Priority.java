package TestngAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {

	
	@BeforeTest
	public void BeforeTets()
	{
		System.out.println("PBeforeTest");
	}
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("1st Beforeclass");
	}
	@Test
	public void book()
	{
		System.out.println("2ntTest Book");
	}
	@Test
	public void cele()
	{
		System.out.println("3rd @Test");
	}
	@Test
	public void annotation()
	{
		System.out.println("1st @Test case executed");
	}
	@BeforeMethod
	public void Beforemathod()
	{
		System.out.println("Beforemathod");
	}
	@AfterMethod
	public void Aftermathod()
	{
		System.out.println(" Aftermathod");
	}
	
	@AfterTest
	public void AfteeTest()
	{
		System.out.println(" AfterTest");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Afterclass");
	}
	//Before Test
	//2.Beforeclass
	//3.Before Mthod
	//@Test Annotation
	//Aftermathod
	//beforemathod
	//@TestBOOK
	//Aftermathod
	//@BeforeMathod
	//@Testcle
	//Aftermathod
}
