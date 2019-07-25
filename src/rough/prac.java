package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class prac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 
		
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://qaclickacademy.com/practice.php");
		 driver.manage().window().maximize();
		 Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		 Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		 Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		 int l=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		 Assert.assertEquals(l,3);
		 System.out.println(l);


	}

}
