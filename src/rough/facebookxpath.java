package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		String v=driver.findElement(By.xpath("//*[@id='error_box']")).getText();
		System.out.println(v);
		//driver.findElement(By.xpath("//a[@id='reg-link']")).click();
		driver.findElement(By.cssSelector("a#reg-link")).click();
		driver.findElement(By.cssSelector("button.websubmit")).click();
		
		
		//driver.close();
		
		

	}

}
