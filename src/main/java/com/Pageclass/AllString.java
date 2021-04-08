package com.Pageclass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class AllString {

	int count = 0 ;
	// to replace all space 
	@Test
	public void SpecialCharacter()
	{
	String s1= "kdsksjkd$%^&  nj  jj";
	
	String space = s1.trim();
	System.out.println(space);
	}
	
	@Test
	public void substring()
	{
		String s2 = "manoj gupta" ; 
		String s3 = s2.substring(4) ;
		System.out.println(s3);
		
		
		
	}
	@Test
	public void Hashset()
	{
		String[] s1 = {"core" , "java" ,"c#","java" , "core" ,"fh" , "core ", "c#" ,"dsfn" } ;
		Set<String> str = new HashSet<String>();
		for(String name : s1)
		{
			if(str.add(name)==false) {
				
				System.out.println("duplicate element is=" + name);
			}
		}
		
	}
	
	public void Hashmap()
	{
		String[] s1 = {"core" , "java" ,"c#","java" , "core" ,"fh" , "core ", "c#" ,"dsfn" } ;
		Map<String , Integer>  map = new HashMap<String, Integer>();
		
		for(String name : s1)
		{
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	@Test
	public void Stringvalue()
	{
		String[] s1 = {"core" , "java" ,"c#","java" , "core" ,"fh" , "core ", "c#" ,"dsfn" } ;
		
		 for(int i = 0 ; i< s1.length;  i++)
		   {
			 
			   
			   for(int j = i+1 ; j< s1.length ; j++)
			   {
				  
				   if(s1[j].equals(s1[i]))
				   {
					   
					   count ++ ;
					   //System.out.println("the character is  = " + s1[i] +  "count times" +count);
			     	}
				  
			   }
			   if(count>=2)
			   {
				   
				   
				   System.out.println(count+" "+ s1[i]);
			   }
			 
		   }
		
		
		 System.out.println("<==========================>");
		
	}
	
	 public static void main(String[] args)
	 {
		 AllString as = new AllString();
		 as.SpecialCharacter();
		// as.substring();
		 as.Stringvalue();
		 //as.Hashset();
		 
		 
		 
		 
	 }
	
}



