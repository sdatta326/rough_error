package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_auto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
				driver.navigate().refresh();
Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//driver.findElement(By.xpath("//*[@class='close']")).submit();
		Thread.sleep(3000);
		WebElement s=driver.findElement(By.id("hp-widget__sfrom"));
		s.clear();
		s.sendKeys("Mum");
		Thread.sleep(3000);
		
		s.sendKeys(Keys.ENTER);
		WebElement d=driver.findElement(By.id("hp-widget__sTo"));
		d.clear();
		Thread.sleep(3000);
		d.sendKeys("DEL");
		Thread.sleep(3000);
		
		
		
		
		
		d.sendKeys(Keys.DOWN);
		d.sendKeys(Keys.DOWN);
		d.sendKeys(Keys.DOWN);
		d.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		
		d.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		
List<WebElement> l=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		/*for(WebElement a:l)
		{
		System.out.println(a.getAttribute("value"));
		}*/
for (int i=0; i<l.size();i++){
    System.out.println("Radio button text:" + l.get(i).getAttribute("value"));
  }

System.out.println(l.size());



	}

}
