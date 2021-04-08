package Excel;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class Dprovidertest extends Hashexceldata{
 

	static Hashexceldata data = new Hashexceldata();
	 //@BeforeClass
	 /*@Test
		public void readadata() throws FileNotFoundException
		{
			data.read();
			System.out.println("all file read");
		}*/
	  
	@Test
	public static ArrayList<Object[]> lldata() throws FileNotFoundException
	{
		ArrayList<Object[]>  ar = new ArrayList<Object[]>();

		data.read();
		System.out.println("all file read");
		for(int i = 1 ; i<=2; i++)
		{
			for(int j= 0 ; j<=5; j++)
			{
				
				String value = data.getalldata(i, j);
				System.out.println(value);
			}
		    String fname = data.getalldata(i, 0);
			String Mname = data.getalldata(i, 1);
			String Lname = data.getalldata(i, 2);
			String emailid = data.getalldata(i, 3);
			String mobileno = data.getalldata(i, 4);
			System.out.println(fname +" " + Mname + " "+ Lname + " "+emailid + " "+ mobileno );
		  
		Object[] obj = { fname , Mname,Lname,emailid ,mobileno};
		ar.add(obj);
		System.out.println(obj);
	  }
		
		return ar;
	
}
}
