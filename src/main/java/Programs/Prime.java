package Programs;

import org.testng.annotations.Test;

public class Prime {
//2,3,5,7,11,


	@Test
	public void primenumber()
	{
		System.out.println("Prime number is ");
		for(int i =1 ; i<=100; i++)
		{
			int count = 0 ;
			for(int j =i ;j>=1 ; j--)
			{
				if(i%j==0)
				{
					count = count+1;
				}
			}
			if(count==2)
			{
				System.out.println(" ,"+ i+" ");
				
			}
		}
	}
	
	@Test(priority =1)
	public void palindron()
	{
		System.out.println("palimndron umber is ");
		//16461
		int num = 16461 , n , sum= 0;
		while(num>0)
		{
			n= num%10;                    //1   6 4 6 1
			sum= (sum*10)+n;              // 16461
			num =num/10;                   //6461
		}
		System.out.println(sum);
	}
	
	@Test(priority=2)
	public void febo()
	{
		//0,1,1,2,3,5
	int	n1=0 , n2=1 , sum = 0, n=20;
	System.out.println("febonanices series is ");
	while(n>0)
	{
		System.out.print(" ,"+n1);  //0,1,1,2,3  // 0,1,1,2
		sum = n1+n2;//0+1=1, 1+1=2, 1+2, 2+3//1,2,3
		n1= n2;   //1,1,2,3//1,1,2
		n2= sum;//1,2,3//1,2
		n--;
	}
		
		
		
	}
}
