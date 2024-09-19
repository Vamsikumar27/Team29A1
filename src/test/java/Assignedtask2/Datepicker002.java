package Assignedtask2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker002 {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//input[@id='datepicker']"));
		ele1.sendKeys("08/15/2024");
		
	}

}
