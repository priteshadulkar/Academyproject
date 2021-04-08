package TestngAnnotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C {
	@Test()
	public void ebbok()
	{
		System.out.println("21nd 1st ebbok is executed");
		
	}
	@BeforeTest
	public void Best()
	{
		
	 System.out.println("21nd Beforetest");
		
	}
	
	@BeforeClass
	public void sclassBefore()
	{
		System.out.println("21nd classBefore");
	}
	
	@BeforeMethod
	public void szoom()
	{
		System.out.println("21ndzoom before ma thod is executed");
	}
	@Test
	public void sexcel()
	{
		System.out.println("211nd 3rd excel");
	}
	@Test(priority =1)
	public void sbook()
	{
		
	 System.out.println("21nd "
	 		+ "2st book is executed");
		
	}
}
