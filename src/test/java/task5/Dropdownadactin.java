package task5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownadactin {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//select[@id='room_type']"));
		
		

	}

}