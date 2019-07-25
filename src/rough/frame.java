package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		Actions a=new Actions(driver);
		WebElement s=driver.findElement(By.id("draggable"));
		WebElement t=driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		a.dragAndDrop(s,t).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		Thread.sleep(3000);
		int l=driver.findElements(By.tagName("a")).size();
		System.out.println(l);
		WebElement ds=driver.findElement(By.id("sidebar"));
		int sl=ds.findElements(By.tagName("a")).size();
		System.out.println(sl);*/
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement dc=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int cl=dc.findElements(By.tagName("a")).size();
		System.out.println(cl);
		
	for(int k=0;k<cl;k++)
	{
		String ctab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		dc.findElements(By.tagName("a")).get(k).sendKeys(ctab);
		Thread.sleep(3000);
		
	}
		
		

	}

}
