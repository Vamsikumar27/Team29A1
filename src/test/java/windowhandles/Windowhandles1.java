package windowhandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		WebElement ele1=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		ele1.click();
		Set<String> windowids=driver.getWindowHandles();
		List<String> windowlist=new ArrayList(windowids);
		String parentid=windowlist.get(0);
		String childid=windowlist.get(1);
		System.out.println(windowlist);
		driver.switchTo().window(parentid);
		WebElement ele2=driver.findElement(By.xpath("//input[@name='username']"));
		ele2.sendKeys("Admin");
		WebElement ele3=driver.findElement(By.xpath("//input[@name='password']"));
		ele3.sendKeys("admin123");
		WebElement ele4=driver.findElement(By.xpath("//button[@type='submit']"));
		ele4.click();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//button[@fdprocessedid='suahph']")).click();
		

	}

}
