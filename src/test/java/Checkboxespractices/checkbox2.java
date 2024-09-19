package Checkboxespractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("friday")).click();
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
		
		for(int i=0;i<7;i++) {
			
		}

	}

}
