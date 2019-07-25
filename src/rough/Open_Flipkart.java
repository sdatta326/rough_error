package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");

		System.out.println("Open Flipkart");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//a[@type='Login & Signup' ]")).click();

		driver.findElement(By.xpath("//*[@class='_2zrpKA']")).sendKeys("9477523466");

		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("abcd1234");

		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();

		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@class='LM6RPg']")).click();

		driver.findElement(By.xpath("//*[@class='LM6RPg']")).sendKeys("mo");

		String search = driver.findElement(By.xpath("//*[@class='LM6RPg']")).getAttribute("value");

		int i = 0;
		while (!search.equalsIgnoreCase("mobile lens")) {
			i++;
			driver.findElement(By.xpath("//*[@class='LM6RPg']")).sendKeys(Keys.DOWN);

			if (i > 20) {
				break;
			}
		}

		// Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@class='vh79eN']")).click();
		// driver.findElement(By.xpath("//*[@class='LM6RPg']")).sendKeys(Keys.ENTER);

		// Thread.sleep(5000);

		// driver.findElement(By.xpath("//*[text()='Electronics']/ancestor::*[1]")).click();

		// Thread.sleep(5000);
		// driver.close();

	}

}
