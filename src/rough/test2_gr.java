package rough;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



class test2_gr
{
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='display']/input")).click();
	
		
		

	}

}
