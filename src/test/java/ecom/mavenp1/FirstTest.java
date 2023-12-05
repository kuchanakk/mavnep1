package ecom.mavenp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
public void test1() {
	
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.amazon.in");
		
		
	}

}
