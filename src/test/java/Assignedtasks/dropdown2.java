package Assignedtasks;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/text-box");
		//driver.manage().window().maximize();
	    int width =700;
	    int height=1500;
	    Dimension d= new Dimension(width,height);
	    driver.manage().window().setSize(d);
		//driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]/div[contains(@class,'accordion')]/div[1]/span[1]/div[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]/div[contains(@class,'accordion')]/div[4]/span[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'element-list collapse show')]//li[@id='item-8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=' css-1pahdxg-control']//div[@class=' css-1hwfws3']")).click();
		//sc.selectByIndex(1);

		
		
		

	}

}
