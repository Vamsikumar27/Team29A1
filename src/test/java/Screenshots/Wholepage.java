package Screenshots;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Wholepage {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        
   
        
        TakesScreenshot ts=(TakesScreenshot)driver;
        
        File source=ts.getScreenshotAs(OutputType.FILE);
        File target =new File("C:\\Eclipse_workspace\\sample1\\screenshotts\\Wholepage.png");
        FileUtils.copyFile(source, target);
        
        
        
        
	}
}
