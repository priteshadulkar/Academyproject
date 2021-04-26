package Com.TestScript;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Java {
	
	public  void pal()
	{
		int counter = 0 ;
		for(int i =1; i<=100 ; i++)
		{
			counter = 0 ;
			for(int j=i ; j>=1 ; j--)
			{
				if(i%j==0)
				{
					counter =  counter + 1 ;
					
				}
			}
				
		    if(counter == 2)
		    {
		    	//System.out.println("the prime number is");
		    	System.out.print(i +" ");
		    	
		    	
		    }
			
		    
		    
		    
		    
		    
		    
		    
		    
			
		}

	}
	@Test
	public void palindron()
	{
		int n1 =0 , n2= 1, sum1 = 0 ,num1 =20;
		 while(num1>0)
		 {
			 System.out.print(n1+ ",");// 0,1,1
			 sum1= n1+n2;//0+1//1+1//1+2
			 n1= n2;//1,1.2
			 n2=sum1;//2,3
			 num1--;
			 
		 }
		 System.out.println();
		  String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
					"aug", "Sep", "Oct", "nov", "Dec" };
		  Arrays.sort(inputList);
		  
		  System.out.println(Arrays.toString(inputList));
	}
}
