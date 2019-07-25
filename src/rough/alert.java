package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/iframe/html/body/button")).click();
		//driver.findElement(By.xpath("/html/body/button")).click();
		//String s=driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).getText();
		driver.findElement(By.name("cusid")).sendKeys("ram");
		driver.findElement(By.name("submit")).click();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		/*Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.name("cusid")).sendKeys("ram");
		driver.findElement(By.name("res")).click();*/
		
	

		

	}

}
