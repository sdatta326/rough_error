package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class spicejetcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		/*boolean i=driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		System.out.println(i);*/
		//driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		//boolean k=driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		//System.out.println(k);
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("it is disabled");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("now it is enabled");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}

}
