package Waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo {
	public static WebDriver driver;
      public static void main(String[] args) {
    	  driver=new ChromeDriver();
    	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
    	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  		  driver.manage().window().maximize();
	     WebElement txtusername=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	     txtusername.sendKeys("Admin");
     WebElement	 txtpassword=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
     txtpassword.sendKeys("admin123");
    WebElement txtbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login']")));
    txtbutton.click();
}
		

	

}
