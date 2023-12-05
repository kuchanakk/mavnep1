package ecom.mavenp1;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonmethods.ScrenShot;
import excelinfom.Exceldatainfo;
import objrep.Homepage;
import objrep.ProddetailsPage;
import testbase.Browser;

public class PopitemsTest extends Browser {
	static Browser b;
	static Homepage home;
	static ProddetailsPage pdpage;
	static Exceldatainfo excel;
	static ScrenShot schot;
	
	@BeforeMethod
	public void openbrowser() {
		
		 b = new Browser();
		b.launchbrowser("firefox");
		
	}
	@Test 
	public void tablestest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		 home = new Homepage(driver);
		home.poitemlink().click();
		Thread.sleep(5000);
		home.tabletLink().click();
		Thread.sleep(5000);
		 pdpage = new ProddetailsPage(driver);
		String actaulproduct=pdpage.producttext().getText();
		 excel = new Exceldatainfo();
		 
		String exptext=excel.readdata(1, 0);

		
		if(actaulproduct.contains(exptext)) {
			
			
		excel.writedata(1, 1, "valid data");
			
			
		}else {
			
			excel.writedata(1, 1, "invalid data");
			schot = new ScrenShot();
			schot.sshot();
			
		}
			
		
	}
	@Test
	public void laptoptest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		 home = new Homepage(driver);
		 pdpage = new ProddetailsPage(driver);
		 excel = new Exceldatainfo();
			schot = new ScrenShot();


		home.poitemlink().click();
		Thread.sleep(5000);
		home.laptoplink().click();
		Thread.sleep(5000);
		String exptext=excel.readdata(2, 0);
		
		String actualproducttest=pdpage.producttext().getText();
		if(actualproducttest.contains(exptext)) {
			
			excel.writedata(2, 1, "valid data");
			
			
		}else {
			
			excel.writedata(2, 1, "invalid data");

			schot = new ScrenShot();
			schot.sshot();			
			
		}
		
	}
	
	
	@Test
	public void spktest() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		 home = new Homepage(driver);
		 pdpage = new ProddetailsPage(driver);
		 excel = new Exceldatainfo();
			schot = new ScrenShot();
		home.poitemlink().click();
		Thread.sleep(5000);
		home.spklink().click();
		Thread.sleep(5000);
		String exptext=excel.readdata(3, 0);

		
		String actualproducttext=pdpage.producttext().getText();
		
		if(actualproducttext.contains(exptext)) {
			
			excel.writedata(3, 1, "valid data");
			
		}else {
			excel.writedata(3, 1, "invalid data");
			schot = new ScrenShot();
			schot.sshot();
			
		}
			
			
		
		
	}
	
	
	@AfterMethod
	public void closebrowser() {
		
b.closeb();

	}
	
	
	
	

}
