package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class rough_flip {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");

		System.out.println("Open Flipkart");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//*[@class='LM6RPg']")).sendKeys("mobile cases");
		driver.findElement(By.xpath("//*[@class='vh79eN']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		WebElement e=driver.findElement(By.xpath("//div[@class='_1qKb_B']/select"));
		Select t=new Select(e);
		 t.selectByIndex(3);
		 WebElement e1=driver.findElement(By.xpath("//div[@class='_1YoBfV']/select"));
		 Select t1=new Select(e1);
		 t1.selectByIndex(5);
		 //List<WebElement> li=driver.findElements(By.xpath("//div[@class='_1YoBfV']/select/option"));
		 /*for(int i=0;i<li.size();i++)
		 {
		 System.out.println(li.size()+" "+li.get(i).getAttribute("value"));
		 }*/
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		 WebElement m=driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/612/612/jmnrtzk0-1/cases-covers/back-cover/x/u/h/kapaver-b07gt4ydpm-original-imaf9gx5qrhtfwkp.jpeg?q=70']"));
		 //m.click();
		 Actions builder = new Actions(driver);
		 Actions seriesOfActions = builder
		 	.moveToElement(m);
		 seriesOfActions.perform() ;
		 
		 
	}

}
