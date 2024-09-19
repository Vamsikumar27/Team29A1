package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobiles");
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobiles");
	     driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("mobiles");
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobiles");
	     driver.close();
		

	}

}
