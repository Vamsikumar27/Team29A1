package practiceall;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jseclicking {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.id("firstname"));
		WebElement lname=driver.findElement(By.id("lastname"));
		WebElement email=driver.findElement(By.id("email_address"));
		WebElement pwd=driver.findElement(By.id("password"));
		WebElement Cpwd=driver.findElement(By.id("password-confirmation"));
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']//span[text()='Create an Account']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('value','vignesh')", fname);
		jse.executeScript("arguments[0].setAttribute('value','mahadev')", lname);
		jse.executeScript("arguments[0].setAttribute('value','vignesh@123')", email);
		jse.executeScript("arguments[0].setAttribute('value','mahadev')", pwd);
		jse.executeScript("arguments[0].setAttribute('value','mahadev')", Cpwd);
		jse.executeScript("arguments[0].click();", btn);
		
		
		
		

	}

}
