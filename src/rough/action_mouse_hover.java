package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		Actions a=new Actions(driver);
		//Thread.sleep(3000);
		//WebElement m=driver.findElement(By.id("nav-link-yourAccount"));
		//a[@id='nav-link-yourAccount']
		//WebElement s=//
		//WebElement m=driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));
		WebElement t=driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));
		Thread.sleep(3000);
		
		//a.moveToElement(m).build().perform();
		//driver.findElement(By.id("twotabsearchtextbox")).click();
		WebElement s=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//s.click();
		//Thread.sleep(3000);
		//s.sendKeys("hello");
		Thread.sleep(3000);
		a.moveToElement(s).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(t).contextClick().build().perform();
		

		//a.moveToElement(m).build().perform();
		//Thread.sleep(3000);
		//a.moveToElement(s).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();








	}

}
