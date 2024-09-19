package Actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
   public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement image=driver.findElement(By.xpath("//td[@class='header_title']"));
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=image.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Eclipse_workspace\\sample1\\screenshotts\\logo.png");
		FileUtils.copyFile(src,target);
		
		
		////td[@class='header_title']"
		
		

	}

}
