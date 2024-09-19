package Assignedtasks;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		//Normal Alert
		a.accept();
		//Confirmation Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		a.accept();
		//Prompt Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		a.sendKeys("prompting accepted");
		a.accept();
		
		

	}

}
