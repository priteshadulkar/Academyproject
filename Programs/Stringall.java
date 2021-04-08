package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Stringall {
//1.s1="abscd" ,s2 ="12345"  concate two string
	
	String s1="abscd" ;
   String s2 ="12345" ;
   String concate ;
   //@Test
   public void concate()
   {
	   for(int i = 0 ; i<=s1.length()-1; i++)
	   {
		  concate =  String.valueOf(s1.charAt(i))  +  String.valueOf(s2.charAt(i));
		   System.out.println(concate);
 	   }
	  
   }
  // @Test
   public void Addstring()
   {
	   // add 200 string into the int and sum is int ;
	  String  sname= "Great wall is 200 ";
	   int a = 400 ;
	   // 1st split use("\\s") \\  we use for split on the base of space\\
	   String[] sl= sname.split("\\s");
	  
	   for(int i = 0 ;i<=sl.length-1 ; i++)
	   {
		   String all = sl[i];
				   System.out.println(all);
	   }
	   
	   int sum  = a + Integer.parseInt(sl[3]);
	   System.out.println(sum);
   }
   
   // Duplicate value
  // @Test  
   public void Duplicate()
   {
	   String s[]= {  "c" , "c#", "net" ,"java" ,"c ", "c" ,"c#","java","c ", "c","net","net","net","net"} ;
	  
	   for(int i =0 ;i<=s.length-1;i++)
	   {
		   int count = 0 ;
		  
		   for(int j = i+1; j<=s.length-1; j++)
		   {
			 
			   if(s[i]==s[j])
			   {
				   count = count+1;
				   s[j]="0"; // to avoid print visited world 
				  
			   }
			  
		   }
		   
	         if(count>=1) {	   
			   System.out.println(s[i]+ " ,"+ count);
		   
	         }
	   }
   }
  
  
   public void duplicateMap()
   {
	   Map<Character, Integer> map = new HashMap<Character, Integer>();
		String s= "big black bug bit a big black dog on his big black nose";
	   char[] ch = s.toCharArray();
	   for(Character cha : ch)
	   {
		   if(map.containsKey(cha))//a,1 l,1//l,2//p,1//l,3//i,1//c,1//a,2
		   {
			   map.put(cha, map.get(cha)+1);
		   }
		   else
		   {
			   map.put(cha, 1); 
		   }
		   
		   
	   }
	   System.out.println(map);
	   Set<Character> set = map.keySet();
	   for(Character chas :set)
	   {
		   if(map.get(chas)>1)
		   {
			   System.out.println(chas + " "+ map.get(chas));
		   }
	   }
	   
		
	}
   

   public void app()
   {
	   Map<Character, Integer> map = new HashMap<Character, Integer>();
	   String s= "big black bug bit a big black dog on his big black nose";
	   char[] ch =s.toCharArray();
	   
	  for(Character cha :ch )
	  {
		  if(map.containsKey(cha))
		  {
			  map.put(cha, map.get(cha)+1);
		  }
		  else
		  {
			  map.put(cha, 1);
		  }
	  }
	  Set<Character> set = map.keySet();
	  for(Character chas : set)
	  {
		  if(map.get(chas)>1)
		  {
			System.out.println(chas + " " +map.get(chas));
		  }
	  }
   
   }
   //@Test
   public void sortstring()
   {
	   
   
   String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
			"aug", "Sep", "Oct", "nov", "Dec" };
   String[] countries = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind", "Fig", "Mulberry",  "Apple", "Plum",  "Orange", "Custard apple",  "Apricot"};  
 //sorts string array in alphabetical order or ascending order  
        Arrays.sort(countries);   // it is sorting String and String[] both
        Arrays.sort(inputList);
       System.out.println(inputList);
 //prints the sorted string array in ascending order  
      System.out.println(Arrays.toString(countries));
       System.out.println(Arrays.toString(inputList));
   }
   
   @Test
   public void sort()
   {
	   String ap = "ampnjnbo" ;
	   char[] ch = ap.toCharArray();
	   Arrays.sort(ch);
	   System.out.println(ch);
   }
   
   ////////////////
 //  PATTERENS
   
   @Test
   public void simplepatteren()
   { 
	   System.out.println("patteren simple");
	   int i , j;
	   for( i =0 ;i<=5 ; i++)
	   {
		   System.out.print(" ");
	   
		 for( j=0  ; j<=i ; j++ )
		 {
			 System.out.print("* ");
			 
	    }
		 
		 System.out.println();
	   }
	   
		
	   //Left pattern
	   for(int k = 5 ; k<=1; k++)// print 5 space then print i=k =*
	   {
		   System.out.print(" ");
		   for(int l = 5 ; l>=i ; l--)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }

	   for(int h = 0 ; h<=5-1; h++)
	   {
		   
		  for(int k= 0 ; k<=i ; k++ )
		  {
			  System.out.print(" ");
		  }
		  for(int p = 0 ;p<=5-1-h ; p++)
		  {
			  System.out.print("*"+ " ");
		  }
		  System.out.println();
	 }
	  /* for (int i= 0; i<= 5-1 ; i++) //
	    {
	        for (int j=0; j<=i; j++)
	        {
	            System.out.print(" ");// space than * with space
	        }
	        for (int k=0; k<=5-1-i; k++)
	        {
	            System.out.print("*" + " ");
	        }
	        System.out.println();
	    }*/
	   
   }
   
   
   
   
   
}
