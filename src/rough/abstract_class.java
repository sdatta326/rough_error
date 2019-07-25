package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
//      WebDriver driver= new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'health-and-fitness')]")).click();
		
	}

}
