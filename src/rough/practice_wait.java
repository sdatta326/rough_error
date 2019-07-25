package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
	WebDriverWait d=new WebDriverWait(driver,20);
	d.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
	
	String s=driver.findElement(By.id("results")).getText();
	System.out.println(s);

	}

}
