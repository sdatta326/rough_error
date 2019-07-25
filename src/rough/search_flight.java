package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class search_flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByIndex(2);
		Thread.sleep(3000);
		Select c=new Select(driver.findElement(By.id("Childrens")));
		c.selectByIndex(4);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		Thread.sleep(3000);
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(3000);
		String t=driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(t);


	}

}
