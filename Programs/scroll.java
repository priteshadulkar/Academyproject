package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scroll {

	WebDriver driver ;
	
	@Test
	public void Scrollup() {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");

	 driver= new ChromeDriver();
	 driver.navigate().to("https://www.tutorialspoint.com/index.htm");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 System.out.println(" Home page is loaded successfully");
	 JavascriptExecutor js = ( JavascriptExecutor)driver;
	 js.executeScript("window.scroll(0,250)");
	int x = driver.findElement(By.xpath("//*[@class='fontawesome-i2svg-active fontawesome-i2svg-complete']")).getLocation().getX();
	System.out.println(x);
}
}
