package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertspractice {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		//driver.manage().window().maximize();
		int width=700;
		int height=1500;
		Dimension d=new Dimension(width,height);
		driver.manage().window().setSize(d);
		//normal alert
		//
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		// Confirmation Alert
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Thread.sleep(2000);
		a.dismiss();
		//Prompt Alert
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Thread.sleep(2000);
		a.sendKeys("testing");
		a.accept();
		
		
		
		
		
		

	}

}
