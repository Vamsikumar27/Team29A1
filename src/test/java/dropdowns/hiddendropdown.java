package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hiddendropdown {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
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
   Thread.sleep(2000);
   driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		//specific selection
  // driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();
   // get the values
   List<WebElement>options=driver.findElements(By.xpath("//div[@role='option']//span"));
 
   System.out.println(options.size());
  /* for(WebElement op:options) {
	   System.out.println(op.getText());
	   */
   
   
   
   }
   }
		
