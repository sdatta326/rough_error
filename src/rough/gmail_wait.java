package rough;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class gmail_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//TimeUnit SECONDS = null;
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'https://mail.google.com/mail/?tab=wm')]")).click();
		//Thread.sleep(3000);
		//WebDriverWait dv=new WebDriverWait(driver,6);
		//dv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign in')]")));
		//dv.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'Sign in')]")));
		driver.findElement(By.linkText("Sign in")).click();

		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		//driver.findElement(By.xpath("//a[contains(@href,'https://accounts.google.com/AccountChooser?service=mail&amp;continue=https://mail.google.com/mail/')]")).click();

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		//driver.close();
		// driver.switchTo().window(tabs2.get(0));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sdatta326@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("likerainbow");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//Thread.sleep(4000);
		  WebDriverWait wait = new WebDriverWait(driver,30);
		   
		    
		   
		           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Compose')]")));
		   
		                 // click on the compose button as soon as the "compose" button is visible
		   
		          driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		   
		          }

		//driver.findElement(By.xpath("//div[@role='button']")).click();
		//driver.findElement(By.linkText("Important")).click();
		
	}


