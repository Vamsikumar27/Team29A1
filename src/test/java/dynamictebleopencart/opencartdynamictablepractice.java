package dynamictebleopencart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencartdynamictablepractice {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
	    WebElement	username=driver.findElement(By.xpath("//input[@id='input-username']"));
	    username.clear();
	    username.sendKeys("demo");
	   WebElement password= driver.findElement(By.xpath("//input[@id='input-password']"));
	   password.clear();
	   password.sendKeys("demo");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	    
		

	}

}
