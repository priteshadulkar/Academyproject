package com.Parallel;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

public class ParallelTesting  {
   
	WebDriver driver ;
	
	@Test
	public void parallel() throws IOException
	{
		System.out.println("Thread is given for chrome is="+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
System.out.println("Thread is given for chrome is="+Thread.currentThread().getId());
		 driver= new ChromeDriver();
		 driver.navigate().to("https://www.goibibo.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 System.out.println(" Home page is loaded successfully");
		
		
	}
	@Test
	public void parallelfirfox()
	{
		System.out.println("Thread is given for chrome is="+Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver", "D:\\Geckodriver\\geckodriver.exe");
		System.out.println("Thread is given for chrome is="+Thread.currentThread().getId());
		 driver= new FirefoxDriver();
		 driver.navigate().to("https://www.goibibo.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 System.out.println(" Home page is loaded successfully");
		
		
	}
	
	}
	


