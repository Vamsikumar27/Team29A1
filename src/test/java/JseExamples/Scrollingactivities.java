package JseExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingactivities {
	 public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hubilo.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		// Scrolling by using pixel values
		jse.executeScript("window.scrollBy(0,800);", "");
		System.out.println(jse.executeScript("return window.pageYOffset;" ));
		
		//Scrolling up to element should be present
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Webinar+']"));
		//jse.executeScript(null, args)
		

	}

}
