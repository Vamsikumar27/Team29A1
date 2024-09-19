package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoveraction {
    public static WebDriver driver;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
       WebElement mac=   driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
       Actions ac=new Actions(driver);
       ac.moveToElement(desktop).moveToElement(mac).click().build().perform();
	}

}
