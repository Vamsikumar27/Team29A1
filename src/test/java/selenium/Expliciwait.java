package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expliciwait {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.id("btn1")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Show the textboxes here:']//input[@id='txt1']")));
		driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']//input[@id='txt1']")).sendKeys("vamsi");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btn2\"]")));
		
		
		driver.findElement(By.xpath("//*[@id=\"btn2\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Show the textboxes here:']//input[@id='txt2']")));
		driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']//input[@id='txt2']")).sendKeys("kumar");
		

	}

}
