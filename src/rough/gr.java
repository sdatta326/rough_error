package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class gr {
	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/ajax.html");
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		Select s=new Select(driver.findElement(By.id("fruits")));
		
		s.selectByVisibleText("Banana");
		s.selectByIndex(2);
		
		driver.close();	
		
		
		

	}

}
