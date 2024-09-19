package Alerts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drpdnele=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcountry=new Select(drpdnele);
		// select by visible text
		//drpcountry.selectByVisibleText("France");
		// select by value
		//drpcountry.selectByValue("uk");
		// select by index number
		//drpcountry.selectByIndex(5);
		List<WebElement> Options=drpcountry.getOptions();
		System.out.println("the number of options"+Options.size());
		for(int i=0;i<Options.size();i++) {
			System.out.println(Options.get(i).getText());
			
			
		}

	}

}
