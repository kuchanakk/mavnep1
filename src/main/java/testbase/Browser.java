package testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;
	
	public void launchbrowser(String browser) {
		
		//String browser = "chrome";
		
		if(browser.equals("firefox")) {
			
			 driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("http://www.advantageonlineshopping.com/#/");
			
		} else if(browser.equals("chrome")) {
			

			 driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("http://www.advantageonlineshopping.com/#/");
			
			
		} else if(browser.equals("edge")) {
			

			 driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("http://www.advantageonlineshopping.com/#/");
			
		}
		
		
		
		
		
		
		
	}
	
	
	public void closeb() {
		
		driver.close();
	}
	
	
	
}
