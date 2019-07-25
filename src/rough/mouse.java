package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
			System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
			Thread.sleep(3000);
			 WebDriver driver = new ChromeDriver();
			 Thread.sleep(3000);
			 
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			WebElement txtUsername = driver.findElement(By.id("email"));

			Actions builder = new Actions(driver);
			/*Action seriesOfActions = builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.keyUp(txtUsername, Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick()
				.build();
				
			seriesOfActions.perform() ;*/
			
			Action seriesOfActions = builder
					.moveToElement(txtUsername)
					.click().sendKeys(txtUsername,"hello").keyDown(txtUsername, Keys.SHIFT).build();
					
				
					
				seriesOfActions.perform();

			

	}

}
