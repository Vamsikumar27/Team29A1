package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wholepage1 {
     public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 File target=new File("C:\\Eclipse_workspace\\sample1\\screenshotts\\Wholepage1.png");
		 FileUtils.copyFile(source, target);
	
		

	}

}
