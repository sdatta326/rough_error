package rough;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class flipcart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).click();
		//driver.findElement(By.xpath("//span[contains(@class,'_1QZ6fC')")).click();
		//String element=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).getText();
		//System.out.println(element);
		//List  elements = (List) driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		//System.out.println(elements);
		driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//ul[@class='_114Zhd']/li/ul/li/ul/li[2]/ul/li/a")).click();
		

		



	}

}
