package Assignedtask2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload01 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement file=driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		file.sendKeys("C:\\Users\\vamsi\\Downloads\\AlertsExamples.java");
		WebElement submit=driver.findElement(By.id("file-submit"));
		submit.click();
		

	}

}
