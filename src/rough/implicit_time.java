package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_time {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.get("https://in.via.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		Thread.sleep(3000);
		/*WebElement w=driver.findElement(By.xpath("//div[@id='round-trip-panel']/div/input"));
		w.sendKeys("kol");
		Thread.sleep(3000);
		w.sendKeys(Keys.DOWN);
		w.sendKeys(Keys.ENTER);
		WebElement d=driver.findElement(By.xpath("//div[@id='round-trip-panel']/div[3]/input"));
		d.sendKeys("mum");
		Thread.sleep(3000);
		d.sendKeys(Keys.DOWN);
		d.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='vc-cell vc-selected-cell']")).click();
		d.sendKeys(Keys.TAB);
		Thread.sleep(3000);

		//vc-cell vc-selected-cell
		driver.findElement(By.xpath("//div[@class='vc-cell vc-selected-cell']")).click();//NEED TO ASK
		driver.findElement(By.id("search-flight-btn")).click();
		driver.findElement(By.xpath("//div[@class='filterResult filterToggle']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='modifyCTA js-modify-search']")).click();
		//Thread.sleep(3000);
		WebDriverWait dv=new WebDriverWait(driver,30);
		dv.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='modifyCTA js-modify-search']")));
		driver.findElement(By.xpath("//div[@class='modifyCTA js-modify-search']")).click();


		//dv.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='modifyCTA js-modify-search']")));
		//driver.findElement(By.xpath("//div[@class='modifyCTA js-modify-search openState']")).click();
		driver.findElement(By.id("search-flight-btn")).click();



		//driver.findElement(By.xpath("//div[@class='element-hotel'] //input[@id='destination']")).sendKeys(Keys.ENTER);*/

		//driver.findElement(By.xpath("//img[@title='Bangalore to Delhi']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'http://in.via.com/hotels')]")).click();
		Thread.sleep(3000);
		


		WebElement h=driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']"));
		//WebElement h=driver.findElement(By.xpath("//input[contains(text(),'Enter City, Area or Hotel Name')]"));
		//placeholder

		//WebElement h=driver.findElement(By.xpath("//input[@placeholder='Enter City, Area or Hotel Name']"));
		//h.click();
		h.sendKeys("kol");
		Thread.sleep(3000);
		//h.sendKeys(Keys.DOWN);
		h.sendKeys(Keys.DOWN);
		h.sendKeys(Keys.ENTER);
		/*WebElement n=driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']"));
		n.sendKeys("mum");
		n.sendKeys(Keys.DOWN);
		n.sendKeys(Keys.ENTER);*/


		driver.findElement(By.xpath("//div[contains(text(),'Search Hotels')]")).click();
		//Thread.sleep(3000);
		//WebDriverWait dv=new WebDriverWait(driver,10);
		
		//dv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://www.tripadvisor.com/img/cdsi/img2/ratings/traveler/4.5-15902-1.gif']")));
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://www.tripadvisor.com/img/cdsi/img2/ratings/traveler/4.5-15902-1.gif']")).click();
		//driver.findElement(By.xpath("//span[@class='reviewNum js-smallReviewNum']")).click();




	}

}
