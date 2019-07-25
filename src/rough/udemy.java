package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
//      WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='zi6sUf _3Ed3Ub']/ul/li[2]/span")).click();
		//div[@class='_2OZ78M _1fj2FQ']/li/ul/li[1]/a
		//driver.findElement(By.xpath("//li[@class='_1GPxMV _3mmoXN']/ul/li/ul/li/ul/li/a")).click();
		Thread.sleep(3000);
//driver.findElement(By.xpath("//a[@title='Television']")).click();

		driver.findElement(By.xpath("//div[@class='zi6sUf _3Ed3Ub']/ul/li[2]/ul/li/ul/li/ul/li/a")).click();
		//driver.findElement(By.xpath("//a[@title='Television']")).click();
		
		
}
}