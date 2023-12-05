package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testbase.Browser;

public class ScrenShot extends Browser {
	
	
	
public void sshot() throws IOException {
		
		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("C:\\Users\\kiran\\eclipse-workspace\\mavenp1\\resources\\schshot\\error1.png"));
	}

}
