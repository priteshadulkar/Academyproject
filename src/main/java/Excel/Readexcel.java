package Excel;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Readexcel extends Hashexceldata{

	
	Hashexceldata data = new Hashexceldata();
	
	@BeforeTest
	public void fileread() throws FileNotFoundException
	   {
		data.read();
		System.out.println("data is read");
			
	   }
	
	
	@Test
	public void readdata()
	{
		
		System.out.println("enbter inti theb ");
		for(int i = 1 ; i<=2; i++)
		{
			for(int j= 0 ; j<=5; j++)
			{
				
				String value = data.getalldata(i, j);
				System.out.println(value);
			}
			/*String fname = data.getalldata(i, 0);
			String Mname = data.getalldata(i, 1);
			String Lname = data.getalldata(i, 2);
			String emailid = data.getalldata(i, 3);
			String mobileno = data.getalldata(i, 4);
			System.out.println(fname +" " + Mname + " "+ Lname + " "+emailid + " "+ mobileno );*/
		}
		
		
	}
}
