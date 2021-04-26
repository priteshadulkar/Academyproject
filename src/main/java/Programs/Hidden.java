package Programs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hidden {
	WebDriver driver ;


@Test
	public void Scrollup() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");

		 driver= new ChromeDriver();
	WebDriver driver = new ChromeDriver();  
    
    driver.get("https://learn.letskodeit.com/p/practice");  
      
    driver.manage().window().maximize();  
      
    //Clicking on the Hide button  
    driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();  
                
    JavascriptExecutor js = (JavascriptExecutor)driver;  
      
    // Identifying the element using ID attribute and Entering the value in the text box  
js.executeScript("document.getElementById('displayed-text').value='text123'");  
      
	
	}

}
