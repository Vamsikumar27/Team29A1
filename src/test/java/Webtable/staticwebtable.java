package Webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class staticwebtable {
    public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//no of rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		int Rows=rows.size();
		//no of coloumns
		List<WebElement> coloumns=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		int Column=coloumns.size();
		System.out.println(Rows+"  "+Column);
		
		//get the total data table
		for(int i=0;i<Rows;i++) {
			
			System.out.println(rows.get(i).getText());
		}
	
   }
      
		

	}


