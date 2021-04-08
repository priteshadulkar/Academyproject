package TestngAnnotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {

	@Test
	public void ebbok()
	{
		System.out.println("2nd 1st ebbok is executed");
		
	}
	@BeforeTest
	public void Atest()	{
		
	 System.out.println("2nd Beforetest");
		
	}
	
	@BeforeClass
	public void sclassBefore()
	{
		System.out.println("2nd classBefore");
	}
	
	@BeforeMethod
	public void szoom()
	{
		System.out.println("2ndzoom before ma thod is executed");
	}
	@Test
	public void sexcel()
	{
		System.out.println("2nd 3rd excel");
	}
	@Test
	public void sbook()
	{
		
	 System.out.println("2nd "
	 		+ "2st book is executed");
		
	}
}
