package selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());
//		driver.get("https://www.amazon.in/");
//		
//		 Set<String>windowid=driver.getWindowHandles();
//		 System.out.println("Window id status is"+windowid);
		
		
//	boolean	Displatstatus=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[1]/h1")).isDisplayed();
//	System.out.println(Displatstatus);    //is displayes element
//	is enabled
//		boolean status=driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).isEnabled();
//		System.out.println("the element status is :"+status);
		
	WebElement	male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement	female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println("Before selection...");
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
		
		
	System.out.println("After selection...");
	male_rd.click();
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
	//driver.close();
		
		
		

	}

}
