package rough;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class flipcart {

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
		java.util.List<WebElement> link=driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		for(WebElement element:link)
		{
			System.out.println(element.getText());
		}
		for(WebElement element:link)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element.click();

		}
		driver.findElement(By.xpath("//a[@title='Books']")).click();
		//div[@class='_4IiNRh _2mtkou']
		driver.findElement(By.xpath("//div[@title='French']")).getText();

		//WebElement e1=driver.findElement(By.xpath("\"//div[@class='_1GEhLw']\""));
		//WebElement e2=driver.findElement(By.xpath("\"//div[@class='_1GEhLw']\""));
		
		/*List e=(List) driver.findElement(By.xpath("//div[@class='_4IiNRh _2mtkou'"));
		
		WebElement e1=(WebElement) e;
		 for (int i=0; i<2; i++) {											
	           e1.click (); 			
	            System.out.println("FLIPCART LANGUAGE  Persists Checkbox Status is -  "+e1.getText());							
	        }*/
		//driver.close();



	}

}
