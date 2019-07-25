package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("AED");
		Thread.sleep(3000);
		s.selectByVisibleText("INR");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(3000);
		
		//(".ui-state-default.ui-state-highlight.ui-state-active");
		
		int l=driver.findElements(By.cssSelector(".ui-datepicker-trigger")).size();
		for(int i=0;i<l;i++)
		{
			driver.findElements(By.cssSelector(".ui-datepicker-trigger")).get(i).click();
			Thread.sleep(2000);
			
			if(i==0) {
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			}
			Thread.sleep(2000);
			if(i==1)
			{
				//".ui-datepicker-trigger"

				driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
				
				
				
			}
		}
		}
		
		

	}


