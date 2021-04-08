package TestngAnnotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D {

	@Test
	public void anotation()
	{
		System.out.println("1st is executed");
		
	}
	@BeforeTest
	public void Atest()
	{
		
	 System.out.println("1STBeforetest");
		
	}
	
	@BeforeClass
	public void classBefore()
	{
		System.out.println("classBefore");
	}
	
	@BeforeMethod
	public void zoom()
	{
		System.out.println("zoom before ma thod is executed");
	}
	@Test
	public void excel()
	{
		System.out.println("3rd excel");
	}
	@Test
	public void book()
	{
		
	 System.out.println("2st book is executed");
		
	}
	
}
//	public void ()
//	{
//		System.out.println("read is executed");
//	}
//	public void read()
//	{
//		System.out.println("read is executed");
//	}
//}
