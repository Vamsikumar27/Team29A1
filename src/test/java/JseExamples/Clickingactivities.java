package JseExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickingactivities {
    public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		WebElement loginbuton=driver.findElement(By.id("login"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('value','vamsikumar')", user);
		jse.executeScript("arguments[0].setAttribute('value','CBFY24')", pass);
		jse.executeScript("arguments[0].click();", loginbuton);
		

	}

}
