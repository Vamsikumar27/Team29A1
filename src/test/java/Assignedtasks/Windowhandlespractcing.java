package Assignedtasks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlespractcing {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Frames");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")).click();
		Set<String> windowids=driver.getWindowHandles();
		List<String> Windowlist=new ArrayList(windowids);
		String parentid=Windowlist.get(0);
		String childid=Windowlist.get(1);
		System.out.println(Windowlist);
		// parent window
		
		/*driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
		System.out.println("parent window current url is :"+driver.getCurrentUrl());*/
		//Child Window
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//span[normalize-space()='In building construction']")).click();
		System.out.println("Child window current url is :"+driver.getCurrentUrl());
		
		
		
		
		
		

	}

}
