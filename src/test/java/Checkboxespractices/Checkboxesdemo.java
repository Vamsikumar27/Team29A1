package Checkboxespractices;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxesdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// select specific single check box
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//Select multiple textboxes
		
    	//List<WebElement> Checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
//		for(WebElement checkbox:Checkboxes) {
//			checkbox.click();
//		}
		//Select last 3 checkboxes
		
//		List<WebElement> Checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
//		for(int i=4;i<Checkboxes.size();i++) {
//			Checkboxes.get(i).click();
//		}
		//Select first 3 text boxes
//		List<WebElement> Checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
//		for(int i=0;i<3;i++) {
//			Checkboxes.get(i).click();
//		}
		// un selected the selected  text boxes
		List<WebElement> Checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
		for(int i=0;i<3;i++) {
			Checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0;i<Checkboxes.size();i++) {
			if(Checkboxes.get(i).isSelected()) {
			
			Checkboxes.get(i).click();
			}
			
		}
		
		
		
		
	}

}
